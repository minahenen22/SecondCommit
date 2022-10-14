package reviewClass06;

import java.util.Arrays;
import java.util.Scanner;

public class Replit104 {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        String [] names= new String[5];
        System.out.println("Enter 5 names");
        for (int i=0; i<names.length;i++){
            names[i]=scan.nextLine();

        }

        char letter=0;
        for (int i=0; i<4; i++){
            letter=names[i].charAt(i);


        }System.out.print(letter++);
        }
    }

