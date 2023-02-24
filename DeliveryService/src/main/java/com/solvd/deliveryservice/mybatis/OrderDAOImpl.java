package com.solvd.deliveryservice.mybatis;

import java.sql.SQLException;
import java.util.List;

import com.solvd.deliveryservice.dao.IOrderDAO;
import com.solvd.deliveryservice.models.Order;

import java.util.List;
import org.apache.ibatis.session.SqlSession;

public class OrderDAOImpl implements IOrderDAO {
    private SqlSession sqlSession;

    public void setSqlSession(SqlSession sqlSession)
    {
        this.sqlSession = sqlSession;
    }


    public Order getOrderById(int id) {
        return sqlSession.selectOne("getOrderById", id);
    }


    public List<Order> getOrdersByUserId(int userId) {
        return sqlSession.selectList("getOrdersByUserId", userId);
    }


    public void insertOrder(Order order) {
        sqlSession.insert("insertOrder", order);
    }


    public void updateOrder(Order order) {
        sqlSession.update("updateOrder", order);
    }


    public void deleteOrder(int id) {
        sqlSession.delete("deleteOrder", id);
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


    public List getAllOrders() {
        return null;
    }
}

