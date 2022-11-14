package Lab_Rob_1;

public class Dog {
    String name;
    int age;
    double weight;

    public Dog(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    void command(String com){
        if (com == "Сидіти"){
            System.out.println("Собака сіла");
        }else if (com == "Лежати"){
            System.out.println("Собака лежить");
        }else if (com == "Голос"){
            System.out.println("Собака лає");
        }
    }

    String showName (){
        return name;
    }
}
