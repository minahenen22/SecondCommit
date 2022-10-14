package replit;

public class Practice {
    public static void main(String[] args) {

        String line = "This is a test";
        String[] result = line.split ( "\\s" );
        for ( int i = 0; i < result.length; i++ )
            System.out.println ( result[i] );
        char[] charArray = { 'H', 'e', 'l', 'l', 'o' };
        String hello = new String ( charArray );

        String world = new String ( "World" );
        char[] worldArray = world.toCharArray();
        System.out.println("**************************");

        System.out.println(worldArray);
        char[] charArray1 = { 'H', 'e', 'l', 'l', 'o' };
        String hello1 = new String ( charArray1 );
        System.out.println(charArray1);
    }
}
