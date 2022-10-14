package class15;


import java.util.Scanner;

public class HomeWork3 {
    void greeting(String country) {
        switch (country) {
            case "Egypt":
                System.out.println("Ahlan");
                break;
            case "USA":
                System.out.println("Welcome");
                break;
            case "Spain":
                System.out.println("Ola");
                break;
            case "UAE":
                System.out.println("Hala");
                break;
        }
    }
        public static void main (String [] args){
            HomeWork3 obj=new HomeWork3();
            System.out.println("Enter your country");
            Scanner scan=new Scanner(System.in);
            String country=scan.nextLine();

            obj.greeting(country);

        }


}
