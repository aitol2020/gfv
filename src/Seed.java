public abstract class Seed implements Printable {
    private String name;
    private String color;

    public Seed(String name, String color){
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }
}








