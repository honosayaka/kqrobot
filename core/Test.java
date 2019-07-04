package core;

import java.text.SimpleDateFormat;
import java.util.logging.SimpleFormatter;

public class Test {
    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new  SimpleDateFormat("HH");
        String date =dateFormat.format(System.currentTimeMillis());
        System.out.println(date);
    }
}
