package sec03.chap06;

public class Ex03 {
    public static void main(String[] args) {
        String str1 = "아무말이나 주절주절...";
        char ch1= str1.charAt(0); // JS에서처럼 index값을 쓰는게 아닌 charAt필요

        // 마지막 문자 얻기
        char ch2 = str1.charAt(str1.length() - 1);

        String str2 = "요런것 저런것 등등";

        // 두번째 인자를 넣어주면 해당 index 이후부터 찾게 됨
        // 포함안됐을때 -1이 나오는건 JS와 동일함
        int int1 = str2.indexOf("런");
        int int2 = str2.indexOf("런", 3);
    }
}
