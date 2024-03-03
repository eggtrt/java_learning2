package sec03.chap01;

public class Ex09 {
    public static void main(String[] args) {
        int int1 = 3;
        int int2 = 3;
        boolean bool1 = int1 == int2;
        boolean bool2 = int1 != int2;

        boolean bool3 = int1 > int2;

        // > 보다 기본 연산자가 더 우선적으로 적용됨
        boolean bool4 = int1 * int2 > int1 + int2;
    }
}
