
import java.util.Scanner;

public class Min_And_SecondMinArray {
  public static void main(String[] args) {
    
    Scanner Sc = new Scanner(System.in);
    System.out.println("Entet the Array Number");
    // Taking the input fro size of the Array

    int N = Sc.nextInt();
    int arr[] = new int[N];

    // Input for N Element of the Array
    for(int i = 0; i < N; i++) {
      arr[i] = Sc.nextInt();
    }
    int min_element = Integer.MAX_VALUE;

    for(int i = 0; i < N; ++i) {
    if(arr[i] < min_element) {
      min_element = arr[i];
    }
  }
  System.out.println(min_element);

  int sec_Min = Integer.MAX_VALUE;
  for(int i = 0; i < N; i++) {
    if(arr[i] == min_element) 
       continue;

      if( arr[i] < sec_Min) 
        sec_Min = arr[i];  
  }
  System.out.println(sec_Min);
  Sc.close();
}
}
