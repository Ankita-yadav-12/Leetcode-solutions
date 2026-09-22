class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String rev="";

        String str="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if((ch>='a' && ch<='z')|| (ch>='0'&&ch<='9')){
                    str=str+ch;

                }}
            for(int j=str.length()-1;j>=0;j--){
                rev=rev+str.charAt(j);

            }
            
        return (str.equals(rev));
        
    }
}