package Assignment2;

public class AdvancedRemote extends RemoteControl {
    public AdvancedRemote(Device device) {
        super(device);
    }

    @Override
    public void setChannel(int channel) {
        device.setChannel(channel);
    }

    public void mute() {
        System.out.println("Muting the device.");
        device.setVolume(0);
    }
}

