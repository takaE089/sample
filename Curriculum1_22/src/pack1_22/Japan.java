package pack1_22;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Japan {
	
	// 国名の変数を宣言
	private String countryName;
	// 食べ物の変数を宣言
	private String countryFood;
	// 食べ物の種類の変数を宣言
	private String foodType;
	// 日時の変数を宣言
	private String date;
	
	// コンストラクタを作成
	public Japan(String countryName) {
		// 変数に引数を代入
		this.countryName = countryName;
	}
	
	// コンストラクタを作成
	public Japan(String countryFood, String foodType) {
		// 変数に引数を代入
		this.countryFood = countryFood;
		// 変数に引数を代入
		this.foodType = foodType;
	}
	
	// コンストラクタを作成
	public Japan() {
		// インスタンス生成
		Date nowDate = new Date();
		// インスタンス生成
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd H:m:s");
		// 変数に現在の日時を代入
		date = sdf.format(nowDate);
	}
	
	// メソッドを作成
	public void displayCountry() {
		// コンソールへ出力
		System.out.println("こんにちは！ここは" + this.countryName + "です！");
	}
	
	// メソッドを作成
	public void displayFood() {
		// コンソールへ出力
		System.out.println("この" + this.countryFood + "はうまい");
		// コンソールへ出力
		System.out.println(this.countryFood + "は" + this.foodType + "です");
	}
	
	// メソッドを作成
	public void displayDate() {
		// コンソールへ出力
		System.out.println("今の現在日時は" + date + "です");
	}
	
}