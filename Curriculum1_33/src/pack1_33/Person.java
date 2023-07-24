package pack1_33;

public class Person {
	// インスタンスフィールドを定義
	// 入力回数の変数を宣言
	public static int count = 0;
	// 名前の変数を宣言
	public String firstName;
	// 苗字の変数を宣言
	public String lastName;
	// 歳の変数を宣言
	public int age;
	// 身長の変数を宣言
	public double height;
	// 体重の変数を宣言
	public double weight;
	
	// コンストラクタを定義
	public Person(String firstName, int age, double height, double weight) {
		// カウントをインクリメント
		Person.count++;
		
		// 引数を変数に代入
		this.firstName = firstName;
		// 引数を変数に代入
		this.age = age;
		// 引数を変数に代入
		this.height = height;
		// 引数を変数に代入
		this.weight = weight;
		
	}
	
	// コンストラクタを定義(オーバーロード)
	public Person(String firstName, String lastName, int age, double height, double weight) {
		// カウントをインクリメント
		Person.count++;
		
		// 引数を変数に代入
		this.firstName = firstName;
		// 引数を変数に代入
		this.lastName = lastName;
		// 引数を変数に代入
		this.age = age;
		// 引数を変数に代入
		this.height = height;
		// 引数を変数に代入
		this.weight = weight;
		
	}
	
	// メソッドを定義
	public String fullName() {
		// 値を返す
		return this.firstName + this.lastName;
		
	}
	
	// メソッドを定義
	public void print() {
		// コンソールに出力
		System.out.println("名前は" + this.fullName() + "です");
		// コンソールに出力
		System.out.println("年は" + this.age + "才です");
		
	}
	
	// メソッドを定義
	public double bmi() {
		// bmi値を計算し変数に代入
		double bmi = Math.floor(weight / (height * height));
		// 値を返す
		return bmi;
		
	}
	
	// メソッドを定義
	public static void printCount() {
		// コンソールに出力
		System.out.println("合計" + count + "人です");
		
	}
	
}