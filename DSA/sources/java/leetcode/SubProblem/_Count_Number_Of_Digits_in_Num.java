public class _Count_Number_Of_Digits_in_Num {
    public static int countDigit(int a){
        int count = 0;
        while(a != 0){
            a = a/10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int res = countDigit(1234);
        System.out.println(res);
    }
}
