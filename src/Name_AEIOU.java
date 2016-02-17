import java.util.Scanner;
public class Name_AEIOU {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			String name = " ";
			int count = 0,count1=0,count2 = 0,count3=0,count4=0;
			int count5 = 0,count6=0,count7 = 0,count8=0,count9=0;
			Scanner sc = new Scanner(System.in);
			System.out.print(" Enter my name : ");
			
			name = sc.nextLine();
			System.out.println("- AEIOU aeiou -");
	       
			for(int i=0;i<name.length();i++){
				String s = " ";
				s = name.substring(i,i+1);
				
				if(s.equals("A"))count++;
				else if(s.equals("E"))count1++;
				else if(s.equals("I"))count2++;
				else if(s.equals("O"))count3++;
				else if(s.equals("U"))count4++;
				else if (s.equals("a"))count5++;
				else if (s.equals("e"))count6++;
				else if (s.equals("i"))count7++;
				else if (s.equals("o"))count8++;
				else if (s.equals("u"))count9++;
				
			}
			
			System.out.println("A = "+count+"\nE = "+count1+"\nI = "+count2+"\nO = "+count3+"\nU = "+count4);
			System.out.println("   ");
			System.out.println("a = "+count5+"\ne = "+count6+"\ni = "+count7+"\no = "+count8+"\nu = "+count9);
			}
		
		}