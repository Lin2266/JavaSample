package Javax.xml1;

/*
 將示範以不同的方式從無到有的建立一份 XML 文件。
 使用 XmlDocument 物件 
 首先, 我們可以使用 XmlDocument 物件來一個節點一個節點的建立起 XML, 如下例:
 using System.Xml;
 */
public class XmlDocument1 {

    public static void main(String[] args) {
        // 建立一個 XmlDocument 物件並加入 Declaration
        XmlDocument xdoc = new XmlDocument();
        xdoc.AppendChild(xdoc.CreateXmlDeclaration("1.0", "UTF-8", "yes"));

// 建立根節點物件並加入 XmlDocument 中 (第 0 層)
        XmlElement rootElement = xdoc.CreateElement("Employees");
        xdoc.AppendChild(rootElement);

// 建立一個子元素, 並在這個子元素裡加上一個 attribute (第 1 層)
        XmlElement eleChild1 = xdoc.CreateElement("Employee");
        XmlAttribute attChild1 = xdoc.CreateAttribute("Department");
        attChild1.Value = "研發部";
        eleChild1.Attributes.Append(attChild1);
        rootElement.AppendChild(eleChild1);

// 再為這個子元素加入一個孫元素 (第 2 層)
        XmlElement eleGrandChild1 = xdoc.CreateElement("Name");
        eleGrandChild1.InnerText = "吳大寶";
        eleChild1.AppendChild(eleGrandChild1);

// 建立第二個子元素 (第 1 層)
        XmlElement eleChild2 = xdoc.CreateElement("Employee");
        XmlAttribute attChild2 = xdoc.CreateAttribute("Department");
        attChild2.Value = "總務部";
        eleChild2.Attributes.Append(attChild2);

// 建立第二個孫元素 (第 2 層)
        XmlElement eleGrandChild2 = xdoc.CreateElement("Name");
        eleGrandChild2.InnerText = "鄭小胖";
        eleChild2.AppendChild(eleGrandChild2);
        rootElement.AppendChild(eleChild2);

// 將建立的 XML 節點儲存為檔案
        xdoc.Save(MapPath("~/App_Data/Test01.xml"));
        Response.Write("XML created!");
    }

}
