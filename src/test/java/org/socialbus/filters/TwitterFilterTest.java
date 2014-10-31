package org.socialbus.filters;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.junit.Assert.*;

public class TwitterFilterTest {

    @Test
    public void tetCreateANewFilter() {
        String[] screenNames = {"@test"};
        String[] hashtags = {"#test"};
        String urlCallback = "http://test.com";

        TwitterFilter filter = new TwitterFilter(screenNames, hashtags, urlCallback);
        assertThat(filter.allScreenUsernames(), CoreMatchers.hasItems(screenNames));
        assertThat(filter.allHashtags(), CoreMatchers.hasItems(hashtags));
        assertEquals(filter.urlCallback, urlCallback);
    }

    @Test
    public void tetCheckContainsUser() {
        String[] screenNames = {"@test1", "@test2"};
        String[] hashtags = new String[0];
        String urlCallback = "http://test.com";
        TwitterFilter filter = new TwitterFilter(screenNames, hashtags, urlCallback);
        assertTrue(filter.hasScreenNameUser("@test1"));
        assertFalse(filter.hasScreenNameUser("notpresent"));
    }

    @Test
    public void tetCheckContainsHahtag() {
        String[] screenNames = new String[0];
        String[] hashtags = {"#test1", "#test2"};
        String urlCallback = "http://test.com";
        TwitterFilter filter = new TwitterFilter(screenNames, hashtags, urlCallback);
        assertTrue(filter.hasHashtag("#test1"));
        assertFalse(filter.hasHashtag("notpresent"));
    }

}
