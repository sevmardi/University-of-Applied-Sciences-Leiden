package BinaryTree;

public class main {

	
  public static void main(String[] args)
{
    new main();
}
  
  public main()
  {
	  
	  	BKnoop<String> knoop1 = new BKnoop<String>("1");
	  
	   BKnoop<String> knoop2 = new BKnoop<String>("2");
       BKnoop<String> knoop3 = new BKnoop<String>("3");
       BKnoop<String> knoop4 = new BKnoop<String>("4");
       BKnoop<String> knoop5 = new BKnoop<String>("5");
       BKnoop<String> knoop6 = new BKnoop<String>("6");
       BKnoop<String> knoop7 = new BKnoop<String>("7");
       
       
       knoop1.add(knoop2);
       knoop1.add(knoop3);
       
       
       knoop2.add(knoop4);
       knoop2.add(knoop5);
       
       knoop3.add(knoop6);
       
       
       System.out.println(knoop1.preorder());
       System.out.println(knoop1.postorder());
       System.out.println(knoop1.inorder());
       
       
       System.out.println("aantal knopen: " + knoop1.aantalKnopen());
       System.out.println("aantal bladen: " + knoop1.aantalBlad());
       System.out.println("Diepte: " + knoop1.diepte());
       System.out.println(knoop1.levelorder());
       
       
	  
  }
	
	
}
