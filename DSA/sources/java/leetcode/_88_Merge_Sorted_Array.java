public class _88_Merge_Sorted_Array {
    public static void merge(int[] n1, int m, int[] n2, int n) {
        for (int ai : n2) {
            insertIntoArray(ai, n1, m);
            m++;
        }
    }

    private static void insertIntoArray(int x, int[] a, int m) {
        boolean found = false;
        for (int k = 0; k < m; k++) {
            if (a[k] > x) {
                found = true;
                // Shift elements to the right
                for (int i = m - 1; i >= k; i--) {
                    a[i + 1] = a[i];
                }
                a[k] = x;
                break;
            }
        }
        if (!found) {
            a[m] = x; // Insert at the end if no larger element is found
        }
    }

    public static void main(String[] args) {
        int[] n1 = {2, 3, 4, 5, 0, 0, 0}; // First array
        int[] n2 = {1, 3, 6}; // Second array
        merge(n1, 4, n2, 3); // Merge n2 into n1
        for (int num : n1) {
            System.out.print(num + " "); // Print the merged array
        }
    }
}
