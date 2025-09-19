class Solution {
    public String toLowerCase(String s) {
        char[] strArr = s.toCharArray();
		StringBuilder str = new StringBuilder();
		for (int i = 0; i < strArr.length; i++) {
			if(strArr[i]>='A' && strArr[i]<='Z') {
				str.append((char) (strArr[i] + 32));
			}else {
				str.append(strArr[i]);
			}
		}
		return str.toString();
    }
}