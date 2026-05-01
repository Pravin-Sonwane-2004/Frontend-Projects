public class AVGof2DMatrix {
    void main() {
     int [][] matrix = {
        {1,2,3},
        {4,5,6},
        {7,8,9}
    };

    int addition = 0;
    int avg = 1;
    int count = 0;
    for(int i=0;i<matrix.length;i++) {
        for(int j=0;j<matrix[i].length;j++) {
            addition += matrix[i][j];
            count++;
        }
    }
    //i needed to use double here but i didnt used soo next time when ill open it ill look into it
    
    avg = addition/count;
    IO.println(avg);
    }
}
