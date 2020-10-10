package Properties;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

import com.sun.security.ntlm.Client;

public class Properties1 {

	public static void main(String[] args) {
		Properties prop = new Properties();
		try {
			prop.load(new InputStreamReader(Client.class.getClassLoader().getResourceAsStream("config.properites")));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
