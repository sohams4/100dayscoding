 import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int m = 20;
        int count = 0;
        for(int i=1;i<=m;i++)
    {
     if(m%i==0)
     {
        count++;

     }   
    

    }
    if(count==2)
    System.out.println("prime");
    else
    System.out.println("not prime");
    }}
    
