package IntsCalculator;

public class IntsCalculator implements Ints {
    protected final Calculator target;

    public IntsCalculator() { this.target = new Calculator(); }

    @Override
    public int sum(int arg0, int arg1) {
        int sum = (int)target.newFormula().addOperand(arg0).addOperand(arg1).calculate(Calculator.Operation.SUM).result();//считаем через target
        return sum;
    }

    @Override
    public int mult(int arg0, int arg1) {
        int mult = (int)target.newFormula().addOperand(arg0).addOperand(arg1).calculate(Calculator.Operation.MULT).result();//считаем через target
        return mult;//считаем через target
    }
   @Override
    public int pow(int a, int b) {
       int pow = (int)target.newFormula().addOperand(a).addOperand(b).calculate(Calculator.Operation.POW).result();//считаем через target
       return pow;//считаем через target
    }
}

