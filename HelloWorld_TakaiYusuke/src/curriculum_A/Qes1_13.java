package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		/******************************************
		 * [概要]Qes1_ローカル変数宣言　Qes2_変数初期化
		 ******************************************/
		
		// バイト型の変数宣言
		byte b = 0;
		
		// 短整数型の変数宣言
		short s = 0;
		
		// 整数型の変数宣言
		int i = 0;
		
		// 長整数型の変数宣言
		long l = 0;
		
		// 単精度浮動小数点型の変数宣言
		float f = 0.0f;
		
		// 倍精度浮動小数点型の変数宣言
		double d = 0.0;
		
		// 文字型の変数宣言
		char c = '\u0000';
		
		// 文字列型の変数宣言
		String str = null;
		
		// ブーリアン型の変数宣言
		boolean is = false;
		
		
		/***********************
		 * [概要]Qes3_変数へ値代入
		 ***********************/
		
		// バイト型に10を代入
		b = 10;
		
		// 短整数型に100を代入
		s = 100;
		
		// 整数型に1000を代入
		i = 1000;
		
		// 長整数型に10000を代入
		l = 10000;
		
		// 単精度浮動小数点数型に9.5を代入
		f = 9.5f;
		
		// 倍精度浮動小数点数型に10.5を代入
		d = 10.5;
		
		// 文字型にaを代入
		c = 'a';
		
		// 文字列型にハローを代入
		str = "ハロー";
		
		// ブーリアン型にtrueを代入
		is = true;
		
		
		/*************************
		 * [概要]Qes4_コンソール出力
		 *************************/
		
		// 11110をコンソールに出力
		System.out.println(b + s + i + l);
		
		// 20をコンソールに出力
		System.out.println(Math.round(f + d));
		
		// aハローtrueをコンソールに出力
		System.out.println(c + str + is);
		
		// 11130をコンソールに出力
		System.out.println(Math.round(b + s + i + l + f + d));
		
		// 10000000000をコンソールに出力
		System.out.println(b * s * i * l);
		
		// 0.105をコンソールに出力
		System.out.println(d / s);
		
		// -90をコンソールに出力
		System.out.println(b - s);
		
		
		/*************************
		 * [概要]Qes5_プログラム修正
		 *************************/
		
		// ハローJAVA43をコンソールに出力
		int num = 20;
		int num1 = 23;
		System.out.println("ハローJAVA" + (num + num1));
		
		
		/*************************
		 * [概要]Qes6_人物情報の出力
		 *************************/
		
		// 人物情報を変数指定
		String name = "山田太郎";
		int age = 18;
		double height = 170.5;
		double weight = 62.2;
		String food = "寿司";
		
		// [初めまして山田太郎です]をコンソールに出力
		System.out.println("初めまして" + name + "です");
		
		// [年齢は18際です]をコンソールに出力
		System.out.println("年齢は" + age + "歳です");
		
		// [身長は170.5cmです]をコンソールに出力
		System.out.println("身長は" + height + "cmです");
		
		// [体重は62.2kgです]をコンソールに出力
		System.out.println("体重は" + weight + "kgです");
		
		// [好きな食べ物は寿司です]をコンソールに出力
		System.out.println("好きな食べ物は" + food + "です");
		
		
		/******************************
		 * [概要]Qes7_BMIのコンソール出力
		 ******************************/
		
		// BMIを計算し変数宣言
		double bmi = weight / ((height / 100) * (height / 100));
		
		// BMIを小数点第二位で四捨五入
		bmi = ((double)Math.round(bmi * 10)) / 10;
		
		// [BMIは〇〇です]をコンソールに出力
		System.out.println("BMIは" + bmi + "です");
		
		
		/****************************
		 * [概要]Qes8_変数の再代入と出力
		 ****************************/
		
		// 人物情報の変数を再代入
		name = "鈴木一郎";
		age = 24;
		height = 168.5;
		weight = 64.2;
		food = "オムライス";
		
		// [初めまして鈴木一郎です]をコンソールに出力
		System.out.println("初めまして" + name + "です");
		
		// [年齢は24歳です]をコンソールに出力
		System.out.println("年齢は" + age + "歳です");
		
		// [身長は168.5cmです]をコンソールに出力
		System.out.println("身長は" + height + "cmです");
		
		// [体重は64.2kg]をコンソールに出力
		System.out.println("体重は" + weight + "kgです");
		
		// [好きな食べ物はオムライスです]をコンソールに出力
		System.out.println("好きな食べ物は" + food + "です");
		
		// BMIの再計算
		bmi = weight / ((height / 100) * (height / 100));
		
		// BMIを小数点第二位で四捨五入
		bmi = ((double)Math.round(bmi * 10)) / 10;

		// [BMIは22.6です]をコンソールに出力
		System.out.println("BMIは" + bmi + "です");
		
		
		/**************************************
		 * [概要]Qes9_和算で自己代入しコンソール出力
		 **************************************/
		
		// [年齢・身長・体重]の数値を和算で自己代入
		age += age;
		height += height;
		weight += weight;
		
		// [初めまして鈴木一郎です]をコンソールに出力
		System.out.println("初めまして" + name + "です");
		
		// [年齢は48歳です]をコンソールに出力
		System.out.println("年齢" + age + "歳です");
		
		// [身長は337.0cmです]をコンソールに出力
		System.out.println("身長は" + height + "cmです");
		
		// [体重は128.4kgです]をコンソールに出力
		System.out.println("体重は" + weight + "kgです");
		
		// [好きな食べ物はオムライスです]をコンソールに出力
		System.out.println("好きな食べ物は" + food + "です");
		
		// BMIの再計算
		bmi = weight / ((height / 100) * (height / 100));
		
		// BMIを小数点第三位で四捨五入
		bmi = ((double)Math.round(bmi * 100)) / 100;
		
		// [BMIは11.31です]をコンソールに出力
		System.out.println("BMIは" + bmi + "です");
		
		
		/*********************
		 * [概要]Qes10_条件演算子
		 *********************/
		
		// 問8の[年齢・身長・体重]を再代入
		age = 24;
		height = 168.5;
		weight = 64.2;
		
		// 年齢が25歳以上ならコンソールにtrueを出力
		String result = age >= 25 ? "true" : "false";
		System.out.println(result);
		
		
		/**************************
		 * [概要]Qes11_文字列型へ変換
		 **************************/
		
		// [年齢・身長・体重]を文字列に型変換
		String strAge = String.valueOf(age);
		String strHeight = String.valueOf(height);
		String strWeight = String.valueOf(weight);
		
		// [年齢・身長・体重]を繋げてコンソールへ出力
		System.out.println(strAge + strHeight + strWeight);
		
		
		/**************************
		 * [概要]Qes12_整数型へ変換
		 **************************/
		
		// [年齢]を文字列身から整数型に変換
		age = Integer.parseInt(strAge);
		
		// [身長]を文字列から小数型に変換
		height = Double.parseDouble(strHeight);
		
		// [身長]を小数型から整数型に変換
		int iHeight = (int)Math.round(height);
		
		// 整数型に変換した[年齢・身長]をコンソールに出力
		System.out.println(age);
		System.out.println(iHeight);
		
		
		/***********************
		 * [概要]Qes13_条件演算子
		 ***********************/
		
		// [年齢が25もしくは身長が160以上]であればtrueを出力
		result = age == 25 || iHeight >= 160 ? "true" : "false";
		System.out.println(result);

	}

}
