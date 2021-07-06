package com.project.Strings;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
public class ManipulatedStringPrinter {
	public static void main(String[] args) throws IOException
	{
		PrintWriter print=new PrintWriter("Strings_Output.txt");
		Scanner stringReader = new Scanner(System.in);
		//Reverse the String
		System.out.println("Enter the input to reverse the string to get the reverse string ");
		String inputToReversTheString = stringReader.next();
		//System.out.println(inputToReversTheString);
		print.println("1.Reverse the String ");
		print.println("  Input:" + inputToReversTheString);
		String reverseString = findtheReverseString(inputToReversTheString);
		print.println("  Output:" + reverseString);
		print.println("**********************************************************");
		
		//Reverse the Sentence
		stringReader.nextLine();
		System.out.println("Enter the sentence to get the reverse sentence ");
		String inputToReverseTheSentence = stringReader.nextLine();
		print.println("2.Reverse the Sentence ");
		print.println("  Input:" + inputToReverseTheSentence);
		String reverseSentence = findtheReverseSentence(inputToReverseTheSentence);
		print.println("  Output:" + reverseSentence);
		print.println("**********************************************************");
		
		//Respective letters count
		System.out.println("Enter the string to get the respective letters count ");
		String inputToRespectiveLettersCount = stringReader.next();
		print.println("3.Respective Letters Count in the given sentence/string ");
		print.println("  Input:" + inputToRespectiveLettersCount);
		String RespectiveLettersCount = findtheRespectiveLettersCount(inputToRespectiveLettersCount);
		print.println("  Output:" + RespectiveLettersCount);
		print.println("**********************************************************");
		
		//Remove Repeated Letter
		System.out.println("Enter the string to remove the repeated characters ");
		String inputToRemoveRepeatedLetters = stringReader.next();
		print.println("4.Removal of repeated characters");
		print.println("  Input:" + inputToRemoveRepeatedLetters);
		String removeRepeatedLetters = findRemovalOfRepeatedLetters(inputToRemoveRepeatedLetters);
		print.println("  Output:" + removeRepeatedLetters);
		print.println("**********************************************************"); 
		
		//Highest Repeated Letter
		System.out.println("Enter the string to find the highest repeated character ");
		String inputToFindHighestRepeatedCharacter = stringReader.next();
		print.println("5.Highest Repeated Letter ");
		print.println("  Input:" + inputToFindHighestRepeatedCharacter);
		char  highestRepeatedCharacter= findHighestRepeatedCharacter(inputToFindHighestRepeatedCharacter);
		print.println("  Output:" + highestRepeatedCharacter);
		print.println("**********************************************************");  
		
		//First Repeated Letter
		System.out.println("Enter the string to find the first repeated character ");
		String inputToFindFirsttRepeatedCharacter = stringReader.next();
		print.println("6.First Repeated Letter ");
		print.println("  Input:" + inputToFindFirsttRepeatedCharacter);
		char  firstRepeatedCharacter= findFirstRepeatedCharacter(inputToFindFirsttRepeatedCharacter);
		print.println("  Output:" + firstRepeatedCharacter);
		print.println("**********************************************************"); 	
		
		//sort the string characters in ascending order
		System.out.println("Enter the string to sort the characters in  ascending order");
		String inputToSortCharactersInAscendingOrder = stringReader.next();
		print.println("7.Sort the string characters in ascending order ");
		print.println("  Input:" + inputToSortCharactersInAscendingOrder);
		String SortCharactersInAscendingOrder = methodToSortCharactersInAscendingOrder (inputToSortCharactersInAscendingOrder);
		print.println("  Output:" + SortCharactersInAscendingOrder);
		
		
		System.out.println("Check the file Strings_Output.txt for the output");
		
		print.close();
		stringReader.close();
	}

