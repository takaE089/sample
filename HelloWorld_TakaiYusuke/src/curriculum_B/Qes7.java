package curriculum_B;

import java.util.Scanner;

public class Qes7 {

	public static void main(String[] args) {
		// scanインスタンス生成
		Scanner scan = new Scanner(System.in);
		
		// [生徒の人数を入力してください(2以上)；]とコンソールへ出力
		System.out.print("生徒の人数を入力してください(2以上)：");
		
		// コンソールへ入力された値を取得し変数[x]へ代入
		int x = scan.nextInt();
		// [x]行、4列の配列[table]を宣言
		int table[][] = new int [x] [4];
		// [x]列の、配列[sum]を宣言
		double sum[] = new double [x];
		// 変数[eigo]を初期化
		double eigo = 0;
		// 変数[sugaku]を初期化
		double sugaku = 0;
		// 変数[rika]を初期化
		double rika = 0;
		// 変数[shakai]を初期化
		double shakai = 0;
		// 変数[avg]を宣言
		double avg;
		
		// 入力された人数が2人以上の場合実行
		if(x >= 2) {
			// 人数分ループ処理
			for(int i = 0; i < x; i++) {
				// 英語の点数の入力文をコンソールへ出力
				System.out.print((i + 1) + "人目の『英語』の点数を入力してください：");
				// 入力された値を配列[table]に代入
				table[i][0] = scan.nextInt();
				
				// 数学の点数の入力文をコンソールへ出力
				System.out.print((i + 1) + "人目の『数学』の点数を入力してください：");
				// 入力された値を配列[table]に代入
				table[i][1] = scan.nextInt();
				
				// 理科の点数の入力文をコンソールへ出力
				System.out.print((i + 1) + "人目の『理科』の点数を入力してください：");
				// 入力された値を配列[table]に代入
				table[i][2] = scan.nextInt();
				
				// 社会の点数の入力文をコンソールへ出力
				System.out.print((i + 1) + "人目の『社会』の点数を入力してください：");
				// 入力された値を配列[table]に代入
				table[i][3] = scan.nextInt();
				
				// 改行処理
				System.out.println();
				
				// 教科の数(４回)だけループ処理
				for(int j = 0; j < 4; j++) {
					// 全教科の合計点を配列[sum]に代入
					sum[i] += table[i][j];
				}
				
				// 全員の英語の合計点を変数[eigo]に代入
				eigo += table[i][0];
				// 全員の数学の合計点を変数[sugaku]に代入
				sugaku += table[i][1];
				// 全員の理科の合計点を変数[rika]に代入
				rika += table[i][2];
				// 全員の社会の合計点を変数[shakai]に代入
				shakai += table[i][3];
			}
			
			// 人数分ループ処理
			for(int k = 0; k < x; k++) {
				// 一人あたりの平均点を出し、変数[avg]に代入
				avg = sum[k] / 4;
				// 平均点を表示させるメッセージをコンソールへ出力
				System.out.println((k + 1) + "人目の平均点は" + String.format("%.2f", avg) + "点です。");
			}
			
			//改行処理
			System.out.println();
			// 全体の英語の平均点を小数点第二位までコンソールへ出力
			System.out.println("英語の平均点は" + String.format("%.2f", eigo / x) + "点です。");
			// 全体の数学の平均点を小数点第二位までコンソールへ出力
			System.out.println("数学の平均点は" + String.format("%.2f", sugaku / x) + "点です。");
			// 全体の理科の平均点を小数点第二位までコンソールへ出力
			System.out.println("理科の平均点は" + String.format("%.2f", rika / x) + "点です。");
			// 全体の社会の平均点を小数点第二位までコンソールへ出力
			System.out.println("社会の平均点は" + String.format("%.2f", shakai / x) + "点です。");
			// 全体の全教科の平均点を小数点第二位までコンソールへ出力
			System.out.println("全体の平均点は" + String.format("%.2f", (eigo + sugaku + rika + shakai) / (x * 4)) + "点です。");
		}
	}
}
