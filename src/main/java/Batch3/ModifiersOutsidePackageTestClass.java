package Batch3;

import Modifiers.Defaultmodifiers;
import Modifiers.Protected;
import Modifiers.Publicmodifiers;

public class ModifiersOutsidePackageTestClass {
    public static void main(String[] args){

       Publicmodifiers obj = new Publicmodifiers();
        System.out.println(obj.country);
        obj.method1();


    }
}
