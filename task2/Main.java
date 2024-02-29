// Інтерфейс Animal
interface Animal {
    void makeSound(); // Метод для виділення звуку тварини
    void eat(); // Метод для прийому їжі тварини
}

// Абстрактний клас Pet
abstract class Pet implements Animal {
    private String name;
    private String foodType;

    public Pet(String name, String foodType) {
        this.name = name;
        this.foodType = foodType;
    }

    public String getName() {
        return name;
    }

    @Override
    public void eat() {
        System.out.println(name + " їсть " + foodType);
    }
}

// Клас Dog, який розширює абстрактний клас Pet
class Dog extends Pet {
    public Dog(String name) {
        super(name, "кісточки");
    }

    @Override
    public void makeSound() {
        System.out.println("Гав-гав!");
    }
}

// Клас Cat, який розширює абстрактний клас Pet
class Cat extends Pet {
    public Cat(String name) {
        super(name, "риба");
    }

    @Override
    public void makeSound() {
        System.out.println("Мяу!");
    }
}

// Клас Bird, який реалізує інтерфейс Animal без розширення абстрактного класу Pet
class Bird implements Animal {
    private String name;

    public Bird(String name) {
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println("Цвірінь-цвірінь!");
    }

    @Override
    public void eat() {
        System.out.println(name + " їсть насіння");
    }
}

// Приклад використання
public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Барон");
        Cat myCat = new Cat("Мурзик");
        Bird myBird = new Bird("Пташка");

        myDog.makeSound();  // Виведе "Гав-гав!"
        myDog.eat();        // Виведе "Барон їсть кісточки"

        myCat.makeSound();  // Виведе "Мяу!"
        myCat.eat();        // Виведе "Мурзик їсть рибу"

        myBird.makeSound(); // Виведе "Цвірінь-цвірінь!"
        myBird.eat();       // Виведе "Пташка їсть насіння"
    }
}
