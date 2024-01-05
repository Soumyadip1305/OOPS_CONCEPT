package OOPS.Package.Poperty_Inheritence;

public class BoxColour extends BoxWeight{
    // BoxColour also Extends BoxWeight
    String colour;
    public BoxColour(double l, double h, double w, String  colour) {
        super(l, h, w);
        System.out.print("Box colour is ");
        this.colour=colour;
    }
}
