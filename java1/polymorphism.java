class Animal { void sound(){ System.out.println("Animal Sound"); } }
class Dog extends Animal { void sound(){ System.out.println("Bark"); } }
class Cat extends Animal { void sound(){ System.out.println("Meow"); } }

public class polymorphism {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();  // Runtime -> Bark

        a = new Cat();
        a.sound();  // Runtime -> Meow
    }
}
