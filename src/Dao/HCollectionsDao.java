package Dao;

import Entity.HCollectionsEntity;

/**
 * Created by panyunyi on 2017/5/3.
 */
public class HCollectionsDao {
    public void addCollections(String haidaxueSn,String questionSn,String answersSn){
        HCollectionsEntity hCollectionsEntity=new HCollectionsEntity();
        hCollectionsEntity.setHaidaxueSn(haidaxueSn);
        hCollectionsEntity.setQuestionSn(questionSn);
        DaoFactory<HCollectionsEntity>daoFactory=new DaoFactory<>();
        daoFactory.save(hCollectionsEntity);
    }
    public void deleteCollections(String haidaxueSn,String questionSn,String answerSn){
        HCollectionsEntity hCollectionsEntity=new HCollectionsEntity();
        hCollectionsEntity.setHaidaxueSn(haidaxueSn);
        hCollectionsEntity.setQuestionSn(questionSn);
        DaoFactory<HCollectionsEntity>daoFactory=new DaoFactory<>();
        daoFactory.delete(hCollectionsEntity);
    }

}
