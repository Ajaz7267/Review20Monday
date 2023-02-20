//1.Write a program to swap two numbers without using 3rd variable;

package Review.Monday20;

import java.util.Scanner;

public class SwapTwoNumber {
    public static void main(String[] args) {
        int firstElement,secondElement;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter firstElement and second Element:");
        firstElement  =sc.nextInt();
        secondElement =sc.nextInt();
        System.out.println(firstElement +"and"+ secondElement);
        firstElement=firstElement+secondElement;
        secondElement=firstElement-secondElement;
        firstElement=firstElement-secondElement;
        System.out.println("FirstNumber:"+firstElement+"SecondNumber:"+secondElement);
    }
}
