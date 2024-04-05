import java.util.*;

class Formatter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose operation (1, 2 or exit): ");
        String input = sc.nextLine();
        String operation = "";

        while (!input.equals("exit")) {

            if (input.equals("1") || input.equals("2")) {
                operation = input;

//                System.out.println("Token: " + operation);
                System.out.println("\nType number: ");

                input = sc.next();
            } else {
                switch (operation) {
                    case "1":
                        int temperature = Integer.valueOf(input) * 32;
                        System.out.println("Temperature converted from C to F " + temperature);
                        break;
                    case "2":
                        double length = Double.valueOf(input) * 0.01;
                        System.out.println("Lenth converted from km to m " + length);
                        break;
                }

                System.out.println();
                System.out.println("Choose operation (1, 2 or exit): ");
                input = sc.next();
            }
        }
        sc.close();
    }
}