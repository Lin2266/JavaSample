package Java.lang.String1;

public class ReplaceFirst {

	public static void main(String[] args) {
		//replaceFirst (要被取代的字串，要取代的字串)  取代第一個找到的”要被取代字串”

		String replaceString = "www.yslifes.com,blog.yslifes.com";
        String replaced = replaceString.replaceFirst("com", "com1");
        //First取代後的字串:www.yslifes.com1,blog.yslifes.com
        System.out.println("First取代後的字串:"+replaced);
        

	}

}
