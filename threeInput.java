/*Brayden Hanshew
 * Apr 15, 2025
 */
import java.io.File;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileWriter;

public class threeInput{
  public static void main(String[] args){
    try{
    File myObj = new File("Input.txt");
    System.out.println("please enter 3 int numbers with a space between them");
    Scanner myReader = new Scanner(myObj);
    
    int num1 = myReader.nextInt();
    int num2 = myReader.nextInt();
    int num3 = myReader.nextInt();
    
    int output = num1 + num2 + num3;
    
    FileWriter myWriter = new FileWriter("Output.txt");
      myWriter.write("output is "+ output);
      myWriter.close();
      System.out.println("Check output file");
    }
    catch(IOException e)
    {System.out.print(e);
    }
  }
}