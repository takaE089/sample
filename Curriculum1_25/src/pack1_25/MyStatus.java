package pack1_25;

public class MyStatus extends Status {
	
	// コンストラクタを作成
	public MyStatus(String name) {
		// コンストラクタを呼び出し
		super();
		// セッターメソッドに引数を渡す
		super.setName(name);
	}
	
	// メソッドを作成
	public void display() {
		// コンソールへメッセージを出力
		System.out.println("こんにちは「 " + super.getName() + " 」さん");
		// コンソールへステータス値を出力
		System.out.println("ステータス\n"
							+ "HP：" + hp + "\n"
							+ "MP：" + mp + "\n"
							+ "攻撃力：" + att + "\n"
							+ "素早さ：" + spe + "\n"
							+ "防御力：" + def + "\n");
		// コンソールへメッセージを出力
		System.out.println("さあ冒険に出かけよう!");
	}
	
}