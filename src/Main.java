public class Main {

    public static void main(String[] args) {
        createObject("Airplane").print();
        createObject("Car").print();
        createObject("Ship").print();
    }

    public static Printable createObject(String className) {

        Printable printable;
        printable = null;
        switch (className) {
            case "Airplane":
                printable = new Airplane("Су-57", "Bleak", 90);
                break;
            case "Car":
                printable = new Car("BMW", "brown", "X5");
                break;
            case "Ship":
                printable = new Ship("TITANIC","WHITE","KRUIS");
                break;
        }
        return printable;
    }
}
