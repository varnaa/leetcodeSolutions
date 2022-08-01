class Solution {
    public int mostWordsFound(String[] sentences) {
        // base case
        if(sentences == null || sentences.length == 0){
            return -1;
        }
        
        int maxWords = Integer.MIN_VALUE;
        for(String sentence: sentences){
            sentence = sentence.trim();
            maxWords = Math.max(maxWords, sentence.split(" ").length);
        }
        
        return maxWords;
    }
}