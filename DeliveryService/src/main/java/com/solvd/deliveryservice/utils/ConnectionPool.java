package com.solvd.deliveryservice.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Properties;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.function.Supplier;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class ConnectionPool {
    Logger logger = Logger.getLogger(ConnectionPool.class.getName());
    private static ConnectionPool instance;
    private static final int MAX_CONNECTIONS = 10;
    public Object returnConnection;
    private LinkedBlockingQueue<Connection> availableConnections;
    private String url;
    private String username;
    private String password;

    private ConnectionPool() throws InterruptedException, SQLException {
        try {
            Properties prop = new Properties();
            prop.load(new FileInputStream("C:\\Users\\House Games\\eclipse-workspace\\deliveryService\\src\\main\\resources\\properties\\config.properties"));
            url = prop.getProperty("db.url");
            username = prop.getProperty("db.username");
            password = prop.getProperty("db.password");
            availableConnections = new LinkedBlockingQueue<Connection>();
            for (int i = 0; i < MAX_CONNECTIONS; i++) {
                Connection connection = instance.getConnection();
                availableConnections.add(connection);
            }
        } catch (IOException e) {
            logger.info((Supplier<String>) e);
        }
        this.availableConnections = availableConnections;
    }


    public synchronized Connection getConnection() throws InterruptedException{
        Connection connection = availableConnections.take();
        return connection;
    }

    public void close() {
        for (Connection connection : availableConnections) {
            connection.close();
        }
    }

    public static ConnectionPool getInstance() throws InterruptedException, SQLException {
        if (instance == null) {
            instance = new ConnectionPool();
        }
        return instance;
    }

    public void putConnection(java.sql.Connection connection) {
    }

    public void returnConnection(java.sql.Connection conn) {
    }
}