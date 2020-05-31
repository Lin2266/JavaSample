/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Properties;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class Acontroller {

    public static void main(String[] args) {
        try {
            run(new Aservice());
//            run(new Bservice());
        } catch (IOException ex) {
            Logger.getLogger(Acontroller.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void run(Oservice a) throws IOException {
        Properties p = new Properties();
        List<Properties> list = new ArrayList<>();
        p.load(new FileReader(new File("F:\\JAVA_C\\eclipse-jee-2018-09-win32-x86_64\\專案\\JavaSample\\src\\Properties\\other.properties")));
        //p.get("url1");
        p.getProperty("jlejwf");
        p.getProperty("dsawe");
        p.getProperty("ljew");
        p.getProperty("iewdc");
        list.add(p);
        for (Properties s : list) {
            System.out.println("1:"+s);
        }

        p.setProperty("jlejwf", "jdbc:mysql://localhost:3306/");
        p.setProperty("dsawe", "root");
        p.setProperty("ljew", "bbs");
        p.setProperty("iewdc", "root");
        

        p.store(new FileWriter(new File("F:\\JAVA_C\\eclipse-jee-2018-09-win32-x86_64\\專案\\JavaSample\\src\\Properties\\other.properties")), "");

//        url1 = abc
//        url2 = def
//        url3 = fgi
//        url4 = jkl


        System.out.println();
//        a.s1();
//        a.s2();
//        a.s3();

    }

}
