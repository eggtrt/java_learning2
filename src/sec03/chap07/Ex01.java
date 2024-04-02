package sec03.chap07;

public class Ex01 {
    public static void main(String[] args) {
        String str1 = "%s의 둘레는 반지름 X %d X %f입니다.";

        String circle = "원";
        int two = 2;
        double PI = 3.14;

        String str2 = str1.formatted(circle, two, PI);

        String str3 = String.format(str1, circle, two, PI);

        // %b 불리언
        // %d 십진수 정수
        // %f 실수
        // %c 문자
        // %s 문자열
        // %n 포맷 문자열내 바꿈

        System.out.printf("%s의 둘레는 반지름 X %d X %f입니다.%n", circle, two, PI);
        System.out.printf("%s의 둘레는 반지름 X %d X %f입니다.%n", circle, two, PI);
        System.out.printf("%s의 둘레는 반지름 X %d X %f입니다.%n", circle, two, PI);
    }
}
