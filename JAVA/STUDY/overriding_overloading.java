Programming/Java
[Java]오버로딩 & 오버라이딩(Overloading & Overriding)
heyhyo 2018. 7. 12. 09:07
오버로딩(Overloading)





오버로딩(Overloading)이라는 뜻은 사전적으로 '과적하다.'라는 뜻이다. C언어에서는 함수명이 고유하게 존재해야 한다. 즉 하나의 함수가 하나의 기능만을 구현해야 한다는 것이다. 하지만 자바에서는 하나의 메소드 이름으로 여러 기능을 구현하기 때문에 '과적하다.'라는 뜻의 이름을 붙여준 것으로 보인다.



오버로딩의 정의는 자바의 한 클래스 내에 이미 사용하려는 이름과 같은 이름을 가진 메소드가 있더라도 매개변수의 개수 또는 타입이 다르면, 같은 이름을 사용해서 메소드를 정의할 수 있다.





오버로딩의 조건





메소드의 이름이 같고, 매개변수의 개수나 타입이 달라야 한다. 주의할 점은 '리턴 값만' 다른 것은 오버로딩을 할 수 없다는 것이다.



아래의 코드를 통해서 예를 들어보자.



<코드>

class OverloadingTest {

	public static void main(String[] args) {
		OverloadingMethods om = new OverloadingMethods();

		om.print();
		System.out.println(om.print(3));
		om.print("Hello!");
		System.out.println(om.print(4, 5));
	}
}

class OverloadingMethods {
	public void print() {
		System.out.println("오버로딩1");
	}

	String print(Integer a) {
		System.out.println("오버로딩2");
		return a.toString();
	}

	void print(String a) {
		System.out.println("오버로딩3");
		System.out.println(a);
	}

	String print(Integer a, Integer b) {
		System.out.println("오버로딩4");
		return a.toString() + b.toString();
	}

}




<결과>

오버로딩1
오버로딩2
3
오버로딩3
Hello!
오버로딩4
45


위 코드는 아무런 문제없이 잘 실행되고 있다. print라는 같은 이름을 가진 네개의 메소드가 매개변수의 개수와 타입를 다르게 지정하여 지정하는 것이 가능하다는 것을 보여주고 있다.



단, 여기서 한번 더 강조할 점은 '리턴 값'만 다르게 지정하는 것은 오버로딩할 수 없다는 것이다.



또한 접근 제어자도 자유롭게 지정해 줄 수 있다. 각 메소드의 접근 제어자를 public, default, protected, private으로 다르게 지정해줘도 상관없다는 것이다. 접근 제어자만 다르게한다고 오버로딩이 가능하지 않다는 것도 알아두자.



결국 오버로딩은 매개변수의 차이로만 구현할 수 있다는 것이다. 매개변수가 다르다면 리턴 값은 다르게 지정할 수 있다.





오버로딩을 사용하는 이유





1. 같은 기능을 하는 메소드를 하나의 이름으로 사용할 수 있다.



우리가 흔히 콘솔창에 텍스트를 출력할 때 사용하는 println라는 메소드를 대표적인 예로 들어볼 수 있다. 실은 이 함수가 오버로딩의 결정체이다. 우리는 println의 인자 값으로 int, double, boolean, String 등의 아주 다양한 타입의 매개변수들을 집어넣어도 우리는 그 함수들이 어떻게 실행되지는 모르지만 콘솔창에 아주 잘 출력해주는 것을 볼 수 있다.



이렇게 '출력하다.'라는 같은 기능을 가진 메소드들를 println이라는 하나의 이름으로 정의가 가능한 것이다.



2. 메소드의 이름을 절약할 수 있다.



이 위에서 예로 들었던 println을 생각해보자. 이 메소드를 매개변수의 종류에 따라서 다르게 지정한다고 생각해보자. printlnInt, printlnDouble, printlnBoolean 등 수많은 메소드들의 이름을 정해줘야 할 것이다. 이는 프로그래머의 입장에서는 메소드의 네이밍에 고민을 가중시킨다. 그리고 이런 이름들은 다른 곳에 사용할 가능성도 생기게 된다.







오버라이딩(Overriding)





부모 클래스로부터 상속받은 메소드를 자식 클래스에서 재정의하는 것을 오버라이딩이라고 한다. 상속받은 메소드를 그대로 사용할 수도 있지만, 자식 클래스에서 상황에 맞게 변경해야하는 경우 오버라이딩할 필요가 생긴다.





오버라이딩의 조건



