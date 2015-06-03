package week2.lineaire_lijst.lineaire_lijst_versie_3.niet_uitgewerkt;

public class TestLijst
{

  public static void main( String args[] ) 
  {
    Lijst lijst = new Lijst();
    
    lijst.addFirst( "Een" );
    lijst.addFirst( "Twee" );
    lijst.addFirst( "Drie" );
    lijst.addLast( "Nul" );
    lijst.addLast( "MinEen" );
    
    System.out.println(lijst.removeFirst() + " is verwijderd");
    
    Iterator iter = lijst.iterator();
    
    while( iter.hasNext() ) 
      System.out.println( iter.next() );
    
    System.out.println(lijst.removeLast() + " is verwijderd");
    
    System.out.println("\n En nu omgekeerd : \n");

    Iterator backiter = lijst.iterator();
    while( backiter.hasPrevious() ) 
      System.out.println( backiter.previous() );
    
    System.out.println("\n" + lijst.size());
    System.out.println("\n" + lijst.isEmpty());
    lijst.clear();
    System.out.println("\n" + lijst.size());
    System.out.println("\n" + lijst.isEmpty());
    
    lijst.addFirst( "Drie" );
    lijst.addLast( "Nul" );
    lijst.addLast( "MinEen" );
    
    Iterator iter2 = lijst.iterator();
    
    while( iter2.hasNext() ) 
      System.out.println( iter2.next() );
    
    System.out.println("\n" + lijst.size());
    System.out.println("\n" + lijst.isEmpty());
    
  }
}






