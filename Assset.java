abstract class Asset {
    abstract void displayDetails();
}

class Stock extends Asset {
    @Override void displayDetails() { System.out.println("Displaying Stock details..."); }
}

class Bond extends Asset {
    @Override void displayDetails() { System.out.println("Displaying Bond details..."); }
}

class Savings extends Asset {
    @Override void displayDetails() { System.out.println("Displaying Savings details..."); }
}