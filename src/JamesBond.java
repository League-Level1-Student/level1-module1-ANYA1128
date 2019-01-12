
public class JamesBond {
	int findCode(Vault vvv) {

		for (int i = 0; i < 1000000; i++) {

			if (vvv.tryCode(i) == true) {
				return i;
			}
		}

		return -1;

	}
}
