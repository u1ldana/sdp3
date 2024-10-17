package Assignment2;

public class HomeEntertainmentSystem {
    public static void main(String[] args) {

        Device tv = new TVDevice();
        RemoteControl basicRemote = new BasicRemote(tv);
        basicRemote.powerOn();
        basicRemote.setChannel(10);
        basicRemote.setVolume(20);
        basicRemote.powerOff();

        System.out.println("-----------------------------");

        Device soundSystem = new SoundSystemDevice();
        RemoteControl advancedRemote = new AdvancedRemote(soundSystem);
        advancedRemote.powerOn();
        advancedRemote.setVolume(15);
        ((AdvancedRemote) advancedRemote).mute();
        advancedRemote.powerOff();
    }
}
