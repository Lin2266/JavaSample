package Javax.xml1;


import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
/*
＜?xml version=&quot;1.0&quot; encoding=&quot;GB2312&quot;?＞ 
＜學生花名冊＞ 
　＜學生 性別 = &quot;男&quot;＞ 
　　＜姓名＞李華＜/姓名＞ 
　　＜年齡＞14＜/年齡＞ 
　　＜電話＞6287555＜/電話＞ 
　＜/學生＞ 
　＜學生 性別 = &quot;男&quot;＞ 
　　＜姓名＞張三＜/姓名＞ 
　　＜年齡＞16＜/年齡＞ 
　　＜電話＞8273425＜/電話＞ 
　＜/學生＞ 
＜/學生花名冊＞ 
準備工作做完後，接著就開始寫實質性的JAVA代碼了。為保存從XML檔讀入的資訊，需要先建一個簡單的Bean來保存學生資訊，
命名為StudentBean，代碼如下所示： 

public class StudentBean { 
　private String sex; file://學生性別 
　private String name; file://學生姓名 
　private int age; file://學生年齡 
　private String phone; file://電話號碼 
*/
//讀取xml屬性
public class NewMain1 {

    public static void main(String[] args) {

        try {
    // 可以使用絕對路勁
            File f = new File("AGROUP_APRCDST.xml");
// 返回documentBuilderFactory對象
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
// documentBuilder為抽象不能直接實例化(將XML文件轉換為DOM文件)
// 返回db對象用documentBuilderFatory對象獲得返回documentBuildr對象
            DocumentBuilder db = dbf.newDocumentBuilder();
// 得到一個DOM並返回給document對象
            Document dt = db.parse(f);
// 得到一個elment根元素
            Element element = dt.getDocumentElement();
// 獲得根節點
//System.out.println("根元素：" + element.getNodeName());

// 獲得根元素下的子節點
            NodeList childNodes = element.getChildNodes();

// 遍歷這些子節點
            for (int i = 0; i < childNodes.getLength(); i++) {
// 獲得每個對應位置i的結點
                Node node1 = childNodes.item(i);

                if ("AGROUP_APRCDST".equals(node1.getNodeName())) {
// 如果節點的名稱為"Account"，則輸出Account元素屬性type

//System.out.println("\r\n找到一篇賬號. 所屬區域: " + node1.getAttributes().getNamedItem("gNAME").getNodeValue() + ". ");
// 獲得下的節點
                    NodeList nodeDetail = node1.getChildNodes();
// 遍歷下的節點
                    for (int j = 0; j < nodeDetail.getLength(); j++) {
// 獲得元素每一個節點
                        Node detail = nodeDetail.item(j);
                        if ("gNAME".equals(detail.getNodeName())) // 輸出code
                        {
                            System.out.println("名字: " + detail.getTextContent());
                        } else if ("SCODE".equals(detail.getNodeName())) // 輸出pass
                        {
                            System.out.println("代碼: " + detail.getTextContent());
                        }
//else if ("gNAME".equals(detail.getNodeName())) // 輸出name
//System.out.println("名字: " + detail.getTextContent());
//else if ("money".equals(detail.getNodeName())) // 輸出money
//System.out.println("餘額: " + detail.getTextContent());
                    }
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
