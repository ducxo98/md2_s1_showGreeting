import java.util.Scanner;

public class showGreeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Eanter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello:" + name);
    }
}
