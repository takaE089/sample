package pack1_29;

import java.util.Arrays;
import java.util.Collections;

public class Prefectures {
	
	// 配列を初期化
	String[] pre = {"北海道:札幌市:83424",
					"青森県:青森市:9646",
					"岩手県:盛岡市:15275",
					"宮城県:仙台市:7282",
					"秋田県:秋田市:11638",
					"山形県:山形市:9323",
					"福島県:福島市:13784",
					"茨城県:水戸市:6097",
					"栃木県:宇都宮市:6408",
					"群馬県:前橋市:6362",
					"埼玉県:さいたま市:3798"};
	
	// メソッド作成
	public void preSplit(String str) {
		// 引数値を[,]で分割し配列に代入
		String[] split = str.split(",");
		// 昇順、降順判定用の変数を初期化
		int check = 0;
		
		// 配列の長さ分ループ処理
		for(int i = 0; i < split.length; i++) {
			// 値が昇順の時
			if(split[i].equals("昇順")) {
				// 変数に1を代入
				check = 1;
				
			}
			// 値が降順の時
			else if(split[i].equals("降順")) {
				// 変数に2を代入
				check = 2;
				
			}
		}
		
		// 変数の値が１(昇順)の時
		if(check == 1) {
			// 昇順にソート
			Arrays.sort(split);
			
			// 昇順の値を抜いた配列の長さ分ループ処理
			for(int j = 0; j < split.length - 1; j++) {
				// Displayクラスをインスタンス化
				Display dis = new Display();
				
				// String型からInt型に変換
				int num = Integer.parseInt(split[j]);
				
				// 引数渡しメソッド実行
				dis.display(pre[num]);
				
			}
		} 
		// 変数の値が２(降順)の時
		else if(check == 2) {
			// 降順にソート
			Arrays.sort(split, Collections.reverseOrder());
			
			// 降順の値を抜いた配列の長さ分ループ処理
			for(int j = 1; j < split.length; j++) {
				// Displayクラスをインスタンス化
				Display dis = new Display();
				
				// String型からInt型に変換
				int num = Integer.parseInt(split[j]);
				
				// 引数を渡しメソッド実行
				dis.display(pre[num]);
				
			}
		}
	}
	
}