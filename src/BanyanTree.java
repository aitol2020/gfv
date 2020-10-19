public class BanyanTree extends  Seed implements Printable {

    private int lifeSpan;

    public BanyanTree(String name, String color, int lifeSpan){
        super(name, color);
        this.lifeSpan = lifeSpan;


    }

    @Override
    public void print() {
        System.out.println("----------------------");
        System.out.println( "Life Span  in years = " + lifeSpan +
                "\nName = " + getName() +
                "\nColor = " + getColor());

    }
}
