public class Race {
    private String currentLeader;
    private int leaderDistance;

    public Race() {
        this.currentLeader = "";
        this.leaderDistance = 0;
        }
    public void newLeader(String car, int speed) {
        int distance = speed * 24;

        if (distance > leaderDistance) {
            leaderDistance = distance;
            currentLeader = car;
        }
    }
    public String getCurrentLeader() {
        return currentLeader;
    }
}
