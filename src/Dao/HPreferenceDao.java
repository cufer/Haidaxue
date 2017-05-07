package Dao;

import Entity.HPreferencesEntity;

/**
 * Created by panyunyi on 2017/5/3.
 */
public class HPreferenceDao {
    public boolean addPreferences(String haidaxueSn,String questionSn,String answersSn){
        HPreferencesEntity hPreferencesEntity=new HPreferencesEntity();
        hPreferencesEntity.setAnswersSn(answersSn);
        hPreferencesEntity.setHaidaxueSn(haidaxueSn);
        DaoFactory<HPreferencesEntity>daoFactory=new DaoFactory<>();
        return daoFactory.save(hPreferencesEntity);
    }
    public boolean deletePreferences(String haidaxueSn,String questionSn,String answersSn){
        HPreferencesEntity hPreferencesEntity=new HPreferencesEntity();
        hPreferencesEntity.setAnswersSn(answersSn);
        hPreferencesEntity.setHaidaxueSn(haidaxueSn);
        DaoFactory<HPreferencesEntity>daoFactory=new DaoFactory<>();
        return daoFactory.delete(hPreferencesEntity);
    }

}
