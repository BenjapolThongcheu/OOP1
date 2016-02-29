import javax.swing.JOptionPane;
import javax.swing.JTextArea;
public class scoreSection {

	public static void main(String[] args) {
		
		String choice=" ";
		
		choice=JOptionPane.showInputDialog(null,"Enter Section "+"\n"+"1.Section 3"+
		"\n"+"2.Section 4 "+"\n"+"3.Section 5 "+"\n"+"4.Random score"+"\n"+" 5.Exit program ");
		//ar2 = Integer.parseInt(se2);
		
		
		switch(choice){
		case "1" : section3();break;
		case "2" : section4();break;
		case "3" : section5();break;
		case "4" : random();break;
		case "5" : break;
		}
	}
		public static void section3(){
			String a="Student"+"\t"+"Homework"+"\t"+"Assimenge"+"\t"+"Score midterm"+"\t"+"Score final"+"\t"+" "
					+ " Total score "+"\t"+" Grade "+"\n";
			
			
			int b;
			JTextArea output = new JTextArea(10,80);
			b = Integer.parseInt(JOptionPane.showInputDialog(null," Enter number Student "));
			String g=" ",h=" ";
			int ss1[][] = new int [b][5];
			int[] total = new int[b];
			String gpa[] = new String[b];
			int l,o,v,e;
			
			for(int i=0;i < ss1.length;i++){
				
				do{
			l = Integer.parseInt(JOptionPane.showInputDialog(null," Enter Homework ","Student"+(i+1),1));
			if (ss1[i][0]<0||ss1[i][0]>=20 )JOptionPane.showMessageDialog(null," Error score <= 20 !! ");
				}while(ss1[i][0]<0||ss1[i][0]>=20);
				
				do{
			o = Integer.parseInt(JOptionPane.showInputDialog(null," Enter Assimenge ","Student"+(i+1),1));
			if (ss1[i][1]<0||ss1[i][1]>=20) JOptionPane.showMessageDialog(null,"Error score <= 20 !!");
				}while(ss1[i][1]<0||ss1[i][1]>=20);
				
				do{
			v = Integer.parseInt(JOptionPane.showInputDialog(null," Enter Score midterm ","Student"+(i+1),1));
			if (ss1[i][2]<0||ss1[i][2]>=30) JOptionPane.showMessageDialog(null,"Error score <= 30 !! ");
				}while(ss1[i][2]<0||ss1[i][2]>=30);
				
				do{
					
			e = Integer.parseInt(JOptionPane.showInputDialog(null," Enter Score final ","Student"+(i+1),1));
			if (ss1[i][3]<0||ss1[i][3]>=30) JOptionPane.showMessageDialog(null,"Error score <= 30 !! ");
				}while(ss1[i][3]<0||ss1[i][3]>=30);
				
				ss1[i][0]=l;
				ss1[i][1]=o;
				ss1[i][2]=v;
				ss1[i][3]=e;
				
			total[i] = (ss1[i][0]+ss1[i][1]+ss1[i][2]+ss1[i][3]);
			
		if (total[i]>=80&&total[i]<=100)g = " A ";
		else if(total[i]>=75&&total[i]<=79)g = " B+ ";
		else if(total[i]>=70&&total[i]<=74)g = " B ";
		else if(total[i]>=65&&total[i]<=69)g = " C+ ";
		else if(total[i]>=60&&total[i]<=64)g = " C ";
		else if(total[i]>=55&&total[i]<=59)g = " D+ ";
		else if(total[i]>=50&&total[i]<=54)g = " D ";
		else if(total[i]<50)g = " F ";
		gpa[i]= g;
		
				}
			
			for(int i=0;i < ss1.length;i++){
			a+=(i+1)+"     " + " \t " + ss1[i][0]+" \t "+ss1[i][1]+" \t "+ss1[i][2]+" \t "
			+ss1[i][3]+" \t "+total[i]+"\t"+gpa[i]+"\n";
			}
			output.setText(a);
			JOptionPane.showMessageDialog(null,output);
			}

		///////////////////////////////////////////////////////////////
		////////////////////    section4  ///////////////////////////////

