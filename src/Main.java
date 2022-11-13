import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();
        String Money = a.next();
        double c = b;
        switch (Money) {
            case "USD":
                System.out.println(c * 82.61);
                break;
            case "RUB":
                System.out.println(c * 1.15);
                break;
            case "KZT":
                System.out.println(c * 0.56);
                break;
            case "EUR":
                System.out.println(c * 111.32);
                break;
            default:
                System.out.println("Ваш запрос не понятен");
        }
    }
}