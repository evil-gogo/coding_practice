package jiomoney;


import java.io.InputStreamReader;
import java.io.BufferedReader; 
import java.io.OutputStream;
import java.net.URL;
import java.net.URLEncoder;
import java.net.URLConnection;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public class TwitterAnalyzer {

	public static void main(String[] args) {
		System.out.println(TwitterAnalyzer.read("http://api.twitter.com/oauth/request_token"));
	}

	public static String read(String url) {

		/*String consumerKey = "SWQ49sXSN5A9Udpqyj9mUuPW5";
		String consumerSecret = "UYGWF3kNue55PbsUhMfNIH5mVGtXEIm3bDMWpuarXo4pkf3WHi";
		String accessToken = "784358090930065408-MuWuOeWfM3HkuHyAyyJ0NXKoGQ8sTXd";
		String accessSecret = "Pgc1sgNGulQajEhUi06L2glTtaP85RvDGBCWVxNw4vty4";
		*/
		
		
		String consumerKey = "pWfYAui8tyYa2ESyeCYRx9oI8";
		String consumerSecret = "8kbjSFg8GNr17qhgVI45tSdCLeLISZ0MxXJGgVE3leVIHzkcs5";
		String accessToken = "904953399375937536-XKRDhSVgDREHTBJzfmz3WbrR4RRBS0b";
		String accessTokenSecret = "Za4intqRTZobnwR6tDAbWG27jgFBQuZXle0M4HvMl7Ogl";
		 


		StringBuffer buffer = new StringBuffer();
		try {
			/** 
			 * get the time - note: value below zero 
			 * the millisecond value is used for oauth_nonce later on
			 */
			int millis = (int) System.currentTimeMillis() * -1;
			int time = (int) millis / 1000;

			/**
			 * Listing of all parameters necessary to retrieve a token
			 * (sorted lexicographically as demanded)
			 */
			String[][] data = {
					
					{"oauth_consumer_key", consumerKey},
					{"oauth_nonce",  String.valueOf(millis)},
					{"oauth_signature", ""},
					{"oauth_signature_method", "HMAC-SHA1"},
					{"oauth_timestamp", String.valueOf(time)},
					{"oauth_version", "1.0"}
			};

			/**
			 * Generation of the signature base string
			 */
			String signature_base_string = "POST&" + URLEncoder.encode(url, "UTF-8") + "&";
			for (int i = 0; i < data.length; i++) {
				// ignore the empty oauth_signature field
				if (i != 3) {
					signature_base_string +=
							URLEncoder.encode(data[i][0], "UTF-8") + "%3D" +
									URLEncoder.encode(data[i][1], "UTF-8") + "%26";
				}
			}
			// cut the last appended %26 
			signature_base_string = signature_base_string.substring(0,
					signature_base_string.length()-3);

			/**
			 * Sign the request
			 */
			Mac m = Mac.getInstance("HmacSHA1");
			m.init(new SecretKeySpec(consumerSecret.getBytes(), "HmacSHA1"));
			m.update(signature_base_string.getBytes());
			byte[] res = m.doFinal();
			String sig = String.valueOf(Base64Coder.encode(res));
				
			
			data[3][1] = sig;

			/**
			 * Create the header for the request
			 */
			String header = "OAuth ";
			for(String[] item : data) {
				header += item[0]+"=\""+item[1]+"\", ";
			}
			// cut off last appended comma
			header = header.substring(0, header.length()-2);

			System.out.println("Signature Base String: "+signature_base_string);
			System.out.println("Authorization Header: "+header);
			System.out.println("Signature: "+sig);

			String charset = "UTF-8";
			URLConnection connection = new URL(url).openConnection();
			connection.setDoInput(true);
			connection.setDoOutput(true);
			connection.setRequestProperty("Accept-Charset", charset);
			connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded;charset=" + charset);
			connection.setRequestProperty("Authorization", header);
			connection.setRequestProperty("User-Agent", "XXXX");
			OutputStream output = connection.getOutputStream();
			output.write(header.getBytes(charset));

			BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

			String read;
			while((read = reader.readLine()) != null) {
				buffer.append(read);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}

		return buffer.toString();
	}

}
