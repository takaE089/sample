package pack1_31;

public class Person {
	// インスタンスフィールドを定義
	// 名前の変数を宣言
	private String name;
	// 歳の変数を宣言
	private int age;
	// 身長の変数を宣言
	private double height;
	// 体重の変数を宣言
	private double weight;
	// 入力回数の変数を宣言
	private static int count;
	
	// コンストラクタを定義しインスタンスフィールドに値をセット
	public Person(String name, int age, double height, double weight) {
		// 引数を変数に代入
		this.name = name;
		// 引数を変数に代入
		this.age = age;
		// 引数を変数に代入
		this.height = height;
		// 引数を変数に代入
		this.weight = weight;
		
		// カウントをインクリメント
		count++;
		
	}
	
	// メソッドを定義
	public double bmi() {
		// bmi値を計算し変数に代入
		double bmi = Math.floor(weight / (height * height));
		// 値を返す
		return bmi;
		
	}
	
	// メソッドを定義
	public void print() {
		// コンソールに出力
		System.out.println("名前は" + this.name + "です");
		// コンソールに出力
		System.out.println("年は" + this.age + "才です");
		// コンソールに出力
		System.out.println("BMIは" + this.bmi() + "です");
		
	}
	
	// メソッドを定義
	public static void printCount() {
		// コンソールに出力
		System.out.println("合計" + count + "人です");
		
	}
	
	// メソッドを定義
	public String getName() {
		// 値を返す
		return name;
		
	}
	
	// メソッドを定義
	public void buy(Car car) {
		// person1の名前をセット
		car.setOwner(this.getName());
		// コンソールへ出力
		System.out.println(car.getOwner() + "が購入しました");
		
	}
	
	// メソッドを定義
	public void buy(Bicycle bicycle) {
		// person2の名前をセット
		bicycle.setOwner(this.getName());
		// コンソールへ出力
		System.out.println(bicycle.getOwner() + "が購入しました");
		
	}
	
}