package com.solvd.deliveryservice.mybatis;

import com.solvd.deliveryservice.dao.IUserDAO;
import com.solvd.deliveryservice.models.User;

import org.apache.ibatis.session.SqlSession;

import java.sql.SQLException;
import java.util.List;

public class UserDAOImpl implements IUserDAO {
    private SqlSession sqlSession;

    public void setSqlSession(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    public User getUserById(int id) {
        return sqlSession.selectOne("getUserById", id);
    }

    public User getUserByUsername(String username) {
        return sqlSession.selectOne("getUserByUsername", username);
    }

    public void insertUser(User user) {
        sqlSession.insert("insertUser", user);
    }

    public void updateUser(User user) {
        sqlSession.update("updateUser", user);
    }

    public void deleteUser(int id) {
        sqlSession.delete("deleteUser", id);
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

    public List getAllUsers() {
        return null;
    }
}




