public class Main {
    public static void main(String[] args) {
        System.out.println("You are now playing");
        Football football = new Football();
        Sport sport = new Sport();
        Rugby rugby = new Rugby();

        football.play();
        sport.play();
        rugby.play();
    }
}