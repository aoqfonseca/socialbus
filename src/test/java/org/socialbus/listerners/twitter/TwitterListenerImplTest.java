package org.socialbus.listerners.twitter;

import org.junit.Before;
import org.junit.Test;
import org.socialbus.filters.TwitterFilter;
import org.socialbus.messages.TwitterMessage;

import static org.junit.Assert.*;

public class TwitterListenerImplTest {

    private TwitterFilter filter;

    @Before
    public void setUp() throws Exception {
        String[] filterScreenName = {"@aoqfonseca"};
        String[] filterHashtags = new String[0];
        String filterUrlCallback = "http://test.com";
        this.filter = new TwitterFilter(filterScreenName, filterHashtags, filterUrlCallback);
    }

    @Test
    public void testImplementCorrectInterface() {
        TwitterListenerImpl t = new TwitterListenerImpl(this.filter);
        assertTrue(t instanceof TwitterListener);
    }

    @Test
    public void testOnMessage() {
        Long authorId = 1L;
        String screenName = "aoqfonseca";
        String text = "text";
        String jsonMessage = "{}";
        TwitterMessage mockMessage = new TwitterMessage(authorId, screenName, text, jsonMessage);

        TwitterListener listener = new TwitterListenerImpl(this.filter);
        listener.onMessage(mockMessage);
    }
}
