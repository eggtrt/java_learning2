package sec03.chap05;

public class Ex02 {
    public static void main(String[] args) {
        String h1 = "hello";
        String h2 = "hello";

        boolean bool1 = h1 == h2; // true

        String h3 = new String("hello");

        boolean bool2 = h1 == h3; // false
        boolean bool3 = h3.equals(h1); // true

        String h4 = h3;
        boolean bool4 = h3 == h4; // true

        // constant로 선언한 경우와 instance로 선언한 경우 heap에서 사용하는 방식이 달라지게됨
    }
}
