//baekjoon-1110.java
/*
    	1. N을 입력받는다.(0<N<99)
    	2. 입력받은 N 값이 10보다 작으면 0을 더하고 10보다 크면 놔둔다.
    	3. 주어진 수 가장 오른쪽 자리 수와 앞에 구한 합의 가장 오른쪽 자리 수를 이어 붙여 새로운 수 생성
    	4. 처음 주어진 수로 돌아오기 까지의 사이클 구하기 
    	*/
import java.util.Scanner;

public class Main{
    public static void main(String args[]){
    	Scanner Sc = new Scanner(System.in);
    	
    	char ch = Sc.next().charAt(0);
    	System.out.println(ch+0);
    	int num = (int)ch;
    	System.out.println(num);
    	
    }
}