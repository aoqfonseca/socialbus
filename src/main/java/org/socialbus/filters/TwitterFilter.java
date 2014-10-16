package org.socialbus.filters;

import java.util.List;

public class TwitterFilter {

	private List<String> screenUserNames;
	private List<String> hashTags;

	public List<String> getScreenUserNames() {
		return screenUserNames;
	}

	public void setScreenUserNames(List<String> screenUserNames) {
		this.screenUserNames = screenUserNames;
	}

	public List<String> getHashTags() {
		return hashTags;
	}

	public void setHashTags(List<String> hashTags) {
		this.hashTags = hashTags;
	}

	public void addUser(String user) {
		this.screenUserNames.add(user);
	}

	public void addHastags(String hashtag) {
		this.screenUserNames.add(hashtag);
	}

}
