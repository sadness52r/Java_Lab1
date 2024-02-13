public class ComplexNumber implements IOperated<ComplexNumber>{
    private double real;
    private double image;

    ComplexNumber(String complex){

        long plusCount = complex.chars().filter(c -> c == '+').count();

    }
    ComplexNumber(double real, double image){
        this.real = real;
        this.image = image;
    }

    public double getReal(){
        return real;
    }
    public void setReal(double real){
        this.real = real;
    }
    public double getImage(){
        return image;
    }
    public void setImage(double image){
        this.image = image;
    }

    public ComplexNumber Add(ComplexNumber num){
        return new ComplexNumber();
    }
    public ComplexNumber Substract(ComplexNumber num){
        return new ComplexNumber();
    }
    public ComplexNumber Multiply(ComplexNumber num){
        return new ComplexNumber();
    }
    public ComplexNumber Divide(ComplexNumber num){
        return new ComplexNumber();
    }
    @Override
    public String toString(){
        if (image > 0){
            if (real == 0){
                return image + "i";
            }
            return real + " + " + image + "i";
        }
        else if (image < 0){
            if (real == 0){
                return image + "i";
            }
            return real + " - " + (-image) + "i";
        }
        return String.valueOf(real);
    }
}
