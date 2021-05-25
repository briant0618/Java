package sub1;
/*
 * 날짜 : 2021/05/18
 * 이름 : 김동현
 * 내용 : Java Class Inherit
 */
public class InhritanceTest {
	public static void main(String[] args) {
		
		StockAccount kb = new StockAccount("KB증권",
										   "121-101-2010",
										   "홍길동",
										   1000000,
										   "삼성전자",
										   10,80000);
		kb.sell(5,79000);
		kb.buy(10, 81000);
		kb.show();
	}
}
