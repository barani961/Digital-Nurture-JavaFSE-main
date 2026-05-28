public class OperatorPrecedence{
    public static void main(String[] args){

        int result1=10+5*2;
        System.out.println("Expression: 10+5*2");
        System.out.println("Explanation: Multiplication(*) has higher precedence");
        System.out.println("Step1: 5*2=10");
        System.out.println("Step2: 10+10=20");
        System.out.println("Result: "+result1);

        System.out.println("****************");

        int result2=(10+5)*2;
        System.out.println("Expression: (10+5)*2");
        System.out.println("Explanation: Parentheses are evaluated first");
        System.out.println("Step1: 10+5=15");
        System.out.println("Step2: 15*2=30");
        System.out.println("Result: "+result2);

        System.out.println("****************");

        int result3=20/4+3*2;
        System.out.println("Expression: 20/4+3*2");
        System.out.println("Explanation: Division and multiplication happen first");
        System.out.println("Step1: 20/4=5");
        System.out.println("Step2: 3*2=6");
        System.out.println("Step3: 5+6=11");
        System.out.println("Result: "+result3);

        System.out.println("****************");

        int result5=8+4/2*3;
        System.out.println("Expression: 8+4/2*3");
        System.out.println("Explanation: / and * have same precedence and evaluate left to right");
        System.out.println("Step1: 4/2=2");
        System.out.println("Step2: 2*3=6");
        System.out.println("Step3: 8+6=14");
        System.out.println("Result: "+result5);
    }
}