package IntsCalculator;

public class Main {
    public static void main(String[] args) {
        // IntsCalculator.Calculator calc = new IntsCalculator.Calculator();
        // System.out.println(
        //         calc.newFormula()
        //                 .addOperand(5)
        //                 .addOperand(15)
        //                 .calculate(IntsCalculator.Calculator.Operation.MULT)
        //                 .result()
        // );


        Ints intsCalc = new IntsCalculator();
        System.out.println(intsCalc.sum(2, 2));
        System.out.println(intsCalc.mult(10, 22));
        System.out.println(intsCalc.pow(2, 10));


    }
}