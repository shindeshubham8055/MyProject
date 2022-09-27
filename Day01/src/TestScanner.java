import java.util.Scanner;
// scanner class waprun apan value ghetlya
public class TestScanner{
public static void main(String[] args)
{
//create a Scanner objct, wrapping stdin
Scanner sc =new Scanner(System.in);
System.out.println("Enter emplyee Id,Sallery, Name permanent seat");
System.out.printf(" EMp id %d Salary %.2f name %s is permanent %b %n",sc.nextInt(),sc.nextDouble(),sc.next(),sc.nextBoolean());

sc.close();
}
}
