package org.socalbus.client

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.hasItem;


public class TwitterClientTest {

    private TwitterClient twitterClient;
    private List<String> terms;
    private List<Long> followings;

    @Before
    public void setUp() throws Exception {
        terms = new ArrayList<String>();
        followings = new ArrayList<Long>();
        twitterClient = new TwitterClient(terms, followings);
    }

    @Test public void testCreateNewClient() throws Exception {

        assertEquals(twitterClient.following, followings);
        assertEquals(twitterClient.terms, terms);
    }

    @Test public void testAddingTerms() throws Exception {
        twitterClient.addTerms("new term");
        assertThat(twitterClient.terms, hasItem("new term"));

    }
    @Test public void testAddingFollowing() throws Exception {
        twitterClient.addFollowing(123456L);
        assertThat(twitterClient.following, hasItem(123456L));

    }
}