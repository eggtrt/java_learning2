package sec03.chap02;

public class Ex05 {
    public static void main(String[] args) {
        // 당연하게도 실수와 정수의 계산은 실수를 반환함

        // 리터럴로 작성시 double임을 명시하려면 .0을 붙여야함
        double dbl1 = 5 / 2; // 2.0이 나옴
        double dbl2 = 5.0 / 2; // 2.5
        double dbl3 = (double) 5 / 2; // 2.5
        // 정수 자료형에 강제로 실수를 넣으면 소수 부분을 버림
    }
}
