package sc;
import java.util.*;
public class Runner {
public static void main(String arg[]) {
	
	int text = 0, call = 0, videoCall = 0, email = 0, inPerson = 0;
	boolean invalidAnswer = true;
	String desire;
	int q;
	Scanner kb = new Scanner(System.in);
	
	
		System.out.println("Welcome to the Communication Portal! \n\nThe purpose of this "
				+ "program is to show you the most effective method of communication "
				+ "based on a variety of factors regarding \nyour upcoming interaction.\n\n"
				+ "To begin with, the program will ask you multiple questions regarding "
				+ "the circumstances of \nyour communication. After receiving your answers, the "
				+ "program will compile your data and, "
				+ "\nafter utilizing extensive research analysis, will output"
				+ " the most effective form of communication for your situuation. \n\n"
				+ "Press Enter when you're ready to begin!");
		
		kb.nextLine();
		
		
		
		// Question 1 : Relationship
		while (invalidAnswer){
			
			System.out.println("What is your relationship with the other person?"
					+ "\n 1. Stranger\n 2. Acquaintance\n"
					+ " 3. Friend\n 4. Family/Close Friend\n"
					+ " 5. Boss");
			
			q = kb.nextInt();
			switch(q){
		
			case 1: 
				inPerson += 3;
				call += 2;
				videoCall += 1;
				email += 1.5;
				text --;
				invalidAnswer = false;
				break;
			case 2: 
				inPerson += 2;
				call += 2;
				email += 2;
				videoCall += 1;
				text += 1;
				invalidAnswer = false;
				break;
			case 3: 
				email += 2;
				text += 2;
				call += 2;
				videoCall ++;
				inPerson +=1;
				invalidAnswer = false;
				break;
			case 4: 
				call += 3;
				text += 3;
				videoCall += 2;
				email += 2;
				inPerson += 3;
				invalidAnswer = false;
				break;
			case 5: 
				inPerson += 3;
				email += 3;
				call += 1.5;
				videoCall += 1;
				text --;
				invalidAnswer = false;
				break;
			default: 
				System.out.println("Please choose a valid answer\n");
				break;
		
		
			}
		}
		
		invalidAnswer = true;
		
		
		// Question 2 : Occasion
				while (invalidAnswer){
					
					System.out.println("What is purpose of the interaction?"
							+ "\n 1. Short Question\n 2. Business\n"
							+ " 3. Interview\n 4. Date\n 5. Friendly Chat");
					
					q = kb.nextInt();
					switch(q){
				
					case 1: 
						text += 5;
						email += 4;
						call += 5;
						videoCall +=2;
						boolean shortQuestion = true;
						invalidAnswer = false;
						break;
					case 2: 
						inPerson += 3;
						email += 1.5;
						call += 2;
						videoCall ++;
						invalidAnswer = false;
						break;
					case 3: 
						inPerson += 3;
						email --;
						call += .25;
						videoCall += 2;
						text -= 2;
						invalidAnswer = false;
						break;
					case 4: 
						inPerson += 3;
						email -=2;
						call --;
						videoCall ++;
						text -=2;
						invalidAnswer = false;
						break;
					case 5: 
						inPerson += 3;
						email -=2;
						call --;
						videoCall ++;
						text -=2;
						invalidAnswer = false;
						break;
					default: 
						System.out.println("Please choose a valid answer\n");
						break;
				
				
					}
				}
				
				invalidAnswer = true;
				
				
		// Question 3 : Tone of Conversation
				while (invalidAnswer){
					
					System.out.println("What is the tone of the interaction?"
							+ "\n 1. Formal\n 2. Casual");
					
					q = kb.nextInt();
					switch(q){
				
					case 1: 
						inPerson += 4;
						email += 2;
						call += 3;
						videoCall += 0;
						text += -3;
						invalidAnswer = false;
						break;
					case 2: 
						inPerson += 1;
						email += 2;
						call += 2;
						videoCall += 3;
						text += 4;
						invalidAnswer = false;
						break;	
					default: 
						System.out.println("Please choose a valid answer\n");
						break;
				
				
					}
				}
				
				invalidAnswer = true;
		
		// Question 4 : Duration
				while (invalidAnswer){
					
					System.out.println("How long will the communication take?"
							+ "\n 1. 5 minutes or less\n 2. 5 - 30 minutes\n"
							+ " 3. 30 - 60 minutes\n 4. Longer than an hour");
					
					q = kb.nextInt();
					switch(q){
				
					case 1: 
						inPerson -= 2;
						email += 3;
						call += 3;
						videoCall += 1;
						text += 3;
						invalidAnswer = false;
						break;
					case 2: 
						inPerson += 1;
						email += 2;
						call += 4;
						videoCall += 3;
						text += 2;
						invalidAnswer = false;
						break;
					case 3: 
						inPerson += 3;
						email += 1;
						call += 2;
						videoCall += 2;
						text += 1;
						invalidAnswer = false;
						break;
					case 4: 
						inPerson += 4;
						email += -2;
						call += 3;
						videoCall += 4;
						text += -2;
						invalidAnswer = false;
						break;
					default: 
						System.out.println("Please choose a valid answer\n");
						break;
				
				
					}
				}
				
				invalidAnswer = true;
				
				
				// Question 5: Vicinity
				while (invalidAnswer){
					
					System.out.println("If you were to physically meet with the other person,\n"
							+ "how long would the travel time be?"
							+ "\n 1. 5 minutes or less\n 2. 5 - 15 minutes\n"
							+ " 3. 15 - 60 minutes\n 4. Longer than an hour");
					
					q = kb.nextInt();
					switch(q){
				
					case 1: 
						inPerson += 5;
						email += -5;
						call += -3;
						videoCall += -4;
						text += -5;
						invalidAnswer = false;
						break;
					case 2: 
						inPerson += 3;
						email += 1;
						call += 2;
						videoCall += 0;
						text += 1;
						invalidAnswer = false;
						break;
					case 3: 
						inPerson += 1;
						email += 3;
						call += 3;
						videoCall += 2;
						text += 2;
						invalidAnswer = false;
						break;
					case 4: 
						inPerson -= 3;
						email += 3;
						call += 4;
						videoCall += 5;
						text += 3;
						invalidAnswer = false;
						break;
					default: 
						System.out.println("Please choose a valid answer\n");
						break;
				
				
					}
				}
				
				invalidAnswer = true;
				
				int [] a = new int[5];
				
				a[0] = text;
				a[1] = email;
				a[2] = call;
				a[3] = videoCall;
				a[4] = inPerson;
				
				/*for(int x=0; x<5; x++){
					int t = a[x];
					for(int y = 0; y<5; y++){
						if (t > a[y]){
							
						}
						
					}
				}*/
				
				Arrays.sort(a);
				String answer1 = "boo";
				String answer2 = "boo2";
				
				if(a[4] == text){
					answer1 = "text";
				}
				if(a[4] == call){
					answer1 = "call";
				}if(a[4] == email){
					answer1 = "email";
				}if(a[4] == videoCall){
					answer1 = "video call";
				}if(a[4] == inPerson){
					answer1 = "an in person meeting";
				}
				
				if(a[3] == text){
					answer2 = "text";
				}
				if(a[3] == call){
					answer2 = "call";
				}if(a[3] == email){
					answer2 = "email";
				}if(a[3] == videoCall){
					answer2 = "video call";
				}if(a[3] == inPerson){
					answer2 = "an in person meeting";
				}
				
				if(answer1 == answer2){
					if(a[2] == text){
						answer2 = "text";
					}if(a[2] == call){
						answer2 = "call";
					}if(a[2] == email){
						answer2 = "email";
					}if(a[2] == videoCall){
						answer2 = "video call";
					}if(a[2] == inPerson){
						answer2 = "an in person meeting";
					}
				}
				
				if(answer1 == answer2){
					if(a[1] == text){
						answer2 = "text";
					}if(a[1] == call){
						answer2 = "call";
					}if(a[1] == email){
						answer2 = "email";
					}if(a[1] == videoCall){
						answer2 = "video call";
					}if(a[1] == inPerson){
						answer2 = "an in person meeting";
					}
				}
				
				if(answer1 == answer2){
					if(a[0] == text){
						answer2 = "text";
					}if(a[0] == call){
						answer2 = "call";
					}if(a[0] == email){
						answer2 = "email";
					}if(a[0] == videoCall){
						answer2 = "video call";
					}if(a[0] == inPerson){
						answer2 = "an in person meeting";
					}
				}
				
				System.out.println("\n\nThe analysis is complete! \n\n"
						+ "The most suggested form of interaction is through " + answer1 +"!");
				System.out.println("\nThe second most suggested form of interaction is through " + answer2 +"!");
				
				System.out.println("\nThank you for your time, and we wish you the best of luck in your interaction!\n\n");
				
				
				/*System.out.println("\nIn Person:" + inPerson);
				System.out.println("Video Call" + videoCall);
				System.out.println("Call:" + call);
				System.out.println("Email:" + email);
				System.out.println("Text:" + text);*/
				
		
			
	
	}
}
