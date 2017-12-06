package motion;


import java.util.Scanner;
 
public class speak3 {
 
 public static void Main(String[] args) {
 
 // Defining Scanner Object to read data from console
 Scanner inputScanner = new Scanner(System.in);
 
 TextToSpeechConvertor ttsc = new TextToSpeechConvertor();
 
 System.out.println("Enter the Text : (type 'exit' to terminate)");
 
 // Reading the text
 String inputText = inputScanner.nextLine();
 
 while (true) {
 
 if("exit".equalsIgnoreCase(inputText)) {
 
 inputText = "Bye, See you later";
 ttsc.speak(inputText);
 break;
 }
 
 ttsc.speak(inputText);
 
 System.out.println("Enter the Text : (type 'exit' to terminate)");
 inputText = inputScanner.nextLine();
 }
 
 inputScanner.close();
 
 }
}