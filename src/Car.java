public class Car {
    private String brand;
    private String type;
    private int speed;
    private double price;

    public Car(String brand, String type, int speed, double price){
        this.brand = brand;
        this.type = type;
        this.speed = speed;
        this.price = price;
    }

    public int getSpeed(){
        return this.speed;
    }

    public double getPrice(){
        return this.price;
    }

    public double getRelationship(){
        return this.speed/this.price;
    }

    @Override
    public String toString(){
        return this.brand + "-" + this.type + " price:" + this.price;
    }
}

