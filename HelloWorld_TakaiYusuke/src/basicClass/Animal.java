package basicClass;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Animal {
	
	public static void main(String[] args) {
		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		// インスタンス生成
		Dog name = new Dog();
		// コンソールへ出力
		System.out.println(name.animalName);
		
		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		// インスタンス生成
		Dog num = new Dog(3);
		// コンソールへ出力
		System.out.println("動物の数は" + num.animalNum + "匹");
		
		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
		// インスタンス生成
		Date nowDate = new Date();
		// インスタンス生成
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd H:m:s");
		// 指定した表示形式の現在の日時を代入
		String formatNowDate = sdf.format(nowDate);
		// コンソールへ出力
		System.out.println(formatNowDate);
	}
}