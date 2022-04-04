# method
* method 는 코드를 분리하는 목적이 있다
* main() 에 많은 코드가 만들어지면 가독성, 성능 등의 문제가 발생할 수 있다.
* 나중에 코드를 변경, 업그레이드 등을 할때 어려움을 겪을 수 있다.
* main() 에서 수행할 코드들을 묶음으로 만들어 별도의 코드 블럭으로 선언을 한다. 이것을 method 선언 이라고 한다.
* method에 코드를 분리해 두면 main() 에서는 한줄의 코드로 method 를 호출하고 결과를 확인 할수 있다.

## main() : 진입점, 시작점 method 라고 한다
* java 코드를 작성하고 컴파일 후 실행을 하면 JVM 프로그램이 작동하여 코드를 실행하는데 이때 main()를 찾아서 실행하도록 미리 구성이 되어 있다.
* java 코드에는 반드시 main() 가 있어야만 코드가 시작될 수 있다.
* main() 는 public static void main(String[] args) {} 형식으로 코드가 정해져 있다.
* main() 외에 다른 method 는 개발자가 임의로 이름을 정하여 만들수 있다.
* 단 한 클래스에서는 같은 이름의 method 를 중복 선언할수 없다.
## void method 
* public void num() {} 와 같은 형식으로 선언을 한다
* void 키워드가 있는 method 는 특별한 경우가 아니면 return 명령이 필요 없다.
* return type 이 void 인 경우는 ```return;``` 명령이 감춰진 상태로 자동으로 만들어진 다고 보면 된다.
```
public void run() {

	return ; 
}
```

## return 명령
* method 를 끝내는 명령이다
* return type void 인 경우는 ```return``` 명령문 단독으로 사용된다.
* return type void 인 경우 특별한 때가 아니면 ```return```을 사용하지 않아도 된다.
* return type void 이외의 경우 반드시 return 명령이 있어야 하고, return type 과 같은 데이터를 포함해야 한다
* 처음 method 를 선언할때 숫자인 경우는 ```return 0;```, 문자열인 경우는 ```return ""```; 또는 ```return null;``` 을 사용한다. boolean 인 경우는 보통 ```return false``` 를 사용한다.




## int method, String method, long method 등
* public int num() {} 와 같은 형식으로 선언을 한다.
* int 는 return type 이라고 한다.
* return type 이 void 가 아닌경우는 반드시 return 명령이 있어야 한다.
* return 명령은 return type 과 같은 데이터를 포함해야 한다
```
public int num() {
	return 0;
}
```
위의 num() 는 return type 이 int 이므로 반드시 ```return 정수;``` 와 같은 명령문이 반드시 있어야 한다.
```
public String nation() {
	return "";
}
```
```
public long num1() {
	return 0L;
}
```
```
public float num2() {
	return 0.0f;
}
```
