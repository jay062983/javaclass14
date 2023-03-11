package Stringmethod02;

public class returnmethodtester {
    public static void main(String[] args) {


        returnmethod math = new returnmethod();
        int result = math.sub(100, 50);
        System.out.println(result);


        returnmethod rd = new returnmethod();
        String str = rd.method1();
        System.out.println(str);
        int result1=rd.method2();
        System.out.println(result1);
    }
}