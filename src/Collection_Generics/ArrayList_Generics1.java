
package Collection_Generics;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Generics1 {
    static class Name implements Comparable<Name>{
        String first,last;
        Name(String first,String last){
            this.first = first;
            this.last = last;
        }
        //比較元素順序，沒有在照key值來排
        @Override
        public int compareTo(Name n) {
            int cmpLast = last.compareTo(n.last);
            return cmpLast != 0 ? cmpLast:first.compareTo(n.first);
        }
        public String toString(){
            return first + "" + last;
        }
    }

    public static void main(String[] args) {
        ArrayList<Name> list = new ArrayList<Name>();
        list.add(new Name("Joe","Shome"));
        list.add(new Name("John","Doe"));
        list.add(new Name("Jane","Doe"));
        Collections.sort(list);
        for (Name n : list) {
            System.out.println(n);
        }
        
    }
    
}
