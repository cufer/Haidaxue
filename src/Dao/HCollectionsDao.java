package Dao;

import Entity.HCollectionsEntity;
import Entity.HUsersEntity;

import java.util.List;

/**
 * Created by panyunyi on 2017/5/3.
 */
public class
HCollectionsDao {
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
    public List getAllCollection(HUsersEntity hUsersEntity){
        DaoFactory<HCollectionsEntity> daoFactory=new DaoFactory<>();

        List<HCollectionsEntity> list=daoFactory.cursor(new HCollectionsEntity(),"select * from h_collections where haidaxue_sn='"+hUsersEntity.getHaidaxueSn()+"'",HCollectionsEntity.class);

        return list;
    }
}
