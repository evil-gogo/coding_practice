package jiomoney;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class HTTPDemo {
	public static void main(String[] args) {
		String StringURL = "https://twitter.com/toptweets?lang=en";
		//String results = doUrlConnectionAction(StringURL);
		String results = doHTTPUrlConnectionAction(StringURL);
		System.out.println(results);

	}

	private static String doUrlConnectionAction(String StringURL) {
		URL url = null;
		try {
			url = new URL(StringURL);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		URLConnection urlConnection = null;
		BufferedReader bufferedReader;
		StringBuilder content = new StringBuilder();
		String line = null;
		try {
			urlConnection = url.openConnection();
			bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));

			while ((line = bufferedReader.readLine()) != null) {
				content.append(line + "\n");
			}

			bufferedReader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("Closing Connection");

		}

		return content.toString();
	}
	
	private static String doHTTPUrlConnectionAction(String StringURL) {
		URL url = null;
		try {
			url = new URL(StringURL);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		HttpURLConnection httpUrlConnection = null;
		BufferedReader bufferedReader;
		StringBuilder content = new StringBuilder();
		String line = null;
		try {
			httpUrlConnection = (HttpURLConnection) url.openConnection();
			bufferedReader = new BufferedReader(new InputStreamReader(httpUrlConnection.getInputStream()));
			
			while ((line = bufferedReader.readLine()) != null) {
				content.append(line + "\n");
			}
			
			bufferedReader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("Closing Connection");
			
		}

		return content.toString();
	}
}