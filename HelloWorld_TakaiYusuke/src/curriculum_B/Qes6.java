package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes6 {

	public static void main(String[] args) {
		// scanインスタンス生成
		Scanner scan = new Scanner(System.in);
		
		// コンソールに入力された値を代入
		String line = scan.nextLine();
		// 入力された値を[、]で区切って配列に代入
		String values[] = line.split("、");
		// rndインスタンス生成
		Random rnd = new Random();
		// 0~11の値をランダムで取得し代入
		int index = rnd.nextInt(12);
		
		// 配列の長さ分ループ処理し値を代入
		for(String app: values) {
			// 値で条件指定
			switch(app) {
				// 値が"パソコン"なら下記の処理を実行
				case "パソコン":
					// 0~11の値をランダムで取得し再代入
					index = rnd.nextInt(12);
					// コンソールへ残り台数を出力
					System.out.println(app + "の残り台数は" + index +  "台です\n");
					// switch文を抜ける
					break;
					
				// 値が"冷蔵庫"なら下記の処理を実行
				case "冷蔵庫":
					// 0~11の値をランダムで取得し再代入
					index = rnd.nextInt(12);
					// コンソールへ残り台数を出力
					System.out.println(app + "の残り台数は" + index + "台です\n");
					// switch文を抜ける
					break;
					
				// 値が"扇風機"なら下記の処理を実行
				case "扇風機":
					// 0~11の値をランダムで取得し再代入
					index = rnd.nextInt(12);
					// コンソールへ残り台数を出力
					System.out.println(app + "の残り台数は" + index + "台です\n");
					// switch文を抜ける
					break;
					
				// 値が"洗濯機"なら下記の処理を実行
				case "洗濯機":
					// 0~11の値をランダムで取得し再代入
					index = rnd.nextInt(12);
					// コンソールへ残り台数を出力
					System.out.println(app + "の残り台数は" + index + "台です\n");
					// switch文を抜ける
					break;
					
				// 値が"加湿器"なら下記の処理を実行
				case "加湿器":
					// 0~11の値をランダムで取得し再代入
					index = rnd.nextInt(12);
					// コンソールへ残り台数を出力
					System.out.println(app + "の残り台数は" + index + "台です\n");
					// switch文を抜ける
					break;
					
				// 値が"テレビかディスプレイ"なら下記の処理を実行
				case "テレビ":
				case "ディスプレイ":
					// 値がテレビなら[index]値、ディスプレイなら11から[index]値を引いた数を代入
					int result = app.equals("テレビ") ? index: 11 - index;
					// コンソールへ残り台数を出力
					System.out.println(app + "の残り台数は" + result + "台です\n");
					// switch文を抜ける
					break;
					
				// 値が"その他"なら下記の処理を実行
				default:
					// コンソールへメッセージを出力
					System.out.println("『" + app +  "』" + "は指定の商品ではありません\n");
					// switch文を抜ける
					break;
			}
		}
	}
}