package kr.co.infopub.chapter.s056;
import java.util.ArrayList;
import java.util.List;
// �迭���� ���� List
public class LottoList {
	public static void main(String[] args) {
		List<Integer> ilist=new ArrayList<>();
		// �ֱ�
		for (int i = 1; i <= 10; i++) {
			ilist.add(i);
		}
		// ��������
		for(int i=0; i< ilist.size() ;i++){
			int m=ilist.get(i);
			System.out.printf("%d\t",m);
		}
		System.out.println();
	}
}