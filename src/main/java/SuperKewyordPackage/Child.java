package SuperKewyordPackage;

public class Child extends Parent{
    // Using super keyword we can use parent class properties into child class.
    //Must we have to create parent child relationship.
    public void money(){
        super.properties();
    }
    public static void main(String[] args) {
        Child obj = new Child();
        obj.money();

    }
}
