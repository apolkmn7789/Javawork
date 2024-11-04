/*
* 변수 - 변하는 수(수학적)
* 하나의 값(자료형)을 메모리에 담는것
*
* int a = 10; (정수 자료형)
* 정수 자료형에 이름이 a라는 곳에 10을 담아라.
* a=20;
* a의 값이 20으로 바뀐다.
* 
* 자료형 - 기본자료형 / 참조자료형
* 기본자료형
* 문자 - char (정수형) ''안에 값을 입력
* 정수 - int,long,short,byte
* 실수 - float,double
* 논리 - boolean(true,false)
* String - ""안에 값을 입력 (문자열) 참조 자료형이지만 기본 자료형처럼 쓰임
* 상수 - Final(고정된 값)
* 1byte = bit(8개가 모인것)
*
* 형 변환
* 본인 자료형에서 다른 자료형으로 바뀌는 것
* 자동 형 변환
* byte + short = int
* int + long = long
*
* 강제 형 변환
* 강제로 형 변환을 시키는 것
* (자료형)변수
*
* 형 변환에서 중요한게 있는데
* 참조 자료형에서의 형 변환은 거의 필수적이고 중요하다.
*
* 참조와 기본 자료형은 형 변환이 불가능하다.
* 하지만 15 + 16 + "" = "31"이라는 문자열 (15 + 16까지는 정수로 더하고
* 뒤에 ""을보고 자동 형 변환이 일어난다)
*
* Scanner
* Scanner sc = new Scanner(System.in); // 입력 준비
        System.out.print("첫 번째 숫자를 입력하세요: ");
        int num1 = sc.nextInt(); // 입력받는 값
* 
* 연산자
* 1.대입 연산자 int a = 10;(=) <- 값을 대입시킨다.
* 2.산술 연산자 + - * / %
* ++(증가 연산자) --(감소 연산자)
* 3.관계(비교)연산자 > < >= <= == !=
* 4. 논리 연산자 && || !(not)
* && || 횟수 제한이 x 조합 제한 x
* 5.단축연산자 a+=b (a+b를 a에 담아라/a = a+b를 줄인것)
* */