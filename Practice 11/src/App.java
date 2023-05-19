public class App {
    public static void main(String[] args) throws Exception {
        Dog dog = new Dog("gimmy");
        System.out.println("It's name is " + dog.getName() + ".");
        dog.setName("puppy");
        System.out.println("It's name is " + dog.getName() + " now.");
    }
}

class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
        System.out.println(this.name + " is Animal.");
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected String getName() {
        return this.name;
    }

}

class Mammal extends Animal {
    public Mammal(String name) {
        super(name);
        System.out.println(this.name + " is Mammal.");
    }
}

class Dog extends Mammal {
    public Dog(String name) {
        super(name);
        System.out.println(this.name + " is Dog.");
    }
}
