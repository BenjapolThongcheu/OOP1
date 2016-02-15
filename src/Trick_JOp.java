import javax.swing.JOptionPane;
public class Trick_JOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int ball1=1,ball2=0,ball3=0;
String result;
do{
	result = JOptionPane.showInputDialog("Enter number");
	if (result.length()>49)JOptionPane.showMessageDialog(null,"resultnumber overload !!!"," ",1);
}while(result.length()>49);
	for(int i=0;i<result.length();i++){
		if(result.charAt(i)=='A'){
			if(ball1>ball2){
				ball1=0; ball2=1;}
			else if (ball2>ball1){ball1=1;ball2=0;}
			else{ball1=0;ball2=0;}
			}
		if(result.charAt(i)== 'B'){
			if (ball2>ball3){ ball2=0;ball1=1;}
			else if (ball3>ball2){ball2=1;ball3=0;}
			else {ball2=0;ball3=0;}
		}
		if (result.charAt(i)=='c'){
			if (ball1>ball3){ ball3=1;ball1=0;}
			else if (ball3>ball1){ball1=1;ball3=0;}
			else {ball3=0;ball1=0;}
		}
	}
		check(ball1,ball2,ball3);
}
	public static void check(int ball1,int ball2,int ball3){
		if (ball1==1)JOptionPane.showMessageDialog(null,"1"," ",1);
		else if (ball2==1)JOptionPane.showMessageDialog(null,"2"," ",1);
		else if (ball3==1)JOptionPane.showMessageDialog(null,"3"," ",1);
	}
	}


