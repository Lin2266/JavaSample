
package Java.lang.String1;

/*
replaceAll、replaceFirst字串取代:
replaceAll (要被取代的字串，要取代的字串)   取代全部找到的”要被取代字串”

replaceFirst (要被取代的字串，要取代的字串)  取代第一個找到的”要被取代字串”

其中replaceAll函數可以使用正規表示式來做整批有規則性的取代
*/
public class ReplaceAll_ReplaceFirst {

    public static void main(String[] args) {
        String replaceString = "blog.yslifes.com,blog.yslifes.com";
        String replaced = replaceString.replaceAll("blog", "www");
        System.out.println("All取代後的字串:"+replaced);
        //All取代後的字串:www.yslifes.com,www.yslifes.com
        
        replaced = replaceString.replaceFirst("blog", "www");
        System.out.println("First取代後的字串:"+replaced);
        //First取代後的字串:www.yslifes.com,blog.yslifes.com
    }
    
}
