package LCS;

import com.sun.jndi.url.iiopname.iiopnameURLContextFactory;

import sun.tools.jar.resources.jar;

public class Tester {
	static String aString;
	static String bString;
	static int[][] matrix;

	public static void main(String[] args) {
		aString = "BATMAN";
		bString = "BINLADEN";
		matrix = new int[aString.length() + 1][bString.length() + 1];
		for (int i = 1; i < aString.length() + 1; i++) {
			for (int j = 1; j < bString.length() + 1; j++) {
				if (aString.charAt(i - 1) == bString.charAt(j - 1)) {
					matrix[i][j] = 1 + matrix[i - 1][j - 1];
				} else if (matrix[i][j - 1] > matrix[i - 1][j]) {
					matrix[i][j] = matrix[i][j - 1];
				} else {
					matrix[i][j] = matrix[i - 1][j];
				}
			}
		}
		Node root = null;
		backTrack(root, aString.length(), bString.length(), matrix);
		/*
		 * String rString =""; int i = aString.length() , j = bString.length(); for (;
		 * i>0 && j>0;) { if(aString.charAt(i-1)==bString.charAt(j-1)) {
		 * rString=aString.charAt(i-1)+rString ; i-- ; j-- ; }else if
		 * (matrix[i-1][j]>matrix[i][j-1]) { i-- ; }else { j-- ; }
		 * 
		 * } System.out.println(matrix[aString.length() ][bString.length() ] +"\t"
		 * +rString);
		 */
	}

	public static void backTrack(Node root, int i, int j, int[][] matrix) {
		if (i <= 0 || j <= 0) {
			return;
		}
		if (root == null && aString.charAt(i - 1) == bString.charAt(j - 1)) {
			Node node  = new Node(aString.charAt(i - 1));
			root = node ;
			backTrack(root, i--, j--, matrix);
		} else if (aString.charAt(i - 1) == bString.charAt(j - 1)) {
			Node n = new Node(aString.charAt(i - 1));
			root.leftNode = n;
			backTrack(n, i--, j--, matrix);
		} else if (matrix[i - 1][j] > matrix[i][j - 1]) {
			backTrack(root, i--, j, matrix);
		} else if (matrix[i - 1][j] == matrix[i][j - 1]) {
			Node nodel = new Node();
			root.leftNode = nodel;
			Node noder = new Node();
			root.rightNode = noder;
			backTrack(nodel, i--, j, matrix);
			backTrack(noder, i, j--, matrix);
		} else {
			backTrack(root, i, j--, matrix);
		}

	}

}
