class Solution {
    public boolean isPowerOfTwo(int n) {
        int value = 1;
		for(int x=0; x<=30; x++) {
			if(value==n) {
				return true;
			}else if(value>n) {
				return false;
			}
			value = value*2;
			
		}
		return false;
    }
}