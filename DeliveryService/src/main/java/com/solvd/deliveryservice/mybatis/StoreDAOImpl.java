package com.solvd.deliveryservice.mybatis;

import com.solvd.deliveryservice.dao.IStoreDAO;
import com.solvd.deliveryservice.models.Store;


import java.sql.SQLException;
import java.util.List;
import org.apache.ibatis.session.SqlSession;

public class StoreDAOImpl implements IStoreDAO {
    private SqlSession sqlSession;

    public void setSqlSession(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    public List<Store> getAllStores() {
        return sqlSession.selectList("getAllStores");
    }


    public Store getStoreById(int id) {
        return sqlSession.selectOne("getStoreById", id);
    }

    public void insertStore(Store store) {
        sqlSession.insert("insertStore", store);
    }

    public void updateStore(Store store) {
        sqlSession.update("updateStore", store);
    }

    public void deleteStore(int id) {
        sqlSession.delete("deleteStore", id);
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


