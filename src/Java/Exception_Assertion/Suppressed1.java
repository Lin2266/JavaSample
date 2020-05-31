
package Java.Exception_Assertion;

import java.io.IOException;
import java.sql.SQLException;
//壓制，7.0例外壓制處理
//目的是讓例外可以透過addSuppressed()先收集起來，最後再透過getSuppressed()取出
//並進行各項例外物件的處理與記錄
public class Suppressed1 {

    public static void main(String[] args) {
        Throwable tw = new Throwable();
        //將錯誤例外加入到suppressed pool中，取出的回傳值型態是Throwable[]
        try {
            throw new IOException("IO 例外");
        } catch (IOException e) {
            tw.addSuppressed(e);
        }
        try {
            throw new SQLException("SQL 例外");
        } catch (SQLException e) {
            tw.addSuppressed(e);
        }
        
        Throwable[] tws = tw.getSuppressed();
        for(Throwable t : tws){
            System.out.println(t.getClass() + ":" + t.getMessage());
        }
    }
    
}
