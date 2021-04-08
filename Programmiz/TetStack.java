import java.util.ArrayDeque;

public class TetStack {
	public static void main(String[] args) {
		ArrayDeque<Integer> st = new ArrayDeque<>();
		for (int i = 0; i < 10; i++) {
			st.add(i);
		}

		System.out.println(st.toString());

	}
}
