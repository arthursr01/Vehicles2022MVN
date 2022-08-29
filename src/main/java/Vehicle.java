public class Vehicle {

    private int milesPerGallon = 20;
    private double gallonOfGas = 10;
    private int odometer = 0;

    public int getMilesPerGallon() {
        return milesPerGallon;
    }

    public void setMilesPerGallon(int milesPerGallon) {
        this.milesPerGallon = milesPerGallon;
    }

    public double getGallonOfGas() {
        return gallonOfGas;
    }

    public void setGallonOfGas(double gallonOfGas) {
        this.gallonOfGas = gallonOfGas;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    public void go(int milesDriven) {
        setGallonOfGas(getGallonOfGas() - (milesDriven / getMilesPerGallon()));
        setOdometer(getOdometer() + milesDriven);
    }
}
