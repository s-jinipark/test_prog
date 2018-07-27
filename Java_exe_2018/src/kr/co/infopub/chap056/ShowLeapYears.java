package kr.co.infopub.chap056;
public class ShowLeapYears {

	public static void main(String[] args) {
		for(int year=1995;year<2021;year++){
			boolean yearTF=false;
			if( (0 == (year % 4) && 0 != (year %100)) || 
				 0 == year%400 ){
				yearTF = true;
			}else{
				yearTF = false;
			}
				
			if(yearTF){
				System.out.println(year+"´Â À±³âÀÔ´Ï´Ù. ");
			}else{
				System.out.println(year+"´Â À±³âÀÌ ¾Æ´Õ´Ï´Ù.");
			}
        }//
		System.out.println("-------------------------------");
		printLeapYears(1995,2021);
		
	}
	public static boolean isLeapYear(int year){
		boolean isLeap=false;
		if((0 == (year % 4) && 0 != (year %100)) || 
			0 == year%400){
			isLeap=true;
		}
		return isLeap;
	}
	public static void printLeapYears(int from, int to){
		for(int year=from;year<to;year++){
			prints(year,isLeapYear(year));
        }//
	}
	public static void prints(int year,boolean isLeap){
		if(isLeap){
			System.out.println(year+"´Â À±³âÀÔ´Ï´Ù. ");
		}else{
			System.out.println(year+"´Â À±³âÀÌ ¾Æ´Õ´Ï´Ù.");
		}
	}
}
