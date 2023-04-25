public class Main{
        public static void main(String[] args) {
            int lines = 2;
            int columns = 2;

            double[][] matrix1 = {
                    {1, 3},
                    {2, 5}};
            double[][] matrix2 = {
                    {2, 3},
                    {4, 1}};

            Matrix matrixClass1 = new Matrix(matrix1);
            matrixClass1.columns = 2;
            matrixClass1.lines = 2;

            Matrix matrixClass2 = new Matrix(matrix2);
            matrixClass2.columns = 2;
            matrixClass2.lines = 2;

            matrixClass1.print();
            matrixClass2.print();

            matrixClass1.Sum(matrixClass1, matrixClass2);

            matrixClass1.Multyply(matrixClass1, 3);

            matrixClass1.MultiplyMatrix(matrixClass1, matrixClass2);
        }
}