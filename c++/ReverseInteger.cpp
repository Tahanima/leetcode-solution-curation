class ReverseInteger {
public:
  int reverse(int x) {
    signed long long rev = 0, num = x;
    bool is_negative = false;
    
    if (num < 0) {
      is_negative = true;
      num *= -1;
    }
    
    for (; num > 0; rev = rev * 10 + (num % 10), num /= 10);
    
    if (rev > ((1LL << 31) - 1))
      return 0;
      
    if (is_negative)
      rev *= -1LL;
    
    return (int)rev;
  }
};
