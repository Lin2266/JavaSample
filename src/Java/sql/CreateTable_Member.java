package Java.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
 Statement敘述句是用來敘述SQL的物件
 SQL常用方法             用途
 executeQuery()          主要是執行SQL查詢語句且會回傳一個ResultSet，從資料庫所查到的紀錄每一筆都會忠實地
 存放在此物件內

 executeUpdate()         主要是執行CREATETABLE、DROPTABLE、ALTERTABLE、INSERT、DELETE與UPDATE並會得到一個異
 動筆數int值，此方法不適用select的SQL語句

 execute()               傳回值為true時，表示執行的是查詢語句、反之傳回false
 executeBatch()          配合addBatch()方法進行批次SQL語句執行
 */
public class CreateTable_Member {

    public static void main(String[] args) {
        //建立 derby connection
        try (Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
                //建立statement(敘述)實體
                Statement stmt = conn.createStatement();) {
            //建立derby driver instance,JDBC4.0之後會自動參照ClassPath建立

            //建立資料表SQL語句，id是主鍵不能是空的
            String sql = "CREATE TABLE app.MEMBER("+"ID INTEGER not null primary key,"+
                         "NAME VARCHAR(10),"+
                         "SEX VARCHAR(1),"+
                         "EMAIL VARCHAR(60)"+
                         ")";
            String sq2 = "CREATE TABLE APP.LIN(" + "ID INTEGER not null primary key,"
                    + "PASSWORD VARCHAR(10),"
                    + "EMAIL VARCHAR(60),"
                    + "BIRTHDAY VARCHAR(20)" +//不能用DATE
                    ")";
            //將建立資料表SQL語句送入至Statement物件中並傳到資料庫
            stmt.executeUpdate(sql);

        } catch (SQLException e) {
            System.out.println(e.getNextException());
        }
    }

}
