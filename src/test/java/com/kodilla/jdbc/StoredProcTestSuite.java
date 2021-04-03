//package com.kodilla.jdbc;
//
//import org.junit.jupiter.api.Test;
//import java.com.kodilla.DbManager;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//public class StoredProcTestSuite {
//    @Test
//    public void testUpdateVipLevels() throws SQLException {
//        // Given
//        DbManager dbManager = DbManager.getInstance();
//        String sqlUpdate = "UPDATE READERS SET VIP_LEVEL=\"Not set\"";
//        Statement statement = dbManager.getConnection().createdStatement();
//        statement.executeUpdate(sqlUpdate);
//
//        // When
//
//    }
//
//}