		public static void section4(){
			String a="Student"+"\t"+"Homework"+"\t"+"Assimenge"+"\t"+"Score midterm"+"\t"+"Score final"+
		"\t"+"score point"+ " Total score "+"\t"+" Grade "+"\n";
			
			
			int b;
			JTextArea output = new JTextArea(10,80);
			b = Integer.parseInt(JOptionPane.showInputDialog(null," Enter number Student "));
			String g=" ",h=" ";
			int ss1[][] = new int [b][5];
			int[] total = new int[b];
			String gpa[] = new String[b];
			int l,o,v,e,x;
			
			for(int i=0;i < ss1.length;i++){
				
				do{
			l = Integer.parseInt(JOptionPane.showInputDialog(null," Enter Homework ","Student"+(i+1),1));
			if (ss1[i][0]<0||ss1[i][0]>=20 )JOptionPane.showMessageDialog(null," Error score <= 20 !! ");
				}while(ss1[i][0]<0||ss1[i][0]>=15);
				
				do{
			o = Integer.parseInt(JOptionPane.showInputDialog(null," Enter Assimenge ","Student"+(i+1),1));
			if (ss1[i][1]<0||ss1[i][1]>=20) JOptionPane.showMessageDialog(null,"Error score <= 20 !!");
				}while(ss1[i][1]<0||ss1[i][1]>=15);
				
					
				do{
			v = Integer.parseInt(JOptionPane.showInputDialog(null," Enter Score midterm ","Student"+(i+1),1));
			if (ss1[i][2]<0||ss1[i][2]>=30) JOptionPane.showMessageDialog(null,"Error score <= 30 !! ");
				}while(ss1[i][2]<0||ss1[i][2]>=30);
				
				do{
					
			e = Integer.parseInt(JOptionPane.showInputDialog(null," Enter Score final ","Student"+(i+1),1));
			if (ss1[i][3]<0||ss1[i][3]>=30) JOptionPane.showMessageDialog(null,"Error score <= 30 !! ");
				}while(ss1[i][3]<0||ss1[i][3]>=30);
				
			do{
			x = Integer.parseInt(JOptionPane.showInputDialog(null," Enter points ","Student"+(i+1),1));
				if (ss1[i][3]<0||ss1[i][3]>=10) JOptionPane.showMessageDialog(null,"Error score <= 10 !! ");
					}while(ss1[i][3]<0||ss1[i][3]>=10);
				
				
				ss1[i][0]=l;
				ss1[i][1]=o;
				ss1[i][2]=v;
				ss1[i][3]=e;
				ss1[i][4]=x;
				
				
			total[i] = (ss1[i][0]+ss1[i][1]+ss1[i][2]+ss1[i][3]+ss1[i][4]);
			
		if (total[i]>=80&&total[i]<=100)g = " A ";
		else if(total[i]>=75&&total[i]<=79)g = " B+ ";
		else if(total[i]>=70&&total[i]<=74)g = " B ";
		else if(total[i]>=65&&total[i]<=69)g = " C+ ";
		else if(total[i]>=60&&total[i]<=64)g = " C ";
		else if(total[i]>=55&&total[i]<=59)g = " D+ ";
		else if(total[i]>=50&&total[i]<=54)g = " D ";
		else if(total[i]<50)g = " F ";
		gpa[i]= g;
		
				}
			
			for(int i=0;i < ss1.length;i++){
			a+=(i+1)+"     " + " \t " + ss1[i][0]+" \t "+ss1[i][1]+" \t "+ss1[i][2]+" \t "
			+ss1[i][3]+"/t"+ss1[i][4]+"\t "+total[i]+"\t"+gpa[i]+"\n";
			}
			output.setText(a);
			JOptionPane.showMessageDialog(null,output);
			}
		
			///////////////////////////////////////////////////////////////
			////////////////////    section5  ///////////////////////////////
		
