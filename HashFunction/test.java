
public class test {
	
	public static void main(String[] args) {
		
		int[] arr = new int[20000];
		
		for(int i=0;i<arr.length; i++)
		{
			arr[i] = i;
		}
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == 19000)
			{
				System.out.println("Found it");
			}
			
		}
		System.out.println("Duration: " + (System.currentTimeMillis() - startTime) + "ms");
	}
}
