public class Phone implements AlterPhone {
    int batteryPercentage;
    String operatingSystem;
    String brand;

    public Phone(int batteryPercentage, String operatingSystem, String brand) {
        this.batteryPercentage = batteryPercentage;
        this.operatingSystem = operatingSystem;
        this.brand = brand;
    }

    public int getBatteryPercentage() {
        return batteryPercentage;
    }

    public void setBatteryPercentage(int batteryPercentage) {
        this.batteryPercentage = batteryPercentage;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void chargePhone(int minutes) {
        int chargeAmount = minutes / 2; // Assume 2 minutes of charging gives 1% battery
        batteryPercentage += chargeAmount;
        if (batteryPercentage > 100) {
            batteryPercentage = 100; // Cap battery at 100%
        }
        setBatteryPercentage(batteryPercentage);
        System.out.println("Phone charged. New battery percentage: " + this.getBatteryPercentage() + "%");
    }

    public void updateDevice(boolean update) {
        String currentOS = this.operatingSystem.split(" ")[0];
        int versionNumber = Integer.parseInt(this.operatingSystem.split(" ")[1]);
        if (update) {
            setOperatingSystem(currentOS + " " + (versionNumber + 1));
        } else {
            System.out.println("No update performed.");
            return;
        }
        System.out.println("Phone updated. New operating system: " + this.getOperatingSystem());
    }

    public String toString() {
        return "Brand: " + brand + ", OS: " + operatingSystem + ", Battery: " + batteryPercentage + "%";
    }
}
