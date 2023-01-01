package chap10;

public class Zoo {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.fetch();
        dog.makeSound();

        Animal sash = new Dog();
        sash.makeSound();
        feed(sash);
        sash.numberOfLegs();

        sash = new Cat();
        sash.makeSound();
        sash.numberOfLegs();
        ((Cat)sash).scratch();
        feed(sash);

    }
    public static void feed(Animal animal){

        if(animal instanceof Dog){
            System.out.println("here's dog food");
        } else if (animal instanceof Cat) {
            System.out.println("Here's Cat food");

        }

    }
}
