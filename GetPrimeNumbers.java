import java.util.Scanner; 
public class GetPrimeNumbers{
public static boolean isPrime(int n) {
int h=1;
       if (n <= 1) {return false;}else{
        for(int i=2; i<=n; i++){
          if(n%i==0){
          h++;
          if(h>2){return false;}
          }
        }
       return true;
       }   
   }  

static void myMethod() {
	      Scanner s = new Scanner(System.in);  
	      System.out.print("Enter the first number : ");  
        int start = s.nextInt();  
        System.out.print("Enter the second number : ");  
        int end = s.nextInt();  
        System.out.println("List of prime numbers between " + start + " and " + end); 
	      for (int i = start; i <= end; i++){  
             if (isPrime(i)){  
              	  System.out.println(i);  
          	  }  
       	  }  
 	     }

public static void main(String[] args) {
    myMethod();
  }
}