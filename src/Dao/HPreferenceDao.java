package Dao;

import Entity.HAnswersEntity;
import Entity.HPreferencesEntity;

import java.util.List;

/**
 * Created by panyunyi on 2017/5/3.
 */
public class HPreferenceDao {
    public boolean addPreferences(String haidaxueSn,String answersSn){
        HPreferencesEntity hPreferencesEntity=new HPreferencesEntity();
        hPreferencesEntity.setAnswersSn(answersSn);
        hPreferencesEntity.setHaidaxueSn(haidaxueSn);
        DaoFactory<HPreferencesEntity>daoFactory=new DaoFactory<>();
        //daoFactory.cursor(hPreferencesEntity,"update h_preferences set de_name = de_name+1 where id =1; ",null);

        return daoFactory.save(hPreferencesEntity);
    }
    public boolean deletePreferences(String haidaxueSn,String questionSn,String answersSn){
        HPreferencesEntity hPreferencesEntity=new HPreferencesEntity();
        hPreferencesEntity.setAnswersSn(answersSn);
        hPreferencesEntity.setHaidaxueSn(haidaxueSn);
        DaoFactory<HPreferencesEntity>daoFactory=new DaoFactory<>();
        return daoFactory.delete(hPreferencesEntity);
    }
    public void addcount(String answerSn){
        DaoFactory<HAnswersEntity>daoFactory=new DaoFactory();
        HAnswersEntity hAnswersEntity=new HAnswersEntity();
        List list=daoFactory.cursor(hAnswersEntity,"select * from h_answers as h where h.answers_sn='"+answerSn+"'" ,HAnswersEntity.class);
        int a=((HAnswersEntity)list.get(0)).getAnswersSupportCount()+1;
        hAnswersEntity.setAnswersSupportCount(a);
        daoFactory.update(hAnswersEntity);
    }

}