오버라이딩은 부모 클래스의 메소드를 재정의하는 것이므로, 자식 클래스에서는 오버라이딩하고자 하는 메소드의 이름, 매개변수, 리턴 값이 모두 같아야 한다. 코드를 통해 좀 더 자세히 알아보자.



<코드>

public class OverridingTest {

	public static void main(String[] args) {
		Person person = new Person();
		Child child = new Child();
		Senior senior = new Senior();
		
		person.cry();
		child.cry();
		senior.cry();
	}
}

class Person {
	void cry() {
		System.out.println("흑흑");
	}
}

class Child extends Person {
	@Override
	protected void cry() {
		System.out.println("잉잉");
	}
}

class Senior extends Person {
	@Override
	public void cry() {
		System.out.println("훌쩍훌쩍");
	}
}




<결과>

흑흑
잉잉
훌쩍훌쩍


@Override는 어떤 용도인가?



이는 어노테이션(Annotation)이라는 것으로 직역하면 주석이라는 뜻이다. 이는 일반적인 주석과 다르게, 검증하는 기능을 한다. 여기서 사용된 @Override라는 어노테이션은 오버라이딩을 검증하는 기능을 한다. 코드상으로 검사했을 때 오버라이딩이 실제로 시행되지 않았다면 컴파일시 오류를 출력한다.



위 코드는 정상적으로 실행되는 것을 볼 수 있다. 부모 클래스의 메소드를 오버라이딩하는 것은 내용만을 새로 정의하는 것이므로 선언부는 부모의 것과 완벽히 동일해야 하는 것을 볼 수 있다.



프로그래머가 Person클래스의 cry메소드를 '흑흑'이라고 정의했다. 그런데 Child클래스와 Senior클래스를 만들면서 울음소리를 다르게 출력하고 싶은 것이다. 그래서 Chile클래스와 Senior클래스에서 부모의 메소드의 이름만 빌려와서 자기의 방식대로 '재정의'하였다. 이것이 오버라이딩이다.



여기서 접근 제어자를 다르게 설정해 놓은 것을 볼 수 있다. 오버라이딩에서 접근 제어자를 설정하는 규칙이 존재한다.



1. 자식 클래스에서 오버라이딩하는 메소드의 접근 제어자는 부모 클래스보다 더 좁게 설정할 수 없다.



위에서 볼 수 있듯이 부모클래스의 접근제어자는 default로 설정되어 있다. 여기서 자식 클래스들은 default보다 같거나 더 넓은 범위의 접근제어자만 설정할 수 있으므로 default, protected, public 이 세 개의 접근 제어자는 사용이 가능하다.



2. 예외(Exception)는 부모 클래스의 메소드 보다 많이 선언할 수 없다.



부모 클래스에서 어떤 예외를 throws 한다고 하면, 자식 클래스에서는 그 예외보다 더 큰 범위의 예외를 throws할 수 없다는 것이다.



3. static메소드를 인스턴스의 메소드로 또는 그 반대로 바꿀 수 없다.



부모 클래스의 static메소드를 자식에서 같은 이름으로 정의할 수 있지만 이것은 다시 정의하는 것이 아니라 같은 이름의 static메소드를 새로 정의하는 것이다.







오버로딩 vs 오버라이딩





이 둘은 이름만 비슷하지 사실 명백히 다른 것이다.



오버로딩 - 기존에 없는 새로운 메소드를 추가하는 것

오버라이딩 - 상속받은 메소드를 재정의 하는 것



 구분

 Overriding

 Overloading

 접근 제어자

 부모 클래스의 메소드의 접근 제어자보다 더 넓은 범위의 접근 제어자를 자식 클래스의 메소드에서 설정할 수 있다.

 모든 접근 제어자를 사용할 수 있다.

 리턴형 

 동일해야 한다.

 달라도 된다.

 메소드명

 동일해야 한다.

 동일해야 한다.

 매개변수

 동일해야 한다.

 달라야만 한다.

 적용 범위

 상속관계에서 적용된다.

 같은 클래스 내에서 적용된다.



위의 내용을 바탕으로 둘을 비교하여 정리한 표이다. 각 기법이 어떤 상황에서 어떻게 사용되고, 왜 사용되는지 정리하여 실제로 코딩할 때 유용하게 잘 사용하면 더 나은 프로그램을 설계할 수 있을 것이라고 생각한다.



여기서 사용된 개념에서 오버라이딩과 접근 제어자, 예외는 따로 정리된 페이지를 참고하기를 바란다.
