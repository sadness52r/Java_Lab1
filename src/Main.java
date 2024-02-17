//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ComplexNumber comp1 = new ComplexNumber(5, -2);
        ComplexNumber comp2 = new ComplexNumber(1, 3);
        ComplexNumber comp3 = new ComplexNumber(0, -7);
        ComplexNumber comp4 = new ComplexNumber(10, 5);

        System.out.println("Operations with complex numbers:\n");
        System.out.println("Sum: (" + comp1.toString() + ") + (" + comp2.toString() + ") = " + comp1.Add(comp2).toString() + "\n");
        System.out.println("Subtract: (" + comp1.toString() + ") - (" + comp2.toString() + ") = " + comp1.Subtract(comp2).toString() + "\n");
        System.out.println("Multiply: (" + comp1.toString() + ") * (" + comp2.toString() + ") = " + comp1.Multiply(comp2).toString() + "\n");
        System.out.println("Divide: (" + comp1.toString() + ") / (" + comp2.toString() + ") = " + comp1.Divide(comp2).toString() + "\n");

        System.out.println("####################\n");

        
        System.out.println("Operations with complex matrix:\n");
        System.out.println("Sum: (" + comp1.toString() + ") + (" + comp2.toString() + ") = " + comp1.Add(comp2).toString() + "\n");
        System.out.println("Subtract: (" + comp1.toString() + ") - (" + comp2.toString() + ") = " + comp1.Subtract(comp2).toString() + "\n");
        System.out.println("Multiply: (" + comp1.toString() + ") * (" + comp2.toString() + ") = " + comp1.Multiply(comp2).toString() + "\n");
        System.out.println("Divide: (" + comp1.toString() + ") / (" + comp2.toString() + ") = " + comp1.Divide(comp2).toString() + "\n");
    }
}