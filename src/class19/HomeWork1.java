package class19;

public class HomeWork1 {

}
class a {
    String name="Mina";


}
class b extends a {
    void mina(){
        System.out.println(name);
    }

}

class c extends b{
    public static void main(String[] args) {
        c obj=new c();
        obj.mina();
    }
}

