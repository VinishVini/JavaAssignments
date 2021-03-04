import java.text.DecimalFormat;

public class Calculation {

    public static void main(String[] args) {

    Calculation calc = new Calculation();
    System.out.println("Addition of two numbers is = "+calc.addition(10,20));
    System.out.println("Subtraction of two numbers is = "+calc.subtraction(10,20));
    System.out.println("Multiplication of two numbers is = "+calc.multiplication(10,20));
    System.out.println("Division of two numbers is = "+calc.division(1567,3));

    }

    public int addition(int a, int b)
    {
      return a+b;
    }

    public int subtraction(int a, int b)
    {
        return a-b;
    }

    public int multiplication(int a, int b)
    {
        return a*b;
    }

    public double division(double a , double b)
    {

        DecimalFormat d = new DecimalFormat("#####.###");
        double result = Double.parseDouble(d.format(a/b));
        return result;
    }
}
