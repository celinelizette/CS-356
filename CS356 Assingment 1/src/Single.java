public class Single implements Question {
	private String q;
	private String ans1;
	private String ans2;

	public Single(String s, String string, String string2) {
		this.q = s;
		this.ans1 = string;
		this.ans2 = string2;
	}
	
	public String getQ(){
		return q;
	}
	public String getAns1(){
		return ans1;
	}
	public String getAns2(){
		return ans2;
	}

}
