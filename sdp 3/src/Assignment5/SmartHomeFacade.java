package Assignment5;

public class SmartHomeFacade {
    private Light light;
    private Thermostat thermostat;
    private SecuritySystem securitySystem;
    private EntertainmentSystem entertainmentSystem;

    public SmartHomeFacade(Light light, Thermostat thermostat, SecuritySystem securitySystem, EntertainmentSystem entertainmentSystem) {
        this.light = light;
        this.thermostat = thermostat;
        this.securitySystem = securitySystem;
        this.entertainmentSystem = entertainmentSystem;
    }


    public void leaveHome() {
        light.turnOff();
        thermostat.setTemperature(18);
        securitySystem.arm();
        entertainmentSystem.turnOff();
        System.out.println("You have left home.");
    }


    public void arriveHome() {
        light.turnOn();
        thermostat.setTemperature(21);
        securitySystem.disarm();
        entertainmentSystem.turnOn();
        System.out.println("Welcome home!");
    }


    public void nightMode() {
        light.turnOff();
        thermostat.setTemperature(20);
        securitySystem.arm();
        System.out.println("Night mode activated.");
    }


    public void movieMode() {
        light.turnOff();
        thermostat.setTemperature(22);
        entertainmentSystem.setMovieMode();
        System.out.println("Movie mode is ON.");
    }
}
