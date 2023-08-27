class Solution {
    public int mostWordsFound(String[] sentences) {

        int maxLen = Integer.MIN_VALUE;

        for(int i = 0; i < sentences.length; i++){
            String[] eachSen = sentences[i].split(" ");
            if(eachSen.length > maxLen){
                maxLen = eachSen.length;
            }
        }

        return maxLen;
    }
}
