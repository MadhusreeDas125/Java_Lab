class Point{
    private double x;
    privatedouble y;
    public Point(double x,double y){ 
        this.x=x;
        this.y=y;

    }
    public String getCoordinates(){
        return "(" + x + "," + y +")";
    }
}
public Circle{
    private double radius;
    private double centre;
    public class Circle(double radius,double x,double y){
        this.radius=radius;
        this.centre=new Point(x,y);
    }
    public double calculateArea(){
        return 3.14*radius*radius;
    }
    public void displayDetails(){
        System.out.println("Radius: "+radius);
        System.out.println("Centre point: "+ centre.getCoordinates());
        System.out.println("Area= "+ calculateArea());
    }
}
public static void main(String[] args){
    Circle myCircle= new Circle(5.0,10.0,20.0);
    myCircle.displayDetails();
}
