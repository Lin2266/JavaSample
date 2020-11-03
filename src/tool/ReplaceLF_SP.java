package tool;
/*
Version 2.0-- modified by max, 2002/5/23
改用 char 用法
2002/11/8, 改成處理 5 個 xml 保留字元
    >  --> &gt;
    <  --> &lt;
    "  --> &quot;
    '  --> &apos;
    &  --> &amp;
    &#22531; --> &#22531; // 方方土
Version 2.1-- 2002/12/15, 改寫 ReplaceLF_SP 可使用字串長度.
Version 2.2-- 2003/8/10, 增加 ReplaceBlnk_SP. 將 5 個保留字元及 unicode 換成空白字

*/

import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;

public class ReplaceLF_SP{
  private static Log log = LogFactory.getLog(ReplaceLF_SP.class);
  public static final int SNOY_LENGTH = 3;
  public static final int SNO_LENGTH = 8;
  public String ReplaceLF_SP(String str) {
    return this.ReplaceLF_SP(str, -1);
  }
  public String ReplaceLF_SP(String str, int limit) {
    try
    {
      if (str==null || str=="") return "";
      char[] ca= str.toCharArray();
      StringBuilder nstr= new StringBuilder(1000);
      int len= ca.length;
      int ulen=0;
      int j, utf=0;
      char tt, st;
      for (int i=0; i<len; i++)
      {
        if (ulen >= limit && limit >0) {
          nstr.append("...");
          break;
        }
        tt= ca[i];
        if (tt==10 || tt==13) nstr.append(' ');  // LF
        else if (tt=='>') nstr.append("&gt;");   // >
        else if (tt=='<') nstr.append("&lt;");   // <
        else if (tt==34) nstr.append("&quot;");  // "
        else if (tt==39) nstr.append("&apos;");  // '
        else if (tt=='&') {
          utf=0;
          if (i+7 < len) { // 要處理方方土, &#22531;
            st= ca[i+1];
            if (st=='#') {
              utf=1;
              for (j=2; j<7; j++)
              {
                if (!Character.isDigit(ca[i+j])) utf=0;
              }
              if (utf==1)
              {
                if (ca[i+7] !=';') utf=0;
              }
              if (utf==1)
              {
                nstr.append("&#");
                for (j=2; j<7; j++) nstr.append(ca[i+j]);
                nstr.append(';');
                i+= 7;
              }
            }
          }
          if (utf==0)
          {
            nstr.append("&amp;");
          }
        }else if (tt=='$') nstr.append('＄');  // $
        else nstr.append(tt);
        ulen ++;
      }
      String xstr= nstr.toString();
      return xstr;
    }
    catch (Exception e) { return null; }
  }
  public static String ReplaceLF(String str) {
    try
    {
      if (str==null || str=="") return "";
      char[] ca= str.toCharArray();
      StringBuilder nstr= new StringBuilder(1000);
      int len= ca.length;
      char tt;
      for (int i=0; i<len; i++)
      {
        tt= ca[i];
        if (tt==10 || tt==13) nstr.append(' ');  // LF
        else nstr.append(tt);
      }
      String xstr= nstr.toString();
      return xstr;
    }
    catch (Exception e) { return null; }
  }
  //-------------------------------------------------------------------------------
  // 2003/8/10, ReplaceBlank_SP
  //-------------------------------------------------------------------------------
  public String ReplaceBlank_SP(String str) {
    return this.ReplaceBlank_SP(str, -1);
  }
  public String ReplaceBlank_SP(String str, int limit) {
    try
    {
      if (str==null || str=="") return "";
      char[] ca= str.toCharArray();
      StringBuilder nstr= new StringBuilder(1000);
      int len= ca.length;
      int ulen=0;
      int j, utf=0;
      char tt, st;
      for (int i=0; i<len; i++)
      {
        if (ulen >= limit && limit >0) {
          nstr.append("...");
          break;
        }
        tt= ca[i];
        if (tt==10 || tt==13) nstr.append(' ');  // LF
        else if (tt=='>') nstr.append('＞');   // >
        else if (tt=='<') nstr.append('＜');   // <
        else if (tt==34) nstr.append('”');  // "
        else if (tt==39) nstr.append('’');  // '
        else if (tt=='&') {
          utf=0;
          if (i+7 < len) { // 要處理方方土, &#22531;
            st= ca[i+1];
            if (st=='#') {
              utf=1;
              for (j=2; j<7; j++)
              {
                if (!Character.isDigit(ca[i+j])) utf=0;
              }
              if (utf==1)
              {
                if (ca[i+7] !=';') utf=0;
              }
              if (utf==1)
              {
                nstr.append(' ');
                i+= 7;
              }
            }
          }
          if (utf==0)
          {
            nstr.append('＆');
          }
        }else if (tt=='$') nstr.append('＄');  // $
        else nstr.append(tt);
        ulen ++;
      }
      String xstr= nstr.toString();
      return xstr;
    }
    catch (Exception e) { return null; }
  }

