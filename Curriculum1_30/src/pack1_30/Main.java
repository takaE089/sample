package pack1_30;

public class Main {

	public static void main(String[] args) {
		// インスタンス生成
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60);
		
		// メソッド呼び出し
		person1.print();
		
		// メソッド呼び出し
		Person.printCount();
		
	}

}
