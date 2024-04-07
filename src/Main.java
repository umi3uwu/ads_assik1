import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static int findMin(int n, int[] arr){

        if (n==1){
            return arr[0];
        }
        int res=findMin(n-1,arr);
        return Math.min(res,arr[n-1]);

    }
    public static double sumAvg(int a, int[] arr){

        return sumAvg(a,arr,0)/(double) a;
    }
    private static int sumAvg(int a, int[] arr,int ind){
        if(ind == a){
            return 0;
        }
        return arr[ind]+sumAvg(a,arr,++ind);
    }
    public static boolean isPrime(int a){
        return isPrime(a,2);
    }
    private static boolean isPrime(int a, int div) {
        if (a<=2){
            return a==2;
        }
        if (a%div==0){
            return false;
        }
        if (div==a-1){
            return true;
        }
        return isPrime(a,div+1);
    }
    public static int findFactorial(int a) {
        if (a==1){
            return 1;
        }
        return a*(findFactorial(a-1));
    }
    public static int fibonacci(int a){
        if (a==0)
            return 0;
        if (a==1)
            return 1;
        else
            return fibonacci(a-1)+fibonacci(a-2);
    }
    public static int findPower(int a, int n) {
        if(n==0){
            return 1;
        }
        return a*(findPower(a,n-1));
    }
    public static void strPermutations(String remaining, String curPerm){
        int len=remaining.length();
        if (remaining.length()==0){
            System.out.println(curPerm);
        }
        else{
            for(int i =0;i<len;i++){
                char cur=remaining.charAt(i);
                String newRemaining = remaining.substring(0,i)+remaining.substring(i+1);
                strPermutations(newRemaining, curPerm + cur);
            }
        }
    }
    public static boolean areAllDigits(String str){
        if(str.isEmpty())
            return true;
        else{
            char firstChar = str.charAt(0);
            if(Character.isDigit(firstChar)) return areAllDigits(str.substring(1));
            else return false;
        }
    }
    public static int binCoefficient(int n,int k){
        if(k==0 || k==n){
            return 1;
        }
        return binCoefficient(n-1,k-1)+binCoefficient(n-1,k);
    }
    public static int GCD(int n, int k){
        if(k==0) return n;
        return GCD(k,n%k);
    }
//    Complexity: linear - O(n)
    public static void task1(){
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr=new int[a];
        for(int i =0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(findMin(a,arr));
    }
//    Complexity: linear - O(n)
    public static void task2(){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(sumAvg(n,arr));
    }
//    Complexity: quadratic - O(n^2)
    public static void task3(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(isPrime(a)){
            System.out.println("Prime");
        }
        else
            System.out.println("Composite");
    }
//    Complexity: linear - O(n)
    public static void task4(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int res=findFactorial(a);
        System.out.println(res);
    }
//    Complexity: exponential - O(2^n)
    public static void task5(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int res = fibonacci(a);
        System.out.println(res);
    }
//    Complexity: linear - O(n)
    public static void task6(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        int res= findPower(a,n);
        System.out.println(res);
    }
//    Complexity: Factorial - O(n!)
    public static void task7(){
        Scanner sc= new Scanner(System.in);
        String s = sc.nextLine();
        strPermutations(s,"");

    }
//    Complexity: linear - O(n)
    public static void task8(){
        Scanner sc=new Scanner(System.in);
        String s = sc.nextLine();
        if (areAllDigits(s)) System.out.println("YES");
        else System.out.println("NO");
    }
//    Complexity: Exponential - O(2^n)
    public static void task9(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        System.out.println(binCoefficient(n,k));
    }
//    Complexity: linear - O(n) or Logarithmic - O(log n) ???
    public static void task10(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        System.out.println(GCD(n,k));
    }

//    just write any task as currently written in main (task2(), task3(), etc.)
//    bigO notation written near task (for example: psv task10(){}) methods so that it would be more readable
    public static void main(String[] args) {
        task1();
    }
}