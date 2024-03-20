package sec03.chap06;

public class Ex05 {
    public static void main(String[] args) {
        String str_b1 = "호랑이가 산다";

        boolean bool_b1 = str_b1.contains("호랑이");
        boolean bool_b2 = str_b1.contains("고양이");

        boolean bool_b3 = str_b1.startsWith("호랑이");
        boolean bool_b4 = str_b1.startsWith("사자");
        boolean bool_b5 = str_b1.startsWith("호랑이", 4);

        boolean bool_b6 = str_b1.endsWith("산다");

        String emailRegex = "^[\\w-\\.]";

        String str_c1 = "jisu@aa.aa";
        String str_c2 = "jisu.aa.aa";


        boolean bool_c1 = str_c1.matches(emailRegex);
        boolean bool_c2 = str_c2.matches(emailRegex);

        String str_a1 = "ABC";
        String str_a2 = "ABCDE";
        String str_a3 = "ABCDEFG";

        // 같은 문자열이면 0 반환
        int int_a1 = str_a1.compareTo(str_a1);

        // 시작하는 부분이 같을 때는 글자 길이의 차이 반환
        int int_a2 = str_a2.compareTo(str_a1);
        int int_a3 = str_a1.compareTo(str_a3);
        int int_a4 = str_a2.compareTo(str_a3);

        String str_a4 = "HIJKLM";

        // 시작하는 부분이 다를 때느 첫 글자의 정수값 차이 반환
        int int_a5 = str_a1.compareTo(str_a4);

        String str_d1 = "abc";
        String str_d2 = "DEF";

        // 대소문자 무시하여 비교
        int int_d1 = str_d1.compareToIgnoreCase(str_d2);
    }
}
