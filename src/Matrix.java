public class Matrix<T> implements IOperated<Matrix>{
    private final int rows;
    private final int columns;
    private Object[][] matrix;
    Matrix(int rows, int cols){
        this.rows = rows;
        columns = cols;
        matrix = new Object[this.rows][columns];
    }
    Matrix(Object[][] listMatrix){
        rows = listMatrix.
    }

    public int getRows(){
        return rows;
    }
    public int getColumns(){
        return columns;
    }
    public int getShape(){
        return rows * columns;
    }
    public T getElement(int row, int col){
        @SuppressWarnings("unchecked")
        final T el = (T)matrix[row][col];
        return el;
    }
    public void setElement(int row, int col, T value){
        matrix[row][col] = value;
    }
    public Matrix<T> Add(Matrix<T> mat) throws {
        if(rows != mat.rows || columns != mat.columns){
            throw new IndexOutOfBoundsException("You cannot add matrices with different shapes!");
        }
        Matrix<T> newMatrix = new Matrix<T>(rows, columns);

    }
}
