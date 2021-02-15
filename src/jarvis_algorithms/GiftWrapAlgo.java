package jarvis_algorithms;
import java.util.*;

public class GiftWrapAlgo {
	
	/* 
	* find orientation of ordered triplets p, q, r
	* the function returns following values
	* 0 ---> p, q and r are co-linear
	* 1 ---> Clockwise
	* 2 ---> anti-clockwise
	*/
	public static int orientation(Points p, Points q, Points r) {
		int val = (q.y - p.y) * (r.x - q.x) - (q.x - p.x) * (r.y - q.y);
		if (val == 0) return 0;
		return (val > 0) ? 1 : 2;
	}
		
	// print convexHull of a set of n points
	public static void convexHull(Points[] points, int n) {
		
		// there must be 3 points
		if (n < 3) return;
		
		// initialize result
		Vector<Points> hull = new Vector<Points>();
		
		// find left most point
		int l = 0;
		for (int i=1; i<n; i++) {
			if (points[i].x < points[l].x) {
				l = i;
			}
		}
		/*
		 * start from leftmost point, keep moving anti-clockwise until react
		 * start point again. this loop runs 0(h) times where h is number of 
		 * points in result or output 
		*/
		int p = l,q;
		do {
			// add current point to result
			hull.add(points[p]);
			/*
			 * search for  point q such that orientation p,x,q is anti-clockwise
			 * for all points x. to keep track of last visited most anti-clockwise
			 * point in q. if i is more anti-clockwise that q then update q
			*/
			q = (p+1) % n;
			
			for (int i=0; i<n; i++) {
				// if i more anti-clockwise that current q than update q
				if (orientation(points[p], points[i], points[q]) == 2) {
					q = i;
				}
				
			}
			// now q is most anti-clockwise with.r.t p. set p as q for next iter
			// so that added q to result hull
			p = q;
		} 
		while(p != l);
		
		// print result
		for (Points temp : hull) {
			System.out.println("("+temp.x+","+temp.y+")");
		}
		
	}
	
	public static void main(String[] args) {
			
			Points[] points = new Points[7];
			points[0] = new Points(0,3);
			points[1] = new Points(2,3);
			points[2] = new Points(1,1);
			points[3] = new Points(2,1);
			points[4] = new Points(3,0);
			points[5] = new Points(0,0);
			points[6] = new Points(3,3);
			
			int n = points.length;
			convexHull(points, n);
		
	}
	
	
}
