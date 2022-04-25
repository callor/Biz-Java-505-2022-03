# interface argument
* 생성자, method 를 설계할때 interface 가 있는 type 으로 argument 를 작성하면 클래스와 클래스간의 결합도를 낮추어 프로젝트가 커졌을때 많은 장점을 얻을 수 있다.

* 다음과 같이 클래스를 매개변수로 갖는 method 를 설계할때와
```
public void mehtod(ArrayList<Integer> list) {}
```
* 다음과 같이 인터페이스를 매개변수로 갖는 method 를 설계할때와의 차이를 비교해 보자
```
public void method(List<Integer> list) {}
```
* 첫번째 코드에서는 다음과 같은 코드로 method를 사용할수 밖에 없다
```
ArrayList<Interger> list = new ArrayList<Integer>();

obj.method(list);
```
* 하지만 두번재 코드에서는 다음과 같이 유여한 방법으로 method 를 사용할수 있다
```
List<Integer> list1 = new ArrayList<>();
List<Integer> list2 = new LinkedList<>();

obj.method(list1);
obj.method(list2);
```

# Dependency Inject 디자인 패턴
* 의존성 주입
* 클래스에서 사용하는 ```데이터 객체```, 또는 ```서비스 객체``` 등을 클래스코드에서 직접 초기화 하지 않고, 생성자, setter() method 등을 통하여 주입받는 방식
* 클래스코드에서 다른 클래스의 객체를 직접 생성하여 사용하는 코드는 클래스와 클래스의 결합도를 높여 프로젝트가 커졌을때, 유지보수에서 많은 불편함을 야기할 수 있다.
* 의존성주입 패턴을 사용하면 한개의 클래스를 다양한 기능으로 업그레이드 하기가 쉬워진다.
* 코드의 재 사용성이 (매우)증가한다.
* 리팩토링(코드변경)이 수월해 진다.
* 보일러코드(비슷한, 유사한 유형의 코드)가 준다
* 프로젝트의 테스트가 용이해진

# 참조형 변수를 매개변수로 전달하기
* java 이외의(특히 C,C++) 언어에서는 매개변수를 전달할때 주소를 직접 전달하기 위하여 여러가지 기법을 사용한다. : Call by Reference 라고한다.
* java 는 기본타입(primitive)의 변수는 값을 직접 매개변수로 전달한다.
* class 를 사용하는 참조형(reference type)변수는 값을 전달하지 않고 실제 데이터가 저장된 저장소의 주소만 전달한다.
* 전달받은 method 에서 ```요소의 값```을 변경(추가, 수정, 삭제) 하면 전달해 준 곳의 값도 같이 변경된다.
* 다만, java 에서는 이 효과를 Call By Reference 라고 하지 않는다. 참조형 변수를 전달한다 라고 표현한다.


