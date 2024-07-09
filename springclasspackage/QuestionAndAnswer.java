package springclasspackage;

import java.util.List;

public class QuestionAndAnswer {
	
	private String qid,qname;
	private List<String> ans;

	public String getQid() {
		return qid;
	}
	public void setQid(String qid) {
		this.qid = qid;
	}
	public String getQname() {
		return qname;
	}
	public void setQname(String qname) {
		this.qname = qname;
	}
	public List<String> getAns() {
		return ans;
	}
	public void setAns(List<String> ans) {
		this.ans = ans;
	}
}
