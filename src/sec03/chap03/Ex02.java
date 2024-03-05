package sec03.chap03;

public class Ex02 {
    public static void main(String[] args) {
        char ch_a1 = 'A';

        char int_a2 = ++ch_a1; // 'B'
        int int_a3 = --ch_a1; // 65

        char ch_a2 = 'A' + 1; // 'B'
//        char ch_a3 = ch_a1 + 1; // 이거는 안됨

        char ch_1 = '1'; // 이건 ASCII code로 49의 값을 가진 문자열임

//        char ch_3 = ''; // 이건 안됨
        String str1 = ""; // 이건 됨
    }
}