		public static void section5(){
			String a="Student"+"\t"+"Homework"+"\t"+"Assimenge"+"\t"+"Score Test "+"\t"+"Score Ponit "+"\t"
					+ "score Midtream "+"\t"+"score final"+"\t"+" total score"+"\t"+" Gread "+"\n";
			
			
			int b;
			JTextArea output = new JTextArea(10,80);
			b = Integer.parseInt(JOptionPane.showInputDialog(null," Enter number Student "));
			String g=" ",h=" ";
			int ss1[][] = new int [b][7];
			int[] total = new int[b];
			String gpa[] = new String[b];
			int l,o,v,e,y,x;
			
			for(int i=0;i < ss1.length;i++){
				
				do{
			l = Integer.parseInt(JOptionPane.showInputDialog(null," Enter Homework ","Student"+(i+1),1));
			if (ss1[i][0]<0||ss1[i][0]>=10 )JOptionPane.showMessageDialog(null," Error score <= 10 !! ");
				}while(ss1[i][0]<0||ss1[i][0]>=10);
				
				do{
			o = Integer.parseInt(JOptionPane.showInputDialog(null," Enter Assimenge ","Student"+(i+1),1));
			if (ss1[i][1]<0||ss1[i][1]>=15) JOptionPane.showMessageDialog(null,"Error score <= 15 !!");
				}while(ss1[i][1]<0||ss1[i][1]>=15);
				
				do{
			v = Integer.parseInt(JOptionPane.showInputDialog(null," Enter Score test ","Student"+(i+1),1));
			if (ss1[i][2]<0||ss1[i][2]>=10) JOptionPane.showMessageDialog(null,"Error score <= 10 !! ");
				}while(ss1[i][2]<0||ss1[i][2]>=10);
				
				do{
					
			e = Integer.parseInt(JOptionPane.showInputDialog(null," Enter Score Points ","Student"+(i+1),1));
			if (ss1[i][3]<0||ss1[i][3]>=5) JOptionPane.showMessageDialog(null,"Error score <= 5 !! ");
				}while(ss1[i][3]<0||ss1[i][3]>=5);
				
				do{
					
			y = Integer.parseInt(JOptionPane.showInputDialog(null," Enter Score midterm  ","Student"+(i+1),1));
			if (ss1[i][3]<0||ss1[i][3]>=30) JOptionPane.showMessageDialog(null,"Error score <= 30 !! ");
				}while(ss1[i][3]<0||ss1[i][3]>=30);
				
				do{
					
			x = Integer.parseInt(JOptionPane.showInputDialog(null," Enter Score final ","Student"+(i+1),1));
			if (ss1[i][3]<0||ss1[i][3]>=30) JOptionPane.showMessageDialog(null,"Error score <= 30 !! ");
				}while(ss1[i][3]<0||ss1[i][3]>=30);
				
				ss1[i][0]=l;
				ss1[i][1]=o;
				ss1[i][2]=v;
				ss1[i][3]=e;
				ss1[i][4]=y;
				ss1[i][5]=x;
				
			total[i] = (ss1[i][0]+ss1[i][1]+ss1[i][2]+ss1[i][3]+ss1[i][4]+ss1[i][5]);
			
		if (total[i]>=80&&total[i]<=100)g = " A ";
		else if(total[i]>=75&&total[i]<=79)g = " B+ ";
		else if(total[i]>=70&&total[i]<=74)g = " B ";
		else if(total[i]>=65&&total[i]<=69)g = " C+ ";
		else if(total[i]>=60&&total[i]<=64)g = " C ";
		else if(total[i]>=55&&total[i]<=59)g = " D+ ";
		else if(total[i]>=50&&total[i]<=54)g = " D ";
		else if(total[i]<50)g = " F ";
		gpa[i]= g;
		
				}
			
			for(int i=0;i < ss1.length;i++){
			a+=(i+1)+"     " + " \t " + ss1[i][0]+" \t "+ss1[i][1]+" \t "+ss1[i][2]+" \t "
			+ss1[i][3]+"\t"+ss1[i][4]+" \t "+ss1[i][5]+"\t"+total[i]+"\t"+gpa[i]+"\n";
			}
			output.setText(a);
			JOptionPane.showMessageDialog(null,output);
			}
		
		///////////////////  Random  /////////////////////
		
		public static void random(){
			String a="Student"+"\t"+"Homework"+"\t"+"Assimenge"+"\t"+"Score Test "+"\t"+"Score Ponit "+"\t"
					+ "score Midtream "+"\t"+"score final"+"\t"+" total score"+"\t"+" Gread "+"\n";
			
			
			int b;
			JTextArea output = new JTextArea(10,80);
			b = Integer.parseInt(JOptionPane.showInputDialog(null," Enter number Student "));
			String g=" ",h=" ";
			int ss1[][] = new int [b][7];
			int[] total = new int[b];
			String gpa[] = new String[b];
			int l,o,v,e,y,x,t;
			int hw=0,as=0,po=0,te=0,mi=0,fi=0;
			
			for(int i=0;i < ss1.length;i++){
				
				
			l = 10 -1+1;
			hw=1+(int)(Math.random()*l);
				
			o = 10 -1+1;
			as=1+(int)(Math.random()*o);
				
			v = 5 -1+1;
			po=1+(int)(Math.random()*v);
			
			e = 10 -1+1;
			te=1+(int)(Math.random()*e);
			
			
			y = 30 -1+1;
			mi=1+(int)(Math.random()*y);
			
			x = 30 -1+1;
			fi=1+(int)(Math.random()*x);
				
				
				ss1[i][0]=hw;
				ss1[i][1]=as;
				ss1[i][2]=po;
				ss1[i][3]=te;
				ss1[i][4]=mi;
				ss1[i][5]=fi;
				
			total[i] = (ss1[i][0]+ss1[i][1]+ss1[i][2]+ss1[i][3]+ss1[i][4]+ss1[i][5]);
			
		if (total[i]>=80&&total[i]<=100)g = " A ";
		else if(total[i]>=75&&total[i]<=79)g = " B+ ";
		else if(total[i]>=70&&total[i]<=74)g = " B ";
		else if(total[i]>=65&&total[i]<=69)g = " C+ ";
		else if(total[i]>=60&&total[i]<=64)g = " C ";
		else if(total[i]>=55&&total[i]<=59)g = " D+ ";
		else if(total[i]>=50&&total[i]<=54)g = " D ";
		else if(total[i]<50)g = " F ";
		gpa[i]= g;
		
				}
			
			for(int i=0;i < ss1.length;i++){
			a+=(i+1)+"     " + " \t " + ss1[i][0]+" \t "+ss1[i][1]+" \t "+ss1[i][2]+" \t "
			+ss1[i][3]+"\t"+ss1[i][4]+" \t "+ss1[i][5]+"\t"+total[i]+"\t"+gpa[i]+"\n";
			}
			output.setText(a);
			JOptionPane.showMessageDialog(null,output);
			
		
}}
	 


