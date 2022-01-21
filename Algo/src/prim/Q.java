package prim;

public class Q {
	int[][] a;
	int Iterator;

	public Q() {
		a = new int[20][1];
		for (int i = 0; i < 20; i++) {
			a[i][0] = -5;
		}
	}

	public void add(int v, int w) {
		a[v][0] = w;
		Iterator++;
	}

	public int getMin() {
		int minimum = 1000;
		int index = 0;
		for (int i = 0; i < a.length; i++) {
			if (minimum > a[i][0] && a[i][0]>0) {
				minimum = a[i][0];
				index = i;

			}
		}

		Iterator--;
		a[index][0] = -5 ;
		return index;
	}

	public boolean isEmpty() {
		if (Iterator == 0) {
			return true;
		}
		return false;
	}
}
