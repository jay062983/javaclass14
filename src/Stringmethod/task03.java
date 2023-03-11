package Stringmethod;

public class task03 {
    public static void main(String[] args) {
        /*  you have a String a="Is it saturday?
        isit raining? Do we have a Java class today.
        How would you find out how many sentences are in that String*/
        String str="Is it saturday? Is it raining? Do we have a Java class today?";
        //String [] arr= str.split("[I]");
       // System.out.println(arr.length);
       // System.out.println(arr[2]);
        System.out.println(str.split("[?]").length);
    }
}
