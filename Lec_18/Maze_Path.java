package Lec_18;

public class Maze_Path {
	public static void main(String[] args) {
		int[][] maze= {{0,1,0,0},{0,0,0,0},{0,1,0,0},{0,0,1,0}};
		Maze_p(0, 0, maze, "",new boolean[maze.length][maze[0].length]);
		
	}
	public static void Maze_p(int r, int c, int[][] maze, String path,boolean[][] visited) {
		
		
		if(r==maze.length || c==maze[0].length||r<0||c<0||maze[r][c]==1||visited[r][c]) {
			return;
		}
		if(r==maze.length -1&& c==maze[0].length-1) {
			System.out.println(path);
			return;
		}
//		System.out.println("{"+r+","+c+"}"+path);
		visited[r][c]=true;
		
		Maze_p(r-1, c, maze, path+"U",visited);
		Maze_p(r, c+1, maze, path+"R",visited);
		Maze_p(r, c-1, maze, path+"L",visited);
		Maze_p(r+1, c, maze, path+"D",visited);
		visited[r][c]=false;
		
	}
}
