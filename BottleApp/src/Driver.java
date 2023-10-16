import java.util.Scanner;

public class Driver {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        Bottle bottle1 = new Bottle();
        bottle1.print();

        System.out.println("Bottle App V 1.0");

        bottle1.setDetails();
        bottle1.print();

        Bottle bottle2 = new Bottle();
        bottle2.setDetails();
        bottle2.print();
    }
}