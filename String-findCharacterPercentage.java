import java.util.*;

// we need to find the percentage of different type of characters in a string
// example:
// 
// input:
// abcde12345678^%^%&%
// 
// output:
// Characters :30%
// Special Characters :30%
// Numbers :40%

public class CharPercentage {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		int charCount = 0, numCount = 0, specialCharCount = 0;
		
		for(int i = 0; i < str.length(); i++) {
			char current = str.charAt(i);
			
			if(current >= 65 && current <= 90 || current >= 97 && current <= 122) {
				charCount++;
			}
			else if(current >= 48 && current <= 57) {
				numCount++;
			}
			else {
				specialCharCount++;
			}
		}
		
		int totalChars = str.length();
		
		double charPercentage = ((double)charCount/(double)totalChars)*100;
		double numPercentage = ((double)numCount/(double)totalChars)*100;
		double specialCharPercentage = ((double)specialCharCount/(double)totalChars)*100;
		
		System.out.println("Characters :" + Math.round(charPercentage) + "%");
		System.out.println("Special Characters :" + Math.round(specialCharPercentage) + "%");
		System.out.println("Numbers :" + Math.round(numPercentage) + "%");
		
		sc.close();

	}

}
