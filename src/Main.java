import entities.Operation;
import entities.Screen;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        char j = '#';
        Screen screen = new Screen();
        Scanner scanner = new Scanner(System.in);
        Operation operations;
        double[] values = new double[3];

        screen.logo();
        for(int i = 0; i < 2; i++){
            screen.begin(i+1);
            values[i] = scanner.nextDouble();
        }

        operations = new Operation(values[0], values[1]);

        do {
            screen.ask();
            n = scanner.nextInt();

            switch (n){
                case 1:
                    values[2] = operations.sum();
                    j = '+';
                    break;

                case 2:
                    values[2] = operations.sub();
                    j = '-';
                    break;

                case 3:
                    values[2] = operations.mlt();
                    j = '*';
                    break;

                case 4:
                    values[2] = operations.div();
                    j = '/';
                    break;

                default:
                    System.out.println("\nInvalid Value! Do again:");
                    break;
            }
        }while (n < 1 || n > 4);

        screen.result(j, values[0], values[1], values[2]);
    }
}