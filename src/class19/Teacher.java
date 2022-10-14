package class19;

public class Teacher {
    String name;
    String speciality;
    int exp;
    public Teacher (String name,String speciality,int exp){
        this.name=name;
        this.speciality=speciality;
        this.exp=exp;

    }
    public void printInfo  (){
        System.out.println("Teacher name is "+name+" Speciality "+speciality+" and has experience of "+exp+" year(s)");
    }


}
class Math extends Teacher{


    Math(String name, String speciality, int exp) {
        super(name, speciality, exp);
    }

    public static void main(String []args) {
    }

    void smart(){
        System.out.println("Math teachers always smart");
    }
}
class chemistry extends Teacher{
    chemistry(String name,String speciality,int exp){
        super(name,speciality,exp);
    }
    void formula(){
        System.out.println("Chemistry teachers masters in formulas");
    }

}
class Piano extends Teacher{
    Piano(String name,String speciality,int exp){
        super(name, speciality, exp);

    }
}
class  TeacherTest{
    public static void main(String[] args) {

        Math mathTeacher=new Math("Mike","Math",12);

        mathTeacher.printInfo();
        mathTeacher.smart();

    }
}




