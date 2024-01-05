package OOPS.Package.Interface;

public class Car implements Engine,Break,Media {



    @Override
    public void brake() {
        System.out.println("I break like AtCoder_Contest normal car");
    }

    @Override
    public void start() {
        System.out.println("I start like AtCoder_Contest normal car");
    }

    @Override
    public void stop() {
        System.out.println("I stop like AtCoder_Contest normal car");
    }

    @Override
    public void acc() {
        System.out.println("I accelerate like AtCoder_Contest normal car");
    }
}
