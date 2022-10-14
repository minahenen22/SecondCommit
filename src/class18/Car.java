package class18;

public class Car {
    String model;
    String make;
    int year;
    String color;
    int topSpeed;
    double price;
    void printCarDetails(){
        System.out.println("Model "+model+" Make "+make+" Color "+color);
    }

}
class BMW extends Car{
    double engineCC;

}
class Tesla extends Car{

}
class Toyota extends Car{
    double engineCC;

}
class CarTester{
    public static void main(String[] args) {
        BMW bmw= new BMW();
        bmw.make="BMW";
        bmw.model="X8";
        bmw.color="Black";
        bmw.printCarDetails();

    }
}