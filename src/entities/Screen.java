package entities;

public class Screen {

    public void logo(){
        System.out.println("*********************************");
        System.out.println("*       Simple Calculator       *");
        System.out.println("*********************************\n");
    }

    public void begin(int i){
        System.out.print("Write the " +i+ " number: ");
    }

    public void ask(){
        System.out.println();
        System.out.println("1 - Sum");
        System.out.println("2 - Subtration");
        System.out.println("3 - Multiplication");
        System.out.println("4 - Divide");
        System.out.println();
        System.out.print("Select the operation: ");
    }

    public void result(char j, double i1, double i2, double i3){
        System.out.println();
        System.out.println("Operation: " +i1+ " " +j+ " " +i2+ " = " +i3);
    }
}
