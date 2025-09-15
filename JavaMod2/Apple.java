
public class Apple extends Phone {
    boolean hasFaceID;

    public Apple(int batteryPercentage, String operatingSystem, boolean hasFaceID) {
        super(batteryPercentage, operatingSystem, "Apple");
        this.hasFaceID = hasFaceID;
    }

    public boolean isHasFaceID() {
        return hasFaceID;
    }

    public void setHasFaceID(boolean hasFaceID) {
        this.hasFaceID = hasFaceID;
    }

    @Override
    public void chargePhone(int minutes) {
        int chargeAmount = minutes / 1; // Apple phones charge faster, 1 minute of charging gives 1% battery
        batteryPercentage += chargeAmount;
        if (batteryPercentage > 100) {
            batteryPercentage = 100; // Cap battery at 100%
        }
        setBatteryPercentage(batteryPercentage);
        System.out.println("Apple phone charged. New battery percentage: " + this.getBatteryPercentage() + "%");
    }

    @Override
    public void updateDevice(boolean update) {
        int versionNumber = Integer.parseInt(this.getOperatingSystem().split(" ")[1]);
        if (update) {
            setOperatingSystem("iOS " + (versionNumber + 1));
        } else {
            System.out.println("No update performed.");
            return;
        }
        System.out.println("Apple phone updated. New operating system: " + this.getOperatingSystem());
    }

    @Override
    public String toString() {
        return super.toString() + ", Has FaceID: " + hasFaceID;
    }
    
}
