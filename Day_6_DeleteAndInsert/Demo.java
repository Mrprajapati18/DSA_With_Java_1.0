import java.util.Scanner;

public class Demo {
  public static void display(int[] arr, int N) {
    for(int i = 0; i < N; i++) {
      System.out.println(arr[i] + " ");
      // System.out.println("");
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
   
   // Create a function for avoiding repeating the code
   
   display(arr, N);
   // Insertion

   // Deletion
   // Insertion
   // Deletion
   // close the Scanner
   sc.close();
 }
}