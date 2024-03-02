package sec03.chap01;

public class Ex02 {
    public static void main(String[] args) {
        byte byteNum;
        int smallIntNum = 123;

        // 강제로 타입을 명시함
        byteNum = (byte) smallIntNum;

        int intNum = 12345;

        // 나머지 만큼 값이 들어감
        byteNum =  (byte) intNum;
    }
}
