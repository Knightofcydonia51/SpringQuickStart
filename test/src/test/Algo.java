package test;

import java.awt.image.AbstractMultiResolutionImage;
import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

import sun.security.action.PutAllAction;


public class Algo {
	
	
	
	 public static int[] solution(int[] answers) {
		 
	       
	        
	        int a = 0;
	        int b = 0;
	        int c = 0;
	        
	        int[] A = {1,2,3,4,5};
	        int[] B = {2,1,2,3,2,4,5};
	        int[] C = {3,3,1,1,2,2,4,4,5,5};
	        
	      
	        
	        for (int i = 0; i < answers.length; i++) {
	        	if (answers[i]==A[i%A.length]) {
	        		a+=1;
	        		System.out.println(a);
	        	}
	        	if (answers[i]==B[i%B.length]) {
	        		b+=1;
	        	}
	        	if (answers[i]==C[i%C.length]) {
	        		c+=1;
	        	}
	        }
	        
	        HashMap<Integer, Integer> num = new HashMap<Integer, Integer>(3);
	        num.put(1, a);
	        num.put(2, b);
	        num.put(3, c);
	        
	        System.out.println(num.keySet().toArray());
//       	 	Arrays.sort(num);
       	 	
//       	 	for (int i = 0; i < num.length; i++) {
//				if (num[num.length -1]==num[i]) {
//					
//				}
//			}
       	 	
	        return answer;
	    }

	public static void main(String[] args) throws Exception {

//		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); // ����
//		String s = bf.readLine(); // String
////		int i = Integer.parseInt(bf.readLine()); // Int
//
////		System.out.println(s);
//
//		StringTokenizer st = new StringTokenizer(s); // StringTokenizer���ڰ��� �Է� ���ڿ� ����
//		int a = Integer.parseInt(st.nextToken()); // ù��° ȣ��
//		int b = Integer.parseInt(st.nextToken()); // �ι�° ȣ��
//
//		if (b - 45 < 0) {
//			if (a - 1 < 0) {
//				a = 24;
//			}
//			System.out.println(a - 1 + " " + (60 + b - 45));
//		} else {
//			System.out.println(a + " " + (b - 45));
//		}
		
		int[] answers= {1,2,3,4,5,1,2};
		System.out.println(Arrays.toString(solution(answers)));
		
	}


	 
	}