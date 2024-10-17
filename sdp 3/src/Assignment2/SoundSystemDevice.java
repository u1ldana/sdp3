package Assignment2;

public class SoundSystemDevice implements Device {
    private int volume;

    @Override
    public void powerOn() {
        System.out.println("Sound system is now ON.");
    }

    @Override
    public void powerOff() {
        System.out.println("Sound system is now OFF.");
    }

    @Override
    public void setChannel(int channel) {

    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Sound system volume set to " + volume);
    }
}

