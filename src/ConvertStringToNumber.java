
public class ConvertStringToNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "1234";
		int result = stringToNumber(str);
		System.out.println("result = " + result);		
		// 1000 + 200 + 30 + 4
	}
	
	private static int stringToNumber(String s) {
				
		if(s.equals(null) || s.isEmpty()) {
			throw new IllegalArgumentException("You enter invalid number!Try again!");
		}
		
		//take string to char array
		char[] ch = new char[s.length()];
		
		for (int i = 0; i < s.length(); i++) {
			ch[i] = s.charAt(i);
		}
		
		int number = 0;
		
		// loop through the char array
		for (int i = ch.length -1, powNum = 0; i >= 0; i--, powNum++) {
			
			// convert char to integer
			int charToNum = ch[i] - '0';
			
			// ex 1234 
			// ch[3] = 4 
			// number = 0 + (4 * 10 power of 0) = 4
			// ch[2] = 3
			// number = 4 + (3 * 10 power of 1) = 34
			// ch[1] = 2
			// number = 34 + (2 * 10 power of 2) = 234
			// ch[0] = 1
			// number = 234 + (1 * 10 power of 3) = 1234
			number += (charToNum * Math.pow(10, powNum)); 			
		}
		
		return number;
	}

}
