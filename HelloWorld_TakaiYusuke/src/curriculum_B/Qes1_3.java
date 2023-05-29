package curriculum_B;

import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Qes1_3 {

	public static void main(String[] args) {
		
		// scanインスタンスを作成
		Scanner scan = new Scanner(System.in);
		
		// 入力された値を取得しnameに代入
		String name = scan.nextLine();
		
		// 入力された文字数が10文字より大きい場合処理
		if(name.length() > 10) {
			// [名前を10文字以内にしてください]を出力
			System.out.println("名前を10文字以内にしてください");
		}
		// 入力された文字数が0文字以下もしくはnullの場合処理
		else if(name.length() <= 0 || name == null) {
			// [名前を入力してください]を出力
			System.out.println("名前を入力してください");
		}
		// 入力された値が正常(文字数ok/半角英数字のみ)だった場合処理
		else if(Pattern.matches("^[A-Z a-z 0-9]+$", name)) {
			// [ユーザー名「入力値」を登録しました]を出力
			System.out.println("ユーザー名「" + name + "」を登録しました");
			
			// 配列にてじゃんけんの手を用意
			String janken[] = {"グー", "チョキ", "パー"};
			// 自分の出す手を[myHand]とし、変数宣言
			String myHand;
			// 相手の出す手を[enemyHand]とし、変数宣言
			String enemyHand;
			// じゃんけん回数を0とし初期化
			int i = 0;
			
			// 最低１回は処理行うため、[do-while文]にてループ処理
			do {
				// Randomインスタンス作成し変数[rnd]に代入
				Random rnd = new Random();
				// [janken.length]の範囲でランダムな数値を取得し変数[index]に代入
				int index = rnd.nextInt(janken.length);
				// ランダムに取得された自分の手を変数[myHand]に代入
				myHand = janken[index];
				// 自分の手と相手の手が同じになってしまうため、再度ランダムな値を[index]に代入
				index = rnd.nextInt(janken.length);
				// ランダムに取得された相手の手を変数[enemyHand]に代入
				enemyHand = janken[index];
				
				// 自分と相手の手をコンソールに出力
				System.out.println(name + "の手は「" + myHand + "」");
				System.out.println("相手の手は「" + enemyHand + "」\n");
				
				// 自分が勝った場合処理
				if(myHand == "グー" && enemyHand == "チョキ" || myHand == "チョキ" && enemyHand == "パー"|| myHand == "パー" && enemyHand == "グー") {
					// コンソールにメッセージ出力
					System.out.println("やるやん。\n次は俺にリベンジさせて\n");
				}
				// グーに負けた場合処理
				else if(myHand == "チョキ" && enemyHand == "グー") {
					// コンソールにメッセージ出力
					System.out.println("俺の勝ち！\n負けは次につながるチャンスです！\nネバーギブアップ\n");
				}
				// チョキに負けた場合処理
				else if(myHand == "パー" && enemyHand == "チョキ") {
					// コンソールにメッセージ出力
					System.out.println("俺の勝ち！\nたかがじゃんけん、そう思ってないですか？\nそれやったら次も、俺が勝ちますよ\n");
				}
				// パーに負けた場合処理
				else if(myHand == "グー" && enemyHand == "パー") {
					// コンソールにメッセージ出力
					System.out.println("俺の勝ち！\nなんで負けたか、明日まで考えといてください。\nそしたら何かが見えてくるはずです\n");
				}
				// あいこの場合処理
				else if(myHand == enemyHand) {
					// コンソールにメッセージ出力
					System.out.println("DRAW あいこ もう一回しましょう！\n");
				}
				
				// i(じゃんけん回数)に＋１する
				i++;
				
			// じゃんけんで負けた場合かあいこの場合はもう一度処理を実行
			} while(myHand == "チョキ" && enemyHand == "グー" || myHand == "パー" && enemyHand == "チョキ"|| myHand == "グー" && enemyHand == "パー" || myHand == enemyHand);
			
			// じゃんけんの合計回数をコンソールに出力
			System.out.println("勝つまでにかかった合計回数は" + i + "回です");
		}
		// 入力された値が半角英数字以外の場合出力
		else {
			// [半角英数字のみで名前を入力してください]を出力
			System.out.println("半角英数字のみで名前を入力してください");
		}
	}
}
