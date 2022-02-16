package com.capita.java8;

public class MeterfFlowStringLogic {

	public static void main(String[] args) {

		//String bprocess = "BUS_STAT-L1:Send HHT Start Response - Confirm Devices [104]";

		String bprocess ="BUS_STAT -- L1:  PreConfig Validation Error";
		if(bprocess.contains("BUS_STAT")) {
		String[] strs = bprocess.split("BUS_STAT");

		for (String string : strs) {
			if (string.length() > 1) {
				//string.startsWith("L");
				//String fullString = string.substring(1);
				String fullString = string.substring(1);
				String[] reqString = fullString.split(":");
				String monitoringLevel = reqString[0].substring(reqString[0].indexOf("L"));
				//int index =monitoringLevel.indexOf("L");
				//String mm =monitoringLevel.substring(index);
				String monitoringText = reqString[1];
				System.out.println(monitoringLevel + "=======" + monitoringText);
			}
		} 
		}		
	}
}
