abstract class AbstractProduct {
    int productId;
    abstract void inputData(int id);
    abstract void displayData();
}

class TravelGuide extends AbstractProduct {
    @Override
    void inputData(int id) { this.productId = id; }
    @Override
    void displayData() { System.out.println("Travel Guide ID: " + productId); }
}

class CD extends AbstractProduct {
    @Override
    void inputData(int id) { this.productId = id; }
    @Override
    void displayData() { System.out.println("CD ID: " + productId); }
}