	private static String methodToSortCharactersInAscendingOrder(String inputToSortCharactersInAscendingOrder) {
		
		if(inputToSortCharactersInAscendingOrder!=null)
		{
		
		String toconverttolowercase = inputToSortCharactersInAscendingOrder.toLowerCase();
		char arrayToConvertStringtoArray[] = toconverttolowercase.toCharArray();
	    Arrays.sort(arrayToConvertStringtoArray);
	    String finalOutputToSortCharactersInAscendingOrder = new String(arrayToConvertStringtoArray);
	    String firstletterOfString = finalOutputToSortCharactersInAscendingOrder.substring(0,1);
	    String remLettersOfString = finalOutputToSortCharactersInAscendingOrder.substring(1);
	    firstletterOfString = firstletterOfString.toUpperCase();
	    finalOutputToSortCharactersInAscendingOrder = firstletterOfString.concat(remLettersOfString);
	    return finalOutputToSortCharactersInAscendingOrder;
		}
		else
		return null;
	}
	private static char findFirstRepeatedCharacter(String inputToFindFirsttRepeatedCharacter) {
		
		int countOfRepeatedLetter = 0;
		char FirstRepeatedCharacter = (char)0;
		int loopVariable=0;
		if(inputToFindFirsttRepeatedCharacter!=null)
		{
		  for(loopVariable=0;loopVariable<inputToFindFirsttRepeatedCharacter.length();loopVariable++) {
		    countOfRepeatedLetter = 0;
		    for(int characterMatchChecker=0;characterMatchChecker<inputToFindFirsttRepeatedCharacter.length();characterMatchChecker++) {
		    if(inputToFindFirsttRepeatedCharacter.charAt(loopVariable) == (inputToFindFirsttRepeatedCharacter.charAt(characterMatchChecker)))
				   countOfRepeatedLetter++;
		    }
		    if(countOfRepeatedLetter > 1)
		    {
		    	FirstRepeatedCharacter = inputToFindFirsttRepeatedCharacter.charAt(loopVariable);
		    	break;
		    }
		  }
		  return FirstRepeatedCharacter;
		}
		else
		 return 0;
	}
		

	private static char findHighestRepeatedCharacter(String inputToFindHighestRepeatedCharacter) {
		
		int countOfRepeatedLetter=0;
		char HighestRepeatedCharacter = (char)0;
		int loopVariable=0;
		int countOfPreviousRepeatedLetter = 1;
		if(inputToFindHighestRepeatedCharacter!=null)
		{
		  for(loopVariable=0;loopVariable<inputToFindHighestRepeatedCharacter.length();loopVariable++) {
		    countOfRepeatedLetter = 0;
		    for(int characterMatchChecker=0;characterMatchChecker<inputToFindHighestRepeatedCharacter.length();characterMatchChecker++) {
		    if(inputToFindHighestRepeatedCharacter.charAt(loopVariable) == (inputToFindHighestRepeatedCharacter.charAt(characterMatchChecker)))
				   countOfRepeatedLetter++;
		    }
		    if(countOfRepeatedLetter > countOfPreviousRepeatedLetter)
		    {
		    	countOfPreviousRepeatedLetter = countOfRepeatedLetter;
		    	HighestRepeatedCharacter = inputToFindHighestRepeatedCharacter.charAt(loopVariable);
		    }
		  }
		  return HighestRepeatedCharacter;
		}
		else
		 return 0;
	}

	private static String findRemovalOfRepeatedLetters(String inputToRemoveRepeatedLetters) {
		
		int countOfRepeatedLetter=0;
		String finalStringAfterRemovalofRepeatedLetters = " ";
		int loopVariable=0;
		if(inputToRemoveRepeatedLetters!=null)
		{
		  for(loopVariable=0;loopVariable<inputToRemoveRepeatedLetters.length();loopVariable++) {
		    countOfRepeatedLetter = 0;
		    for(int characterMatchChecker=0;characterMatchChecker<inputToRemoveRepeatedLetters.length();characterMatchChecker++) {
		    if(inputToRemoveRepeatedLetters.charAt(loopVariable) == (inputToRemoveRepeatedLetters.charAt(characterMatchChecker)))
				   countOfRepeatedLetter++;
		    }
		    if(countOfRepeatedLetter>1)
	        	   continue;
		    else
		    {
		    if(finalStringAfterRemovalofRepeatedLetters.equals(" "))
			 {
		    	finalStringAfterRemovalofRepeatedLetters = Character.toString(inputToRemoveRepeatedLetters.charAt(loopVariable));
			 }
			 else
			 {
				 finalStringAfterRemovalofRepeatedLetters = finalStringAfterRemovalofRepeatedLetters.concat(Character.toString(inputToRemoveRepeatedLetters.charAt(loopVariable)));
			 }
		    }
		  }
		  System.out.println(finalStringAfterRemovalofRepeatedLetters);
		  return finalStringAfterRemovalofRepeatedLetters;
		}
		else
			return null;
	}

