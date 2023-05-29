package curriculum_B;

public class Qes4 {

	public static void main(String[] args) {
		// [課題4]をコンソールに出力
		System.out.println("課題4");
		// iの値が9以下の時ループ処理
		for(int i = 1; i <= 9; i++) {
			// iの値が変わる毎に改行する
			System.out.println();
			// jの値が9以下の時ループ処理
			for(int j = 1; j <= 9; j++) {
				// [i * j = (i * j)]の値を二桁表示でコンソールに出力
				System.out.print(String.format("%02d", i) + " * " + String.format("%02d", j) + " = " + String.format("%02d", (i * j)));
				// 式の間に[ || ]を入れる
				if(j <= 8) {
					System.out.print(" || ");
				}
			}
		}

	}

}
