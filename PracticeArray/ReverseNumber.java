import java.util.Scanner;

public class ReverseNumber {
  public static void main(String[] args) {
    
    Scanner Sc = new Scanner(System.in);
    int N = Sc.nextInt();
    int Array[] = new int[N];
    
    // Input for N Element 
    for(int i = 0; i < N; i++) {
      Array[i] = Sc.nextInt();
    }
    // For revesre Number
    for(int i = N - 1; i >= N; i--) {
      System.out.println(Array[i] + " ");
    }
    Sc.close();
  }
}
