package Dao;

import Entity.HPreferencesEntity;

/**
 * Created by panyunyi on 2017/5/3.
 */
public class PreferenceDao {
    public void addPreferences(String haidaxueSn,String questionSn,String answersSn){
        HPreferencesEntity hPreferencesEntity=new HPreferencesEntity();
        hPreferencesEntity.setAnswersSn(answersSn);
        hPreferencesEntity.setHaidaxueSn(haidaxueSn);
        DaoFactory<HPreferencesEntity>daoFactory=new DaoFactory<>();
        daoFactory.save(hPreferencesEntity);
    }
    public void deletePreferences(String haidaxueSn,String questionSn,String answersSn){
        HPreferencesEntity hPreferencesEntity=new HPreferencesEntity();
        hPreferencesEntity.setAnswersSn(answersSn);
        hPreferencesEntity.setHaidaxueSn(haidaxueSn);
        DaoFactory<HPreferencesEntity>daoFactory=new DaoFactory<>();
        daoFactory.delete(hPreferencesEntity);
    }

}
