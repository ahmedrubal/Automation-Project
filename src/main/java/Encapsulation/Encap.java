package Encapsulation;

public class Encap {// Encapsulation is a process to access private variables which has no value when we assign it.
    //encapsulation is a process of packaging variables and method into a single unit
     private String Uk ;// also u can put null value
    private int room ; // also can assign value 0 (as we already know int type data's not null but it has 0 value.

    public void setUk(String uk1){//using setUK method we can assign local variable in our instance variable
        this.Uk = uk1;// and make sure we have to name that method public ,
        // and  method name must be after set same as variable name with first letter capitalize
                 // Here this referening instance variable of the current class.
    }
    public String getUk(){//getter method used for return the value of a setter method or instance variable
        return this.Uk;
    }
    public static void main(String[] args) {
        Encap obj = new Encap();
        System.out.println(obj.room);
        obj.setUk("london");
        System.out.println(obj.getUk());

    }
}
