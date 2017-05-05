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
        List list=daoFactory.cursor(hQuestionEntity,"select * from h_question",HQuestionEntity.class);
        return list;
    }
    public  List getQuestionByQuestion_Label(HQuestionEntity hQuestionEntity){
        DaoFactory<HQuestionEntity>daoFactory=new DaoFactory<>();
        String questionLabel=hQuestionEntity.getQuestionLable();
        List list=daoFactory.cursor(hQuestionEntity,"select * from h_question where question_label like %"+questionLabel+"%",HQuestionEntity.class);
        return list;
    }
    public  List getQuestionByQuestion_sn(HQuestionEntity hQuestionEntity){

        DaoFactory<HQuestionEntity>daoFactory=new DaoFactory<>();
        String questionSn=hQuestionEntity.getQuestionSn();
        List list=daoFactory.cursor(hQuestionEntity,"select * from h_question where question_sn='"+questionSn+"'",HQuestionEntity.class);
        return list;
    }
    public  void raiseQusetion(String haidaxueSn,String questionLabel,String questionContent,Boolean questionAnonymity,Boolean questionBonus){
        HQuestionEntity hQuestionEntity=new HQuestionEntity();
        hQuestionEntity.setHaidaxueSn(haidaxueSn);
        hQuestionEntity.setQuestionLable(questionLabel);
        hQuestionEntity.setQuestionContent(questionContent);
        hQuestionEntity.setQuestionAnonymity(questionAnonymity);
        hQuestionEntity.setQuestionBonus(questionBonus);
    }


}