  /**
   * 是否傳入字串有半形符號(共八種：!@#$%^&')，不處理於html顯示的難字或特殊符號
   * @param str
   * @return
   */
  public static boolean isReplaceBlankSymbol(String str){
      if (str==null || str=="") return false;
      char[] ca= str.toCharArray();
      int len= ca.length;
      char tt;

      for (int i=0; i<len; i++)
      {
          tt= ca[i];
          
          if(tt=='!') return true;//處理半形!
          if(tt=='@') return true;//處理半形@
          if(tt=='#' && checkSymbol1(str, i)) return true;//處理半形#
          if(tt=='$') return true;//處理半形$
          if(tt=='%') return true;//處理半形%
          if(tt=='^') return true;//處理半形^
          if(tt=='&' && checkSymbol2(str, i)) return true;//處理半形&
          if(tt=='\'') return true;//處理半形'
      }
      return false;
  }
  /**
   * 將半形符號轉為全形符號(共八種：!@#$%^&')，不處理於html顯示的難字或特殊符號
   * @param str
   * @return
   */
  public static String ReplaceBlankSymbol(String str){
      if (str==null || str=="") return "";
      char[] ca= str.toCharArray();
      int len= ca.length;
      char tt;

      for (int i=0; i<len; i++)
      {
          tt= ca[i];
          if(tt=='!') ca[i] = '！';//處理半形!
          if(tt=='@') ca[i] = '＠';//處理半形@
          if(tt=='#' && checkSymbol1(str, i)) ca[i] = '＃';//處理半形#
          if(tt=='$') ca[i] = '＄';//處理半形$
          if(tt=='%') ca[i] = '％';//處理半形%
          if(tt=='^') ca[i] = '︿';//處理半形^
          if(tt=='&' && checkSymbol2(str, i)) ca[i] = '＆';//處理半形&
          if(tt=='\'') ca[i] = '’';//處理半形'
      }
      return String.valueOf(ca);
  }
  private static boolean checkSymbol1(String str, int n){
      if (str==null || str=="") return false;
      char[] ca= str.toCharArray();
      char tt= ca[n];

      if(tt=='#'){//處理半形#
          String tmp = str.substring(n-1);
          if(tmp.matches("^&#[0-9]{5};.*$")
                  || tmp.matches("^&#[xX]{1}[0-9a-fA-F]{4};.*$"))
          {
              //html顯示難字
          }else{
              return true;
          }
      }
      return false;
  }
  private static boolean checkSymbol2(String str, int n){
      if (str==null || str=="") return false;
      char[] ca= str.toCharArray();
      char tt= ca[n];

      if(tt=='&'){//處理半形&
          String tmp = str.substring(n);
          if(tmp.matches("^&#[0-9]{5};.*$")
                  || tmp.matches("^&#[xX]{1}[0-9a-fA-F]{4};.*$"))
          {
              //html顯示難字
          }else if(tmp.matches("^&[a-z]{1,6};.*$")
                  || tmp.matches("^&[a-z]{3}[0-9]{1};.*$")
                  || tmp.matches("^&[a-z]{4}[0-9]{2};.*$")
                  || tmp.matches("^&[a-z]{5}[0-9]{1};.*$"))
          {
              //html顯示特殊符號
          }else{
              return true;
          }
      }
      return false;
  }
  //20060810 adar add 將xml_str中 & < ' " 等字元置換掉
  public String ReplaceXmlStr(String str) {
    try
    {
      if (str==null || "".equals(str)) return "";
      while(str.indexOf("&")!=-1){
        str = str.substring(0,str.indexOf("&"))+"＆"+str.substring(str.indexOf("&")+1);
      }
      while(str.indexOf("<")!=-1){
        str = str.substring(0,str.indexOf("<"))+"＜"+str.substring(str.indexOf("<")+1);
      }
      while(str.indexOf(">")!=-1){
        str = str.substring(0,str.indexOf(">"))+"＞"+str.substring(str.indexOf(">")+1);
      }
      while(str.indexOf("'")!=-1){
        str = str.substring(0,str.indexOf("'"))+"’"+str.substring(str.indexOf("'")+1);
      }
      while(str.indexOf("\"")!=-1){
        str = str.substring(0,str.indexOf("\""))+"”"+str.substring(str.indexOf("\"")+1);
      }
      //20061101 adar 增加取代掉換行
      while(str.indexOf("\r")!=-1){
        str = str.substring(0,str.indexOf("\r"))+""+str.substring(str.indexOf("\r")+1); //20070306 adar 換成空字串，保留原狀況
      }
      while(str.indexOf("\n")!=-1){
        str = str.substring(0,str.indexOf("\n"))+"◎"+str.substring(str.indexOf("\n")+1); //20060226 adar 換行符號指定特定符號
      }
      //20061101 adar 增加取代掉換行 end
      return str;
    }catch (Exception e) { return null; }
  }
  public String ReplaceWhereStmt(String wstr,String snoy,String sno,int maxlen) {
    try{
      boolean AddY=true;
      String year0="";
      if (sno==null || "".equals(sno)) return "";
      if(snoy==null || "".equals(snoy))snoy="";
      while (snoy.length()>0){
        if(snoy.charAt(0)=='0') snoy=snoy.substring(1);
        else break;
      }
      if(snoy.length()>=3){
        snoy = snoy.substring(0, 3);
        year0="";
        AddY=false;
      }else{
        for(int i=0;i<3-snoy.length();i++) year0+="0";
        AddY=true;
      }
      StringBuilder str = new StringBuilder();
      str.append(" "+wstr+" in(");
      int max_no=maxlen-snoy.length()-sno.length();
      if(max_no<0) max_no=0;
      int min_no=7;//預設最少7碼
      if(maxlen<min_no) min_no=maxlen;//若要取的長度比較小，就改取傳入長度
      min_no=min_no-snoy.length()-sno.length();
      if(min_no<0) min_no=0;

      if(maxlen<=0 || max_no<=0){
        //若超過最大長度，最少要查基本的文號
        if(!AddY) str.append("'"+snoy+sno+"'");
        else str.append("'"+snoy+sno+"','"+year0+snoy+sno+"'");
      }else{
        String tmpStr1="";
        String tmpStr2="";
        for(int i=0;i<min_no;i++) tmpStr1+="0";
        for(int i=0;i<=(max_no-min_no);i++){
          if(i!=0) str.append(",");
          tmpStr2="";
          for(int j=0;j<i;j++) tmpStr2+="0";
          str.append("'"+snoy+tmpStr1+tmpStr2+sno+"'");
        }
        if(AddY){
          tmpStr1="";
          for(int i=0;i<(min_no-year0.length());i++) tmpStr1+="0";
          int no=0;
          if(min_no<year0.length()) no=year0.length()-min_no;
          for(int i=0;i<=(max_no-min_no-no);i++){
            tmpStr2="";
            for(int j=0;j<i;j++) tmpStr2+="0";
            str.append(",'"+year0+snoy+tmpStr1+tmpStr2+sno+"'");
          }
        }
      }
      str.append(")");
      return str.toString();
    }catch (Exception e) { return null; }
  }

