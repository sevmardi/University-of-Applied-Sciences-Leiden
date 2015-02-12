
public class VbCalc 
{
  public static void main( String args[] ) 
  {
    String invoer = "3 4 5 + *";
    PostFixCalculator pf = new PostFixCalculator(invoer);
    System.out.println("uitvoer is : " + pf.getResultaat());
  }
}

