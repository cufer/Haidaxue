package Dao;

import Entity.HAnswersEntity;

import java.sql.Date;

import java.time.LocalDate;
import java.util.List;

/**
 * Created by panyunyi on 2017/5/3.
 */
public class HAnswersDao {

    public List getAnswerByHaidaxue_sn(HAnswersEntity hAnswersEntity) {
        DaoFactory<HAnswersEntity> daoFactory = new DaoFactory<>();
        String haidaxueSn = hAnswersEntity.getHaidaxueSn();
        List result = daoFactory.cursor(hAnswersEntity, "select * from h_answers where haidaxue_sn='" + haidaxueSn + "'", HAnswersEntity.class);
        return result;
    }

    public List getAnswerByQuestion_sn(HAnswersEntity hAnswersEntity) {
        DaoFactory<HAnswersEntity> daoFactory = new DaoFactory<>();
        String questionSn = hAnswersEntity.getQuestionSn();
        List result = daoFactory.cursor(hAnswersEntity, "select * from h_answers where question_sn='" + questionSn + "'", HAnswersEntity.class);
        return result;
    }

    public void provideAnswer(String haidaxueSn, String questionSn, String answersContent, Boolean answersAnonymity) {
        HAnswersEntity hAnswersEntity = new HAnswersEntity();
        hAnswersEntity.setHaidaxueSn(haidaxueSn);
        hAnswersEntity.setAnswersAnonymity(answersAnonymity);
        hAnswersEntity.setQuestionSn(questionSn);
        hAnswersEntity.setAnswersContent(answersContent);
        hAnswersEntity.setAnswersSn("123");
        hAnswersEntity.setAnswersDate(Date.valueOf(LocalDate.now()));
        DaoFactory<HAnswersEntity> daoFactory = new DaoFactory<>();
        daoFactory.save(hAnswersEntity);
    }

}
