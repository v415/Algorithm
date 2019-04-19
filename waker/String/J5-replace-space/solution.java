public class Solution {
    public String replaceSpace(StringBuffer str) {
        int p1 = str.length() - 1;
        for(int i = 0; i <= p1; i++){
            if(str.charAt(i) == ' ')
                str.append("  ");
        }
        int p2 = str.length() - 1;
        while(p1 >= 0 && p2 > p1){
            char a = str.charAt(p1--);
            if( a == ' '){
                str.setCharAt(p2--, '0');
                str.setCharAt(p2--, '2');
                str.setCharAt(p2--, '%');
            }
            else
                str.setCharAt(p2--, a);
        }
        return str.toString();
    }
}