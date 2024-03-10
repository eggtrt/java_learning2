package sec03.chap05;

public class Ex04 {
    public static void main(String[] args) {
        String str1 = String.valueOf(true);
        String str2 = String.valueOf(false);
        String str3 = String.valueOf(123);
        String str4 = String.valueOf(3.14f);
        String str5 = String.valueOf('가');

        String str6 = true + ""; // 이런식으로 empty string을 더해서 사용도 가능함
        String str123 = "123";

        int intNum = Integer.parseInt(str123);
        // short, long, double등 다른 number type도 다 가능

        // 아래 케이스들은 runtime error가 발생함
        byte bytNum2 = Byte.parseByte("12345");
        int intNum2 = Integer.parseInt("123.45");
        double dblNum2 = Double.parseDouble("하나");
    }
}
