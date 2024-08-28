package com.tvsmotor.day9.task;

interface VowelFinder
{
	boolean test(String name);
}


public class TaskVowel {
	public static void main(String[] args) {
		VowelFinder vowel = (name) ->
		{
			int i = 0;
			for(i = 0; i < name.length(); ++i)
			{
				char character = name.charAt(i);
				if(character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U' || character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u')
				{
					return true;
				}
			}
			return false;
		};
		String res = (vowel.test("Cry")) ? "The given name has vowels" : "The given name has NO has vowels";
		System.out.println(res);
		
	}

}
