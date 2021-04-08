import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TestFiles {

	public static void main(String[] args) throws IOException {
		BufferedReader br = null;
//		BufferedWriter bw = null;
//		Random rnd = new Random(100);
//		try {
//			bw = new BufferedWriter(new FileWriter(new File("bigData.txt")));
//			for (int i = 0; i < 1000; i++) {
//				String rndNum = String.format("%s\n", String.valueOf(rnd.nextInt(100)));
//				bw.write(rndNum);
//			}
//		} catch (IOException e) {
//			System.out.println();
//			e.printStackTrace();
//		}
//		if (bw != null) {
//			bw.close();
//		}

		FileReader fr = new FileReader("bigData.txt");
		br = new BufferedReader(fr);
		String num = null;
		int count = 0;
		while ((num = br.readLine()) != null) {
			if (count % 10 == 0 && count > 0) {
				System.out.println();
			}
			System.out.print(String.format("%-4s", num));
			count++;
		}
		if (br != null) {
			br.close();
		}
	}

}
