package Javax.xml1;




import java.io.File;
import java.io.FileNotFoundException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
/*
<?xml version="1.0"?>
<company>
	<employee>
		<firstname>Tom</firstname>
		<lastname>Cruise</lastname>
	</employee>
	<employee>
		<firstname>Paul</firstname>
		<lastname>Enderson</lastname>
	</employee>
	<employee>
		<firstname>George</firstname>
		<lastname>Bush</lastname>
	</employee>
</company>
*/
public class XML1 {

    public static void main(String[] args) throws FileNotFoundException {

        try {
            File file = new File("AIDEA_APRCDST.xml");
DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(file);
            doc.getDocumentElement().normalize();
            System.out.println("Root element " + doc.getDocumentElement().getNodeName());
NodeList nodeLst = doc.getElementsByTagName("AIDEA_APRCDST");
System.out.println("Information of all employees");
for (int s = 0; s < nodeLst.getLength(); s++) {
                Node fstNode = nodeLst.item(s);
                if (fstNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element fstElmnt = (Element) fstNode;
                    NodeList fstNmElmntLst = fstElmnt.getElementsByTagName("gNAME");
Element fstNmElmnt = (Element) fstNmElmntLst.item(0);
                    NodeList fstNm = fstNmElmnt.getChildNodes();
                    System.out.println("First Name : "  + ((Node) fstNm.item(0)).getNodeValue());
NodeList lstNmElmntLst = fstElmnt.getElementsByTagName("SCODE");
Element lstNmElmnt = (Element) lstNmElmntLst.item(0);
                    NodeList lstNm = lstNmElmnt.getChildNodes();
                    System.out.println("Last Name : " + ((Node) lstNm.item(0)).getNodeValue());
}
}
} catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
