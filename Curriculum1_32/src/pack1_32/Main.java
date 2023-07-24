package pack1_32;

public class Main {

	public static void main(String[] args) {
		// インスタンス生成
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60);
		// メソッド呼び出し
		person1.print();
		
		// インスタンス生成
		Person person2 = new Person("山田花子", 22, 1.5, 40);
		// メソッド呼び出し
		person2.print(); 
		
		// 合計人数をコンソールに出力
		System.out.println("合計" + Person.count + "人です");
		
		// メソッド呼び出し
		Person.printCount();
		
	}

}