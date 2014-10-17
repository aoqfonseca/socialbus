package org.socialbus.filters;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TwitterFilter {

	private final List<String> screenNames;
	private final List<String> hashtags;
	public final String urlCallback;

	public TwitterFilter(String[] screenNames, String[] hashtags, String urlCallback) {
		
		this.screenNames = Collections.unmodifiableList(Arrays
				.asList(screenNames));
		
		this.hashtags = Collections.unmodifiableList(Arrays
				.asList(hashtags));
		
		this.urlCallback = urlCallback;
	}

	public List<String> allScreenUsernames() {
		return screenNames;
	}

	public List<String> allHashtags() {
		return hashtags;
	}

	public boolean hasScreenNameUser(String screenName) {
		return this.screenNames.contains(screenName);
	}

	public boolean hasHashtag(String hashtag) {
		return this.hashtags.contains(hashtag);
	}

}
