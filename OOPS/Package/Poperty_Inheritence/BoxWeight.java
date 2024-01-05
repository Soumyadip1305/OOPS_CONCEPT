package OOPS.Package.Poperty_Inheritence;

public class BoxWeight extends Box {
    // BoxWeight Extends Box

    double weight;
    double side;
    public BoxWeight(double l,double h,double w,double weight) {
        super(l, h, w);
        System.out.println(super.weight);
        this.weight = weight;
    }
    public BoxWeight(){
        this.weight=-1;
    }

    static void greeting(){
        System.out.println("Hey,I am in BoxWeight of greeting");
    }

    public BoxWeight(double l,double h,double w){
        super(l, h, w);
    }

    public BoxWeight(double weight) {
        this.weight = weight;
    }

    public BoxWeight(BoxPrice other) {
        super(other);
        weight = other.weight;
    }
   public BoxWeight (double side,double weight){
        super(weight);
        this.side=side;
    }
}
