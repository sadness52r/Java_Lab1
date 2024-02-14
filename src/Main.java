//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println((new ComplexNumber(5, -2)).toString());
        System.out.println(((new ComplexNumber(5, 2)).Multiply(new ComplexNumber(5, -2))).toString());
    }
}