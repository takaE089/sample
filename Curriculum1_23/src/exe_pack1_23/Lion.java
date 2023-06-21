package exe_pack1_23;

import pack1_23.AnimalData;

public class Lion {

	public static void main(String[] args) {
		/*
	 	
	 	下記がコンソールに出力されるように作成してください
	 	※thisとsetterとgetterとフィールドを使ってください
	 	
	  	動物名：ライオン
		体長：2.1m
		速度：80km/h
	 	
	 	*/
		
		// インスタンス生成
		AnimalData data = new AnimalData();
		
		// メソッドに引数を渡す
		data.setName("ライオン");
		// メソッド呼び出してコンソールへ出力
		System.out.println("動物名：" + data.getName());
		
		// メソッドに引数を渡す
		data.setBodyLength(2.1);
		// メソッド呼び出してコンソールへ出力
		System.out.println("体長：" + data.getBodyLength() + "m");
		
		// メソッドに引数を渡す
		data.setSpeed(80);
		// メソッド呼び出してコンソールへ出力
		System.out.println("速度：" + data.getSpeed() + "km/h");
	}

}