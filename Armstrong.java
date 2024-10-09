import java.text.NumberFormat;

class LocaleConstantExample {
    public static void main(String[] args) {
        Locale usLocale = Locale.forLanguageTag("hi-IN");

        Locale deLocale = Locale.forlanguageTag("en-US");

        long number = 123456789L;
        NumberFormat denf = NumberFormat.getInstance(deLocale);
        NumberFormat usnf = NumberFormat.getInstance(usLocale);
        System.out.println( denf.format(number) );
        System.out.println( usnf.format(number) );


    }

}
