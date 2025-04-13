package com.walking.l30t01;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void validateString(String inputString) {
        Matcher matcher = Pattern.compile("\\+7\\s\\(\\d{3}\\)\\s\\d{3}-\\d{2}-\\d{2}").matcher(inputString);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }

    }

    public static void validateStringHardVariant(String inputString) {
        Matcher matcher = Pattern.compile("\\+7\\s?\\(?\\d{3}\\)?\\s?\\d{3}-?\\d{2}-?\\d{2}").matcher(inputString);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }

    }

    public static void main(String[] args) {
        String str = """
                +7 (916) 123-45-67
                +7 (495) 987-65-43
                +7 (800) 555-35-35
                +7 (903) 77-22-11
                +7(903)71722-11
                +79037722111
                +7 926 000-00-00
                +7 (926) 000ц00-00
                -3 (1926) 000-00-00
                +7 (XXX) XXX-XX-XX
                """;
        System.out.println("\nВариант 1");
        validateString(str);
        System.out.println("\nВариант со *");
        validateStringHardVariant(str);
    }


}
