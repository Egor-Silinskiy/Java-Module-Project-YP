import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Race race = new Race();
        Scanner scanner = new Scanner(System.in);
        String name;
        int speed;
        for (int i = 1; i <= 3; i++) {
            System.out.println("Введите название автомобиля №" + i + ": ");
            name = scanner.next();

            while (true) {
                System.out.println("Введите скорость автомобиля №" + i + ". Скорость автомобиля должна быть в диапазоне от 0 до 250 км/час: ");
                if (scanner.hasNextInt()) {
                    speed = scanner.nextInt();
                    if (speed >= 0 && speed <= 250) {
                        break;
                    } else {
                        System.out.println("Введена некорректная скорость! Данное значение должно быть в диапазоне от 0 до 250 км/час!");
                    }
                } else {
                    System.out.print("Введите целое число! ");
                    scanner.next();


                }
            }

        Car car = new Car(name, speed);
        race.newLeader(car.getName(), car.getSpeed());

    }
        System.out.println("Самая быстрая машина: " + race.getCurrentLeader());
        scanner.close();
    }
}
