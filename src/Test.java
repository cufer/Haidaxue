import Dao.HAnswersDao;
import Entity.HAnswersEntity;

import java.util.List;

/**
 * Created by panyunyi on 2017/5/3.
 */
public class Test {
    public static void main(String args[]){
        HAnswersDao hAnswersDao=new HAnswersDao();
        HAnswersEntity hAnswersEntity=new HAnswersEntity();
        hAnswersEntity.setHaidaxueSn("123456");
        List list=hAnswersDao.getAnswerByHaidaxue_sn(hAnswersEntity);
        for(int i=0;i<list.size();i++){
            HAnswersEntity hAnswersEntity1=(HAnswersEntity)list.get(i);
            System.out.print(hAnswersEntity1.getAnswersContent());
        }
    }
}
