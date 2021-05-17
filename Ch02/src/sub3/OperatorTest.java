package sub3;
/*
 * 날짜 : 2021/05/17
 * 이름 : 김동현
 * 내용 : Java 연산자 
 */
public class OperatorTest {
     public static void main(String[] args) {
		 //산술 연산자
    	 int num1 = 1, num2 = 2, num3 = 3, num4 = 4;
    	 int res1 = num1 + num2;
    	 int res2 = num3 - num2;
    	 int res3 = num2 * num3;
    	 int res4 = num4 / num2;
    	 int res5 = num4 % num3;
    	 
         System.out.println("res1 : "+res1);
         System.out.println("res2 : "+res2);
         System.out.println("res3 : "+res3);
         System.out.println("res4 : "+res4);
         System.out.println("res5 : "+res5);
    	 
    	 //증가,감소 연산자
         int n1 = 1;
         int n2 = 2;
         
         n1 ++;
         ++ n1;
         
         n2--;
         --n2;
         
         System.out.println("n1 : " + n1);
         System.out.println("n2 : " + n2);
         
    	 //복합 대입 연산자
         int var1 = 1;
         int var2 = 2;
         int var3 = 3;
         int var4 = 4;
         
         var1 += 1;
         var2 -= 2;
         var3 *= 3;
         var4 /= 4;
         
         System.out.println("var1 : "+var1);
         System.out.println("var2 : "+var2);
         System.out.println("var3 : "+var3);
         System.out.println("var4 : "+var4);
         
    	 //비교 연산자
         int val1 = 1;
         int val2 = 2;
         
         boolean re1 = val1 < val2;
         boolean re2 = val1 > val2;
         boolean re3 = val1 <= val2;
         boolean re4 = val1 >= val2;
         boolean re5 = val1 == val2;
         boolean re6 = val1 != val2;
         
         System.out.println("re1 :"+re1);
         System.out.println("re2 :"+re2);
         System.out.println("re3 :"+re3);
         System.out.println("re4 :"+re4);
         System.out.println("re5 :"+re5);
         System.out.println("re6 :"+re6);

    	 //논리 연산자
         boolean result1 = (val1 > 1) && (val2 < 3); // && = and
         boolean result2 = (val1 > 0) && (val2 < 3);
         boolean result3 = (val1 > 1) || (val2 < 3); // || = or
         boolean result4 = (val1 > 1) || (val2 < 2);
         boolean result5 = !(val1 > val2); // ! = not [부정문]
         System.out.println("result1 : "+result1);
         System.out.println("result2 : "+result2);
         System.out.println("result3 : "+result3);
         System.out.println("result4 : "+result4);
         System.out.println("result5 : "+result5);
         
	}
}
