package Class17;

public class HomeWork2 {
    /*
    Write a java Class Stulate Average Grade. Test Student clasudents that have a constructor which takes students name
    and 3 subject grades. Your program should print an average mark of each student name.
NOTE: please use different names for instance and local variables.
     */
    private String name;
    private int math;
    private int science;
    private int chemistry;
    private int score;
     char grade=0;

    public HomeWork2 (String stuName,int stuMath,int stuScience, int stuChemisty ){
        name=stuName;
        math=stuMath;
        science=stuScience;
        chemistry=stuChemisty;

    }
    int grade(){
        score=(math+science+chemistry)/3;
        if (score>90){
            grade='A';

        }else if (score>70){
            grade='B';
        }else if (score>60){
            grade='C';
        }else {
            System.out.println("Not a valid score");
        }

        return grade;}

    public static void main(String[] args) {
        HomeWork2 mina=new HomeWork2("Mina",80,81,85);
        System.out.println(mina.grade());
    }
}
