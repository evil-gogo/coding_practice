package goldmansachs;

public class Channel {

	public static void main(String[] args) {
		int count = min_count("1,100", "24,35,35,64");
		System.out.println(count);
	}
	
	public static int min_count(String range,String channel) { 
		int flag = 1;
		String array[] = range.split(",");
		String array2[] = channel.split(",");
		int first_channel = Integer.parseInt(array[0]);
		int last_channel = Integer.parseInt(array[1]);
		int current_channel = first_channel;
		int count_clicks = 0;
		int click2 = 10000;
		int click3 = 10000;
		for (int x = 0; x < array2.length; x++)	{
			int change_channel = Integer.parseInt(array2[x]);
			if (change_channel > last_channel || change_channel < first_channel) {
				flag = 0;
			}
			int click1 = array2[x].length();
			if (x >= 2) {
				if (array2[x - 2].equals(array2[x])) {
					click2 = 1;
				}
			}
			if (current_channel < change_channel) {
				int temp_count = Math.abs(current_channel - change_channel);
				int temp_count2 = Math.abs(first_channel - current_channel);
				int temp_count3 = Math.abs(change_channel - last_channel);
				int temp_count4 = temp_count2 + temp_count3;
				click3 = Math.min(temp_count, temp_count4);
			}
			if (current_channel > change_channel) {
				int temp_count = Math.abs(current_channel - change_channel);
				int temp_count2 = Math.abs(first_channel - change_channel);
				int temp_count3 = Math.abs(current_channel - last_channel);
				int temp_count4 = temp_count2 + temp_count3;
				click3 = Math.min(temp_count, temp_count4);
			}
			int minimum_count = Math.min(click1, Math.min(click2, click3));
			count_clicks = count_clicks + minimum_count;
			current_channel = change_channel;
		} 
		if (flag == 1) {
			return count_clicks;
		} else {
			return 0;
		}
	}
}

