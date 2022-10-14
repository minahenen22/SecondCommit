package class19;

public class UserClass {
    /*
    Write program: userClass  that has a constructor that initializes instance variable name and mobile number.
     Create a subclass  userInfo that will have user address variable and it also being initialized through constructor call.
     Print users name, mobile number and address in userDetails method. Test your code.

     */
    String name;
    int mobNumber;

    public UserClass(String name,int mobNumber){
        this.name=name;
        this.mobNumber=mobNumber;
    }


}

class userInfo extends UserClass{
        String address;
    public userInfo(String name, int mobNumber,String address) {
        super(name, mobNumber);
        this.address=address;
    }
    public void printInfoUser(){
        System.out.println("User name is "+name+" Mobile no.: "+mobNumber+" lives in "+address);
    }
}
class TestUser{
    public static void main(String[] args) {
        userInfo obj=new userInfo("Mina",857254588,"125W 6th Street");
        obj.printInfoUser();
    }
}