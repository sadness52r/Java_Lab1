public class ComplexMatrix implements IOperated<ComplexMatrix>{
    private int rows;
    private int columns;
    private ComplexNumber[][] matrix;

    ComplexMatrix(int rows, int cols){
        try{
            this.rows = rows;
            columns = cols;
            matrix = new ComplexNumber[this.rows][columns];
        }
        catch(RuntimeException e){
            System.out.println(e.getMessage());
        }
    }
    ComplexMatrix(ComplexNumber[][] listMatrix){
        rows = listMatrix.length;
        columns = listMatrix[0].length;
        matrix = listMatrix;
    }

    public int getRows(){
        return rows;
    }
    public int getColumns(){
        return columns;
    }
    public int[] getShape(){
        int[] shape = new int[2];
        shape[0] = rows;
        shape[1] = columns;
        return shape;
    }
    public ComplexNumber getElement(int row, int col){
        return matrix[row][col];
    }
    public void setElement(int row, int col, ComplexNumber value){
        if (row < 0 || row >= rows || col < 0 || col >= columns){
            throw new IndexOutOfBoundsException("You cannot assign a value for unknown elements!");
        }
        matrix[row][col] = value;
    }
    public ComplexMatrix Add(ComplexMatrix mat) {
        if(rows != mat.rows || columns != mat.columns){
            throw new IndexOutOfBoundsException("You cannot add matrices with different shapes!");
        }
        ComplexMatrix newMatrix = new ComplexMatrix(rows, columns);
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                newMatrix.matrix[i][j] = matrix[i][j].Add(mat.matrix[i][j]);
            }
        }
        return newMatrix;
    }
    public ComplexMatrix Subtract(ComplexMatrix mat) {
        if(rows != mat.rows || columns != mat.columns){
            throw new IndexOutOfBoundsException("You cannot subtract matrices with different shapes!");
        }
        ComplexMatrix newMatrix = new ComplexMatrix(rows, columns);
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                newMatrix.matrix[i][j] = matrix[i][j].Subtract(mat.matrix[i][j]);
            }
        }
        return newMatrix;
    }
    public ComplexMatrix Multiply(ComplexMatrix mat) {
        if(columns != mat.rows){
            throw new IndexOutOfBoundsException("You cannot multiply matrices with different rows and columns!");
        }
        ComplexMatrix newMatrix = new ComplexMatrix(rows, mat.columns);
        for (int i = 0; i < rows; i++){
            ComplexNumber element = new ComplexNumber(0, 0);
            for (int j = 0; j < mat.columns; j++){
                for (int k = 0; k < mat.rows; k++){
                    element = element.Add(matrix[i][k].Multiply(mat.matrix[k][j]));
                }
                newMatrix.matrix[i][j] = element;
            }
        }
        return newMatrix;
    }
    public ComplexMatrix Transpose(){
        ComplexMatrix newMatrix = new ComplexMatrix(columns, rows);
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                newMatrix.matrix[j][i] = matrix[i][j];
            }
        }
        return newMatrix;
    }
    public ComplexNumber Determinant(int dimension){
        if (rows != columns){
            throw new IndexOutOfBoundsException("You cannot find a determinant if you have non square matrix!");
        }
        if (dimension == 1){
            return matrix[0][0];
        }
        else if (dimension == 2){
            return (matrix[0][0].Multiply(matrix[1][1])).Subtract(matrix[1][0].Multiply(matrix[0][1]));
        }
        ComplexNumber[][] for_det = new ComplexNumber[dimension - 1][dimension - 1];
        ComplexNumber det = new ComplexNumber(0, 0);
        int str, stlb;
        for (int j = 0; j < dimension; j++)
        {
            str = 0;
            for (int k = 1; k < dimension; k++)
            {
                stlb = 0;
                for (int s = 0; s < dimension; s++)
                {
                    if (s != j)
                    {
                        for_det[str][stlb] = matrix[k][s];
                        stlb++;
                    }
                }
                str++;
            }
            ComplexNumber value = matrix[0][j];
            ComplexNumber power = new ComplexNumber(Math.pow(-1, (double)j + 2), 0);
            ComplexNumber newComplex = (power.Multiply(value)).Multiply(Determinant(dimension - 1));
            det = det.Add(newComplex);

        }
        return det;
    }

    @Override
    public String toString(){
        String strMat = "";
        int maxSize = -1;
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                if (matrix[i][j].toString().length() > maxSize){
                    maxSize = matrix[i][j].toString().length();
                }
            }
        }

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                strMat = strMat.concat( matrix[i][j].toString() + " ".repeat(2 * maxSize - matrix[i][j].toString().length()));
            }
            strMat = strMat.concat("\n");
        }
        return strMat;
    }
}
