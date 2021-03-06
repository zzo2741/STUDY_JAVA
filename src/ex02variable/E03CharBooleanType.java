package ex02variable;

public class E03CharBooleanType {

	public static void main(String[] args) {

		BoolChar bc = new BoolChar();
		bc.charEx();
		System.out.println("--------------------------------");
		bc.boolEx();

	}
}

class BoolChar {
	public void boolEx() {
		
		/*
		 * boolean형 : true 혹은 false 두가지의 값만 가질수 있는 데이터형으로 산술연산(+,-,*,/)이나
		 *  		    비교연산(<,<=등)은 사용이 불가능하다.
		 * 			    단, 논리연산은 가능하다.
		 */
		
		boolean bn1 = true;
		boolean bn2 = false;
		System.out.println("bn = " + bn1 + ", bn2 + " + bn2);

		/*
		 * && : 논리 AND 연산으로 양쪽 모두 참일때 참을 반환한다.
		 * 	         나머지는 거짓을 반환한다.
		 * 
		 * || : 논리 OR 연산으로 둘중 하나만 참이면 참을 반환한다.
		 *      둘다 거짓일 때 거짓을 반환한다.
		 */
		
		boolean bn3 = bn1 && bn2;
		System.out.println("bn3(And) = " + bn3);

		boolean bn4 = bn1 || bn2;
		System.out.println("bn4(OR) = " + bn4);
		
		boolean bn5 = '가' > 30000;
		System.out.println("bn3 = " + bn5);

	}

	public void charEx() {
		/*
		 * char형 : 하나의 문자를 저장할 수 있는 자료형으로 값을 저장할때 '(single quotation)으로 감싸서 표현한다. 만약
		 * "(double quotation)으로 감싸면 문자열로 인식하므로 string형으로 선언한다.
		 */

		char ch1 = '가';
		// char chStr = '가나다라';[에러발생]->문자열
		String chStr = "가나다라";
		System.out.println("ch1 = " + ch1);
		System.out.println("chStr = " + chStr);

		/*
		 * 아스키코드 : 1byte로 표현할 수 있는 문자(영문, 숫자)를 십진수코드로 정의한 것을 말한다. EX) A -> 65로 표현 a ->
		 * 97로 표현 유니코드 : 1byte로 표현이 안되는 문자(한글, 한자 등)는 2byte가 필요하고, 이를 16진수로 정의한 값을 말한다.
		 */

		char ch2 = 'A';
		int num1 = 2;
		int num2 = ch2 + num1;// 65 + 2 = 67
		System.out.println("num2 = " + num2);// 결과 : 67
		System.out.println("num2 = " + (char) num2);// 결과 : C

		char ch3 = (char) (ch2 + num1);// == (char)num2
		System.out.println("ch(문자출력) -> " + ch3);
		System.out.println("ch(아스키코드출력) -> " + (int) ch3);

		char ch4 = '1';// 숫자가 아니라 문자 1이므로 49로 저장된다.
		char ch4_1 = '1' + 1;
		System.out.println("ch4 = " + ch4 + ", ch4_1 = " + ch4_1 + ", ch4_1 = " + (int) ch4_1);

	}
}
