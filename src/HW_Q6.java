import java.util.*;

/**
 * This program implements a simple English translation.
 * 
 * @author Younho An
 * @version v0.1
 * @since 04-23 2022
 */

public class HW_Q6 {

	public static void main(String[] args) {

		// 단어 데이터베이스
		String eng[] = { "apple","is","red","banana","delicious","long","train","i","hate","exam"};
		String kor[] = { "사과",	"는", "빨간색","바나나", "맛있다",     "길다", "기차", "나","싫다", "시험"};

		System.out.print("input : ");
		Scanner	scan = new Scanner(System.in);
		String input_S = scan.nextLine();

		// 단어를 공백문자를 기준으로 나눠줌
		String Splitted_Str[] = input_S.split(" ");
		
		// 번역할 단어의 위치 검색
		int Translate;
		
		/*
		 * Splitted_Str의 단어를 영어 데이터베이스와 비교하여 찾아본다. 영어 데이터 베이스에 없다면 한글 데이터 베이스를 찾아본다. 둘 중
		 * Splitted_Str과 같은 단어를 발견한다면, 그단어의 배열index를 Translate 변수에 저장한다. 찾아낸 index를 토대로
		 * 번역할 단어를 찾는다. 만약 두 데이터 베이스 모두에 없다면, 모름을 출력하고 다음 단어를 검색한다.
		 */
		for (int i =0; i < Splitted_Str.length ; i++) {
			try{
				Translate = Arrays.asList(eng).indexOf(Splitted_Str[i]);
				System.out.print(kor[Translate] + " ");
			} 
			catch(ArrayIndexOutOfBoundsException e){
				try{
					Translate = Arrays.asList(kor).indexOf(Splitted_Str[i]);
					System.out.print(eng[Translate] + " ");
				}
				catch(ArrayIndexOutOfBoundsException be){
					System.out.print("모름");
				}
			}
		}
	}
}
