package com.rss.bean;

/**
 * @author shengri
 * @date 5/7/19
 */
public class RssImage {
    //required
    /**
     * <url> is the URL of a GIF, JPEG or PNG image that represents the channel.
     */
    public String url;
    /**
     *  <title> describes the image, it's used in the ALT attribute of the HTML <img> tag when the channel is rendered in HTML.
     */
    public String title;
    /**
     * <link> is the URL of the site, when the channel is rendered, the image is a link to the site.
     * (Note, in practice the image <title> and <link> should have the same value as the channel's <title> and <link>.
     */
    public String link;

    //Optional
    /**
     * <width> and <height>, numbers, indicating the width and height of the image in pixels.
     * Maximum value for width is 144, default value is 88.
     */
    public Integer width;
    /**
     * <width> and <height>, numbers, indicating the width and height of the image in pixels.
     * Maximum value for height is 400, default value is 31.
     */
    public Integer height;
    /**
     * <description> contains text that is included in the TITLE attribute of the link formed around the image in the HTML rendering.
     */
    public String description;
}
