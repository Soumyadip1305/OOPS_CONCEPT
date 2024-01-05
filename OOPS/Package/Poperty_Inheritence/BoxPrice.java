package OOPS.Package.Poperty_Inheritence;

public class BoxPrice extends BoxWeight{
    // BoxPrice also Extends BoxWeight
    double cost;

    BoxPrice (double side,double cost){
        super(side);
        this.cost=cost;
    }
    BoxPrice(BoxPrice other){
        super(other);
        this.cost=other.cost;
    }

    public BoxPrice(double l, double h, double w, double weight, double cost) {
        super(l, h, w, weight);
        this.cost = cost;
    }

    public BoxPrice(double side, double weight, double cost) {
        super(side,weight);
        this.cost = cost;
    }
}
