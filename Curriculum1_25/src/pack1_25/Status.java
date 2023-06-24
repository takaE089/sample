package pack1_25;

import java.util.Random;

public class Status {
	
	// 名前の変数を宣言
	private String name;
	// HPの変数を宣言
	protected int hp;
	// MPの変数を宣言
	protected int mp;
	// 攻撃力の変数を宣言
	protected int att;
	// 素早さの変数を宣言
	protected int spe;
	// 防御力の変数を宣言
	protected int def;
	
	// コンストラクタを作成
	public Status() {
		// インスタンス生成
		Random rnd = new Random();
		
		// 1~999のランダムな値を代入
		hp = rnd.nextInt(999) + 1;
		// 1~999のランダムな値を代入
		mp = rnd.nextInt(999) + 1;
		// 1~999のランダムな値を代入
		att = rnd.nextInt(999) + 1;
		// 1~999のランダムな値を代入
		spe = rnd.nextInt(999) + 1;
		// 1~999のランダムな値を代入
		def = rnd.nextInt(999) + 1;
	}
	
	// セッターメソッドを作成
	public void setName(String name) {
		// 引数を代入
		this.name = name;
	}
	
	// ゲッターメソッドを作成
	public String getName() {
		// 変数の値を返す
		return this.name;
	}
	
}