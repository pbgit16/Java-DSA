class Solution {
    public boolean isPalindrome(String s) {
       int l=0;
        int r=s.length()-1;
        while(l<r){
            char left=s.charAt(l);
            char right=s.charAt(r);

            if(!isAlphaNum(left)){
                l++;
            }
            else if(!isAlphaNum(right)){
                r--;
            }
            else{
                if(Character.toLowerCase(left)!= Character.toLowerCase(right)){
                    return false;
                }
                l++;
                r--;
            }
        }
        return true;
    }
    static boolean isAlphaNum(char ch){
        return Character.isLetterOrDigit(ch);
    }
        }
    
