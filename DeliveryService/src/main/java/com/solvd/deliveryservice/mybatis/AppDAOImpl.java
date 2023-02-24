package com.solvd.deliveryservice.mybatis;

import com.solvd.deliveryservice.dao.IAppDAO;
import com.solvd.deliveryservice.models.App;

import java.sql.SQLException;
import java.util.List;
import org.apache.ibatis.session.SqlSession;

public class AppDAOImpl implements IAppDAO {
    private SqlSession sqlSession;

    public void setSqlSession(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }


    public App getAppById(int id) {
        return sqlSession.selectOne("getAppById", id);
    }


    public List<App> getAllApps() {
        return sqlSession.selectList("getAllApps");
    }


    public void insertApp(App app) {
        sqlSession.insert("insertApp", app);
    }


    public void updateApp(App app) {
        sqlSession.update("updateApp", app);
    }


    public void deleteApp(int id) {
        sqlSession.delete("deleteApp", id);
    }


    public Object getEntityById(long id) throws SQLException, InterruptedException {
        return null;
    }


    public void updateEntity(Object entity) {

    }


    public Object createEntity(Object entity) {
        return null;
    }


    public void removeEntity(long id) {

    }
}



