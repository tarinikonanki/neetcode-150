class Solution {
    public boolean isPalindrome(String s) {
        char[] pal = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase().toCharArray();
        int pointer1 = 0;
        int pointer2 = pal.length - 1;
        while(pointer1 < pointer2){
            if(pal[pointer1] != pal[pointer2]){
                return false;
            }
            pointer1++;
            pointer2--;
        }
        return true;
    }
}
