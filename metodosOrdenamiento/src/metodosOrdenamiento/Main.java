package metodosOrdenamiento;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
//		double[] vec = new double[7];
//		
//		for(int i = 0; i < vec.length ; i++) {
//			vec[i] = Math.round(Math.random());
//		}

		ArrayList<Double> vec = new ArrayList<Double>();
		double max;
		int maxe = 0;
		
		for(int i = 0; i < 10 ; i++) {
			vec.add(Math.random()*100);
		}
		
		System.out.println(vec);
		
		for(int a = 0; a < vec.size() - 1 ; a++) {
			max = vec.get(0);
			maxe = 0;
			for(int e = 1; e < vec.size() - a; e++) {
				if(vec.get(e) > max) {
					max = vec.get(e);
					maxe = e;

				}
			}
			
			vec.remove(maxe);
			vec.add(maxe, vec.get(vec.size() - 1 - a));

			vec.remove(vec.size() - 1 - a);
			vec.add(vec.size() - a, max);
			
		}
		System.out.println(vec);
	}

}
