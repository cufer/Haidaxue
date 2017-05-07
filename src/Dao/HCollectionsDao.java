package Dao;

import Entity.HCollectionsEntity;

import java.util.List;

/**
 * Created by panyunyi on 2017/5/3.
 */
public class HCollectionsDao {
    public boolean addCollections(String haidaxueSn,String questionSn,String answersSn){
        HCollectionsEntity hCollectionsEntity=new HCollectionsEntity();
        hCollectionsEntity.setHaidaxueSn(haidaxueSn);
        hCollectionsEntity.setQuestionSn(questionSn);
        DaoFactory<HCollectionsEntity>daoFactory=new DaoFactory<>();
        return daoFactory.save(hCollectionsEntity);
    }
    public boolean deleteCollections(String haidaxueSn,String questionSn,String answerSn){
        HCollectionsEntity hCollectionsEntity=new HCollectionsEntity();
        hCollectionsEntity.setHaidaxueSn(haidaxueSn);
        hCollectionsEntity.setQuestionSn(questionSn);
        DaoFactory<HCollectionsEntity>daoFactory=new DaoFactory<>();
        return daoFactory.delete(hCollectionsEntity);
    }
    /*
    * List getAllCollection()
    * */
    public List getAllCollection(){
        DaoFactory<HCollectionsEntity> daoFactory=new DaoFactory<>();
        HCollectionsEntity hCollectionsEntity=new HCollectionsEntity();
        List<HCollectionsEntity> list=daoFactory.cursor(hCollectionsEntity,"select * from q_collecitons",HCollectionsEntity.class);

        return list;
    }
}
