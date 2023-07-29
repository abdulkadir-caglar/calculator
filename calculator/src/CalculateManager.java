public class CalculateManager {
    public void addition(int num1, int num2){
        int result = num1 + num2;
        System.out.println(result);
    }

    public void extraction(int num1, int num2){
        int result = num1 - num2;
        System.out.println(result);
    }

    public void multiplication(int num1, int num2){
        int result = num1 * num2;
        System.out.println(result);
    }

    public void division(double num1, double num2){
        if(num2 == 0){
            System.out.println("Undefined.");
            return ;
        }
        double result = num1 / num2;
        System.out.println(result);
    }

    public void factorial(int number){
        if(number == 0){
            System.out.println(1);
        }
        else if(number < 0){
            System.out.println("Undefined result.");
        }
        else{
            int result = 1;
            for(int i = 1; i<= number; i++){
                result *= i;
            }
            System.out.println(result);
        }

    }

}
