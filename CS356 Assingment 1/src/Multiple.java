public class Multiple implements Question {
	private String Q;
	private String ans1;
	private String ans2;
	private String ans3;
	private String ans4;
	
	public Multiple(String q, String a, String b, String c, String d) {
		this.Q = q;
		this.ans1 = a;
		this.ans2 = b;
		this.ans3 = c;
		this.ans4 = d;
		
	}
	
	public String getQ(){
		return Q;
	}
	public String getAns1(){
		return ans1;
	}
	public String getAns2(){
		return ans2;
	}
	public String getAns3(){
		return ans3;
	}
	public String getAns4(){
		return ans4;
	}

}
