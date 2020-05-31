
package Java.sql;
//血型
public enum BloodType {
    O, A, B, AB;

    @Override
    public String toString() {
        //ordinal順序數
        //return this.ordinal() + ('-' + this.name()) + '型';
        return this.name() + '型';
        //-跟name沒加括號，會變成字串相加
        //return this.ordinal() + '-' + this.name() + '型'; 
    }
    
    
    
}
