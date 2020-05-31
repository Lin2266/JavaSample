
package Java.util.regex1;

import java.util.regex.Pattern;

/*
java.util.*函式庫中提供許多好用的工具，眾所皆知的就是Collection、Framework(骨架)集合函式庫，除此之外還針對正則運算式
(Regular Expression,簡稱Regex或RegExp)提供了java.util.regex.*套件函式庫，針對String提供了Pattern(模式)與Matcher(匹配)
這二個工具類別，而對Stream(串流)也提供了Formatter(格式化)與Scanner(掃描器)這二個工具類別在util.*裡

Pattern正則樣式(正則運算式)可用來將字串或字串的一部份加以樣式化，常見於搜尋或取代的效果上，正則運算式的基本標示符號有:
Regex基本標示符號       描述
.                       任意一個字元
*                       任意多個字元(包含0)
+                       任意多個字元(不包含0)
?                       任意0個或1個字元
-                       範圍Range
|                       分隔樣式
^                       一行的開頭
$                       一行的結尾
[]                      在[]中的任意一個字元
[^]                     非在[]中的任意一個字元
{n}                     包含前面的字元n個
{n,}                    包含前面的字元n個以上
{n,m}                   包含前面的字元n個以上，m個以下

利用compile()來編譯樣式，是static方法
方法名稱                            回傳值      說明
compile(String regex)               Patterm     將所設定的比對樣式regex與以編譯
compile(String regex,int flags)     Patterm     將所設定的比對樣式regex(樣式)與flags(旗標)比對旗標一同予以編譯

比對旗標(match flag):
在資料比對時所使用的記號，用來判別資料比對時是否要忽略大小寫？是否允許","號？或處理多行模式的比對。
Pattern所提供的比對旗標共有八種，這八種旗標中除了CANON_EQ與LITERAL這二個flag之外，其餘皆各自有嵌入比對旗標表示法:
比對旗標            嵌入比對旗標        說明
CANON_EQ            無                  完全正則化相等模式
CASE_INSENSITIVE    (?!)                忽略大小寫模式
COMMENTS            (?x)                允許有空白與註解
DOTALL              (?s)                允許"."與換行符號
LITERAL             無                  literal(原字面)上直接分析
MULTILINE           (?m)                多行模式
UNICODE_CASE        (?u)                以Unicode為基礎忽略大小寫
UNIX_LINES          (?d)                Unix換行模式

*/
public class Pattern1 {
    /*
    『.』:任意一個字元
    "ABC."這個字串可以表示為"ABCD"或ABC2...等。
    "A.B"表示A與B之間可以有任何一個字元，"ACB"或"AZB"...。
    『*』:任意多個字元
    "A*B"表示A與B之間可以有任意多個字元，"ACB"或"AXYZB"...。
    『[]』:在[]中的任意一個字元
    "ABC[XYZ]"表示在ABC字串後面只能是X或Y或Z其中一個字元，"ABCX"、"ABCY"、"ABCZ"。
    『-』:範圍(Range)
    "ABC[A-F]"表示在ABC字串後可以再加入範圍從A~F中的任意一個字元，"ABCA"、"ABCB"、"ABCF"。
    『|』:分隔樣式的符號
    "ABC[A|ABC|1234]"表示[]中的資訊被分成三種樣式，分別是A、ABC、1234，ABC字串後可以加入中任一種樣式，
                     因此"ABCA"、"ABCABC"、"ABC1234"。
    『n,m』:包含前面的字元n個以上，m個以下
    "ABC[A-F]{2,3}表示字串"ABC後面只要再加上2~3個範圍從A-F當中的字元就可以，"ABCFE"、"ABCACD"。
    
    
    */
  
    public static void main(String[] args) {
        //若要同時比對多種旗標，可利用『|』運算子:
        Pattern ptn = Pattern.compile("ABC[A-F]{2,3}",Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
        
        
        
    }
    
}
