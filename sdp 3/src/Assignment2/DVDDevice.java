package Assignment2;

public class DVDDevice implements Device {
    private int volume;
    private int chapter;

    @Override
    public void powerOn() {
        System.out.println("DVD player is now ON.");
    }

    @Override
    public void powerOff() {
        System.out.println("DVD player is now OFF.");
    }

    public void setChapter(int chapter) {
        this.chapter = chapter;
        System.out.println("DVD chapter set to " + chapter);
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("DVD volume set to " + volume);
    }

    @Override
    public void setChannel(int channel) {
    }
}

