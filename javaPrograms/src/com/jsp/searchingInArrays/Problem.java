package com.jsp.searchingInArrays;

public class Problem {

	public class InterviewTimeCalculator {
	    public static String calculateActualTime(String initialTime, int secondsGainPer5Minutes, int minutesEarly) {
	        // Convert initialTime to seconds
	        String[] timeParts = initialTime.split(":");
	        int initialSeconds = Integer.parseInt(timeParts[0]) * 3600 + Integer.parseInt(timeParts[1]) * 60 + Integer.parseInt(timeParts[2]);

	        // Calculate the total gain in seconds
	        int totalSecondsGain = (minutesEarly / 60) * (secondsGainPer5Minutes * (minutesEarly / 60));

	        // Calculate the actual time in seconds
	        int actualSeconds = initialSeconds + totalSecondsGain;

	        // Convert actual seconds back to HH:MM:SS format
	        int actualHours = actualSeconds / 3600;
	        actualSeconds %= 3600;
	        int actualMinutes = actualSeconds / 60;
	        actualSeconds %= 60;

	        return String.format("%02d:%02d:%02d", actualHours, actualMinutes, actualSeconds);
	    }

	    public static void main(String[] args) {
	        String initialTime = "08:00:00";
	        int secondsGainPer5Minutes = 5;
	        int minutesEarly = 10;

	        String actualTime = calculateActualTime(initialTime, secondsGainPer5Minutes, minutesEarly);
	        System.out.println("Candidate X reaches the venue at: " + actualTime);
	    }
	}

	}


