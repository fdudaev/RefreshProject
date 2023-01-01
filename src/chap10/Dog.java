package chap10;

public class Dog extends Animal{


    @Override
    public void makeSound(){
        System.out.println("woof");
    }
    @Override
    public void numberOfLegs(){
        System.out.println("Dog has 4 legs");
    }
    public void fetch(){
        System.out.println("fetch is fun");
    }


}
