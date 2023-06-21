package pack1_23;

public class AnimalData {

	// 動物名の変数を宣言
	private String name;
	// 体長の変数を宣言
	private Double bodyLength;
	// 速度の変数を宣言
	private int speed;
	
	// セッターメソッドを作成
	public void setName(String name) {
		// 変数に引数を代入
		this.name = name;
	}
	
	// ゲッターメソッドを作成
	public String getName() {
		// 変数を返す
		return this.name;
	}
	
	// セッターメソッドを作成
	public void setBodyLength(Double bodyLength) {
		// 変数に引数を代入
		this.bodyLength = bodyLength;
	}
	
	// ゲッターメソッドを作成
	public Double getBodyLength() {
		// 変数を返す
		return this.bodyLength;
	}
	
	// セッターメソッドを作成
	public void setSpeed(int speed) {
		// 変数に引数を代入
		this.speed = speed;
	}
	
	// ゲッターメソッドを作成
	public int getSpeed() {
		// 変数を返す
		return this.speed;
	}
	
}