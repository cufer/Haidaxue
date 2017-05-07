package Dao;

import Entity.HAnswersEntity;
import Entity.HQuestionEntity;
import Entity.HUsersEntity;

import java.util.List;

/**
 * Created by panyunyi on 2017/5/2.
 * use for adding/deleting/updating members
 *
 *
 */
public class HUsersDao {

    public  boolean add(HUsersEntity hUsersEntity){
        DaoFactory<HUsersEntity>daoFactory=new DaoFactory<>();
        return daoFactory.save(hUsersEntity);
    }
    public  boolean update(HUsersEntity hUsersEntity){
        DaoFactory<HUsersEntity>daoFactory=new DaoFactory<>();
        return daoFactory.update(hUsersEntity);
    }
    public  boolean delete(HUsersEntity hUserEntity){
        DaoFactory<HUsersEntity>daoFactory=new DaoFactory<>();
        return daoFactory.delete(hUserEntity);
    }
    /*
    * @Param:实体类对象
    * @return：布尔值
    *
    * */
    public  boolean login(HUsersEntity hUsersEntity){
        String userName=hUsersEntity.getUserName();
        String passWord=hUsersEntity.getPassword();
        DaoFactory<HUsersEntity>daoFactory=new DaoFactory<>();
        List list=daoFactory.cursor(hUsersEntity,"select * from h_users as u where u.user_name='"+userName+"'and u.password='"+passWord+"'",HUsersEntity.class);
        for(int i=0;i<list.size();i++){
            HUsersEntity h=(HUsersEntity) list.get(i);
            System.out.print(h.getHaidaxueSn());
        }
        if(list.size()!=0)return true;
        return false;
    }
    /*
    * @Param1:实体类对象
    * @Param2:待查询的haidaxue_sn
    * @return 实体类对象（带有相关属性值）
    * */
    public  HUsersEntity getInforByHaidaxue_sn(HUsersEntity hUsersEntity,String haidaxueSn){
        DaoFactory<HUsersEntity>daoFactory=new DaoFactory<>();
        List result=daoFactory.cursor(hUsersEntity,"select * from h_users where haidaxue_sn='"+haidaxueSn+"'",HUsersEntity.class);
        HUsersEntity h=(HUsersEntity)result.get(0);
        return h;
    }

    public  List<HUsersEntity> list(){
        HUsersEntity hUsersEntity=new HUsersEntity();
        DaoFactory<HUsersEntity>daoFactory=new DaoFactory<>();
        List<HUsersEntity>result=daoFactory.cursor(hUsersEntity,"select * from h_users",HUsersEntity.class);

        return result;

    }
    /*
    * 200分为一级，当然后续的算法可以调
    * */
    public  int level(HUsersEntity hUsersEntity){
        DaoFactory<HAnswersEntity>daoFactory=new DaoFactory<>();
        String haidaxueSn=hUsersEntity.getHaidaxueSn();
        List result=daoFactory.cursor(new HAnswersEntity(),"select count(Code) from h_answers as q where q.haidaxue_sn='"+haidaxueSn+"'",null);
        int count =(int)result.get(0);
        count=count*15;
        DaoFactory<HQuestionEntity>daoFactory1=new DaoFactory<>();
        List result1=daoFactory1.cursor(new HQuestionEntity(),"select count(Code) from h_question as q where q.haidaxue_sn='"+haidaxueSn+"'",null);
        count+=(int)result1.get(0)*20;
        return (int)Math.floor(count/200.0);
    }

}
