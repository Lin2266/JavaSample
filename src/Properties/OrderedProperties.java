package Properties;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Properties;
import java.util.Set;


public class OrderedProperties extends Properties {

    private static final long serialVersionUID = -4627607243846121965L;
    private final LinkedHashSet keys = new LinkedHashSet();

    public Enumeration keys() {
        return Collections.enumeration(keys);
    }

    public Object put(Object key, Object value) {
        keys.add(key);
        return super.put(key, value);
    }

    public Set keySet() {
        return keys;
    }

    public Set stringPropertyNames() {
        Set set = new LinkedHashSet();
        for (Object key : this.keys) {
            set.add((String) key);
        }
        return set;
    }

    public static void main(String[] args) throws IOException {
        Properties p = new OrderedProperties();
        p.load(new FileReader(new File("F:\\\\JAVA_C\\\\eclipse-jee-2018-09-win32-x86_64\\\\專案\\\\JavaSample\\\\src\\\\Properties\\\\other.properties")));
        p.getProperty("jlejwf");
        p.getProperty("dsawe");
        p.getProperty("ljew");
        p.getProperty("iewdc");
        
        Set keyset = p.keySet();

        Iterator it = keyset.iterator();
        while(it.hasNext()){
             String key = (String)it.next();
             String value = p.getProperty(key);
            //有了鍵就可以通過map集合的get方法獲取其對應的値
            
            System.out.println( key + ":" + value );
            //key:01, vaule: a  key: 02,vaule: b  key: 03, vaule: c
        }
            
       

        p.setProperty("jlejwf", "11");
        p.setProperty("dsawe", "22");
        p.setProperty("ljew", "33");
        p.setProperty("iewdc", "44");

        p.store(new FileWriter(new File("F:\\\\JAVA_C\\\\eclipse-jee-2018-09-win32-x86_64\\\\專案\\\\JavaSample\\\\src\\\\Properties\\\\other.properties")), "");

//通過 keys(), keySet() 或 stringPropertyNames 來遍歷都能保證按檔案中的順序輸出
    }

}
