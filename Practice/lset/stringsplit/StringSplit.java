package stringsplit;

public class StringSplit {
	public static void main(String args[]) {
		String logFileName = "VZW_LC_TC-3-3-1_TE.log";
		String testCaseNumber = "";
		String scriptName = "";
		String[] logFileNameSplit = logFileName.split("_TE.log" , 2);
		scriptName = logFileNameSplit[0];

		String[] scriptNameSplit = scriptName.split("-" , 2);
			testCaseNumber = scriptNameSplit[1];
		
		System.out.println(scriptName);	
		System.out.println(testCaseNumber);
		scriptName = scriptName + ".xml";
		System.out.println(scriptName);	
		
		/*String logFileName = "VZW_LC_TC-3-3-1.log";
		String testCaseNumber = "";
		String scriptName = "";
		String[] logFileNameSplit = logFileName.split("\\." , 2);
		scriptName = logFileNameSplit[0];

		String[] scriptNameSplit = scriptName.split("-" , 2);
			testCaseNumber = scriptNameSplit[1];
		
		System.out.println(scriptName);	
		System.out.println(testCaseNumber);
		scriptName = scriptName + ".xml";
		System.out.println(scriptName);	*/
	}

}
