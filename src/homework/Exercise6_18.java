package homework;

public class Exercise6_18 {
    static boolean isNumber(String str) {
        if (str.matches(".*[0-9].*"))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        String str = "123";
        System.out.println(str + "는 숫자입니까?" + isNumber(str));

        str = "1234o";
        System.out.println(str + "는 숫자입니까?" + isNumber(str));
    }
}
