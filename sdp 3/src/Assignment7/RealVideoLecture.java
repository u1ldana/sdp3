package Assignment7;

public class RealVideoLecture implements VideoLecture {
    private String fileName;

    public RealVideoLecture(String fileName) {
        this.fileName = fileName;
        loadFromDisk();
    }


    private void loadFromDisk() {
        System.out.println("Loading video: " + fileName);
    }

    @Override
    public void getInfo() {
        System.out.println("Video info: " + fileName);
    }

    @Override
    public void play() {
        System.out.println("Playing video: " + fileName);
    }
}
