public class bubbleSort {
    public static void bubbleSortt (int[]arr) {
        int n = arr.length;
        for(int i = 0; i<n;i++) {
            for(int j = 0; j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    protected static void printArr(int[] arr ){
        for(int i:arr){
            System.out.println(i);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = { 64, 34, 25, 12, 22, 11, 90 };
        System.out.println("Original array");
        printArr(arr);  
        System.out.println("Sorted array");
        bubbleSortt(arr);
        printArr(arr);  
    }
}
