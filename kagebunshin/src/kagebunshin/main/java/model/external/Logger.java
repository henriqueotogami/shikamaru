package kagebunshin.main.java.model.external;


import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {

    public static void info(final String message) {
        final String completeFormat = "dd/MM/yyyy HH:mm:ss";
        final SimpleDateFormat simpleDateFormat = new SimpleDateFormat(completeFormat);
        final String actualDateTime = simpleDateFormat.format(new Date());
        System.out.println("[INFO]: " + actualDateTime + " " + message);
    }
}
