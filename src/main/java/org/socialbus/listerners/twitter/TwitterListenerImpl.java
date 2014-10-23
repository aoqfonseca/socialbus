package org.socialbus.listerners.twitter;

import org.socialbus.filters.TwitterFilter;
import org.socialbus.messages.TwitterMessage;

public class TwitterListenerImpl implements TwitterListener {

    public TwitterFilter filter;

    public TwitterListenerImpl(TwitterFilter filter) {
        this.filter = filter;
    }

    @Override
    public void onMessage(TwitterMessage message) {
        filter.hasScreenNameUser(message.screenName);
    }


}
