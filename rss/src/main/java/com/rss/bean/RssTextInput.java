package com.rss.bean;

/**
 * The purpose of the <textInput> element is something of a mystery.
 * You can use it to specify a search engine box. Or to allow a reader to provide feedback.
 * Most aggregators ignore it.
 *
 * @author shengri
 * @date 5/7/19
 */
public class RssTextInput {
    //required
    /**
     * <title> -- The label of the Submit button in the text input area.
     */
    public String title;
    /**
     * <description> -- Explains the text input area.
     */
    public String description;
    /**
     * <name> -- The name of the text object in the text input area.
     */
    public String name;
    /**
     * <link> -- The URL of the CGI script that processes text input requests.
     */
    public String link;
}
