import java.util.*;

import Stack.ListStack;

public class PostFixCalculator
{
   private String invoerString;
   int resultaat;
 
   //----------------------------------CONSTRUCTOR----------------------
   public PostFixCalculator (String invoer)
   {
     this.invoerString = invoer;
     evaluate();
   }
   //-----------------------------getter---------------------------------------------
   
   public int getResultaat()
   {
     return (resultaat);
   }
   //-------------------------------------------------------------   
   private void evaluate()
   {
     ListStack mystack = new ListStack();
     
     StringTokenizer tokens  = new StringTokenizer(invoerString);
     int operand;
     
     while (tokens.hasMoreTokens())
     {
       String token = tokens.nextToken();
       char eerste = token.charAt(0);						// het eerste karakter van elk token 
    		   
       if (( eerste >= '0') && (eerste <= '9'))
       {
    	   try{
    		   operand = Integer.parseInt(token);
    		   mystack.push(new Integer(operand));
    	   }
    	   catch(NumberFormatException nfe)
    	   {
    		   
    	   }
    	   
       }
       else
       {
         int v1 = (int) mystack.pop();			  					// poppen en omzetten van een String naar int
         int v2 = 	(int) mystack.pop();								// idem
         int result = 0;
         
         switch (eerste)
         {
           case '+' : result = v1 + v2; 
                      break;
           case '*' : result = v1 *v2;
                      break;
           case '-' : result = v1 - v2;
                      break;
         }
         mystack.push(result);									// wat doe je met het resultaat? zie algoritme
       }	
     }
     resultaat =(int)(mystack.pop()) ;		 					// als alles goed is gegaan resultaat poppen en omzetten naar een int
   
}
}
