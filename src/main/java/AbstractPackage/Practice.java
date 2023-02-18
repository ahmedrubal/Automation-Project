package AbstractPackage;

public class Practice {
    public static void main(String[] args) {
        int[]arr ={4,8,9};
        int max=0;
        for (int i = 0; i<arr.length; i++){
           // max=arr[i];
            if (max<arr[i]){
                max=arr[i];
            }

        }
        System.out.println(max);

    }
}
