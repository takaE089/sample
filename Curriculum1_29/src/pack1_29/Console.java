package pack1_29;

import java.util.Objects;
import java.util.Scanner;

public class Console {
	
	public String consoleScan() {
		// Scannerクラスをインスタンス化
		Scanner scan = new Scanner(System.in);
		
		// コンソール値を取得し代入
		String str = scan.nextLine();
		
		// 入力値がNullか0文字以下の場合繰り返す
		while(Objects.isNull(str) || str.length() <= 0) {
			// メッセージを出力
			System.out.println("値を入力してください");
			
			// コンソール値を取得し代入
			str = scan.nextLine();
			
		}
		
		// スキャンを閉じる
		scan.close();
		
		// 変数を返す
		return str;
	}
	
}