package class14;

public class HoweWork04 {
    public static void main(String[] args) {
        String str= "This is the sentence i want to reverse";

        String [] arr=str.split(" ");
        StringBuilder st =new StringBuilder();
        for (int i = 0; i < arr.length ; i++) {
            String word=arr[i];
            StringBuilder stringBuilder=new StringBuilder(word);
            stringBuilder.reverse();
            System.out.print(stringBuilder+ " ");




        }
    }
}
