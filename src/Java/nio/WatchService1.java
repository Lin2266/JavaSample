
package Java.nio;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.text.SimpleDateFormat;
import java.util.Date;


//監控資源
//java7可透過WatchService(監聽服務)介面接口來監控指定目錄下的資源
public class WatchService1 {

    public static void main(String[] args) throws Exception {//有兩種例外
        //要監聽的目錄
        Path dir = Paths.get("F:/JAVA_C/LIN/");
        WatchService ws = FileSystems.getDefault().newWatchService();
        //註冊，要監聽的事件有建立、刪除、修改
        dir.register(ws,
                StandardWatchEventKinds.ENTRY_CREATE,//標準監聽事件種類，項目建立
                StandardWatchEventKinds.ENTRY_DELETE,//項目刪除
                StandardWatchEventKinds.ENTRY_MODIFY);//項目修改，會顯示刪除、建立、在修改
        while(true){
            System.out.println("系統監聽中...");
            WatchKey watchKey = ws.take();//調用take(採取)開始監聽，有間斷例外
            //監聽目錄若在任意時間點上有下建立、刪除、修改檔案或目錄發生會執行下列分析該事件資料
            for(WatchEvent<?> event: watchKey.pollEvents()){
                //事件種類的名字 + 事件上下文字串
                System.out.println(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()) +
                        "事件:" + event.kind().name() + "," + "資源:" + event.context().toString());
            }
            watchKey.reset();//監聽器重置
        }
    }
    
}
