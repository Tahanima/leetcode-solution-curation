public class IsomorphicStrings {
  public bool IsIsomorphic(string s, string t) {
    int len = s.Length;
    bool isIso = true;
    int[] mapping = new int[130];
    int[] mappedTo = new int[130];
    
    for (int i = 0; i < len; i++) {
      if (mapping[s[i]] > 0) {
        int val = mapping[s[i]];
        
        if ((int)t[i] != val) {
          isIso = false;
          break;
        }
      } else {
        if (mappedTo[t[i]] > 0) {
          isIso = false;
          break;
        }
        
        mapping[s[i]] = t[i];
        mappedTo[t[i]] = s[i];
      }
    }
    
    return isIso;
  }
}