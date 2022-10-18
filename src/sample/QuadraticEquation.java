package sample;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        System.out.println("Enter inputs: ");
        Scanner sc= new Scanner(System.in);
        double a,b,c;
        a= sc.nextDouble();
        b= sc.nextDouble();
        c= sc.nextDouble();
        System.out.println("Input 1: " + a);
        System.out.println("Input 2: " +b);
        System.out.println("Input 3: " +c);
        double res= b*b-4*a*c;
        double r1,r2;
        if(res>0)
        {
            r1= (-b+Math.pow(res,0.5))/2*a;
            r2=(-b-Math.pow(res,0.5))/2*a;
            System.out.println("the roots are: "+r1+ "and" +r2);
        } else
            if (res==0)
            {
                r1=r2=-b/2*a;
                System.out.println("the root is: "+r1);
            }
            else
                System.out.println("the equation has no real roots");
    }
}
