package loops;
import java.util.Scanner;
public class Assignment1loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


//        Write a Java program to calculate the sum of natural numbers up to a given positive integer 'n'.
//        System.out.println("Enter positive integer:");
//        int n=sc.nextInt();
//        if(n<=0){
//            System.out.println("Please enter a positive integer");
//        }else {
//
//        int sum=0;
//        for(int i=1;i<=n;i++){
//            sum+=i;
//        }
//        System.out.println("Sum of natural numbers upto "+n+" is: "+sum);
//
//        }

        // Q2. Write a java program to print a multiplication table for a given number 'n'.
//        int n = sc.nextInt();
//        System.out.println("Enter number to print multiplication table of: ");
//        if (n <= 0) {
//            System.out.println("Please enter a positive integer");
//        } else {
//            for (int i = 1; i <= 10; i++) {
//                //System.out.println(n+" * "+i+" = "+n*i);
//                System.out.println(n + " * " + i + " = " + n * i);
//            }
//
//        }

        // Q3. Write a Java Program to find the GCD( General Common Divisor) of two numbers using a loop.
//        System.out.print("Enter the first num:");
//        int num1=Math.abs(sc.nextInt()); // Use Math.abs to handle negative numbers
//        System.out.print("Enter the second num:");
//        int num2=Math.abs(sc.nextInt()); // Use Math.abs to handle negative numbers
//        int gcd = 1;
//        for (int i = 1; i <= num1 && i <= num2; i++) {
//            if (num1 % i == 0 && num2 % i == 0) {
//                gcd = i;
//            }
//        }
//        System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + gcd);

        // Write a Java Program to check if a given string is a palindrome or not using a loop.

//        String word=sc.nextLine();
//        String rev="";
//        for(int i=word.length()-1;i>=0;i--){
//            rev=rev+word.charAt(i);
//        }
//        if(word.equals(rev)){
//            System.out.println("The given string is a palindrome");
//        }else{
//            System.out.println("The given string is not a palindrome");
//        }

        // Write a Java Program to generate and print the first 'n' terms of the fibonacci series.

        int n=sc.nextInt();
        int n1=0,n2=1,n3;
        System.out.print(n1+" "+n2);
        for(int i=2;i<n;i++){
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
    }
}
