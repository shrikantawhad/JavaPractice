package logic;

import java.util.*;
import java.util.*;

//public class MaximumTeams {
//    
//    public static int maxTeams(List<Integer> teamSize, int k) {
//        Collections.sort(teamSize);
//        int n = teamSize.size();
//        int maxTeams = 0;
//        
//        for (int i = 0; i < n; i++) {
//            int currentTeamSize = teamSize.get(i);
//            int reducedTeamSize = Math.max(1, currentTeamSize - k);
//            int remainingTeams = n - i;
//            int teamsWithCurrentSize = remainingTeams / reducedTeamSize;
//            maxTeams = Math.max(maxTeams, teamsWithCurrentSize);
//        }
//        
//        return maxTeams;
//    }
//    
//    public static void main(String[] args) {
//        List<Integer> teamSizes = Arrays.asList(1, 7, 3, 8);
//        int k = 4;
//        System.out.println("Maximum number of teams of equal size: " + maxTeams(teamSizes, k));
//    }
//}


    
	import java.util.*;

	public class MaximumTeams {
	    
	    public static int maxTeams(List<Integer> teamSize, int k) {
	        Map<Integer, Integer> freqMap = new HashMap<>();
	        
	        // Count the frequency of each team size
	        for (int size : teamSize) {
	            freqMap.put(size, freqMap.getOrDefault(size, 0) + 1);
	        }
	        
	        // Find the maximum frequency
	        int maxFreq = 0;
	        for (int freq : freqMap.values()) {
	            maxFreq = Math.max(maxFreq, freq);
	        }
	        
	        // Calculate the maximum number of teams of equal size
	        int maxTeams = maxFreq + k;
	        return Math.min(maxTeams, teamSize.size());
	    }
	    
	    public static void main(String[] args) {
	        List<Integer> teamSizes = Arrays.asList(1, 7, 3, 8);
	        int k = 1;
	        System.out.println("Maximum number of teams of equal size: " + maxTeams(teamSizes, k));
	    }
	}


