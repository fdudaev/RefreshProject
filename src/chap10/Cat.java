package chap10;

public class Cat extends Animal{


    @Override
    public void makeSound(){
        System.out.println("meaw");
    }
    @Override
    public void numberOfLegs(){
        System.out.println("Cat is 4 legged animal.");
    }
    public void scratch(){
        System.out.println("I am a cat. I scratch things.");
    }
}
