//need to transpose the matrix soo that it will look like that 
//1, 4, 7
//2, 5, 8
//3, 6, 9
public class TransposeMatrix {

    void main() {
        int[][] firstMat = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        
        int[][] result = new int[3][3];
        for(int i=0;i<firstMat.length;i++) {
            for(int j=0;j<firstMat[i].length;j++) {
                result[j][i] = firstMat[i][j    ];
            }
        }

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                IO.print(result[i][j]);
            }
            IO.println();
        }
    }
}
