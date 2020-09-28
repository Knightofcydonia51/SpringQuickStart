package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Algo {
	
	
	
	 public static ArrayList solution(int[] answers) {
		 
	       
	        int a = 0;
	        int b = 0;
	        int c = 0;
	        
	        int[] A = {1,2,3,4,5};
	        int[] B = {2, 1, 2, 3, 2, 4, 2, 5};
	        int[] C = {3,3,1,1,2,2,4,4,5,5};
	        

	        for (int i = 0; i < answers.length; i++) {
	        	if (answers[i]==A[i%A.length]) {
	        		a+=1;
	        	}
	        	if (answers[i]==B[i%B.length]) {
	        		b+=1;
	        	}
	        	if (answers[i]==C[i%C.length]) {
	        		c+=1;
	        	}
	        }
	        
	        
	        
	        int [][] num = {{a,1},{b,2},{c,3}};
	        
	        Arrays.sort(num,Comparator.comparingInt(o1 -> o1[0]));
	        
	        for (int i = 0; i < num.length; i++) {
				System.out.println(num[i][0]+":"+num[i][1]);
			}
	        
	        ArrayList answer = new ArrayList();
       	 	 	 
       	 	for (int i = 0; i < num.length; i++) {
       	 		if (num[num.length-1][0]==0) {
       	 			break;
       	 		}
       	 		else if (num[num.length -1][0]==num[i][0]) {
					answer.add(num[i][1]);
				}
			}
       	 	
       	 Collections.sort(answer);
       	 	
	        return answer;
	    }

	public static void main(String[] args) throws Exception {

//		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); // 선언
//		String s = bf.readLine(); // String
////		int i = Integer.parseInt(bf.readLine()); // Int
//
////		System.out.println(s);
//
//		StringTokenizer st = new StringTokenizer(s); // StringTokenizer인자값에 입력 문자열 넣음
//		int a = Integer.parseInt(st.nextToken()); // 첫번째 호출
//		int b = Integer.parseInt(st.nextToken()); // 두번째 호출
//
//		if (b - 45 < 0) {
//			if (a - 1 < 0) {
//				a = 24;
//			}
//			System.out.println(a - 1 + " " + (60 + b - 45));
//		} else {
//			System.out.println(a + " " + (b - 45));
//		}
		
		int[] answers= {1,2};
		System.out.println(solution(answers));
		
	}


	 
	}