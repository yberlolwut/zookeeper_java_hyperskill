import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int num = scanner.nextInt();
        boolean range = (-15 < num &&  num <=12) || (14 < num && num < 17) || (num >=19);
        if(range){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}