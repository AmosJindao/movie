package com.rss.bean;

/**
 * @author shengri
 * @date 5/7/19
 */
public class RssChannelGlobal {

    //Required channel elements
    /**
     * The name of the channel. It's how people refer to your service.
     * If you have an HTML website that contains the same information as your RSS file,
     * the title of your channel should be the same as the title of your website.
     * Example: GoUpstate.com News Headlines
     **/
    public String title;

    /**
     * The URL to the HTML website corresponding to the channel.
     * Example: http://www.goupstate.com/
     */
    public String link;

    /**
     * Phrase or sentence describing the channel.
     * Example: The latest news from GoUpstate.com, a Spartanburg Herald-Journal Web site.
     **/
    public String description;


//optional channel elements
    /**
     * The language the channel is written in. This allows aggregators to group all Italian language sites,
     * for example, on a single page.
     * A list of allowable values for this element, as provided by Netscape, is here(http://www.rssboard.org/rss-language-codes).
     * You may also use values defined(https://www.w3.org/TR/REC-html40/struct/dirlang.html#langcodes) by the W3C.
     * Example: en-us
     */
    public String language;

    /**
     * Copyright notice for content in the channel.
     * Example: Copyright 2002, Spartanburg Herald-Journal
     */
    public String copyright;

    /**
     * Email address for person responsible for editorial content.
     * <p>
     * Example: geo@herald.com (George Matesky)
     */
    public String managingEditor;

    /**
     * Email address for person responsible for technical issues relating to channel.
     * Example: betty@herald.com (Betty Guernsey)
     */
    public String webMaster;

    /**
     * The publication date for the content in the channel.
     * For example, the New York Times publishes on a daily basis, the publication date flips once every 24 hours.
     * That's when the pubDate of the channel changes.
     * All date-times in RSS conform to the Date and Time Specification of RFC 822, with the exception that the year may be expressed with two characters or four characters (four preferred).
     * <p>
     * Example: Sat, 07 Sep 2002 00:00:01 GMT
     */
    public String pubDate;

    /**
     * The last time the content of the channel changed.
     * Example: Sat, 07 Sep 2002 09:42:31 GMT
     */
    public String lastBuildDate;
    /**
     * Specify one or more categories that the channel belongs to.
     * Follows the same rules as the <item>-level category element. More info.
     * Example: <category>Newspapers</category>
     */
    public String category;
    /**
     * A string indicating the program used to generate the channel.
     * Example: MightyInHouse Content System v2.3
     */
    public String generator;
    /**
     * A URL that points to the documentation for the format used in the RSS file.
     * It's probably a pointer to this page. It's for people who might stumble across an RSS file on a Web server 25 years from now and wonder what it is.
     * Example: http://www.rssboard.org/rss-specification
     */
    public String docs;
    /**
     * Allows processes to register with a cloud to be notified of updates to the channel,
     * implementing a lightweight publish-subscribe protocol for RSS feeds. More info here.
     * Example: <cloud domain="rpc.sys.com" port="80" path="/RPC2" registerProcedure="pingMe" protocol="soap"/>
     */
    public RssCompositeElement cloud;
    /**
     * stands for time to live.
     * It's a number of minutes that indicates how long a channel can be cached before refreshing from the source. More info here.
     * Example: <ttl>60</ttl>
     */
    public Integer ttl;

    /**
     * Specifies a GIF, JPEG or PNG image that can be displayed with the channel. More info here.
     */
    public RssImage image;
    /**
     * The PICS rating for the channel.
     */
    public String rating;
    /**
     * Specifies a text input box that can be displayed with the channel. More info here.
     */
    public RssTextInput textInput;
    /**
     * A hint for aggregators telling them which hours they can skip.
     * This element contains up to 24 <hour> sub-elements whose value is a number between 0 and 23, representing a time in GMT, when aggregators,
     * if they support the feature, may not read the channel on hours listed in the <skipHours> element. The hour beginning at midnight is hour zero.
     */
    public String skipHours;
    /**
     * A hint for aggregators telling them which days they can skip.
     * This element contains up to seven <day> sub-elements whose value is Monday, Tuesday, Wednesday, Thursday, Friday, Saturday or Sunday.
     * Aggregators may not read the channel during days listed in the <skipDays> element.
     */
    public String skipDays;
}
