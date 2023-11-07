class Solution {
    public String reverseVowels(String s) {
        String[] arrayS = s.split("");
        String[] vowels = {"a", "e", "i", "o", "u", "A", "E", "I", "O", "U"};
        ArrayList<String> temp = new ArrayList<>();
        ArrayList<String> tempReverse = new ArrayList<>();
      
        for(int i=0; i<arrayS.length; i++) {
            for(int j=0; j<vowels.length; j++) {
                if(arrayS[i].contains(vowels[j])) {
                temp.add(arrayS[i]);
                break;
                }
            }
        }
      
        tempReverse.addAll(temp);
        Collections.reverse(tempReverse);
        int size = temp.size();
      
        for(int i=0; i<arrayS.length; i++) {
            for(int j=0; j<vowels.length; j++) {
                if(arrayS[i].contains(vowels[j])) {
                    arrayS[i] = tempReverse.remove(0);
                    break;
                }
            }
        }
        
        //s = Arrays.toString(arrayS); 
        //"[h, o, l, l, e]"

        StringBuilder stringBuilder = new StringBuilder();
        
        for(int i=0; i<arrayS.length; i++) {
            stringBuilder.append(arrayS[i]+"");
        }
        s = stringBuilder.toString();
      
        return s;
    }
}