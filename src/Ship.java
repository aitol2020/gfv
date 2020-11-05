public class Ship extends Metal implements Printable {

    private String type;

    public Ship(String name, String color, String type){
        super(name, color);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public void print(){
        System.out.println("----------------------");
        System.out.println( "TYPE = " + type +
                "\nName = " + getName() +
                "\nColor = " + getColor());

    }
}
