package Lab_rob_2;

public class Person {

    String name;
    int age;
    int yearsWithDog;

    public Person(String name, int age, int yearsWithDog) {
        this.name = name;
        this.age = age;
        this.yearsWithDog = yearsWithDog;
    }

    public void info(){
        System.out.println("Ім'я людини "+ name +", Її вік "+ age);
    }
    public int experience(){
        return yearsWithDog;
    }

    public double experience(double yearsWithDog){
        return yearsWithDog;
    }

    public void improve(int study, String... dogs){
        System.out.println("Кількість пройдених курсів персони: " + study);
        System.out.println("Собаки з якими персона проводтла навчання: ");
        for (int i = 0; i < dogs.length; i++){
            System.out.println(dogs[i]);
        }
        if (study >= 12){
            yearsWithDog++;
            System.out.println("Великий досвід по навчанню собак");
        }
        else {
            System.out.println("Не великий досвід по навчанню собак");
        }
    }
    public void person(Person person){
        System.out.println(experience());
        System.out.println(person.age);
    }

    public void upgrade(String up){
        if (up == "Виснажені тренування"){
            System.out.println("Переможець");
        }else if (up == "Лінивий хазяїн"){
            System.out.println("Лузер");
        }
    }
}
