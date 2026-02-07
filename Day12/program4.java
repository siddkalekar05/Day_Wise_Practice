/*
Scenario:
Electric scooter battery check using function.
*/

class LowBatteryException extends Exception {
    LowBatteryException(String message) {
        super(message);
    }
}

class ElectricScooter {

    static void startScooter(int batteryLevel) throws LowBatteryException {
        if (batteryLevel < 20) {
            throw new LowBatteryException("Battery too low!");
        }
        System.out.println("Scooter started");
    }

    public static void main(String[] args) {
        try {
            startScooter(10);
        } catch (LowBatteryException e) {
            System.out.println(e.getMessage());
        }
    }
}
