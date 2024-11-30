class Solution {
    void pushZerosToEnd(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                if (i != count) {
                    int temp = arr[i];
                    arr[i] = arr[count];
                    arr[count] = temp;
                }
                count++;
            }
        }
    }
}