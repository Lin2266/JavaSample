package Java.util.Formatter1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Calendar1 {

    //我的生日
    public static void main(String[] args) {
        String name = "Lin";
        Calendar birthDate = new GregorianCalendar(2016, 3, 2);

        System.out.println("My name is " + name + "\n" + "My birthdate is "
                + birthDate.get(Calendar.YEAR) + "-"
                + birthDate.get(Calendar.MONTH) + "-"
                        + birthDate.get(Calendar.DAY_OF_MONTH));
        System.out.println("-------------------------------");
        System.out.printf("My name is %s%nMy birthdate is %tF%n", name, birthDate);
    }

}
