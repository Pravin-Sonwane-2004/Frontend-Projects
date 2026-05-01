public class MatMul {
        void main() {
    int[][] firstMat = {
            { 1, 2, 3 },
            { 4, 5, 6 },
            { 7, 8, 9 }
    };
    int[][] secMat = {
            { 1, 2, 3 },
            { 4, 5, 6 },
            { 7, 8, 9 }
    };

    int [][] thirdMat = new int[3][3];

    for(int i=0;i<firstMat.length;i++) {
        for(int j=0;j<secMat.length;j++) {
            for(int k=0;k< firstMat.length;k++) {
                thirdMat[i][j] += firstMat[i][k] * secMat[k][j];
            }
        }
    }

    for(int i=0;i<thirdMat.length;i++) {
        for(int j=0;j< thirdMat[i].length;j++) {
                IO.print(thirdMat[i][j] +" ");
        }
        IO.println();
    }
  }
}
