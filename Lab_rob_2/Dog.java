package Lab_rob_2;

public class Dog {

    String name;
    int age;
    double weight;

    public Dog(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Dog(String name) {
        this.name = name;
    }

    public Dog() {
    }

    public Dog(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public void command(String com) {
        if (com == "Сидіти") {
            System.out.println("Собака сіла");
        } else if (com == "Лежати") {
            System.out.println("Собака лежить");
        } else if (com == "Голос") {
            System.out.println("Собака лає");
        }
    }

    public String showName() {
        return name;
    }

    public void upGrate(String up) {
        if (up == "Багато їжі") {
            System.out.println("Не їш багато бо поправишся");
        }else if(up == "Правильне харчування"){
            System.out.println("Струнка собачка");
        }

    }
}