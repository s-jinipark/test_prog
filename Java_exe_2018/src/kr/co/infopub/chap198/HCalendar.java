package kr.co.infopub.chap198;
import java.util.*;
import javax.swing.*;
import java.awt.*;
public class  HCalendar{
	private JPanel jPanel3;
	int year=2003;
	int month=8;
	Calendar today;
	Calendar cal ;
	CalendButton [] calendButton=new CalendButton [49];
	public HCalendar(JPanel jPanel3){
			today=Calendar.getInstance();
			cal = new GregorianCalendar();
			year=today.get(Calendar.YEAR);
			month=today.get(Calendar.MONTH)+1;
			inputs();//섹션 198에서는 코멘트 처리할 것.
			calInput(0);
			this.jPanel3=jPanel3;
			gridInit();
			panelInit();
	}
	public String getCaltext(){
	  return year+"년  "+month+"월  ";
	}
	public void allInit(int gap){
	  this.jPanel3.removeAll();
	  calInput(gap);
	  gridInit();
	  panelInit();
	}
	public void inputs(){
		//InputsInt ins=new InputsInt();//섹션 165 JOptionPane을 이용한 Inputs
		//int [] a=ins.input(2,0,3000);//서로다른 두 수(0~3000사이의 수)를 입력받는다.
		//year=a[0];//년
		//month=a[1];//월
	}
	public void calInput(int gap){
		month+=(gap);
		if (month<=0){
				month = 12;
				year  =year- 1;
		}else if (month>=13){
				month = 1;
				year =year+ 1;
		}
	}
	public void gridInit(){
	  //jPanel3에 버튼 붙이기
	  for (int i = 0; i < 7; i++) {
		calendButton[i]=new CalendButton( - (i + 1));
		jPanel3.add(calendButton[i]);
	  }
	  for (int i = 7; i < 49; i++) {
		calendButton[i]=new CalendButton();
		jPanel3.add(calendButton[i]);
	  }
	}
	public void panelInit(){
	  GridLayout gridLayout1 = new GridLayout(7,7,5,5);
	  jPanel3.setLayout(gridLayout1);
	  calSet();
	}
	public JPanel getCalandarPanel(){  return this.jPanel3;   }
	public void calSet(){
		cal.set(Calendar.YEAR,year);
		cal.set(Calendar.MONTH,(month-1));
		cal.set(Calendar.DATE,1);
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		int j=0,k=0;
		int hopping=0;
		calendButton[0].setForeground(new Color(255,0,0));//일요일 "일"
		calendButton[6].setForeground(new Color(0,0,255));//토요일 "토"
		for(int i=cal.getFirstDayOfWeek();i<dayOfWeek;i++){  j++;  }
		hopping=j;
		for(int kk=0;kk<hopping;kk++){
			calendButton[kk+7].setText("");
		}
		for(int i=cal.getMinimum(Calendar.DAY_OF_MONTH);
				i<=cal.getMaximum(Calendar.DAY_OF_MONTH);i++){
		    cal.set(Calendar.DATE,i);
			if(cal.get(Calendar.MONTH) !=month-1){
				break;
			}
			if((i+hopping-1)%7==0){//일요일
				calendButton[i+6+hopping].setForeground(new Color(255,0,0));
			}
			if((i+hopping)%7==0){//토요일
				calendButton[i+6+hopping].setForeground(new Color(0,0,255));
			}
			calendButton[i+6+hopping].setText((i)+"");
		}//for
	}//
}
