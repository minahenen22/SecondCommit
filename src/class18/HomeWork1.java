package class18;

public class HomeWork1 {
    /*

    Write a Student class   that have instance variables name and address. Create a constructor that will initialize those variables.
    Print name & address of given  student using displayInfo method.

     */
    String name;
    String address;
    HomeWork1(String name,String address){

        this.name=name;
        this.address=address;

    }
    void printInfo(){
        System.out.println("Student name is: "+name+" and address is: "+address);
    }

    public static void main(String[] args) {
        new HomeWork1("Mina","125 W 6th Street").printInfo();

    }
}
