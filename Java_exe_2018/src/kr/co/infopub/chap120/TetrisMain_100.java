package kr.co.infopub.chap120;

public class TetrisMain_100 {

	public static void main(String[] args) {
		
		int [][] tet = {
				{1,1,1,0},{0,0,1,0},{0,0,1,0},{0,0,1,0}};
		
		printTetris(tet);
		
		// left 謝難 90紫
		turnLeft(tet);
		printTetris(tet);
		
		int[][] res = new int[4][4];
		// right 辦難 90紫
		for (int i=0; i<tet.length; i++){
			for (int j=0; j<tet[i].length; j++){
				res[j][tet.length-1-i] = tet[i][j];
				//System.out.println(">" + tet[i][j]);
			}
		}
		printTetris(res);
		
		int[][] res2 = new int[4][4];
		// left 謝難 90紫
		for (int i=0; i<res.length; i++){
			for (int j=0; j<res[i].length; j++){
				res2[res.length-1-j][i] = res[i][j];
				//System.out.println(">" + tet[i][j]);
			}
		}
		printTetris(res2);
		
		
		int[][] res3 = turnLeft2(res2);
		printTetris(res3);
	}
	
	public static void printTetris(int[][] tetris){
		int m=tetris.length;
		int n=tetris[0].length;
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				System.out.print(tetris[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("========================");
	}//
	
	public static void turnLeft(int[][] tetris){
		int temp=tetris[3][0];
		tetris[3][0]=tetris[0][0];
		tetris[0][0]=tetris[0][3];
		tetris[0][3]=tetris[3][3];
		tetris[3][3]=temp;
		temp=tetris[1][0];
		tetris[1][0]=tetris[0][2];
		tetris[0][2]=tetris[2][3];
		tetris[2][3]=tetris[3][1];
		tetris[3][1]=temp;
		temp=tetris[2][0];
		tetris[2][0]=tetris[0][1];
		tetris[0][1]=tetris[1][3];
		tetris[1][3]=tetris[3][2];
		tetris[3][2]=temp;
		temp=tetris[1][1];
		tetris[1][1]=tetris[1][2];
		tetris[1][2]=tetris[2][2];
		tetris[2][2]=tetris[2][1];
		tetris[2][1]=temp;
	}
	
	public static int[][] turnLeft2(int[][] tetris){
		int[][] res2 = new int[4][4];
		// left 謝難 90紫
		for (int i=0; i<tetris.length; i++){
			for (int j=0; j<tetris[i].length; j++){
				res2[tetris.length-1-j][i] = tetris[i][j];
			}
		}
		return res2;
	}
}
