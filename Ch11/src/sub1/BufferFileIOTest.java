package sub1;


import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileOutputStream;

/*
 * ��¥ : 2021/05/27
 * �̸� : �赿��
 * ���� : Java IO Stream���� Buffer
 */
public class BufferFileIOTest {
	public static void main(String[] args) {
	
		String path1 = "C:\\Users\\DongHyunKim\\Desktop\\mococo.gif";
		String path2 = "C:\\Users\\DongHyunKim\\Desktop\\mococo2.gif";
		
		// ���ϰ� �Է½�Ʈ�� ����
		try {
			// ���۽�Ʈ�� ����
			BufferedInputStream  bis = new BufferedInputStream(new FileInputStream(path1));
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(path2));
			
			int value = 0;
			
			while(true) {
				
				// ��Ʈ������ ���� ������ �б�
				value = bis.read();
				
				if(value == -1) {
					// �� �̻� ���� �����Ͱ� ������ ����
					break;
				}
				
				//char ch = (char)value;
				//System.out.print(ch);
				bos.write(value);
				
			}// while end
			
			// ��Ʈ�� ����
			bis.close();
			bos.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("���α׷� ����...");
	}// main end
}




