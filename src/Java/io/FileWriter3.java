package Java.io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter3 {

	public static void main(String[] args) {
		//創健要操作的文件路徑和名稱
		//其中，File.separator表示系統相關的分隔符，Linux下為:/ Windows下為:\\ ，src/不適合用此方法
		//String path = File.separator + "src" + File.separator + "LIN" + File.separator + "new.txt";
		String path = "src/LIN/new.txt";
		//由於io操作會拋出異常，因此在try語句塊的外部定義FileWriter的引用
		FileWriter fw = null;
		try {
			//以path為路徑創建一個新的FileWriter對象
			//如果需要追加數據，而不是覆蓋，則使用FileWriter(path,true)構造方法
			fw = new FileWriter(path);
			
			//將字符串寫入到流中，\r\n表示換行想有好的
			fw.write("Nerxious is a good boy\r\n");
			//如果想馬上看到寫入效果，則需要調用w.flush()方法
			fw.flush();						
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			//如果前面發生異常，那麼是無法產生fw對象的
			//因此要做出判斷，以免發生空指針異常
			if(fw!=null) {
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
