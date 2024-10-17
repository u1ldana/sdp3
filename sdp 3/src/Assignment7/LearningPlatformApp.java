package Assignment7;

public class LearningPlatformApp {
    public static void main(String[] args) {
        OnlineCourse course = new OnlineCourse();


        course.addLecture(new ProxyVideoLecture("Lecture 1: AMCS"));
        course.addLecture(new ProxyVideoLecture("Lecture 2: OOP "));
        course.addLecture(new ProxyVideoLecture("Lecture 3: SDP"));


        System.out.println("Showing lecture info:");
        course.showLecturesInfo();


        System.out.println("\nPlaying first lecture:");
        course.playLecture(0);

        System.out.println("\nPlaying second lecture:");
        course.playLecture(1);
    }
}

