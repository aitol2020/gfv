public class Airplane extends Metal implements Printable {

    private int volume;

    public Airplane(String name, String color, int volume){
        super(name, color);
        this.volume = volume;


    }

    @Override
    public void print() {
        System.out.println("----------------------");
        System.out.println( "volume  = " + volume +
                "\nName = " + getName() +
                "\nColor = " + getColor());

    }
}
