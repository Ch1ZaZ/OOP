package Lab_Rob_1;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Teo",3,16.5);
        dog.command("Лежати");
        System.out.println(dog.showName());

        Person person = new Person("Петро",26,3);
        person.info();
        System.out.println("Час з собакою " + person.experience() + " роки ");

        Area area = new Area("Івана Франка",1057,974);
        System.out.println("Площа " + area.square());
        area.street();

    }
}