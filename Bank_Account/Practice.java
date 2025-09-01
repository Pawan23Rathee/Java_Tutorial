

class Practice{
    public static void main(String[] args) {
      int[] arr = {5, 2, 8, 1, 9};
      Practice practice = new Practice();
      int max = practice.findMax(arr);
      System.out.println("Maximum value: " + max);
    }

    public int findMax(int[] arr){
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
