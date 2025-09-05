class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
		
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			
			if(ch == '(') {
				stack.push(')');
			}else if(ch == '{') {
				stack.push('}');
			}else if(ch == '[') {
				stack.push(']');
			}
			else {
				if(stack.isEmpty()) {
					return false;
				}
			    else if(ch == stack.pop()) {
					continue;
				}else {
					return false;
				}
			}
		}
		return stack.isEmpty();
    }
}