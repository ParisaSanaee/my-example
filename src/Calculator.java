public class Calculator {

        public static double calculate(double num1, double num2, char operator) throws Exception {
            switch (operator) {
                case '+':
                    return num1 + num2;
                case '-':
                    return num1 - num2;
                case '*':
                    return num1 * num2;
                case '/':
                    if (num2 != 0) {
                        return num1 / num2;
                    } else {
                        System.out.println("error");
                        return Double.NaN;
                    }
                default:
                    throw new Exception("operation is not supported");
                  //  System.out.println("Error!");
                  //  return Double.NaN;
            }
        }
}
