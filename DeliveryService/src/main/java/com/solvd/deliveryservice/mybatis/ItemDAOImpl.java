package com.solvd.deliveryservice.mybatis;

import com.solvd.deliveryservice.dao.IItemDAO;
import com.solvd.deliveryservice.models.Item;

import java.sql.SQLException;
import java.util.List;
import org.apache.ibatis.session.SqlSession;

public class ItemDAOImpl implements IItemDAO {
    private SqlSession sqlSession;

    public void setSqlSession(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    public Item getItemById(int id) {
        return sqlSession.selectOne("getItemById", id);
    }

    public List<Item> getAllItems() {
        return sqlSession.selectList("getAllItems");
    }

    public void insertItem(Item item) {
        sqlSession.insert("insertItem", item);
    }

    public void updateItem(Item item) {
        sqlSession.update("updateItem", item);
    }

    public void deleteItem(int id) {
        sqlSession.delete("deleteItem", id);
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


