package com.globo.client;

import java.util.List;

/**
 * Created by andre on 05/08/14.
 */
public class TwitterClient {

    protected List<String> terms;

    protected List<Long> following;

    public TwitterClient(List<String> terms, List<Long> following) {
        this.terms = terms;
        this.following = following;
    }


    public void addTerms(String newTerm) {
        this.terms.add(newTerm);
    }

    public void addFollowing(long twitterUserId) {
        this.following.add(twitterUserId);
    }
}
