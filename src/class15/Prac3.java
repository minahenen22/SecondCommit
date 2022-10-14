package class15;

public class Prac3 {
    /*Create a method that will print whether given String is palindrome or not.*/
    void isPalidrome (String str){
        str=str.toLowerCase();
        StringBuilder stb= new StringBuilder(str);
        stb.reverse();
        if(stb.toString().equals (str)){
            System.out.println("IS Palidrome");
        }else {
            System.out.println("Is not Palidrome");
        }


    }

    public static void main(String[] args) {
        Prac3 word=new Prac3();
        word.isPalidrome("Dad");
        word.isPalidrome("Mina");
    }
}
