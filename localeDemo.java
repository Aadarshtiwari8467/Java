import java.util.*;
import java.text.*;

public class LocaleDemo {
    static void printTotal(Locale locale) {
        // Numberformat nf = NumberFormat();
        NumberFormat nf = NumberFormat.getCurrencyInstance(locale);

        System.out.println(nf.format(12500));
    }

    static void printDate(Locale locale) {
        Date date = new Date();
        DateFormat dtf = DateFormat.getDateInstance(DateFormat.LONG, locale);

        System.out.println(dtf.format(date));
    }

    public static void main(String[] args) {
        Locale locale = new Locale("hi", "IN");
        // Locale locale = Locale = Locale.of("hi","IN");
        // Locale locale2 =Locale.INDIA_HINDI;
        // 2,00,000.00
        // 200,000.00
        printTotal(locale);
        printDate(locale);
    }
}
