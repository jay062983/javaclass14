package Stringmethod;

public class task04 {
    public static void main(String[] args) {
        //how would you reverse a String word by word
        //input=> This is sentence I want to reverse
        //output=> siht si ecnetnes I tnaw  ot esrever
         //StringBuilder st=new StringBuilder("This is sentence I want to reverse")
        //  System.out.println(st.reverse());
        // String str=st.toString();//converting a stringbuilder to
        String str = "This is the sentence I want to reverse ";
        String[] arr = str.split(" ");
        //for (String word : arr) {  
        //    for (int i = word.length() - 1; i >= 0; i--) {
         //       System.out.print(word.charAt(i));

          //  System.out.print(" ");

for(String word:arr){
    System.out.print(new StringBuilder(word).reverse()+" ");
}

            }
        }


