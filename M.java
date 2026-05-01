abstract class ThreeDObject {
    abstract double wholeSurfaceArea();
    abstract double volume();
}

class Box extends ThreeDObject {
    double l, b, h;
    Box(double l, double b, double h) { this.l = l; this.b = b; this.h = h; }
    @Override double wholeSurfaceArea() { return 2 * (l * b + b * h + h * l); }
    @Override double volume() { return l * b * h; }
}

class Cube extends ThreeDObject {
    double s;
    Cube(double s) { this.s = s; }
    @Override double wholeSurfaceArea() { return 6 * s * s; }
    @Override double volume() { return Math.pow(s, 3); }
}

class Cylinder extends ThreeDObject {
    double r, h;
    Cylinder(double r, double h) { this.r = r; this.h = h; }
    @Override double wholeSurfaceArea() { return 2 * Math.PI * r * (r + h); }
    @Override double volume() { return Math.PI * r * r * h; }
}

class Cone extends ThreeDObject {
    double r, h;
    Cone(double r, double h) { this.r = r; this.h = h; }
    @Override double wholeSurfaceArea() {
        double s = Math.sqrt(r * r + h * h);
        return Math.PI * r * (r + s);
    }
    @Override double volume() { return (Math.PI * r * r * h) / 3; }
}

public class M {
    public static void main(String[] args) {
        ThreeDObject obj; 

        obj = new Box(10, 5, 2);
        System.out.println("Box Volume: " + obj.volume());

        obj = new Cube(5);
        System.out.println("Cube Surface Area: " + obj.wholeSurfaceArea());
        
        
    }
}
