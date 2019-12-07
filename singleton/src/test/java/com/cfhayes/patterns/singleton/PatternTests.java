package com.cfhayes.patterns.singleton;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PatternTests {

    @Test
    @DisplayName("Requesting two instance of a singleton should return the same instance")
    public void testScenario1() {
        DbSingleton singleton1 = DbSingleton.getInstance();
        DbSingleton singleton2 = DbSingleton.getInstance();

        int hashCode1 = singleton1.hashCode();
        int hashCode2 = singleton2.hashCode();

        assertTrue(hashCode1 == hashCode2);

    }

    @Test
    @DisplayName("Create a database connection using the singleton")
    public void testScenario2() throws Exception {
        DbSingleton singleton = DbSingleton.getInstance();
        Connection conn = singleton.getConnection();
        Statement statement = conn.createStatement();
        statement.executeUpdate("create table books(title varchar(20))");
        statement.close();

        statement = conn.createStatement();
        String ins1 = "insert into books(title) values('The Big One')";
        statement.executeUpdate(ins1);
        conn.commit();

        ResultSet rs = statement.executeQuery("select * from books");
        int fetchSize = rs.getFetchSize();
        assertEquals(1, fetchSize);
    }
}
