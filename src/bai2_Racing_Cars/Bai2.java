package bai2_Racing_Cars;

public class Bai2 {
    public static int DISTANCE = 100;

    public static int STEP = 2;

    public static void main(String[] args) {
// write your code here
        Car carA = new Car("A");
        Car carB = new Car("B");
        Car carC = new Car("C");

        Thread thread1 = new Thread(carA);
        Thread thread2 = new Thread(carB);
        Thread thread3 = new Thread(carC);

        System.out.println("Distance: 100KM");
        thread1.start();
        thread2.start();
        thread3.start();

    }
}
