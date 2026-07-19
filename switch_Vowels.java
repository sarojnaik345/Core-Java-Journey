import java.util.Scanner;

public class switch_Vowels {
    public static void main(String arg[])
    {
         Scanner sc = new Scanner(System.in);
        System.out.println("enter the alpphabet(A-z or a-z):");
        char vab = sc.next().charAt(0);
        switch(vab){
            case 'A': case 'a':
                System.out.println("vowels");
                break;
            case 'E': case 'e':
                System.out.println("vowels");
                break;
            case 'I': case 'i':
                System.out.println("vowels");
                break;
            case 'O': case 'o':
                System.out.println("vowels");
                break;
            case 'U': case 'u':
                System.out.println("vowels");
                break;
            default:
                System.out.println("Consonant");
        }sc.close();

    }
}
