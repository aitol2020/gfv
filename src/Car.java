public class Car extends Metal implements Printable {

    private String model;

    public Car(String name, String color, String model){
        super(name, color);
        this.model = model;


    }

    @Override
    public void print() {
        System.out.println("----------------------");
        System.out.println( "Модель машины  = " + model +
                "\nИмя = " + getName() +
                "\nЦвет = " + getColor());

    }
}
