public class BigSib {
	private String helloMsg;
	public BigSib() {
		helloMsg = "Word up";
	}
	private void setHelloMsg(String msg) {
		helloMsg = msg;
	}
	public String greet(String name) {
		return helloMsg + " " + name;
	}
}
