public class matrixLinearSearch {
    static int[] linearSearch(int[][] matrix, int target) {
        for(int i=0;i< matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==target){
                    return new int[] {i,j};
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[][] matrix={{1,2,3},
                        {4,5,6},
                        {7,8,9}};
        int target=8;
        int[] result=linearSearch(matrix,target);
        if(result!=null) {
            System.out.println("Element found at index "+"["+result[0]+","+result[1]+"]");
        } else {
            System.out.println("Element not found.");
        }
    }
}
