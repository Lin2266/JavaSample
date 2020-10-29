package Java.text.Format1;


import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class DateFormat8 {
	private Date birthDate;
	public void setBirthDate(Date birthDate) throws Exception {
        if (birthDate == null || birthDate.before(new Date())) {
            this.birthDate = birthDate;
        } else {
            throw new Exception("出生日期必須小於今天");
        }
    }
	
	public void setBirthDate(String sDate) throws Exception {
        if (sDate != null && (sDate = sDate.trim()).length() > 0) {
            sDate = sDate.replace('-', '/');
            try {
                this.setBirthDate(DateFormat.getDateInstance().parse(sDate));//yyyy/M/d
            } catch (ParseException ex) {
                throw new Exception("出生日期資料格式不正確");
            }
        } else {
            this.birthDate = null;
        }
    }

	public static void main(String[] args) {
		String dateString = "20200903";


	}

}
