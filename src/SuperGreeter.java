import java.util.Scanner;

public class SuperGreeter {
    Scanner scanner = new Scanner(System.in);
    public void start(){
        System.out.println("Det virker!");
    }

    public void intastnavn(){

        System.out.println("Intast dit navn:");
        String navn = scanner.next();
        System.out.println("hej " + navn);
    }

    public int askAboutAge(){
        System.out.println("Indtast din alder:");
        int age = scanner.nextInt();
        return age;
    }
}
