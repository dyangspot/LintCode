public class Solution {
    /**
     * @param matrix: A list of lists of integers
     * @param: A number you want to search in the matrix
     * @return: An integer indicate the occurrence of target in the given matrix
     */
    public int searchMatrix(int[][] matrix, int target) {
        // write your code here
        if (matrix == null || matrix.length == 0){
           return 0; 
        }
        if (matrix[0].length == 0 || matrix[0] == null){
            return 0;
        }
        int occurrence = 0;
        // search row
       for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if (matrix[i][j] == target){
                    occurrence++;
                }
            }
        }
        return occurrence;
    }
}

