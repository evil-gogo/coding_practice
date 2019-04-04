package appnomic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class ServerInfo {
	String serverId;
	String type;
	String name; 
	String version;

	public ServerInfo(String server, String type, String name, String version) {
		super();
		this.serverId = server;
		this.type = type;
		this.name = name;
		this.version = version;
	}

	@Override
	public String toString() {
		return "Server Info ||		ID " + serverId + " | " + "Type " + type + " | " + "Name " + name + " | " + "Version " + version ;
	}
}

public class SoftwareUpdateDemo {
	public static int calculateServerUpdateCount(ArrayList<String> array) {
		ArrayList<ServerInfo> serverInfoList = new ArrayList<>();
		Iterator<String> iterator = array.iterator();
		while (iterator.hasNext()) {
			String [] values = iterator.next().split(", ");
			String server = values[0] ;
			String type = values[1];
			String name = values[2];
			String version = values[3];
			ServerInfo serverInfo  = new ServerInfo(server, type, name, version);
			serverInfoList.add(serverInfo);
		}

		serverInfoList.sort(new Comparator<ServerInfo>() {
			@Override
			public int compare(ServerInfo o1, ServerInfo o2) {
				if( o1.type.compareTo(o2.type) == 0) {
					return compareVersion(o2.version, o1.version);
				} else {
					return o1.type.compareTo(o2.type);
				}
			}
		});
		
		
		
		int count = 0;
		HashMap<String, String> hashMap = new HashMap<>();
		for (ServerInfo serverInfo : serverInfoList){
			if (hashMap.containsKey(serverInfo.type)) {
				String maxVersion = hashMap.get(serverInfo.type);
				if (compareVersion(serverInfo.version, maxVersion) < 1) {
					count++;
				}
			} else {
				hashMap.put(serverInfo.type, serverInfo.version);
			}
		}
		return count;
	}

	public static int compareVersion(String version1, String version2) {
		String[] version1Split = version1.split("\\.");
		String[] version2Split = version2.split("\\.");

		if (Integer.valueOf(version1Split[0]).compareTo(Integer.valueOf(version2Split[0])) == 0) {
			if (version1Split.length < 2 || version2Split.length < 2) {
				if (version1Split.length < 2) {
					if (version2Split.length >= 2) {
						return -1;
					}
				}
				if (version2Split.length < 2) {
					if (version1Split.length >= 2) {
						return 1;
					}
				}
				if (version1Split.length ==  1 && version2Split.length  == 1) {
					return 0;
				} 
				
			}
			if (Integer.valueOf(version1Split[1]).compareTo(Integer.valueOf(version2Split[1])) == 0) {
				if (version1Split.length < 3 || version2Split.length < 3) {
					if (version1Split.length < 3) {
						if (version2Split.length == 3) {
							return -1;
						}
					}
					if (version2Split.length < 3) {
						if (version1Split.length == 3) {
							return 1;
						}
					}
					if (version1Split.length ==  2 && version2Split.length  == 2) {
						return 0;
					} 
					
				}
				return Integer.valueOf(version1Split[2]).compareTo(Integer.valueOf(version2Split[2]));
			} else {
				return Integer.valueOf(version1Split[1]).compareTo(Integer.valueOf(version2Split[1]));
			}

		} else {
			return Integer.valueOf(version1Split[0]).compareTo(Integer.valueOf(version2Split[0]));
		}
	}

	public static void main (String[] args) {
		ArrayList<String> inputData = new ArrayList<String>();
		try {
			Scanner in = new Scanner(new BufferedReader(new FileReader("input.txt")));

			while(in.hasNextLine()) {
				String line = in.nextLine().trim();
				if (!line.isEmpty()) // Ignore blank lines
					inputData.add(line);
			}

			int count = calculateServerUpdateCount(inputData);
			PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
			output.write(count + '0');
		
			output.close();
		} catch (IOException e) {
			System.out.println("IO error in input.txt or output.txt");
		}
	}
}