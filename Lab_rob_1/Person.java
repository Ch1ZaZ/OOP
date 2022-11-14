package Lab_Rob_1;

public class Person {
    String name;
    int age;
    int yearsWithDog;

    public Person(String name, int age, int yearsWithDog) {
        this.name = name;
        this.age = age;
        this.yearsWithDog = yearsWithDog;
    }

    void info(){
        System.out.println("Ім'я людини "+ name +", Її вік "+ age);
    }
    int experience(){
        return yearsWithDog;
    }
}