package Stringmethod;

public class Stringtask02 {
    public static void main(String[] args) {
       /* 2) Create a String that should be
       combination of letters, numbers and special characters.
       Find out how many Alphanumeric(abd AZ 284) characters are there in the String.
        */
   String str="09u4q309uq3AJLKDFKDF#$$^#%&)";
        System.out.println(str.replace("[^A-Za-z0-9]","").length());
    }
}
