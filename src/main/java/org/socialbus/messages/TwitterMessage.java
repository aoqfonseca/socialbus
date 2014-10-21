package org.socialbus.messages;

public class TwitterMessage {

	public final Long authorId;
	public final String screenName;
	public final String text;
	public final String originalMessage;

	public TwitterMessage(Long authorId, String screenName, String text,
			String originalMessage) {

		this.authorId = authorId;
		this.screenName = screenName;
		this.text = text;
		this.originalMessage = originalMessage;
	}

}
