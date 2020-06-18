package imsi.inflearn.top50.C1StringArray.T15;

import java.util.*;

public class FindAllAnagrams2 {

	public static void main(String args[])
    {
		FindAllAnagrams2 a = new FindAllAnagrams2();
        String txt = "BACDGABCDA";
        String pat = "ABCD";
        System.out.println(a.findAnagrams(txt, pat));
    }


 public List<Integer> findAnagrams(String txt, String pat) {
	 
	 List<Integer> result = new ArrayList<>();
	 
	 // 우선 배열에 저장
	 char[] txt_c = txt.toCharArray();
	 char[] pat_c = pat.toCharArray();
	 
	 for (int i=0; i<txt_c.length-pat_c.length+1 ; i++) {
		 
		 //System.out.println(">" + i);
		 int cnt = 0;
		 // pat 갯수 만큼. loop
		 for (int j=i ; j<i+pat_c.length ; j++) {
			 for (int k=0 ; k< pat_c.length ; k++) {
				 if (txt_c[j] == pat_c[k] ) cnt++;
 			 }
		 }
		 if (cnt == pat_c.length) {
			 result.add(i);
		 }
		 
	 }
	 
	return result;
  }

	 
	 
	 
}
