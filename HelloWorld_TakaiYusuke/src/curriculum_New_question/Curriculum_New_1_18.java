package curriculum_New_question;

import java.util.Random;

public class Curriculum_New_1_18{
	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
	public static void hello(String str, int num) {
		// コンソールへ出力
		System.out.println(str + " " + num);
	}
	
	// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
	public static void math(int n1, int n2) {
		// コンソールへ出力
		System.out.println(n1 * n2);
	}
	
	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
	public static void displayArray(int[] array) {
		// 配列の長さ分ループ処理
		for(int i = 0; i < array.length; i++) {
			// コンソールへ出力
			System.out.println(array[i]);
		}
	}
	
	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
	public static void math(double d1, double d2) {
		// コンソールへ出力
		System.out.println(d1 + d2);
	}
		
	// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
	// ※0は出力＆格納しないようにしてください。
	public static int[] random(int num) {
		// 引数の値分の配列を宣言
		int index[] = new int[num];
		
		// 引数の値分ループ処理
		for(int i = 0; i < num; i++) {
			// インスタンス生成
			Random rdm = new Random();
			
			// 1~100までの値をランダムで代入
			index[i] = rdm.nextInt(100) + 1;
			
			// コンソールへ出力
			System.out.println(index[i]);
		}
		
		// 値を返す
		return index;
	}

	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。
	public static double displayAvg(int[] a) {
		// 変数を初期化
		int sum = 0;
		
		// 引数の長さ分ループ処理
		for(int i = 0; i < a.length; i++) {
			// 値を足して代入
			sum += a[i]; 
		}
		
		// 配列の平均値を代入
		double arrAvg = sum / a.length;
		
		// コンソールへ出力
		System.out.println(arrAvg);
		
		// 値を返す
		return arrAvg;
	}
	
	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください
	public static boolean displayBool(double d) {
		// 引数が50以上かどうかの真偽値を代入
		boolean bool = d >= 50;
		
		// コンソールへ出力
		System.out.println(bool);
		
		// 値を返す
		return bool;
	}

	public static void main(String[] args) {
    // 作成したメソッドをここで呼び出してください
		// Q1：メソッド呼び出し
		hello("Hello Java", 11);
		
		// Q2：メソッド呼び出し
		math(10, 10);
		
		// Q3：配列初期化
		int[] arr = {1, 2, 3, 4, 5};
		// Q3：メソッド呼び出し
		displayArray(arr);
		
		// Q4：メソッド呼び出し
		math(3.14, 3.14);
		
		// Q5：メソッド呼び出し代入
		int[] ranArr = random(3);
		
		// Q6：メソッド呼び出し代入
		double avg = displayAvg(ranArr);
		
		// Q7；メソッド呼び出し
		displayBool(avg);
	}
}