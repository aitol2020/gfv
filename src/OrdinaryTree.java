public class OrdinaryTree extends Seed implements Printable {

    private double height;

    public OrdinaryTree(String name, String color, double height){
        super(name, color);
        this.height = height;


    }

    @Override
    public void print() {
        System.out.println("----------------------");
        System.out.println("height in feet = " + height +
                "\nName = " + getName() +
                "\nColor = " + getColor());

    }
}
