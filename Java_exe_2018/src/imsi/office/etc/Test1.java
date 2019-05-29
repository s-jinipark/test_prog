package imsi.office.etc;

import java.util.ArrayList;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ArrayList<String> tmp1 = new ArrayList<>();
		//ArrayList<String> tmp2 = new ArrayList<>();
		//ArrayList<String> tmp3 = new ArrayList<>();
		
		ArrayList<String> usr_arr[] = new ArrayList[] {new ArrayList<>(), new ArrayList<>(), new ArrayList<>()}; 

		for (int i=0 ; i<usr_arr.length ; i++) {
			System.out.println(">" + usr_arr[i]);
			//ArrayList<String> tmp = new ArrayList<>();
			ArrayList<String> tmp = usr_arr[i];
			tmp.add(i + "-1");
			tmp.add(i + "-2");
			tmp.add(i + "-3");
			
			usr_arr[i] = tmp;
		}
		
		// Ãâ·Â
		for (int i=0 ; i<usr_arr.length ; i++) {
			System.out.println("->" + usr_arr[i]);


		}
	}

}
