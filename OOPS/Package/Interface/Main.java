package OOPS.Package.Interface;

import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
     Car car = new Car();
        car.acc();
        car.brake();
        car.start();
        car.stop();

        Media carMedia=new Car();
        carMedia.start();
        NiceCar niceCar=new NiceCar();
        niceCar.start();
        niceCar.startMusic();
        niceCar.upgradeEngine();
        niceCar.start();
    }
}
