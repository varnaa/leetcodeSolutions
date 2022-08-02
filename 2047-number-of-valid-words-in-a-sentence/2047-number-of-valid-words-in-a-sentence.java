class Solution {
    boolean validPunch(char cr){
        if(cr == '!' || cr == '.' || cr == ',')
            return true;
        
        return false;
    }
    
    public int countValidWords(String sentence) {
        sentence = sentence.trim();
        int validWordsCount = 0;
        int length = sentence.length();
        int countHyphen = 0;
        boolean validToken = true;
        
        for(int i = 0; i < length; i++){
            char tempChar = sentence.charAt(i);
            
            if(tempChar == ' '){
                if(validToken && i >= 1 && sentence.charAt(i - 1) != ' ')
                    validWordsCount++;
                countHyphen = 0;
                validToken = true;
            }
            else if(tempChar <= 'z' && tempChar >= 'a')
                continue;
            else if(validPunch(tempChar) && (i == length - 1 || sentence.charAt(i+1) == ' '))
                   continue;
            else if(tempChar == '-' && countHyphen < 1 && i >= 1 && (sentence.charAt(i-1) <= 'z' && sentence.charAt(i-1) >= 'a') && i < length - 1 && (sentence.charAt(i+1) <= 'z' && sentence.charAt(i+1) >= 'a')){
               countHyphen++;
               continue;
            }
            else
                validToken = false;
        }
        
        if(validToken == true)
            validWordsCount++;
        
        return validWordsCount;
    }
}