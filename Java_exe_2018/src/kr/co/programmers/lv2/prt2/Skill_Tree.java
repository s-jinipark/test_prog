package kr.co.programmers.lv2.prt2;

public class Skill_Tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Skill_Tree st = new Skill_Tree();
		String skill = "CBD";
		String[]  skill_tree = {"BACDE", "CBADF", "AECB", "BDA"};
		
		int rtn1 = st.solution(skill, skill_tree);
		System.out.println("[1] > " + rtn1);
	}

	public int solution(String skill, String[] skill_trees) {
		int answer = 0;
        
        String[] tmp_tree = new String[skill_trees.length];
        
        for (int i = 0; i<skill_trees.length ; i++) {
        	String temp_s = skill_trees[i];
        	String temp_ss = "";
        	for (int j =0; j < temp_s.length() ; j++) {
        		char temp_c = temp_s.charAt(j);
        		if ( skill.contains(temp_c+"") )
        			temp_ss += temp_c+"";
        	}
        	tmp_tree[i] = temp_ss;
        }
        
        for (int i = 0; i < tmp_tree.length; i++ ) {
        	//System.out.println(">" + tmp_tree[i]);
        	//if ( skill.contains(tmp_tree[i]) )
        	if ( skill.startsWith(tmp_tree[i]) ) {
        		//System.out.println(">>" + tmp_tree[i]);
        		answer++;
        	}
        }
        
        return answer;
    }
    
}
