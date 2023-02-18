package ArrayPackage;

public class ArrayExamples {

    public static  void main(String[] args)   {
//       // ArrayExamples obj = new ArrayExamples();
//        int[] arr1 = new int[5];
////
//            arr1[0] = 10;
//            arr1[1] = 20;
//            arr1[2] = 30;
//            arr1[3] = 40;
//            arr1[4] = 50;
////
////
////
////           // Thread.sleep(2000);
////           // arr1[5] = 60; //ArrayIndexOutOfBound exception
////            //FOR EACH LOOP
//        for(int data:arr1){
//            System.out.println(data);
//        }
//        System.out.println("moon");
//
//        int a0 = arr1[0];
//        int a1 = arr1[1];
//        int a2 = arr1[2];
//        int a3 = arr1[3];
//        // int a4 = arr1[4];
//        System.out.println(a0);
//        System.out.println(a1);
//        System.out.println(a2);
//       // System.out.println(a3);
//        System.out.println(arr1.length);

//        //FOR LOOP
//        for (int i = 0; i < arr1.length; i++) {
//            System.out.println(arr1[i]);
//        }
        //MULTIDIMENSIONAL ARRAY
        int [][] arr2 = {
                {1,2,3,},
                {4,5,6},

        };
        int v =arr2[0][0];
        int v1 =arr2[0][1];
        int v2 =arr2[0][2];
        int v3 =arr2[1][0];
        int v4 =arr2[1][1];
        int v5 =arr2[1][2];
        System.out.println(v5);
        System.out.println(arr2.length);
        for(int i =0; i<arr2.length; i++){
            System.out.println(arr2[0][2]);
            for(int j=0; j<arr2[i].length; j++){
                System.out.print(arr2[i][j] +"\t"); //make space can use "\t"

               // System.out.println(" i = "+ i + " j = " +j);
            }
            System.out.println();

        }








    }
}

