package Batch8am;



public class Practice {

    public static void main(String[] args) {
        int [][] arr = {{1,4,5},{3,4,7},{0,2,9}};
       // System.out.println(arr[0]);
       int max=arr[0][0];
       int maxColumn = 0;


       for (int i =0; i<arr.length;i++){
           for (int j = 0; j< arr.length; j++){
               if (arr[i][j]>max){
                   // System.out.println(i);

                   max=arr[i][j];
                   maxColumn=j;
               }
           }



       }
        System.out.println(max);
        int k =0;
       int min = arr[0][maxColumn];
       while (k<3){
           if (arr[k][maxColumn]<min){
               min=arr[k][maxColumn];

          }
           k++;

       }
        System.out.println(min);









//            if(arr[i]==4){
//                System.out.println(i);
//
//
//            }

        }



//        String one = "Myself";
//        char[]arr = one.toCharArray();
//        String rev = "";
//        for (int i =arr.length-1;i>=0;i--){
//             rev =rev+arr[i];
//
//        } System.out.println(rev);
//        try{
//        String[]fis = new String[4];
//        fis[0]="anc";
//        fis[1]="and";
//        fis[2]="ane";
//        fis[3]="anf";
//        fis[4]="ang";
//        fis[5]="anc";
//        System.out.println(fis[5]);
//        }catch (Exception e){
//            System.out.println("i am handeled");
//        }
//
//        if (one.endsWith("f")){
//            System.out.println("i am verified");
//
//        }else {
//            System.out.println("i am failed");
//        }
//
//
//
////        String[]divide = one.split("s");
////        System.out.println(divide[0]);
////        String first = one.substring(0,2);
////        System.out.println(first);
////        String sub = one.substring(2);
////        System.out.println(sub);
    }


