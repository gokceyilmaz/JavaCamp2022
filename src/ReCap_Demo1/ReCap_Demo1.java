package ReCap_Demo1;

public class ReCap_Demo1 {
    public static void main(String[] args) {
        int number1= 20;
        int number2 = 25;
        int number3 = 2;

        if(number1>number2 && number1>number3){
            System.out.println("number1 ->"+number1+ " is the biggest number.");
        }
       else if(number2>number1 && number2>number3){
            System.out.println("number2 ->"+number2+ " is the biggest number.");
        }
       else{
            System.out.println("number3 ->"+number3+ " is the biggest number.");
        }
    }
}
