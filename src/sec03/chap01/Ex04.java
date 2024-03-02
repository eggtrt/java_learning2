package sec03.chap01;

public class Ex04 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        // int 끼리 연산은 int 반환
        int c = a + b;

        long d = a + b;
//        short e = a + b; // type이 안맞아 불가
        short f = (short) (a + b); // 괄호를 써줘야만 동시에 short로 casting 됨

        // 정수형 자료형의 계산은 소수점 아래를 버림
        byte int1 = 5/2;
        int int2 = 10;
        int int3 = 3;
        int int4 = int2/ int3;
    }
}
