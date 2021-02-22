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
		Stack<Points> hull = new Stack<Points>();
		
		// find left most point
		int left = 0;
		for (int i=1; i<n; i++) {
			if (points[i].x < points[left].x) {
				left = i;
			}
		}
		/*
		 * start from leftmost point, keep moving anti-clockwise until react
		 * start point again. this loop runs 0(h) times where h is number of 
		 * points in result or output 
		*/
		int p = left,q;
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
			// now q is most anti-clockwise with.r.t p. set p as q for next iteration
			// so that added q to result hull
			p = q;
		} 
		while(p != left);
		
		// print result
		for (Points temp : hull) {
			System.out.println("("+temp.x+","+temp.y+")");
		}
		
	}
	
	public static void main(String[] args) {
		
			Random rand = new Random();
			
			Scanner sn = new Scanner(System.in);
			System.out.println("Enter number of points: ");
			int num = sn.nextInt();
			
			Points point[] = new Points[num];
			System.out.println("random points");
			for (int i=0; i<num; i++) {
				point[i] = new Points( rand.nextInt(100), rand.nextInt(100));
				System.out.println("("+point[i].x +"," + point[i].y+")");
				
			}
			
			System.out.println("convex hull");
			convexHull(point,num);
		
	}
	
	
}
