package Lec_16;

import java.util.ArrayList;
import java.util.List;

public class Stair {
	public static void main(String[] args) {
//		climb(0, 5, "");
//		List<String> AL = new ArrayList<>();
//		parenth(3, 3,"" ,AL);
		MazePath(0, 0, 2, 2, "");
		
	}

	public static void climb(int curr, int dest, String ans) {
//		+ve
		if (curr == dest) {
			System.out.println(ans);
			return;
		}
//		-ve BC
		if (curr > dest) {
			return;
		}
		climb(curr + 1, dest, ans + 1);
		climb(curr + 2, dest, ans + 2);
		climb(curr + 3, dest, ans + 3);

	}
	public static void parenth(int open, int close, String ans,List<String> AL ) {
		if(open>close) {
			return;
		}
		
		if(open==close && open==0) {
//			System.out.println(ans);
			AL.add(ans);
			return;
		}
		if (open>0)
			parenth(open-1, close, ans+"(",AL);
		if(close >0)
			parenth(open, close-1, ans+")",AL);
		
	}
	
	public static void MazePath(int curr_r, int curr_c, int r, int c, String ans) {
		if(curr_r==r && curr_c ==c) {
			System.out.println(ans);
			return;
		}
//		if(curr_r>r ||curr_c>c) {
//			return;
//		}
		if(curr_c<c)
			MazePath(curr_r, curr_c+1, r, c, ans+"R");
		
		if(curr_r<r)
			MazePath(curr_r+1, curr_c, r, c, ans+"D");
		
	}
}
