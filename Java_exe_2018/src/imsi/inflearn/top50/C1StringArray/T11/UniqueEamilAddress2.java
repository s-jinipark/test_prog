package imsi.inflearn.top50.C1StringArray.T11;

import java.util.*;

public class UniqueEamilAddress2 {
	
	public static void main(String[] args) {
		String[] emails = {"test.email+alex@leetcode.com",
				           "test.e.mail+bob.cathy@leetcode.com",
				           "testemail+david@lee.tcode.com"};
		
		UniqueEamilAddress2 a = new UniqueEamilAddress2();
		
		System.out.println(a.numUniqueEmails(emails));
		
		//System.out.println(numUniqueEmails_split(emails));
	}
	
	public int numUniqueEmails(String[] emails) {
		// 1 담을 그릇 , 중복을 피할려면 Set
		Set<String> set = new HashSet<>();
		
		// 2
		for (String email : emails) {
			String localName = makeLocalName(email);
			String domainName = makeDomainName(email);	
			set.add( localName +"@" + domainName );
		}
		return set.size();
	}

	private String makeLocalName(String email) {
		StringBuilder sb = new StringBuilder();
		for (int i=0; i < email.length(); i++) {
			// 1 err check
			if (email.charAt(i) == '.') {
				continue;
			}
			if (email.charAt(i) == '+') {
				break;
			}
			if (email.charAt(i) == '@') {
				break;
			}
			// 2 append
			String str = String.valueOf(email.charAt(i));
			sb.append(str);

		}
		return sb.toString();
	}
	
	
	public String makeDomainName(String email) {
		
		return email.substring(email.indexOf('@')+1); 
		// @ 는 필요 없어서 +1
    }


}
