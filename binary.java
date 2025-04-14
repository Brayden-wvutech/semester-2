import java.util.Stack;
import java.util.Scanner;

public class binary {
    public void main(String[]args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a decimal number");
        int input = scanner.nextInt();

        Stack<Integer> biStack = new Stack<>();

        if(input == 0 ){
            System.out.println("Binary output is : 0");
        }
        else{
            while(input > 0){
                biStack.push(input % 2);
                input = input / 2 ;
            }

            }
        System.out.print("Binary output is : " );
            while (!biStack.isEmpty()) {
                System.out.print(biStack.pop());
            }
            scanner.close();
        }
    }