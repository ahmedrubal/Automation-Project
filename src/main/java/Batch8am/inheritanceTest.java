package Batch8am;


import InheritancePackage.Animal;
import InterfacePackage.InterfaceThree;

public class inheritanceTest {
    public static  void main(String[] args){
       /* Dog dog = new Dog();
        dog.bark();
        dog.eat( "Dog");
        dog.run( "Dog");
        dog.walk("Dog");
        Cat cat = new Cat();
        cat.meow();
        cat.walk("cat");
        cat.run("cat");
        cat.eat("cat");
        String str1 = cat.animal;
        System.out.println(str1);

        ChildDog Cdog = (ChildDog) new ChildDog();
        ChildDog.feeding();
        ChildDog.eat("ChildDog");
        ChildDog.run("ChildDog");
        ChildDog.walk("ChildDog");*/

        InterfaceThree obj = new Animal();
        obj.m4();
        obj.walk("dog");
        obj.run("abc");







    }
}
