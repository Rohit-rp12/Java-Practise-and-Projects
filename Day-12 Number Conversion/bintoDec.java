import java.util.*;
public class bintoDec{
    public static void binToDec(int binNum){
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;

        while(binNum>0)
        {
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int)Math.pow(2,pow));   //Math.pow is an inbuilt funct. to calculate power. It takes arguments as double and return them also in double thats why we have typecasted it into "int"
            pow++;
            binNum = binNum/10;
        }
        System.out.println("The decimal of " +  myNum  + " = " + decNum);
    }
    public static void main(String args[]){
        binToDec(10111);
    }
}