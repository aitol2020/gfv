public class BanyanTree extends  Seed implements Printable {

    private String symbol;

    public BanyanTree(String name, String color, String symbol){
        super(name, color);
        this.symbol = symbol;


    }

    @Override
    public void print() {
        System.out.println("----------------------");
        System.out.println( "Symbol of a  = " + symbol +
                "\nName = " + getName() +
                "\nColor = " + getColor());

    }
}
