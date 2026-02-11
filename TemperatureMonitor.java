import java.util.Scanner;

public class TemperatureMonitor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Machine Temperature (°C): ");
        double temperature = sc.nextDouble();

        if (temperature > 80) {
            System.out.println("CRITICAL ALERT! Machine Overheating!");
        } 
        else if (temperature > 50) {
            System.out.println("Warning! Temperature is High.");
        } 
        else {
            System.out.println("Temperature Normal. System Running Smoothly.");
        }
    }
}
