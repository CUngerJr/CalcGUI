import java.util.Stack;

public class PostFixCalculator {

	public void getFinalResult(String s) {
		Stack<Integer> valueStack = new Stack<>();	// Stack to hold values
		Stack<Character> opsStack = new Stack<>();	// Stack to hold operators
		
			
		// Put string into char array
		char[] input = s.toCharArray();
		
		for (int i = 0; i < input.length; i++) {
			if (input[i] == ' ') {
				continue;
			}
			
			if (input[i] > 0 && input[i] < 9) {
				
			}
		}


	}











} // End Class
