public class Car {
    String name;
    int currentSpeed;
    public Car(String name, int currentSpeed) {
        this.name = name;
        this.currentSpeed = currentSpeed;
    }
    public int getCurrentSpeed() {
        return currentSpeed;
    }
    public String getCurrentName() {
        return name;
    }
}
