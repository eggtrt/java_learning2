package sec03.chap06;

public class Ex02 {
    public static void main(String[] args) {
        String str1 = "";
        String str2 = "\t\n";

        // 진짜 비었는지 check
        boolean bool1 = str1.isEmpty();
        boolean bool2 = str2.isEmpty();

        // 글자가 있는지 체크
        boolean bool3 = str1.isBlank();
        boolean bool4 = str2.isBlank();

        // trim은 공백을 제거함
        // 문자열은 불변하기 때문에 다른 변수에 할당할때 method를 사용해도 변하지 않음
    }
}
