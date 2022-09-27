public class TestprimTypes{
public static void main(String[] args)
{
    int data   = 100;
    if(data==100)

System.out.println("Yess");
else
System.out.println("No");
System.out.println("Max Int "+Integer.MAX_VALUE);
System.out.println("Min Int"+Integer.MIN_VALUE);

// byte b1 = 128; cannot store out of range 128 means its auto promoted its value Into int type
// byte range 127 to -128
byte b1=10;
byte b2=5;
// byte b3=b1+b2; // any arithmatic operation on byte data type will result in int
// so we cannot store int to bytes 
byte b3 = (byte) (b1+b2); // forcefull conversion
b1 += 10;// b1=b1+10;
int i=b1;
long l1 =1352654565;
float f =l1;// no javac error cause R.H.S to l.H.s is auto promotion
// f=123.425; // dobule to float promotion not possible
f=123.425F;

double d = 123456.678F;

}

}