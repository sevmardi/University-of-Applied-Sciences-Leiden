import java.util.HashMap;
import java.util.Map;

/**
 * Objective: 
 * @author zero-root
 * Date: 06-05-15
 */
public class Ransom {
	
	public static void main(String[] args) 
	{
		boolean yayRansom = canRandom("Dying wool is what you will be doing", "you will be dying" );
		System.out.println("you" + (yayRansom ? "can" : "can't") + "write a ransom letter");
		boolean failRansom = canRandom("can you believe the New Avangers just came out?", "Give me my money back! Like NOW! ");
		System.out.println("You " + (failRansom ? "can" : "can't") + "write a ransom letter");
	}

	public static boolean canRandom(String magazine, String ransom)
	{
		if(magazine.length() < ransom.length())
		{
			return false;
		}
		String[] ransomWords = ransom.split("");
		
		Map<String, Integer> wordsLeft = new HashMap<String, Integer>();
		
		for(String word : ransomWords)
		{
			if(!wordsLeft.containsKey(word))
			{
				wordsLeft.put(word, 0);
				
			}
			wordsLeft.put(word, wordsLeft.get(word) + 1);
		}
		
		String [] magazineWords = magazine.split("");
		
		for(String word : magazineWords)
		{
			if(wordsLeft.containsKey(word))
			{
				int words = wordsLeft.get(word);
				words--;
				if(words == 0)
				{
					wordsLeft.remove(word);
				}
				else
				{
					wordsLeft.put(word, words);
				}
			}
			if(wordsLeft.size() == 0)	
			{
				return true;
			}
		}
		
		return false;
		
	}
	
	
	public static boolean canRansomMagazineFirst(String magazine, String note)
	{
		String[] words = magazine.split("");
		
		Map<String, Integer> wordCount = new HashMap<String, Integer>();
		
		for(String word : words)
		{
			if(!wordCount.containsKey(word))
			{
				wordCount.put(word, 0);
			}
			else
			{
				wordCount.put(word,  wordCount.get(word) + 1 );
			}
		}
		
		String[] noteWords = note.split("");
		
		for(String noteWord : noteWords)
		{
			if(!wordCount.containsKey(noteWord))
			{
				return false;
			}
			Integer wordsLeft = wordCount.get(noteWord);
			
			if(wordsLeft <= 0)
			{
				return false;
			}
			wordCount.put(noteWord, wordsLeft -1);
		}
		
		return true;
	}
}
