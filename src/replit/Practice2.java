package replit;

public class Practice2 {
    public static void main(String[] args) {
        StringBuffer str=new StringBuffer("Hello Friends");

        str= str.reverse();
        System.out.println(str);

        StringBuilder greeting = new StringBuilder("Hey friends");
        System.out.println(greeting);
        greeting=greeting.reverse();
        System.out.println(greeting);
    }
    }

