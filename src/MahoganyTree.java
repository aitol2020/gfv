public class MahoganyTree  extends  Seed implements Printable {

    private String nameOfaFruit;

    public MahoganyTree(String name, String color, String nameOfaFruit){
        super(name, color);
        this.nameOfaFruit = nameOfaFruit;


    }

    @Override
    public void print() {
        System.out.println("----------------------");
        System.out.println( "Name of a fruit  = " + nameOfaFruit +
                "\nName = " + getName() +
                "\nColor = " + getColor());

    }
}
