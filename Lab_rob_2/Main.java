package Lab_rob_2;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Teo",3,16.5);
        Dog dog1 = new Dog();
        Dog dog2 = new Dog("Teo");
        Dog dog3 = new Dog("Teo", 20);
        dog.command("Лежати");
        dog.upGrate("Правильне харчування");
        System.out.println(dog.showName());


        System.out.println();

        Person person = new Person("Петро",26,3);
        person.info();
        System.out.println("Час з собакою " + person.experience() + " роки ");
        System.out.println("Час з собакою " + person.experience(3.5) + " роки ");
        person.improve(12,"Beagle","Shepherd","Husky");
        person.person(person);
        person.upgrade("Виснажені тренування");

        System.out.println();

        Area area = new Area("Івана Франка",1057,974);
        System.out.println("Площа " + area.square());
        area.street();
        area.up("Якович",2);
        area.upgrade();

    }
}
