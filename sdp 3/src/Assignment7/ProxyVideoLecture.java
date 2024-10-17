package Assignment7;

public class ProxyVideoLecture implements VideoLecture {
    private String fileName;
    private RealVideoLecture realVideoLecture;

    public ProxyVideoLecture(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void getInfo() {
        System.out.println("Video info (from proxy): " + fileName);
    }

    @Override
    public void play() {
        if (realVideoLecture == null) {
            realVideoLecture = new RealVideoLecture(fileName);
        }
        realVideoLecture.play();
    }
}

