package test;

import java.util.ArrayList;

public class ContestCalculator {

	public ArrayList<Double> calculateWinner(ArrayList<Double> wyateErpsNuggets, ArrayList<Double> butchCassidaysNuggets) {
		double sum = 0;
		double sum2 = 0;
		for (int i = 0; i < wyateErpsNuggets.size(); i++) {
			sum = sum + wyateErpsNuggets.get(i);
		}
		for (int i = 0; i < butchCassidaysNuggets.size(); i++) {
			sum2 = sum2 + butchCassidaysNuggets.get(i);
		}
		if (sum > sum2) {
			return wyateErpsNuggets;
		} else {
			return butchCassidaysNuggets;
		}
	}

}