	private static String findtheRespectiveLettersCount(String inputToRespectiveLettersCount) {
		
		int countOfRepeatedLetter=0;
		String finalOutputToRespectiveLettersCount = " ";
		int loopVariable=0;
		char temp = inputToRespectiveLettersCount.charAt(0);
		if(inputToRespectiveLettersCount!=null)
		{
		  for(loopVariable=0;loopVariable<inputToRespectiveLettersCount.length();loopVariable++) {
			  
			 if(inputToRespectiveLettersCount.charAt(i)==temp)
			 {
				 countOfRepeatedLetter++;
			 }
			 else
			 {
				 if(finalOutputToRespectiveLettersCount.equals(" "))
				 {
				    finalOutputToRespectiveLettersCount = Character.toString(inputToRespectiveLettersCount.charAt(loopVariable));
				    finalOutputToRespectiveLettersCount = finalOutputToRespectiveLettersCount.concat(String.valueOf(countOfRepeatedLetter));
				 }
				 else
				 {
					finalOutputToRespectiveLettersCount = finalOutputToRespectiveLettersCount.concat(Character.toString(inputToRespectiveLettersCount.charAt(loopVariable)));
					finalOutputToRespectiveLettersCount = finalOutputToRespectiveLettersCount.concat(String.valueOf(countOfRepeatedLetter));
				 }
			  inputToRespectiveLettersCount = inputToRespectiveLettersCount.replace(Character.toString(inputToRespectiveLettersCount.charAt(loopVariable)),"");
				 
			 }
	      }
		  return finalOutputToRespectiveLettersCount;
		}
		else
			return null;
	}

	private static String findtheReverseString(String inputToReversTheString) {
		
	    if(inputToReversTheString!=null)
	    {
            StringBuffer  inputToReversTheStringInMethod= new StringBuffer(inputToReversTheString);
            inputToReversTheStringInMethod.reverse();
            //System.out.println(inputToReversTheStringInMethod);
		    return inputToReversTheStringInMethod.toString();
	    }
	    else
	      return null;
	}
    private static String findtheReverseSentence(String inputToReverseTheSentence)  {
		
	    if(inputToReverseTheSentence!=null)
	    {
	    	String[] splitTheWordsInTheGivenSentence = inputToReverseTheSentence.split(" ");
	    	String newInputToReverseTheSentence = " ";
	    	int spaceCounttemp = 0;
	    	for(String reverseIndividualWord : splitTheWordsInTheGivenSentence)
	    	{
	    		++spaceCounttemp;
	    		StringBuffer inputToReverseTheIndividualWord = new StringBuffer(reverseIndividualWord);
	    		if(newInputToReverseTheSentence.equals(" "))
	            newInputToReverseTheSentence = inputToReverseTheIndividualWord.reverse().toString();
	    		else
	    		newInputToReverseTheSentence = newInputToReverseTheSentence.concat(inputToReverseTheIndividualWord.reverse().toString());
	    		if(spaceCounttemp == splitTheWordsInTheGivenSentence.length)
	    			break;
	    		else
	    			newInputToReverseTheSentence = newInputToReverseTheSentence.concat(" ");
	    		
	    	}
	    	StringBuffer finalOutputToReverseTheSentence = new StringBuffer(newInputToReverseTheSentence);
	    	finalOutputToReverseTheSentence.reverse();
	    	return finalOutputToReverseTheSentence.toString();
	    }
	    else
	      return null;
	}
}

