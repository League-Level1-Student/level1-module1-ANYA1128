
public class Vault {
	int code;

	public static void main(String[] args) {

		Vault vvv = new Vault(56789);
		JamesBond hi = new JamesBond();
		System.out.println(hi.findCode(vvv));

	}

	public Vault(int code) {
		this.code = code;
	}

	public boolean tryCode(int guess) {
		if (guess == code) {
			return true;
		} else {
			return false;
		}
	}
}