  public String ReplaceWhereStmt(String wstr,String snoy,String sno1,String sno2,String length) { //20061204 adar add 適用於文號區間，例如：wdcs5a401收發文號對照表
    try{
      if (sno1==null || "".equals(sno1)) return "";
      if (sno2==null || "".equals(sno2)) return "";
      if(snoy==null)snoy="";
      else if(snoy.length()==3 && "0".equals(snoy.substring(0,1)))snoy=snoy.substring(1,3);
      else if(snoy.length()>3)snoy=snoy.substring(0,3);
      else if(sno1.length()>8)sno1=sno1.substring(0,8);
      else if(sno2.length()>8)sno2=sno2.substring(0,8);

      StringBuilder str = new StringBuilder();

      if("".equals(snoy)){
        str.append(" "+wstr+" >= '"+sno1+"' and "+wstr+" <= '"+sno2+"' ");
      }else{
        while(sno2.length() < 5){
          sno2="0"+sno2;
        }
        while(sno1.length() < 5){
          sno1="0"+sno1;
        }

        if(sno2.length()> sno1.length()){
          while(sno1.length() != sno2.length()){
            sno1="0"+sno1;
          }
        }
        if(sno2.length()< sno1.length()){
          while(sno1.length() != sno2.length()){
            sno2="0"+sno2;
          }
        }

        str.append("(");
        if(sno2.length() + snoy.length() <= 10){
          str.append(" ( "+wstr+" >= '"+snoy+sno1+"' and "+wstr+" <= '"+snoy+sno2+"' and "+length+"("+wstr+")="+(sno2.length() + snoy.length())+" )");
          str.append(" or ");
        }
        if(sno2.length() + snoy.length() <= 9){
          str.append(" ( "+wstr+" >= '"+snoy+"0"+sno1+"' and "+wstr+" <= '"+snoy+"0"+sno2+"' and "+length+"("+wstr+")="+(sno2.length() + snoy.length() + 1)+" )");
          str.append(" or ");
        }
        if(sno2.length() + snoy.length() <= 8){
          str.append(" ( "+wstr+" >= '"+snoy+"00"+sno1+"' and "+wstr+" <= '"+snoy+"00"+sno2+"' and "+length+"("+wstr+")="+(sno2.length() + snoy.length() + 2)+" )");
          str.append(" or ");
        }
        if(sno2.length() + snoy.length() <= 7){
          str.append(" ( "+wstr+" >= '"+snoy+"000"+sno1+"' and "+wstr+" <= '"+snoy+"000"+sno2+"' and "+length+"("+wstr+")="+(sno2.length() + snoy.length() + 3)+" )");
          str.append(" or ");
        }

        while(sno2.length() <7){
          sno2="0"+sno2;
          sno1="0"+sno1;
        }

        if(snoy.length() == 3){
          str.append(" ( "+wstr+" >= '"+snoy+sno1+"' and "+wstr+" <= '"+snoy+sno2+"' and "+length+"("+wstr+")="+(sno2.length()+snoy.length())+" )");
          str.append(" or ");
          str.append(" ( "+wstr+" >= '"+snoy+"0"+sno1+"' and "+wstr+" <= '"+snoy+"0"+sno2+"' and "+length+"("+wstr+")="+(sno2.length()+snoy.length()+1)+" )");
        }else{
          str.append(" ( "+wstr+" >= '0"+snoy+sno1+"' and "+wstr+" <= '0"+snoy+sno2+"' and "+length+"("+wstr+")="+(sno2.length()+snoy.length())+")");
          str.append(" or ");
          str.append(" ( "+wstr+" >= '0"+snoy+"0"+sno1+"' and "+wstr+" <= '0"+snoy+"0"+sno2+"' and "+length+"("+wstr+")="+(sno2.length()+snoy.length()+1)+")");
        }
        str.append(")");
      }
      return str.toString();
    }catch (Exception e) { return null; }
  }
  //Fixed length: 11碼
  public String ReplaceWhereStmtFixedLength11(String wstr,String snoy,String sno1,String sno2) {
    try{
      StringBuilder str = new StringBuilder();
      while(snoy.length() <SNOY_LENGTH){
        snoy = "0"+snoy;
      }
      while(sno1.length() <SNO_LENGTH){
        sno1="0"+sno1;
      }
      while(sno2.length() <SNO_LENGTH){
        sno2="0"+sno2;
      }
      str.append(" ( "+wstr+" >= '"+snoy+sno1+"' and "+wstr+" <= '"+snoy+sno2+"' )");
      return str.toString();
    }catch (Exception e) { return null; }
  }
}

