package class15;

public class Prac6 {
    boolean isPrime(int num){
        boolean isPrime = true;
        if(num>1){
            for (int i=2;i<num;i++){
                if (num%i==0){
                    isPrime=false;
                    break;
                }
            }
        }else{
            isPrime=false;
        }
        return isPrime;
    }

    public static void main(String[] args) {
        Prac6 prac6=new Prac6();
        System.out.println(prac6.isPrime(12));
        System.out.println(prac6.isPrime(7) );
    }
}
