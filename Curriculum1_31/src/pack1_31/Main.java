package pack1_31;

public class Main {

	public static void main(String[] args) {
		// インスタンス生成
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60);
		
		// メソッド呼び出し
		// person1.print();
		
		// インスタンス生成
		Person person2 = new Person("山田花子", 22, 1.5, 40);
		
		// メソッド呼び出し
		// person1.print(); 
		
		// メソッド呼び出し
		// Person.printCount();
		
		// インスタンス生成
		Car car = new Car();
		
		// インスタンス生成
		Bicycle bicycle = new Bicycle();
		
		// person1の名前をセット
		// car.setOwner(person1.getName());
		
		// person2の名前をセット
		// bicycle.setOwner(person2.getName());
		
		// コンソールへ出力
		// System.out.println(car.getOwner());
		
		// コンソールへ出力
		// System.out.println(bicycle.getOwner());
		
		// メソッド呼び出し
		person1.buy(car);
		
		// メソッド呼び出し
		person2.buy(bicycle);
	}

}