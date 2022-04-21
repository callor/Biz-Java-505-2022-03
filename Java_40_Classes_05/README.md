# java 의 interface
## 클래스의 설계도 역할
* 클래스를 설계할때 method 들을 설계하고, method 의 이름을 정의하고, return type 을 정의하고, argument를 정의하고 하는 일들은 유사한 기능을 하는 클래스들 끼리는 공통으로 일치시켜야 하는 경우가 많다
* 이때 interface 에 미리 method 의 모양(원형, prototype)을 만들어 두고, 클래스를 선언할때 inteface 를 implements 하도록 규칙을 정해 버린다.
* interface 를 implements 한 클래스는 interface 에 정의된 method 를 반드시 만들어야 한다.