public class Solution {
    public static boolean Find(int [][] array,int target) {
        int i = array.length;
        int j = array[0].length;
        int row;
        int col;

        for(row = 0;row<i;row++) {
            for(col = 0;col<j;col++) {
                if(array[row][col]<target) {
                    continue;
                }
                else {
                    if(array[row][col]==target) {return true;}
                    else {
                        j = col;
                        continue;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String args[]) {
        int[][] ar = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        System.out.print(Solution.Find(ar, 7));
    }
}