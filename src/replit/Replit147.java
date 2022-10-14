package replit;

public class Replit147 {

}
class CarObjects{
    String model;
    double price;
    double  quantity;
    double value;
    public CarObjects(String model,double price,double quantity){
        this.model=model;
        this.price=price;
        this.quantity=quantity;

    }

    public double carStockValue(double valQuantity,double valPrice){

        double value=valPrice*valQuantity;

        return value;
    }

}
class MainReplit147 {
    public static void main(String [] args){
        //Toyota 2019 Stock Value 2500000.0
        //BMW 2019 Stock Value 652980.0
        CarObjects toyota= new CarObjects("2019",25000,100);
        System.out.println("Toyota "+toyota.carStockValue(25000,100));
    }

}