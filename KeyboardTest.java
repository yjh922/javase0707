package org.sp.app0707.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/*IT 분야에서 입력 도구는 다양하지만 그 중 표준입력 도구인 키보드로부터
 * 데이터를 읽어보자
 * 주의) FileInputStream : 파일을 대상으로 한 입력스트림
 * 		KeyboardStream(X) --> InputStream으로 처리해야 함
 * 		왜? 내일이라도 당장 어떤 디바이스가 나올지 알 수 없다.
 * */
public class KeyboardTest {

	public static void main(String[] args) {
		//디바이스, 파일 등 다양한 매체로부터 입력을 받기 위한 입력스트림 객체를 사용해야 하고
		//이 클래스는 추상클래스로 지원된다. 따라서 new 불가
		InputStream is=System.in;
		
		//한글이 깨지지 않기 위해 Reader를 이용하자
		InputStreamReader reader=null;
		reader = new InputStreamReader(is);
		BufferedReader buffr=null;
		buffr= new BufferedReader(reader);
		
		try {
			//int data=-1;
			String msg=null;
			//read() 메서드는 데이터를 읽을 때 까지 대기상태에 빠짐
			while(true) {
				msg=buffr.readLine();
				//System.out.println("읽었어");
				System.out.print(msg);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//이미 os가 얻어다 놓은 출력스트림을 이용하여 모니터 출력하는 메서드
		//System.out.println();
	}
}
