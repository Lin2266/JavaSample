package Java.net;

import java.net.InetAddress;

public class Ip {

	public static void main(String[] args) {
		try{
		      InetAddress ownIP=InetAddress.getLocalHost();
		      System.out.println("IP of my system is := "+ownIP.getHostAddress());
		    }catch (Exception e){
		      System.out.println("Exception caught ="+e.getMessage());
		    }

	}

}
