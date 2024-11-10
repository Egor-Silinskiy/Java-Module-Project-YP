public class Race {
    String currentLeader;
    int maxDistance = 0;
    public void startRace(Car car) { // car.getCurrentSpeed() - текущая скорость тачки
        int currentDistance = car.getCurrentSpeed() * 24;
        if (currentDistance > maxDistance) {
            maxDistance = currentDistance;
            currentLeader = car.getCurrentName();
        }

    }


}
