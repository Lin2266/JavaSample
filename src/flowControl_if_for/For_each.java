package flowControl_if_for;
//for-each與for-loop比較
public class For_each {
/*
 for-each是for-loop的改良版，用於簡化存取集合性物件的元素，例如:陣列或集合。
 for-each在執行的過程會自動往下找下一個元素直到全部擷取完畢為止，省去for-loop迴圈中對陣列或集合在維度上的控制
 語法:
 for(元素資料型別 該元素之區域變數: 母體集合)
 */
	public static void main(String[] args) {
		// 分析String[]
		String[] s ={"SCJP","SCWCD","SCMAD"};
		for(int i=0;i<s.length;i++){//for-loop取得陣列元素
			System.out.print(s[i] + ",");
		}
		
		System.out.println();
		for(String ss:s){//for-each取得陣列元素
			System.out.print(ss + ",");
		}

	}

}
