import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int duration = scanner.nextInt();
        int foodCost = scanner.nextInt();
        int flight   = scanner.nextInt();
        int hotel    = scanner.nextInt();

        int totalCost = (duration * foodCost) + (flight * 2 ) + (hotel *(duration - 1));
        System.out.println(totalCost);
    }
}