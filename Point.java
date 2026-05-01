class Point {
    int x, y;
    Point(int x, int y) { this.x = x; this.y = y; }
}

class Circle {
    double radius;
    Point center;

    Circle(double r, int x, int y) {
        this.radius = r;
        this.center = new Point(x, y);
    }

    void display() {
        double area = Math.PI * radius * radius;
        System.out.println("Radius: " + radius);
        System.out.println("Center Point: (" + center.x + "," + center.y + ")");
        System.out.println("Area: " + String.format("%.2f", area));
    }

    public static void main(String[] args) {
        Circle c = new Circle(5.5, 10, 20);
        c.display();
    }
}