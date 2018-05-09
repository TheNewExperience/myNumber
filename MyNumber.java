import sun.nio.cs.Surrogate;

import java.util.Random;

import static java.lang.Math.sqrt;

public class MyNumber {

    protected boolean parityStatus;

    public static void main(String[] args){
        new MyNumber(5);
    }

    MyNumber(int myNumber) {
        Random radnomgen = new Random();
        int random= radnomgen.nextInt(100)+1;
        myNumberOdd(myNumber);
        if(parityStatus==false)
        {
            myNumerEven(myNumber);
        }
        myNumberSqrt(myNumber);
        myNumberPow(myNumber,random);
        myNumberAdd(myNumber,random);
        myNumberSubstract(myNumber,random);

    }

    public boolean myNumberOdd(int myNumber) {
        if((myNumber%=2)!=0) {
            parityStatus=true;
            System.out.println("Liczba nieparzysta!");
        }



        return parityStatus;
    }

    public boolean myNumerEven(int myNumber){
        if((myNumber%=2)==0){
            parityStatus=true;
            System.out.println("Liczba parzysta");
        }
        return parityStatus;
    }

    public double myNumberSqrt(int myNumber){
        double result = sqrt(myNumber);
        System.out.println("Pierwiastek to: "+result);
        return result;
    }
    public int myNumberPow(int myNumber, int pow){
        int result= (int)Math.pow(myNumber,pow);
        System.out.println("Wynik potegowania: "+result);
        return result;
    }
    public int myNumberAdd(int myNumber, int x){
        int result= myNumber+x;
        System.out.println("Wynik dodawania to: "+result);

        return result;
    }
    public int myNumberSubstract(int myNumber,int x){
        int result = myNumber-x;
        System.out.println("Wynik odejmowania: "+result);
        return result;
    }
}
