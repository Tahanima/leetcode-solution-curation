class CountGoodTriplets {
  public int countGoodTriplets(int[] arr, int a, int b, int c) {
    int size = arr.length, count = 0;
    
    for (int i = 0; i < size; i++) {
      for (int j = i + 1; j < size; j++) {
        for (int k = j + 1; k < size; k++) {
          boolean isGoodTriplet = Math.abs(arr[i] - arr[j]) <= a
            && Math.abs(arr[j] - arr[k]) <= b
            && Math.abs(arr[i] - arr[k]) <= c;
          
          if (isGoodTriplet)
            count++;
        }
      }
    }
    
    return count;
  }
}