import java.util.Scanner;

public class SuperGreeter {

    public void start(){
        System.out.println("Det virker!");
    }

    public void intastnavn(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Intast dit navn:");
        String navn = scanner.next();
        System.out.println(navn);
    }
}
