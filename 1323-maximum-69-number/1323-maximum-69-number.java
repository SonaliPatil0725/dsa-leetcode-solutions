class Solution {
    public int maximum69Number (int num) {
        String str = String.valueOf(num);
		char[] array = str.toCharArray();

		for (int i = 0; i < array.length; i++) {
			if (array[i] == '6') {
				array[i]='9';
				break;
			}
		}
		return Integer.parseInt(new String(array));
    }
}