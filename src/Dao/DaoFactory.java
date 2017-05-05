package Dao;

import Entity.HUsersEntity;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by panyunyi on 2017/5/3.
 */
class DaoFactory<T> {

        /*
    * function：增加
    * param：实体类对象
    * */
    public  String save(T u) {
        String i;

        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure("hibernate.cfg.xml").build();
        // 2. 根据服务注册类创建一个元数据资源集，同时构建元数据并生成应用一般唯一的的session工厂
        SessionFactory sessionFactory = new MetadataSources(registry)
                .buildMetadata().buildSessionFactory();


        Session session = sessionFactory.openSession();// 从会话工厂获取一个session
        Transaction t = session.beginTransaction();
        i = (String) session.save(u);
        t.commit();
        session.close();

        //System.out.println(u.getCurrentLocation());
        return i;
    }
    /*
    * function：删除
    * param：实体类对象
    * */
    public  void delete(T u){
        String info;
        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure("hibernate.cfg.xml").build();
        // 2. 根据服务注册类创建一个元数据资源集，同时构建元数据并生成应用一般唯一的的session工厂
        SessionFactory sessionFactory = new MetadataSources(registry)
                .buildMetadata().buildSessionFactory();


        Session session = sessionFactory.openSession();// 从会话工厂获取一个session
        Transaction t = session.beginTransaction();

        session.delete(u);
        t.commit();
        session.close();

    }
    /*
    * function：更新
    * param：实体类对象
    * */
    public void update(T u){
        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure("hibernate.cfg.xml").build();
        // 2. 根据服务注册类创建一个元数据资源集，同时构建元数据并生成应用一般唯一的的session工厂
        SessionFactory sessionFactory = new MetadataSources(registry)
                .buildMetadata().buildSessionFactory();


        Session session = sessionFactory.openSession();// 从会话工厂获取一个session
        Transaction t = session.beginTransaction();
        session.update(u);
        t.commit();
        session.close();
    }
    public List cursor(T u,String s,Class aclass){
        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure("hibernate.cfg.xml").build();
        // 2. 根据服务注册类创建一个元数据资源集，同时构建元数据并生成应用一般唯一的的session工厂
        SessionFactory sessionFactory = new MetadataSources(registry)
                .buildMetadata().buildSessionFactory();


        Session session = sessionFactory.openSession();// 从会话工厂获取一个session
        Transaction t = session.beginTransaction();
        SQLQuery sqlQuery=session.createSQLQuery(s);
        List list;
        //if 做简单的查询
        //else 做统计
        if(aclass!=null){
            sqlQuery.addEntity(aclass);
            list=sqlQuery.getResultList();
        }else{
            int count=((Number)sqlQuery.uniqueResult()).intValue();
            list=new ArrayList<Integer>();
            list.add(count);
        }

        t.commit();
        session.close();
        return list;
    }
}
