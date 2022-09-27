public class Assignment {
    
    public static void main(String[] args) {
        int a =1,b=2,c=5;
        a=b=c;
        System.out.print("a ="+a+"b ="+b+"c ="+c);
        
     
        a=(b=c);
        System.out.print("a ="+a+"b ="+b+"c ="+c);
    }
}
