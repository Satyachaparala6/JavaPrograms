package tasksix;

import java.util.Scanner;

public class Complex {

	double real;
	double imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex add(Complex complex) {
        double sumReal = this.real + complex.real;
        double sumImaginary = this.imaginary + complex.imaginary;
        return new Complex(sumReal, sumImaginary);
    }
    public Complex multiply(Complex complex) {
        double prodReal = (this.real * complex.real) - (this.imaginary * complex.imaginary);
        double prodImaginary = (this.real * complex.imaginary) + (this.imaginary * complex.real);
        return new Complex(prodReal, prodImaginary);
    }
    public void display() {
        System.out.println(this.real + " + " + this.imaginary + "i");
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the real and imaginary parts of the first complex number:");
        double num1Real = scanner.nextDouble();
        double num1Imaginary = scanner.nextDouble();
        Complex num1 = new Complex(num1Real, num1Imaginary);
        System.out.println("Enter the real and imaginary parts of the second complex number:");
        double num2Real = scanner.nextDouble();
        double num2Imaginary = scanner.nextDouble();
        Complex num2 = new Complex(num2Real, num2Imaginary);

        Complex sum = num1.add(num2);
        Complex prod = num1.multiply(num2);
        System.out.println("Sum: ");
        sum.display();
        
}
    
}

