package Regex.baitap_regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class b1 {


    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\d{12}");// min 6 thì \\d{6,}
        Matcher matcher = pattern.matcher("123456789101");
        System.out.println("Input String matches regex - "+matcher.matches());
    }
}
