package Extends;
//is-a「是一個」跟has-a「有一個」的關係
public class Is_a_Has_a {
	class Machine{//機械
		
	}
	//is-a是繼承的關係，電腦有一個機械的父類別
	class Computer extends Machine{
		//has-a 電腦這個類別的成員變數
		int cpu;
		int ram;
		int hd;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
