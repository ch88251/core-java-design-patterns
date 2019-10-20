package com.cfhayes.patterns.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbSingleton {

  private static volatile DbSingleton instance = null;
  private static volatile Connection conn = null;

  private DbSingleton() {
    try {
      DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  public static DbSingleton getInstance() {
    if (instance == null) {
      synchronized (DbSingleton.class) {
        if (instance == null) {
          instance = new DbSingleton();
        }
      }
    }
    return instance;
  }

  public Connection getConnection() {
    if (conn == null) {
      synchronized (DbSingleton.class) {
        if (conn == null) {
          try {
            String dbUrl = "jdbc:derby:memory:patterns/demo;create=true";
            conn = DriverManager.getConnection(dbUrl);
          } catch (SQLException e) {
            e.printStackTrace();
          }
        }
      }
    }

    return conn;
  }

  public void closeConnection() {
    if (conn != null) {
      try {
        conn.close();
        conn = null;
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
  }
}
