package class14;

public class StringDemoNewClass {
    public static void main(String[] args) {
        String str="dad";
        StringBuilder stringBuilder=new StringBuilder(str);
        stringBuilder.reverse();

        if (stringBuilder.toString().equals(str)){
            System.out.println("The String is Palindrome");

        }else {
            System.out.println("This String not aPalindrome");
        }
    }
}
