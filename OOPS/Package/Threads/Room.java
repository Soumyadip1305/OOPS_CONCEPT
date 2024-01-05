package OOPS.Package.Threads;

public class Room {
    public static void main(String[] args) {
        House obj = new House();
        Thread obj2 = new Thread(obj);
        obj.start();

    }
}
