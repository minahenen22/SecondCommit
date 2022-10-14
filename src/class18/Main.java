package class18;

public class Main {
    static String 	thirdLetter(String s){
        for (int i=0;i<s.length();i+=3){
            System.out.print(s.charAt(i)+"");
        }
        return s;
    }


    //test case below (dont change):
    public static void main(String[] args){
        System.out.println(thirdLetter("hello there")); //"hltr"
        System.out.println(thirdLetter("technology")); //"thly"
    }

}