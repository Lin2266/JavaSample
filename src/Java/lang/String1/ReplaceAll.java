
package Java.lang.String1;

/*
replaceAll、replaceFirst字串取代:
replaceAll (要被取代的字串，要取代的字串)   取代全部找到的”要被取代字串”

其中replaceAll函數可以使用正規表示式來做整批有規則性的取代
*/
public class ReplaceAll {

    public static void main(String[] args) {
        String replaceString = "blog.yslifes.com,blog.yslifes.com";
        String replaced = replaceString.replaceAll("yslifes", "my");
        //All取代後的字串:www.yslifes.com,www.yslifes.com
        System.out.println("All取代後的字串:"+replaced);
        
    }
    
}
