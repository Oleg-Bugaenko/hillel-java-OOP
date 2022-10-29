public class Car {

    public void start() {
        startElectricity();
        startCommand();
        startFuelSystem();
    }


    private void startElectricity() {
        System.out.println("Electricity is on");
    }

    private void startCommand() {
        System.out.println("Command is ready");
    }

    private void startFuelSystem() {
        System.out.println("Fuel system is on");
    }
}
