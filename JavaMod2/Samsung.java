public class Samsung extends Phone {

    boolean hasStylus;

    public Samsung(int batteryPercentage, String operatingSystem, boolean hasStylus) {
        super(batteryPercentage, operatingSystem, "Samsung");
        this.hasStylus = hasStylus;
    }

    public boolean isHasStylus() {
        return hasStylus;
    }

    public void setHasStylus(boolean hasStylus) {
        this.hasStylus = hasStylus;
    }

    @Override
    public void chargePhone(int minutes) {
        int chargeAmount = minutes / 3; // Samsung phones charge slower, 3 minutes of charging gives 1% battery
        batteryPercentage += chargeAmount;
        if (batteryPercentage > 100) {
            batteryPercentage = 100; // Cap battery at 100%
        }
        setBatteryPercentage(batteryPercentage);
        System.out.println("Samsung phone charged. New battery percentage: " + this.getBatteryPercentage() + "%");
    }

    @Override
    public void updateDevice(boolean update) {
        int versionNumber = Integer.parseInt(this.getOperatingSystem().split(" ")[1]);
        if (update) {
            setOperatingSystem("Android " + (versionNumber + 1));
            System.out.println("Samsung phone updated. New operating system: " + this.getOperatingSystem());
        } else {
            System.out.println("No update performed.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Has Stylus: " + hasStylus;
    }   
}
