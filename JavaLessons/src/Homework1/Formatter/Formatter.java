import java.util.*;

class Formatter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose operation (1, 2 or exit): ");
        String input = sc.nextLine();

        String operation = input;
        Integer value = null;

        while (!input.equals("exit")) {
            if (operation.equals("")) {
                System.out.println("Choose operation (1, 2 or exit): ");
            } else if(value == null) {
                System.out.println("Type number: ");
            }

            input = sc.next(); // read line

            if (operation.equals("")) {
                operation = input;
            } else if (value == null) {
                try {
                    value = Integer.parseInt(input);
                }  catch (NumberFormatException e) {
                    System.out.println("Incorrect data type for entered value");
                }
            }

            if (!operation.equals("") && value != null) {
                switch (operation) {
                    case "1":
                        System.out.println("Temperature converted from C to F " + (value  * 1.8 + 32));
                        break;
                    case "2":
                        System.out.println("Lenth converted from km to m " + (value * 0.621371));
                        break;
                    default:
                        System.out.println("There is not such operation");
                        break;
                }
                operation = "";
                value = null;
            }
        }
        sc.close();
    }
}
