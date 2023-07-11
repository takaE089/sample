package pack1_29;

public class Display {
	
	public void display(String data) {
		// 引数を[:]で分割し配列へ代入
		String[] sData = data.split(":");
		
		// コンソールへ出力
		System.out.println("都道府県名：" + sData[0]);
		// コンソールへ出力
		System.out.println("県庁所在地：" + sData[1]);
		// コンソールへ出力
		System.out.println("面積：" + sData[2] + "km2\n");
		
	}

}