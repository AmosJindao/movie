package com.rss.bean;

import java.util.List;

/**
 * http://www.rssboard.org/rss-specification
 *
 * @author shengri
 * @date 5/6/19
 */
public class RssFeed {
    public RssChannelGlobal channel;

    public List<RssItem> items;

    public RssFeed(RssChannelGlobal channel, List<RssItem> items) {
        this.channel = channel;
        this.items = items;
    }
}
