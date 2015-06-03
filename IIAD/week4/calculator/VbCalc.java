package  week4.calculator;

public class VbCalc 
{
  public static void main( String args[] ) 
  {
    String invoer = "5 8 2 + -";
    PostFixCalculator pf = new PostFixCalculator(invoer);
    System.out.println("uitvoer is : " + pf.getResultaat());
  }
}


