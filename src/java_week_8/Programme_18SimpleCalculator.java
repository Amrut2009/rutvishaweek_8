package java_week_8;

public class Programme_18SimpleCalculator {
    double firstNumber;
    double SecondNumber;

    public double getFirstNumber() {
        return this.firstNumber;
    }

    public double getSecondNumber() {
        return this.SecondNumber;
    }

    public void setFirstNumber(double fn) {
        this.firstNumber = fn;
    }

    public void setSecondNumber(double SN) {
        this.SecondNumber = SN;
    }

    public double getAdditionResult() {
        return (this.firstNumber + this.SecondNumber);
    }

    public double getMultiplicationResult() {
        return (this.firstNumber * this.SecondNumber);
    }

    public double getSubtractionResult() {
        return (this.firstNumber - this.SecondNumber);
    }

    public double getDivisionResult() {
        return (this.firstNumber - this.SecondNumber);
    }




    public static void main(String[] args) {
        Programme_18SimpleCalculator calculator =new Programme_18SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setFirstNumber(4);
        System.out.println("add="+ calculator.getAdditionResult());
        System.out.println(" subtract = "+calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("division ="+calculator.getDivisionResult());
        System.out.println("multiplication = "+calculator.getMultiplicationResult());


    }
}
