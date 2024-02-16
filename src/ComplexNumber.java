public class ComplexNumber implements IOperated<ComplexNumber>{
    private double real;
    private double image;

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

    public ComplexNumber getConjugate(){
        return new ComplexNumber(real, -image);
    }
    public ComplexNumber Add(ComplexNumber num){
        return new ComplexNumber(real + num.real,
                image + num.image);
    }
    public ComplexNumber Substract(ComplexNumber num){
        return new ComplexNumber(real - num.real,
                image - num.image);
    }
    public ComplexNumber Multiply(ComplexNumber num){
        return new ComplexNumber(real * num.real - image * num.image,
                real * num.image + image * num.real);
    }
    public ComplexNumber Divide(ComplexNumber num){
        ComplexNumber numerator = Multiply(num.getConjugate());
        return new ComplexNumber(numerator.real / num.Multiply(num.getConjugate()).real,
                numerator.image);
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
