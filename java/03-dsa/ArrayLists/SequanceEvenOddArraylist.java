// arr = {1,2,3,4,5,6};
// ans = {2,1,4,3,6,5};

import java.util.ArrayList;

public class SequanceEvenOddArraylist {
    static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
  ArrayList<Integer> even = new ArrayList<>();
  ArrayList<Integer> odd = new ArrayList<>();

  for(int i=0;i<arr.length;i++) {
    if(arr[i]%2==0) {
      even.add(arr[i]);
    }
    else {
      odd.add(arr[i]);
    }
  }
  int j =0;int k=0;int l = 0;
  while (k<odd.size() && l<even.size()) {
  arr[j++] = even.get(k++);
  arr[j++] = odd.get(l++);
  }

  for(int n : arr) {
    System.err.println(n+"");
  }
  }
}
