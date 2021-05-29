public class CountGoodTriplets {
  public int CountGoodTriplets(int[] arr, int a, int b, int c) {
    int size = arr.Length, count = 0;
    
    for (int i = 0; i < size; i++) {
      for (int j = i + 1; j < size; j++) {
        for (int k = j + 1; k < size; k++) {
          bool isGoodTriplet = Math.Abs(arr[i] - arr[j]) <= a
            && Math.Abs(arr[j] - arr[k]) <= b
            && Math.Abs(arr[i] - arr[k]) <= c;
            
            if (isGoodTriplet)
              count++;
        }
      }
    }
    
    return count;
  }
}