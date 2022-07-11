public class Calculator {
    // sum -> filipe
    public int sum(int a, int b){
        return a + b;
    }
    // subtract -> ana
    public int subtract (int a, int b) {
        return a - b;
    }
    // multiply -> ivan ta feito
    
    public int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    // divide -> gonçalo
    public float divide (float a, float b) {
        if(a == 0 || b == 0){
            return 0;
        } else {
            return a / b;
        }
    }
}
