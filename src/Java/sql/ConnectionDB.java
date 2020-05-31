
package Java.sql;

import java.sql.Connection;
import java.sql.DriverManager;


/*
IDE與Derby資料庫連線:
java7內建Derby資料庫路徑為C:\Program\Java\jdk...\db\lib，連線設定在Services標籤並在jdbc:derby://...按右鍵即可連線
IDE專案匯入Derby開發資源包:
lib目錄下匯入五個資源包:1.derby.jar,2.derbyLocal_zh_TW.jar,3.derbyclient.jar,4.derbynet,jar,5.derbytools.jar

分析:"jdbc:derby://localhost:1527/sample","app","app"   說明
"jdbc:derby://localhost:1527/"                          定義derby通訊協定與位置
                                                        jdbc:表示主協定
                                                        derby:表示次協定
"sample"                                                連線後所指向的資料庫名稱
"app","app"                                             Derby預設使用者名稱與密碼
*/
public class ConnectionDB {
    //JDBC API核心接口與資料庫連結
    public static void main(String[] args) {
        //建立derby connection
        try (Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/sample","app","app")){  
            //建立derby driver instance,4.0以前用Class.forName()建立實體，JDBC4.0之後會自動參照ClassPath建立
            Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
