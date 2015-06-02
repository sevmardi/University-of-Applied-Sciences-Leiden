package recursie;
public class Palindroom
{
   public static void main (String [] args)
   {
      String st = "parterRetrap";
      if (palindroom (st, 0, st.length() - 1))
         System.out.println ("Palindroom!");
      else
         System.out.println ("Geen Palindroom");
      
   }
   
   private static boolean palindroom (String s, int begin, int eind)
   {
      if (begin >= eind)
        return (true);
      else
        if (s.charAt(begin) != s.charAt(eind))
          return (false);
        else
          return (palindroom (s, begin + 1, eind - 1));
          
   }
}
