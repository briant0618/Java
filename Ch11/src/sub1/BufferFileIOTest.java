package sub1;


import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileOutputStream;

/*
 * 날짜 : 2021/05/27
 * 이름 : 김동현
 * 내용 : Java IO Stream에서 Buffer
 */
public class BufferFileIOTest {
	public static void main(String[] args) {
	
		String path1 = "C:\\Users\\DongHyunKim\\Desktop\\mococo.gif";
		String path2 = "C:\\Users\\DongHyunKim\\Desktop\\mococo2.gif";
		
		// 파일과 입력스트림 연결
		try {
			// 버퍼스트림 생성
			BufferedInputStream  bis = new BufferedInputStream(new FileInputStream(path1));
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(path2));
			
			int value = 0;
			
			while(true) {
				
				// 스트림으로 부터 데이터 읽기
				value = bis.read();
				
				if(value == -1) {
					// 더 이상 읽을 데이터가 없을때 종료
					break;
				}
				
				//char ch = (char)value;
				//System.out.print(ch);
				bos.write(value);
				
			}// while end
			
			// 스트림 해제
			bis.close();
			bos.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료...");
	}// main end
}




