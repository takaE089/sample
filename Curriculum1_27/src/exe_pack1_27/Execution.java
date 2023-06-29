package exe_pack1_27;

import java.util.Objects;
import java.util.Scanner;

import pack.Animal;

public class Execution {

	public static void main(String[] args) {
		/*
		 
	 	コンソールに下記が入力されたときにコンソール出力結果がコンソールに表示されるように作ってください
	 	ライオン:2.1:80,ゾウ:3.2:40,パンダ:1.9:30,チンパンジー:0.94:25,シマウマ:2.4:65,インコ:0.1:50
	  	
	  	コンソール出力結果
	  	
	  	コンソールに文字を入力してください
	  	動物名：ライオン
		体長：2.1m
		速度：80km/h
		学名：パンテラ レオ
		
		動物名：ゾウ
		体長：3.2m
		速度：40km/h
		学名：ロキソドンタ・サイクロティス
		
		動物名：パンダ
		体長：1.9m
		速度：30km/h
		学名：アイルロポダ・メラノレウカ
		
		動物名：チンパンジー
		体長：0.94m
		速度：25km/h
		学名：パン・トゥログロディテス
		
		動物名：シマウマ
		体長：2.4m
		速度：65km/h
		学名：チャップマンシマウマ
		
		動物名：インコ
		体長：0.1m
		速度：50km/h
		学名：不明
		
		*/
		
		// インスタンス生成
		Scanner scan = new Scanner(System.in);
		
		// コンソールへメッセージを出力
		System.out.println("コンソールに文字を入力してください");
		
		// コンソール入力値を取得し変数へ代入
		String str = scan.nextLine();
		// コンソール入力値を[,]で区切り配列へ代入
		String[] data = str.split(",");
		
		// Nullもしくは文字が入力されていない場合
		if(Objects.isNull(str) || str.length() <= 0) {
			// メッセージを出力
			System.out.println("文字が入力されていません");
			
		// Nullではない場合
		} else {
			// 配列の長さ分ループ処理
			for(int i = 0; i < data.length; i++) {
				// インスタンス生成
				Animal animalData = new Animal(data[i]);
				// メソッド呼び出し
				animalData.display();
				
			}
		}
		
		// スキャナを閉じる
		scan.close();
	}

}