import javax.swing.*;
import java.util.ArrayList;

public class Main {

    private static ArrayList<Vehicle> allVehicles = new ArrayList<>();
/*    private static int milesPerGallon = 20;
    private static double gallonOfGas = 10;
    private static int odometer = 0;*/

/*    private static int[] milesPerGallon = {20, 25, 15};
    private static double[] gallonOfGas = {10, 8, 12};
    private static int[] odometer = {0, 10000, 20000};*/

    public static void main(String[] args) {
        System.out.println("In vehicles Main.");
        System.out.println("Second Line");

        String nickname = JOptionPane.showInputDialog("What is the nickname of your vehicle?");

        Vehicle myVehicle = new Vehicle();
        myVehicle.setMilesPerGallon(20);
        myVehicle.setGallonOfGas(10.0);
        myVehicle.setOdometer(0);
        allVehicles.add(myVehicle);

        Vehicle yourVehicle = new Vehicle();
        yourVehicle.setMilesPerGallon(25);
        yourVehicle.setGallonOfGas(8.0);
        yourVehicle.setOdometer(10000);
        allVehicles.add(yourVehicle);

        Vehicle ourVehicle = new Vehicle();
        ourVehicle.setMilesPerGallon(25);
        ourVehicle.setGallonOfGas(8.0);
        ourVehicle.setOdometer(10000);
        allVehicles.add(ourVehicle);

        drive(100);


        drive(60);

    }

    private static void drive(int milesDriven) {
        for (Vehicle vehicle : allVehicles) {
            System.out.println("Odometer " + vehicle.getOdometer() + " Gallons of Gas " + vehicle.getGallonOfGas());
            vehicle.go(milesDriven);
            System.out.println("Odometer " + vehicle.getOdometer() + " Gallons of Gas " + vehicle.getGallonOfGas());

        }
    }
}
