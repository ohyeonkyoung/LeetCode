class Solution {
    public String mergeAlternately(String word1, String word2) {
			
		int dif = Math.abs(word1.length() - word2.length());
		String result = "";	
			
		if(word1.length() >= word2.length()) {
				
			for(int j=0; j<word2.length(); j++) {
				result += word1.substring(j, j+1);
				result += word2.substring(j, j+1);
			}
			if(dif != 0) result += word1.substring(word2.length());
			result = result.trim();
		} else { // word1.length() < word2.length()
			
			for(int j=0; j<word1.length(); j++) {
				result += word1.substring(j, j+1);
				result += word2.substring(j, j+1);
			}
			if(dif != 0) result += word2.substring(word1.length());
			result = result.trim();
		}
			
		return result.toLowerCase();
    }
}