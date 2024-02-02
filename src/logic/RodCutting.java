package logic;

import java.util.ArrayList;
import java.util.List;

public class RodCutting {

	public static List<Integer> processRods(List<Integer> rodLengths) {
		List<Integer> numberOfRodsAtEachRound = new ArrayList<>();

		while (!rodLengths.isEmpty()) {
			int numRods = rodLengths.size();
			numberOfRodsAtEachRound.add(numRods);

			int minLength = Integer.MAX_VALUE;

			// Find the rod(s) with the shortest length and identify the minimum length
			for (int length : rodLengths) {
				if (length < minLength) {
					minLength = length;
				}
			}

			// Process the round: discard rods, cut off cuts, and discard all offcuts
			List<Integer> updatedLengths = new ArrayList<>();
			for (int length : rodLengths) {
				if (length > minLength) {
					updatedLengths.add(length - minLength);
				}
			}

			// Update the rod lengths for the next round
			rodLengths = updatedLengths;
		}

		return numberOfRodsAtEachRound;
	}

	public static void main(String[] args) {
		List<Integer> initialRodLengths = new ArrayList<>(List.of(1, 1, 3, 4));
		List<Integer> result = processRods(initialRodLengths);
		
		System.out.println("Number of rods at each round: " + result);
	}
}
