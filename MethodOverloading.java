class MethodOverloading {
    void Area(float a,float b){
       float area1=a*b;
       System.out.println("rectangle area is: "+area1);

    }
    void Area(float x){
       float area2=x*x;
       System.out.println("square area is: "+area2);
    }


}
class Shape {
    public static void main(String[] args) {
        MethodOverloading obj1= new MethodOverloading();
        obj1.Area(4,2);
        MethodOverloading obj2= new MethodOverloading();
        obj2.Area(4);
    }
   
}
