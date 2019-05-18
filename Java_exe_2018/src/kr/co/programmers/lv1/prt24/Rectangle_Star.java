package kr.co.programmers.lv1.prt24;

public class Rectangle_Star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle_Star rs = new Rectangle_Star();

		int n = 5;	//가로의 길이
		int m = 3;  //세로의 길이
	    rs.solution( n , m );

	}

	public void solution(int n, int m) {
		for (int i =0 ; i< m ; i++) {
			for (int j =0 ; j< n ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
