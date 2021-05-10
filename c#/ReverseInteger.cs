public class ReverseInteger {
  public int Reverse(int x) {
    bool isNegative = false;
    
    if (x < 0) {
      isNegative = true;
      x *= -1;
    }
    
    long rev = 0;
    for (; x > 0; rev = rev * 10 + (x % 10), x /= 10);
    
    if (rev > ((1L << 31) - 1))
      return 0;
      
    if (isNegative)
      rev *= -1;
      
    return (int)rev;
  }
}