public class MapleTree extends Seed implements Printable {

    private int lifeSpan;

    public MapleTree(String name, String color, int lifeSpan){
        super(name, color);
        this.lifeSpan = lifeSpan;
    }

    public int getLifeTime() {
        return lifeSpan;
    }

    @Override
    public void print(){
        System.out.println("----------------------");
        System.out.println( "Life Span in years = " + lifeSpan +
                "\nName = " + getName() +
                "\nColor = " + getColor());

    }
}
