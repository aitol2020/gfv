public class Main {

    public static void main(String[] args) {
        createObject("BanyanTree").print();
        createObject("OrdinaryTree").print();
        createObject("MahoganyTree").print();
    }

    public static Printable createObject(String className) {    /*  ⬅ we have created Printable type method coz it has been
                                                                   implemented to all classes and has access to print method as well*/
        Printable printable = null;   //  ⬅  we have created Printable type variable coz all of our classes are united by this interface
        switch (className) {
            case "OrdinaryTree":
                printable = new OrdinaryTree("Ordinary tree", "black", 85.6);
                break;
            case "BanyanTree":
                printable = new BanyanTree("Banyan  tree", "green", "Longevity (долговечность) ");
                break;
            case "MahoganyTree":
                printable = new MahoganyTree("Mahogany tree", "brown", "Sky-fruit (it is known as a SKY-FRUIT due to orientation  of capsules toward the sky)");
                break;
        }
        return printable;
    }
}

/*
        a)  Доделать все пункты практического задания из презентации.

        b)  Создать 2х уровневую иерархию из 4х классов
            (1й - родитель --> 2й, 3й, 4й - дочерние, с отличающимися полями).           ✅

        c)  Создать Интерфейс Printable с методом void print();                          ✅

        d)  Реализовать интерфейс Printable классами 2й, 3й и 4й,
            переопределить метод интерфейса так чтобы он
            распечатывал всю информацию о свойствах объекта.                             ✅

        e)  В классе Main создать возвращаемый метод createObject(String className),
            который умеет создавать объекты класса 2й, 3й и 4й и после
            создания и задания свойств объекту метод возвращает ссылку
            на объект (пульт). Можно использовать switch для того чтоб
            определить какого типа нужно создать экземпляр объекта.
            Например если в параметре передается “2й”
            метод должен создать объект именно этого типа.                               ✅

        f)  В главном классе Main создать 3 различных объекта классов
            2й, 3й и 4й с помощью метода createObject,
            и распечатать по ним информацию методом print();                             ✅
            */

