import java.util.*;
class fibonacci_series{
    public static void main(String[]args){
        int num1=0,num2=1;
        System.out.println("Enter any number:");
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        for(int i=0;i<=n;i++){
            int sum=num1+num2;
            System.out.print(sum+" ");
            num1=num2;
            num2=sum;

        }
    }
}