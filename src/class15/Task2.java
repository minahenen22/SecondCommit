package class15;

public class Task2 {
    //print even or odd num
    boolean isEven(int num){
        if(num % 2 == 0){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Task2 even=new Task2();
        if (even.isEven(5)){
            System.out.println("is even");

        }else {
            System.out.println("is Odd");
        }
    }

}
