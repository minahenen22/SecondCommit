package class15;

public class Prac5 {
     /*   Create a method createEmail(). Based on values of users first name,
    lastName and email   type, your method should return complete email Address.
    Example: createEmail(John,   Snow,gmail)-->johnsnow@gmail.com*/
    String createEmail(String fName,String lName,String email){
        return (fName+lName+"@"+email+".com").toLowerCase();
    }

    public static void main(String[] args) {
        Prac5 email= new Prac5();

        String fullEmail=email.createEmail("John","Snow","gmail");
        System.out.println(fullEmail);
        System.out.println(email.createEmail("Mina","Henen","live"));
    }
}
