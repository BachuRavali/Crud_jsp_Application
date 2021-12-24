package com.util;


import java.sql.Connection;
import java.sql.DriverManager;
public class Database {
      public static Connection getConnection() {
          try  {
              Class.forName("com.mysql.cj.jdbc.Driver");
              Connection con = DriverManager.getConnection
                      ("jdbc:mysql://localhost:3306/company2",
                      "root","Ravali@1499");
              return con;
          }
          catch(Exception ex) {
              System.out.println("Database.getConnection() Error -->" + ex.getMessage());
              return null;
          }
      }
 
       public static void close(Connection con) {
          try  {
              con.close();
          }
          catch(Exception ex) {
          }
      }
}