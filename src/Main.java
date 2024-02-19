import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ComplexNumber comp1 = new ComplexNumber(5, -2);
        ComplexNumber comp2 = new ComplexNumber(1, 3);
        ComplexNumber comp3 = new ComplexNumber(0, -7);
        ComplexNumber comp4 = new ComplexNumber(10, 5);

        System.out.println("Operations with complex numbers:");
        System.out.println("Sum: (" + comp1.toString() + ") + (" + comp2.toString() + ") = " + comp1.Add(comp2).toString());
        System.out.println("Subtract: (" + comp1.toString() + ") - (" + comp2.toString() + ") = " + comp1.Subtract(comp2).toString());
        System.out.println("Multiply: (" + comp1.toString() + ") * (" + comp2.toString() + ") = " + comp1.Multiply(comp2).toString());
        System.out.println("Divide: (" + comp1.toString() + ") / (" + comp2.toString() + ") = " + comp1.Divide(comp2).toString());

        System.out.println("####################\n");
        ComplexMatrix mat1 = new ComplexMatrix(5, 5);
        ComplexMatrix mat2 = new ComplexMatrix(5, 5);
        ComplexMatrix mat3 = new ComplexMatrix(3, 6);
        ComplexMatrix mat4 = new ComplexMatrix(6, 3);
        ComplexMatrix mat5 = new ComplexMatrix(3, 3);
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                mat1.setElement(i, j, new ComplexNumber((int)(Math.random() * 12), (int)(Math.random() * 12)));
                mat2.setElement(i, j, new ComplexNumber((int)(Math.random() * 12), (int)(Math.random() * 12)));
            }
        }
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 6; j++){
                mat3.setElement(i, j, new ComplexNumber((int)(Math.random() * 12), (int)(Math.random() * 12)));
            }
        }
        for (int i = 0; i < 6; i++){
            for (int j = 0; j < 3; j++){
                mat4.setElement(i, j, new ComplexNumber((int)(Math.random() * 12), (int)(Math.random() * 12)));
            }
        }
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                mat5.setElement(i, j, new ComplexNumber((int)(Math.random() * 12), (int)(Math.random() * 12)));
            }
        }

        System.out.println("Operations with complex matrix:");
        System.out.println("Sum: \n" + mat1.toString() + " + \n" + mat2.toString() + " = \n" + mat1.Add(mat2).toString());
        System.out.println("Subtract: \n" + mat1.toString() + " - \n" + mat2.toString() + " = \n" + mat1.Subtract(mat2).toString());
        System.out.println("Multiply: \n" + mat1.toString() + " * \n" + mat2.toString() + " = \n" + mat1.Multiply(mat2).toString());


    }
}