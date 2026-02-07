/*
Scenario:
Temperature sensor reading function.
*/

class SmartHomeSensor {

    static void readTemperature() {
        try {
            int temperature = 25 / 0;
            System.out.println(temperature);
        } catch (ArithmeticException e) {
            System.out.println("Sensor malfunction detected!");
        } finally {
            System.out.println("Sensor check complete.");
        }
    }

    public static void main(String[] args) {
        readTemperature();
    }
}
