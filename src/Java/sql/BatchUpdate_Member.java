package Java.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//批次作業:若想進行批次作業以降低java資料庫程式與實體資料庫間的I/O，
//可透過addBatch()(增加批量)與executeBatch()(執行批量)來達成
public class BatchUpdate_Member {
//第一種處理批次的方式:
    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
                Statement stmt = conn.createStatement()) {
            //建立2筆記錄資料Record SQL語句, sex(性別)
            String sql = "INSERT INTO APP.Member(id,name,sex,email)"
                    + "VALUES(2,\'Anita\',\'女\',\'yahoo@xxx.xxx\')";
            String sq2 = "INSERT INTO APP.Member(id,name,sex,email)"
                    + "VALUES(3,\'Joanna\',\'女\',\'yahoo@xxx.xxx\')";
            //清除批次快取，清除list集合的sql語句，否則會造成內存溢出
            stmt.clearBatch();
            //優點：(addBatch())發送的是預編譯後的SQL語句，執行效率高。
            //缺點：只能應用在SQL語句相同，但參數不同的批次處理中。
            //因此此種形式的批次處理經常用于在同一個表中批量插入數據，或批量更新表的數據。
            stmt.addBatch(sql);//就是把sql語句放在list集合中
            stmt.addBatch(sq2);
            //將批次內的SQL語句一次送到資料庫
            int[] count = stmt.executeBatch();//count計算
            int total = 0;
            for (int c : count) {
                total = total + c;
            }
            System.out.println("異動筆數:" + total);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

}
