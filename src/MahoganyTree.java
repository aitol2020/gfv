public class MahoganyTree  extends  Seed implements Printable {

    private int lifeSpan;

    public MahoganyTree(String name, String color, int lifeSpan){
        super(name, color);
        this.lifeSpan = lifeSpan;


    }

    @Override
    public void print() {
        System.out.println("----------------------");
        System.out.println( "Life Span in years  = " + lifeSpan +
                "\nName = " + getName() +
                "\nColor = " + getColor());

    }
}
