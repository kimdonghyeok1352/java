import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.SQLException;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.SQLException;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.SQLException;

public class db {

  public static Connection con;

  public static Connection get() throws SQLException {

   Connection conn=null;

   try {

    String id="sys as sysdba";

    String pw="1234";

    String url="jdbc:oracle:thin:@172.16.7.67:1521/xepdb1";

    //JDBC ����̹��� �ε��ϴ� �ڵ�

    Class.forName("oracle.jdbc.driver.OracleDriver");

    conn=DriverManager.getConnection(url, id, pw);

    

    System.out.println("�����ͺ��̽��� ����ƴ�\n");

    

   }catch(ClassNotFoundException c) {

    System.out.println("�ε� ����");

   }catch(SQLException s) {

    System.out.println("�����ͺ��̽� ���� ����");

   } 

   return conn;

  }

  

}