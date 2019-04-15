public class Solution {
    public boolean Find(int target, int [][] array) {
        if(array == null || array.length == 0 || array[0].length == 0)
            return false;
        int rows = array.length, cols = array[0].length;
        int r = 0, c = cols - 1;
        while(r < rows && c >= 0){
            if(array[r][c] == target)
                return true;
            else if(target > array[r][c])
                r++;
            else
                c--;
        }
        return false;
    }
}