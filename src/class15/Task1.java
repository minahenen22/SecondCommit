package class15;


import java.util.Scanner;

public class Task1 {
    //Create a method that will take 2 parameters as a numbers and prints which number is larger.
    void largest (int num1, int num2){
        if (num1>num2){
            System.out.println("Largest is num1= "+num1);
        }else if (num2>num1){
            System.out.println("Largest is num2= "+num2);
        }else{
            System.out.println("Numbers are equal");
        }
    }

    public static void main(String[] args) {
        Task1 obj = new Task1();
        obj.largest(10,20);
        Scanner scan =new Scanner (System.in);

    }


    }


