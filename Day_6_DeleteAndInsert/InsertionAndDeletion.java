import java.util.Scanner;

public class InsertionAndDeletion {
  public static void display(int[] arr, int N) {
    for(int i = 0; i < N; i++) {
      System.out.print(arr[i] + " ");
    }    
  }
 public static void main(String[] args) {
  
  Scanner  sc = new Scanner(System.in);
  // Declered the array size
   int arr[] = new int[100];
  System.out.println("Enter the number of the Array");
   // taking the input from here
   int N = sc.nextInt();

   for(int i = 0; i < N; i++){
    arr[i] = sc.nextInt();
   }
   
   // Deletion from the end
   if(N >= 1) {
    arr[N - 1] = 0;
    N--;
   }
  //  Insertion 15 from the end
   if(N < 100) {
    arr[N] = 15;
    N++;
   }
   // Create a function for avoiding repeating the code
   display(arr, N);
   // close the Scanner
   sc.close();
 }
}