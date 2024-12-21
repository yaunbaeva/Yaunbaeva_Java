public class Main {
    public static void main(String[] args) {
        int[] A = new int[] {1,2,3,4,5,6,7,8,9,10};

       for (int i = 0; i < A.length; i++){
           if (A[i] % 2 == 0){
               System.out.println(A[i]);
           }
       }
    }
}