import java.util.*;
public class time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int sec,sec1,sec2,hour,min,pm;
		do{
			System.out.print("Enter Seconds : ");
			sec=sc.nextInt();
			
			hour = sec/3600;
			sec1=sec%3600;
			min=sec1/60;
			sec2=sec1%60;
			pm=hour/24;
			
			System.out.print(sec+" Seconds is (HH:MM:SS) = "+hour+":");
			System.out.print(min+":"+sec2+" "+pm+"Day");
			System.out.println();
		}while(sec>0); 
	}

}
