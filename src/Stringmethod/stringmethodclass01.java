package Stringmethod;

public class stringmethodclass01 {
    public static void main(String[] args) {
    /*1) Create a String that will hold a sentence.
    Write a program to get a new String without any spaces.
     */
    String str="Great wall of china";
    String str1=str.replaceAll(" ","");
        System.out.println(str1);
    }
}
