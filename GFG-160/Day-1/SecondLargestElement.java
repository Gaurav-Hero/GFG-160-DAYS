
class SecondLargestElement {
    public int getSecondLargest(int[] arr) {
        int max_one = 0;
        int max_two = 0;
        boolean flag = false;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > max_one) max_one = arr[i];
        }
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > max_two && arr[i] < max_one){
                max_two = arr[i];
                flag = true;
            }
        }
        
        if(flag) return max_two;
        return -1;
        
        
    }
}