abstract class MotorVehicle {
    String modelName;
    int modelNumber;
    double modelPrice;

    MotorVehicle(String name, int num, double price) {
        this.modelName = name;
        this.modelNumber = num;
        this.modelPrice = price;
    }

    void display() {
        System.out.println("Name: " + modelName + "\nNo: " + modelNumber + "\nPrice: " + modelPrice);
    }
}

class Car extends MotorVehicle {
    double discountRate;

    Car(String name, int num, double price, double dr) {
        super(name, num, price);
        this.discountRate = dr;
    }

    void discount() {
        double discAmount = (modelPrice * discountRate / 100);
        System.out.println("Discount: " + discAmount);
        System.out.println("Final Price: " + (modelPrice - discAmount));
    }

    @Override
    void display() {
        super.display();
        System.out.println("Discount Rate: " + discountRate + "%");
    }
}
