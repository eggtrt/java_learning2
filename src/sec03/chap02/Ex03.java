package sec03.chap02;

public class Ex03 {
    public static void main(String[] args) {
        float flt1 = 3.14f; // float은 반드시 f를 써서 명시해줘야함
        double dbl1 = 3.14;

        // float에는 double을 담을 수 없음
        float flt2 = (float) dbl1;

        // 정수를 담을 수 있음
        long lng1 = 123;
        float flt3 = lng1;
        double dbl3 = lng1;

        long lng2 = Long.MAX_VALUE;

        float flt4 = lng2;
        double dbl4 = lng2;
    }
}
