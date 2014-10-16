package org.socialbus.listerners.twitter;

import org.socialbus.messages.TwitterMessage;

public interface TwitterListener {
	
	public void onMessage(TwitterMessage message);

}
