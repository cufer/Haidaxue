package Dao;

import Entity.HQuestionEntity;

import java.util.List;

/**
 * Created by panyunyi on 2017/5/3.
 */
public class HQuestionDao {
    public  List getAllQuestion(){
        DaoFactory<HQuestionEntity>daoFactory=new DaoFactory<>();
        HQuestionEntity hQuestionEntity=new HQuestionEntity();
        List list=daoFactory.cursor(hQuestionEntity,"select * from h_question limit 15",HQuestionEntity.class);
        return list;
    }
    public  List getQuestionByQuestion_Label(HQuestionEntity hQuestionEntity){
        DaoFactory<HQuestionEntity>daoFactory=new DaoFactory<>();
        String questionLabel=hQuestionEntity.getQuestionLabel();
        List<HQuestionEntity> list=daoFactory.cursor(hQuestionEntity,"select * from h_question where question_label like %"+questionLabel+"%",HQuestionEntity.class);
        return list;
    }
    public  List getQuestionByQuestion_sn(HQuestionEntity hQuestionEntity){

        DaoFactory<HQuestionEntity>daoFactory=new DaoFactory<>();
        String questionSn=hQuestionEntity.getQuestionSn();
        List<HQuestionEntity> list=daoFactory.cursor(hQuestionEntity,"select * from h_question where question_sn='"+questionSn+"'",HQuestionEntity.class);
        return list;
    }
    public List getQuestionByHaidaxue_sn(HQuestionEntity hQuestionEntity){
        DaoFactory<HQuestionEntity>daoFactory=new DaoFactory<>();
        String haidaxueSn=hQuestionEntity.getQuestionSn();
        List<HQuestionEntity> list=daoFactory.cursor(hQuestionEntity,"select * from h_question where haidaxue_sn='"+haidaxueSn+"'",HQuestionEntity.class);
        return list;
    }
    public  boolean raiseQuestion(String haidaxueSn,String questionLabel,String questionContent,Boolean questionAnonymity,Boolean questionBonus){
        HQuestionEntity hQuestionEntity=new HQuestionEntity();
        hQuestionEntity.setHaidaxueSn(haidaxueSn);
        hQuestionEntity.setQuestionLabel(questionLabel);
        hQuestionEntity.setQuestionContent(questionContent);
        hQuestionEntity.setQuestionAnonymity(questionAnonymity);
        hQuestionEntity.setQuestionBonus(questionBonus);
        DaoFactory<HQuestionEntity>daoFactory=new DaoFactory<>();
        return daoFactory.save(hQuestionEntity);
    }


}
