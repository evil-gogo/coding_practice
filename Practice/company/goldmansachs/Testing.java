package goldmansachs;

public class Testing {
	public static void main(String[] args) {
		int count = getMinimumClicks("1,100", "94,95,66");
		System.out.println(count);
	}

	private static int getMinimumClicks(String inputChannelRange, String inputChannelSequence) {
		// TODO Auto-generated method stub
		int numberOfClicks = 0, firstChannel, lastChannel, currentChannel, nextChannel, keypadClicks, prevButtonClicks;
		int numberOfForwardButtonClicks, numberOfBackwardButtonClicks, numberOfManualClicks, minimumClicksToSwitch = -1;
		String channelRange[] = inputChannelRange.split(",");
		firstChannel = Integer.parseInt(channelRange[0]);
		lastChannel = Integer.parseInt(channelRange[1]);

		String channelSequence[] = inputChannelSequence.split(",");

		currentChannel = firstChannel;

		for (int channelNumber = 0; channelNumber < channelSequence.length; channelNumber++) {
			prevButtonClicks = -1;

			numberOfForwardButtonClicks = -1;
			numberOfBackwardButtonClicks = -1;

			nextChannel = Integer.parseInt(channelSequence[channelNumber]);

			//Validate Channel Number
			if (!checkChannelNumber(nextChannel, firstChannel, lastChannel)) {
				return 0;
			} 

			//Chaning Channel By Keypad Entering
			keypadClicks = channelSequence[channelNumber].length();


			//Changing by ForwarChannel or BackwardChannel Button 
			if (currentChannel < nextChannel) {
				numberOfForwardButtonClicks = Math.abs(currentChannel - nextChannel);
				numberOfBackwardButtonClicks = Math.abs(currentChannel - firstChannel) + Math.abs(lastChannel - nextChannel);
			}
			if (currentChannel > nextChannel) {
				numberOfBackwardButtonClicks = Math.abs(currentChannel - nextChannel);
				numberOfForwardButtonClicks = Math.abs(nextChannel - firstChannel) + Math.abs(lastChannel - currentChannel);				
			}
			if (currentChannel == nextChannel) {
				numberOfManualClicks = 0;
			} else {
				numberOfManualClicks = Math.min(numberOfForwardButtonClicks, numberOfBackwardButtonClicks);
			}
			minimumClicksToSwitch = Math.min(keypadClicks, numberOfManualClicks);

			//Changing Channel By Previous Channel  Button
			if (channelNumber >= 2 && isChannelPrevButton(channelSequence, channelNumber)) {
				prevButtonClicks = 1; 
				minimumClicksToSwitch = Math.min(prevButtonClicks, minimumClicksToSwitch);
			}

			numberOfClicks = numberOfClicks + minimumClicksToSwitch;
			currentChannel = nextChannel;
		}
		return numberOfClicks;
	}

	private static boolean isChannelPrevButton(String[] channelSequence, int channelNumber) {
		if (channelSequence[channelNumber - 2].equals(channelSequence[channelNumber])) {
			return true;
		} 
		return false;
	}

	private static boolean checkChannelNumber(int nextChannel, int minChannelNumber, int maxChannelNumber) {
		// TODO Auto-generated method stub
		if (nextChannel < minChannelNumber || nextChannel > maxChannelNumber) {
			return false;
		}
		return true;
	}
}
