
public class Driver 
{
	public static void main(String[] args)
	{
		String bookName = "Revelation";
		String listOfVowels = "aeiou";
		int count = 0;
		
		for(int i = 0; i < bookName.length(); i++) 
		{
			char currentChar = bookName.toLowerCase().charAt(i);
			for(int j = 0; j < listOfVowels.length(); j++)
			{
				char currentVowel = listOfVowels.charAt(j);
				if(currentChar == currentVowel)
				{
					count = count + 1;
				}
			}
		}
		System.out.println(count);
	}
}
