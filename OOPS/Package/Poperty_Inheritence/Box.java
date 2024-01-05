package OOPS.Package.Poperty_Inheritence;

public  class  Box {
    double l;
    double h;
    double w;
    double weight;

    static void greeting(){
        System.out.println("Hey,I am in Box of greeting");
    }

    Box(){
        this.l=-1;
        this.h=-1;
        this.w=-1;
    }Box(double size){
        super();
        this.l=size;
        this.h=size;
        this.w=size;
    }public Box(double l,double h,double w){
        this.l=l;
        this.h=h;
        this.w=w;
    }Box(Box old){
        this.l=old.l;
        this.h=old.h;
        this.w=old.w;
    }public void information(){
        System.out.println("Running the box");
    }
}
