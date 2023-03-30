    import java.util.Scanner;
public class MenghitungRumus {
    private double a;
    private double b;
    private double c;
    private double x1;
    private double x2;
    
    private boolean fValid = false;
    private boolean fValid1 = false;
    
    public MenghitungRumus(double a, double b, double c) {
        this.a = a;
        this.b = b;
        
        this.c = c;
        calcX();
    }
    private double calcDiscriminant () {
        return b*b - 4*a*c;
    }
    private void calcX(){
        double d = calcDiscriminant();
        if (d > 0) {
            x1 = (-b + Math.sqrt(d))/(2*a);
            x2 = (-b - Math.sqrt(d))/(2*a);
            fValid = true ;
        }
            else if (d == 0) {
            x1 = (-b + Math.sqrt(d))/(2*a);
            x2 = (-b - Math.sqrt(d))/(2*a);
            fValid1 = true ;
        }
    }
    public boolean isValid () {
        return fValid;
    }
    
     public boolean isValid1 () {
        return fValid1;
    }
    
    public double getA(){
        return a;
    }
    public double getB(){
        return b;
    }
    public double getC(){
        return c;
    }
    public double getX1(){
        return x1;
    }
    public double getX2(){
        return x2;
    }
    static void test(){
      double a = 0, b = 0, c = 0;
      Scanner reader = new Scanner(System.in);
      System.out.print("Input Data a : ");
      a=reader.nextDouble();
      System.out.println("");
      Scanner reader1 = new Scanner(System.in);
      System.out.print("Input Data b : ");
      b=reader1.nextDouble();
      System.out.println("");
      Scanner reader2 = new Scanner(System.in);
      System.out.print("Input Data c : ");
      c=reader1.nextDouble();
      System.out.println("");
      MenghitungRumus s = new MenghitungRumus(a,b,c);
      
    if (s.isValid()) {
            System.out.println("Persamaan "+s.getA()+"x^2"+" + "+s.getB()+"x "+"+ "+s.getC()+" mempunyai akar "+s.getX1()+" atau "+s.getX2());
    }
    else if (s.isValid1()) {
            System.out.println("Persamaan "+s.getA()+"x^2"+" + "+s.getB()+"x "+"+ "+s.getC()+" mempunyai akar kembar yaitu "+s.getX1()+" atau "+s.getX2());
    }
    else {
        System.out.println("Persamaan "+s.getA()+"x^2"+" + "+s.getB()+"x "+"+ "+s.getC()+" tidak mempunyai akar-akar rill/khayal (imajiner)");
    }
}

public static void main (String[] args) {
    test();
}

}
