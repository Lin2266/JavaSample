package Java.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReader2 {

	public static void main(String[] args) {
		//字串
		System.out.println("pls input string= ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String string = br.readLine();
			System.out.println("您所輸入的是字串 not 整數 int num : " + string +"+2= " + (string+2));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
