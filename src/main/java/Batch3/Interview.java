package Batch3;

public class Interview{
    int a;
    int b;

    public void interQestion(int x, int y){
        a=x;
        b=y;

        if (a>b){

            b=a;


            System.out.println(a);
            System.out.println(b);
           // System.out.println("it is true");
            //    int c = b=a;
           // System.out.println( c +"i am  a new value");


        }else {

            System.out.println(" a is not greater than b");
        }
    }
    public static void main(String[] args) {
        Interview in = new Interview();
        in.interQestion(6,3);

}
}
