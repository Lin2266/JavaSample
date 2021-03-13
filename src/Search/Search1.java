
package Search;


/*
循序搜尋法（使用衛兵）:
搜尋的目的，是在『已排序的資料』中尋找指定的資料，而當中循序搜尋是最基本的搜尋法，只要從資料開頭尋找到最後，看看是否找到資料即可。
初學者看到循序搜尋，多數都會使用以下的方式來進行搜尋:
while(i<MAX){
    if(number[i] == k){
        printf("找到指定值");
        break;
    }
    i++;
}

這個方法基本上沒有錯，但是可以加以改善，可以利用設定衛兵的方式，省去if判斷式，衛兵通常設定在數列最後或是最前方，假設設定在列前方好了(索引0的位置)，我們從數列後方向前找，如果找到指定的資料時，其索引值不是0，表示在數列走訪完之前就找到了，在程式的撰寫上，只要使用一個while迴圈就可以了。

下面的程式為了配合衛兵的設置，自行使用快速排序法先將產生的數列排序，然後才進行搜尋，若只是數字的話，通常您可以使用程式語言函式庫所提供的搜尋函式。
*/
public class Search1 {
    public static int linear(int[] number, int des){//linear線性
        int[] tmp = new int[number.length+1];//7+1
        for(int i=1; i<tmp.length;i++){
            tmp[i] = number[i-1];
        }
        tmp[0]=des;//3
        
        int i = number.length;
        while(tmp[i] != tmp[0])
           i--;
        
        return i-1;
           
    }
    public static void main(String[] args) {
        int[] number = {1,2,3,4,6,7,8};
        int find = Search1.linear(number, 3);
        System.out.println(find >=0?"找到數值的索引"+find:"找不到數值");
    }
    
}
