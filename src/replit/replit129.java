package replit;

public class replit129 {
    static String mixString(String s1,String s2){
        String s3=null;
        for (int i=0;i<s1.length();i++){
            s1=s1.charAt(i)+"";
        }
        for (int j=0;j<s2.length();j++){
            s2=s2.charAt(j)+"";


        }s3=s1+s2;
        return s3;
    }


    //test case below (dont change):
    public static void main(String[] args){
        String firstValue = mixString("12345","abcde");
        System.out.println(firstValue);
        String secondValue = mixString("howdy","hello");
        System.out.println(secondValue);

    }
}
