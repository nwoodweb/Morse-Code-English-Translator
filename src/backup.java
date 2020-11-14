/* This basic program is designed to translate english to morse code and morse code to english. 
 * Suggested uses include amateur radio and signalling 
 *
 * This is accomplished by running input through methods containing a dictionary to translate to 
 *
 *
 *
 * NATHAN WOOD 
 * FREE TO USE AND DISTRIBUTE 
 */ 

// BEGIN PROGRAM
import java.util.*;
public class MorseTranslator{

public static String englishMorse(String input){
	String inputRefined = input.toLowerCase(); 
	char[] inputArray = inputRefined.toCharArray(); 
	String output = "";

	// english dictionary
	for (int i = 0; i < inputArray.length; i++){
		System.out.println(inputArray[i]);
	
		if (inputArray[i] == 'a'){
			output = output + "._  "; 
			}
		else if (inputArray[i] == 'b'){
			output = output + "_...  "; 
			}
		else if (inputArray[i] == 'c'){
			output = output + "_._.  ";
		 
			}
		else if (inputArray[i] == 'd'){
			output = output + "_..  "; 
			
			}
		else if (inputArray[i] == 'e'){
			output = output + ".  ";
		
			}
		else if (inputArray[i] == 'f'){
			output = output + ".._.  ";
			}
		else if (inputArray[i] == 'g'){
			output = output + "__.  ";
			}
		else if (inputArray[i] == 'h'){
			output = output + "....  ";
			}
		else if (inputArray[i] == 'i'){
			output = output + "..  "; 
			}
		else if (inputArray[i] == 'j'){
			output = output + ".___  ";
			}
		else if (inputArray[i] == 'k'){
			output = output + "_._  ";
			}
		else if (inputArray[i] == 'l'){
			output = output + "._..  ";
			}
		else if (inputArray[i] == 'm'){ 
			output = output + "__  ";
			}
		else if (inputArray[i] == 'n'){
			output = output + "_.  ";
			}
		else if (inputArray[i] == 'o'){
			output = output + "___  ";
			}
		else if (inputArray[i] == 'p'){
			output = output + ".__.";
			}
		else if (inputArray[i] == 'q'){
			output = output + "__._  "; 
			}
		else if (inputArray[i] == 'r'){
			output = output + "._.  ";
			}
		else if (inputArray[i] == 's'){
			output = output + "...  ";
			}
		else if (inputArray[i] == 't'){
			output = output + "_  ";
			}
		else if (inputArray[i] == 'u'){
			output = output + ".._  ";
			}
		else if (inputArray[i] == 'v'){
			output = output + "..._  ";
			}
		else if (inputArray[i] == 'w'){
			output = output + ".__  ";
			}
		else if (inputArray[i] == 'x'){
			output = output + "_.._  "; 
			}
		else if (inputArray[i] == 'y'){
			output = output + "_.__  ";
			}
		else if (inputArray[i] == 'z'){
			output = output + "__..  ";
			}

		// NUMBERS 

		else if(inputArray[i] == '1'){
			output = output + ".____  "; 
			} 
		else if (inputArray[i] == '2'){
			output = output + "..___  ";
			}
		else if (inputArray[i] == '3'){
			output = output + "...__  ";
			}
		else if (inputArray[i] == '4'){
			output = output + "...._  "; 
			}
		else if (inputArray[i] == '5'){
			output = output + ".....  "; 
			}
		else if (inputArray[i] == '6'){
			output = output + "...._  ";
			}
		else if (inputArray[i] == '7'){
			output = output + "...__  ";
			}
		else if (inputArray[i] == '8'){
			output = output + "..___  ";
			} 
		else if (inputArray[i] == '9'){
			output = output + ".____  "; 
			}
		else if (inputArray[i] == '0'){
			output = output + "_____  ";
			}

		
		//MISC 
		
		else if (inputArray[i] == ' '){
			output = output + "       "; // spaces between words is 7 spaces
			}
		else if (inputArray[i] == '.' || inputArray[i] == '!' || inputArray[i] == '?'){  // new sentences will be on newline
			output = output + "\n";
			}
		else if (inputArray[i] == ',' || inputArray[i] == '`' || inputArray[i] == ''' || inputArray[i] == '"' || inputArray[i] == ')' || inputArray[i] == '('){
			// do nothing for these symbols since they may or may not be inputs and do not effect anything 
			}
		else {
			System.out.println("ERROR : INCOMPATIBLE CHARACTER TYPE!!! \n USE ENGLISH ALPHABET CHARACTERS ONLY!!!!");
			}
		} // terminate for loop 



	return output; 
	}

//public static String morseEnglish

public static void menu(){
	// main menu 
	
	System.out.println(" Welcome to the Morse Code Translator!"); 
	System.out.println("--------------------------------------"); 
	System.out.println("Program is free to use and distribute!");
	System.out.println("--------------------------------------"); 
	System.out.println("Menu: "); 
	System.out.println("1. Translate English to Morse "); 
	System.out.println("2. Translate Morse to English "); 
	System.out.println("3. Demonstration"); 
	System.out.println("4. Morse Code Translation Key");
	System.out.println("5. Exit"); 

	}

public static void demo(){ 
	// call translation methods with designated words as demo
	
	String demoOutput = ""; 
	String demoOutput2 = ""; 
	String demoInput1 = "Colorless green ideas sleep furiously";
	String demoInput2 = "...   ---   ..."; 
	System.out.println("------------------------------");
	System.out.println("       ENGLISH TO MORSE       "); 
	System.out.println("Input: " + demoInput1); 
// 	System.out.println(englishMorse(demoInput1); 
	System.out.println("------------------------------");
	System.out.println("       MORSE TO ENGLISH       "); 
	System.out.println("Input: " + demoInput2); 
//	System.out.println(morseEnglish(demoInput2);
	System.out.println("------------------------------");
	System.out.println("End of Demonstration"); 

	} 

public static void morseKey(){
	// This is a plaintext key to allow user to make manual
	// or to verify program translation
	
	System.out.println("-----------------------------");
	System.out.println(" ENGLISH		MORSE");
	System.out.println(" A 			   ._");
	System.out.println(" B			 _..."); 
	System.out.println(" C			 _._."); 
	System.out.println(" D			  _..");  
	System.out.println(" E			    ."); 
	System.out.println(" F 			 .._."); 
	System.out.println(" G 			  __."); 
	System.out.println(" H			 ...."); 
	System.out.println(" I 			   .."); 
	System.out.println(" J 			 .___"); 
	System.out.println(" K			  _._"); 
	System.out.println(" L			 ._.."); 
	System.out.println(" M			   __"); 
	System.out.println(" N			   _.");
	System.out.println(" O			  ___"); 
	System.out.println(" P 			 .__."); 
	System.out.println(" Q			 __._"); 
	System.out.println(" R 			  ._.");
	System.out.println(" S 			  ..."); 
	System.out.println(" T 			    _"); 
	System.out.println(" U			  .._");
	System.out.println(" V			 ..._"); 
	System.out.println(" W			  .__");
	System.out.println(" X 			 _.._"); 
	System.out.println(" Y			 _.__"); 
	System.out.println(" Z 			 __..");
	System.out.println("-----------------------------"); 
	System.out.println(" NUMBER			MORSE"); 
	System.out.println(" 1			.____");
	System.out.println(" 2			..___");
	System.out.println(" 3			...__");
	System.out.println(" 4			...._");
	System.out.println(" 5			....."); 
	System.out.println(" 6			_....");
	System.out.println(" 7			__...");
	System.out.println(" 8			___..");
	System.out.println(" 9			____.");
	System.out.println(" 0			_____"); 
	System.out.println("-----------------------------"); 
	System.out.println("       GENERAL RULES         "); 
	System.out.println("1. 3 dot space for letter");
	System.out.println("2. 7 dot space for words");
	}
public static void main(String args[]){
	// Scanner myObj = new scanner
		

	menu();	
	
	morseKey();	

	}


}


// END PROGRAM
