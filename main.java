package count;
import java.util.HashMap;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		String input=sc.nextLine();
		sc.close();	
		
		HashMap characters = new HashMap();
		
		Integer temp;
		
		int length = input.length();
		for(int i=0;i<length;i++)
		{
			if(characters.containsKey(input.charAt(i)))
			{
				temp=(Integer)characters.get(input.charAt(i));
				characters.put(input.charAt(i),temp+1);
			}else {
				
				characters.put(input.charAt(i),1);				
			}
			
		
			
		}
		
		System.out.println(characters);
		
	
	}
	
}
