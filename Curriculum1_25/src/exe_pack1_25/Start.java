package exe_pack1_25;

import java.util.Objects;
import java.util.Scanner;

import pack1_25.MyStatus;

public class Start {

	public static void main(String[] args) {
		/*
		 
		 名前を入力したら下記がコンソールに出力されるように作ってください
			条件：数値は毎回変わるように作ってください
			 	 サブクラスを使用してください
				 スーパークラスを使用してください
				 getterとsetterを使用してください
				 packageを2つ作ってメインと処理を分けてください
				 命名する場合は規則にのっとってください
				 コンストラクタを使用してください

			こんにちは 「 名前 」 さん
			ステータス
			HP：849
			MP：862
			攻撃力：375
			素早さ：937
			防御力：24

			さあ冒険に出かけよう！
		 
		 */
		
		// インスタンス生成
		Scanner scan = new Scanner(System.in);
		// コンソール入力値を取得し変数に代入
		String name = scan.nextLine();
		
		// コンソール入力値がnullもしくは文字入力されていない場合
		if(Objects.isNull(name) || name.length() <= 0) {
			// コンソールにメッセージ表示
			System.out.println("名前を入力してください");
			
		// それ以外の場合
		} else {
			// インスタンス生成
			MyStatus ms = new MyStatus(name);
			// メソッド呼び出し
			ms.display();
		}
		
		// スキャナを閉じる
		scan.close();
	}

}
