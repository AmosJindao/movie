package com.rss.bean;

import java.util.List;

/**
 * A channel may contain any number of <item>s. An item may represent a "story" -- much like a story in a newspaper or magazine;
 * if so its description is a synopsis of the story, and the link points to the full story.
 * An item may also be complete in itself, if so, the description contains the text (entity-encoded HTML is allowed; see examples),
 * and the link and title may be omitted. All elements of an item are optional, however at least one of title or description must be present.
 *
 * @author shengri
 * @date 5/6/19
 */
public class RssItem {
    /**
     * The title of the item.
     */
    public String title;
    /**
     * The URL of the item.
     */
    public String link;
    /**
     * The item synopsis.
     */
    public String description;

    /**
     * Email address of the author of the item
     *
     * It's the email address of the author of the item.
     * For newspapers and magazines syndicating via RSS, the author is the person who wrote the article that the <item> describes.
     * For collaborative weblogs, the author of the item might be different from the managing editor or webmaster.
     * For a weblog authored by a single individual it would make sense to omit the <author> element.
     *
     * <author>lawyer@boyer.net (Lawyer Boyer)</author>
     */
    public String author;
    /**
     * category	Includes the item in one or more categories.
     * Example:
     * <category>Grateful Dead</category>
     * <category domain="http://www.fool.com/cusips">MSFT</category>
     */
    public List<RssCompositeElement> categories;
    /**
     * comments	URL of a page for comments relating to the item. More.
     */
    public String comments;
    /**
     * enclosure	Describes a media object that is attached to the item. More.
     * Example: <enclosure url="http://www.scripting.com/mp3s/weatherReportSuite.mp3" length="12216320" type="audio/mpeg" />
     */
    public RssCompositeElement enclosure;
    /**
     * guid	A string that uniquely identifies the item. More.
     * guid stands for globally unique identifier. It's a string that uniquely identifies the item. When present, an aggregator may choose to use this string to determine if an item is new.
     *
     * <guid>http://some.server.com/weblogItem3207</guid>
     *
     * There are no rules for the syntax of a guid. Aggregators must view them as a string. It's up to the source of the feed to establish the uniqueness of the string.
     *
     * If the guid element has an attribute named isPermaLink with a value of true, the reader may assume that it is a permalink to the item, that is, a url that can be opened in a Web browser, that points to the full item described by the <item> element. An example:
     *
     * <guid isPermaLink="true">http://inessential.com/2002/09/01.php#a2</guid>
     *
     * isPermaLink is optional, its default value is true. If its value is false, the guid may not be assumed to be a url, or a url to anything in particular.
     */
    public RssCompositeElement guid;
    /**
     * pubDate	Indicates when the item was published. More.
     * Example: Sat, 07 Sep 2002 00:00:01 GMT
     */
    public String pubDate;
    /**
     * source	The RSS channel that the item came from. More.
     *
     * Example: <source url="http://www.tomalak.org/links2.xml">Tomalak's Realm</source>
     */
    public RssCompositeElement source;
}
