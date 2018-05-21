public class Main {

    public static void main(String[] args) {

        Car c1 = new Car("Audi", "a3", 210, 27000);
        Car c2 = new Car("Mercedes", "classe A", 180, 80000);
        Car c3 = new Car("Ferrari", "Enzo", 400, 70000);
        Car c4 = new Car("BMW", "x5", 200, 35000);

        Car cars[] = new Car[4];
        cars[0] = c1;
        cars[1] = c2;
        cars[2] = c3;
        cars[3] = c4;

        for(int i=0; i<cars.length; i++){
            System.out.println(cars[i]);
        }

        int index = 0;
        int maxSpeed = cars[0].getSpeed();

        for(int i=1; i < cars.length; i++) {
            if (cars[i].getSpeed() > maxSpeed) {
                maxSpeed = cars[i].getSpeed();
                index = i;
            }
        }
        System.out.println("index:" + cars[index]);
        System.out.println("maxSpeed:" + maxSpeed);

        index = 0;
        double maxPrice = cars[0].getPrice();

        for(int i=1; i < cars.length; i++) {
            if (cars[i].getPrice() > maxPrice) {
                maxPrice = cars[i].getPrice();
                index = i;
            }
        }

        System.out.println("index:" + cars[index]);
        System.out.println("maxPrice:" + maxPrice);

        index = 0;
        double maxRelation = cars[0].getRelationship();

        for(int i=1; i < cars.length; i++) {
            if (cars[i].getRelationship() > maxRelation) {
                maxRelation = cars[i].getRelationship();
                index = i;
            }
        }

        System.out.println("index:" + cars[index]);
        System.out.println("maxRelation:" + maxRelation);

    }
}
