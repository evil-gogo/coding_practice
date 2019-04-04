package lg;

public class MMWRelativePath {
	public static void main(String[] args) {
		String url = "http://127.24.1.191/embms/media/onDemand/media_S2_Conf_E.mp4";
		System.out.println(getMMWRelativePath(url));
		String testString = "http://127.0.0.1:35000/tree___9.jpg ";
		System.out.println(TestFXN(testString));
	}
	private static String TestFXN(String url) {
		// TODO Auto-generated method stub
		String fileName = url.substring(url.lastIndexOf("/") + 1);
		System.out.println(fileName);
		return null;
	}
	public static String getMMWRelativePath(String url){
		//String url = "http://127.24.1.191/embms/media/onDemand/media_S2_Conf_E.mp4";
		String path = null;
		int index = url.indexOf("://");
		System.out.println("Index " + index);
		String temp1 = url.substring(index + 3);
		System.out.println(temp1);
		int index2 = temp1.indexOf("/");
		int lastindex = temp1.lastIndexOf("/");
		path = temp1.substring(index2, lastindex);
		return path;
	}
}
