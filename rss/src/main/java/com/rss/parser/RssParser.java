package com.rss.parser;

import com.rss.bean.RssChannelGlobal;
import com.rss.bean.RssItem;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;
import java.util.*;

/**
 * @author shengri
 * @date 5/6/19
 */
public class RssParser {
//    static final String TITLE = "title";
//    static final String DESCRIPTION = "description";
//    static final String CHANNEL = "channel";
//    static final String LANGUAGE = "language";
//    static final String COPYRIGHT = "copyright";
//    static final String LINK = "link";
//    static final String AUTHOR = "author";
//    static final String ITEM = "item";
//    static final String PUB_DATE = "pubDate";
//    static final String GUID = "guid";
//
//    final URL url;
//
//    public RssParser(String feedUrl) {
//        try {
//            this.url = new URL(feedUrl);
//        } catch (MalformedURLException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    public RssFeed readFeed() {
//        RssFeed feed = null;
//        try {
//            boolean isFeedHeader = true;
//            // Set header values intial to the empty string
//            String description = "";
//            String title = "";
//            String link = "";
//            String language = "";
//            String copyright = "";
//            String author = "";
//            String pubdate = "";
//            String guid = "";
//
//            // First create a new XMLInputFactory
//            XMLInputFactory inputFactory = XMLInputFactory.newInstance();
//            // Setup a new eventReader
//            InputStream in = read();
//            XMLEventReader eventReader = inputFactory.createXMLEventReader(in);
//            // read the XML document
//            while (eventReader.hasNext()) {
//                XMLEvent event = eventReader.nextEvent();
//                if (event.isStartElement()) {
//                    String localPart = event.asStartElement().getName()
//                            .getLocalPart();
//                    switch (localPart) {
//                        case ITEM:
//                            if (isFeedHeader) {
//                                isFeedHeader = false;
//                                feed = new RssFeed(title, link, description, language,
//                                        copyright, pubdate);
//                            }
//                            event = eventReader.nextEvent();
//                            break;
//                        case TITLE:
//                            title = getCharacterData(event, eventReader);
//                            break;
//                        case DESCRIPTION:
//                            description = getCharacterData(event, eventReader);
//                            break;
//                        case LINK:
//                            link = getCharacterData(event, eventReader);
//                            break;
//                        case GUID:
//                            guid = getCharacterData(event, eventReader);
//                            break;
//                        case LANGUAGE:
//                            language = getCharacterData(event, eventReader);
//                            break;
//                        case AUTHOR:
//                            author = getCharacterData(event, eventReader);
//                            break;
//                        case PUB_DATE:
//                            pubdate = getCharacterData(event, eventReader);
//                            break;
//                        case COPYRIGHT:
//                            copyright = getCharacterData(event, eventReader);
//                            break;
//                    }
//                } else if (event.isEndElement()) {
//                    if (event.asEndElement().getName().getLocalPart() == (ITEM)) {
//                        RssItem message = new RssItem();
//                        message.author = author;
//                        message.description = description;
//                        message.guid = guid;
//                        message.link = link;
//                        message.title = title;
//
//                        feed.entries.add(message);
//
//                        event = eventReader.nextEvent();
//                        continue;
//                    }
//                }
//            }
//        } catch (XMLStreamException e) {
//            throw new RuntimeException(e);
//        }
//        return feed;
//    }
//
//    private String getCharacterData(XMLEvent event, XMLEventReader eventReader)
//            throws XMLStreamException {
//        String result = "";
//        event = eventReader.nextEvent();
//        if (event instanceof Characters) {
//            result = event.asCharacters().getData();
//        }
//        return result;
//    }
//
//    private InputStream read() {
//        try {
//            return url.openStream();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        File inputFile = new File("/home/shengri/Downloads/rss/weather.xml");
        SAXParserFactory factory = SAXParserFactory.newInstance();

        SAXParser saxParser = factory.newSAXParser();
        RSSParserHandler rssParserHandler = new RSSParserHandler();

        saxParser.parse(inputFile, rssParserHandler);

    }

    public static class RSSParserHandler extends DefaultHandler {
        boolean isGlobal = true;
        RssChannelGlobal global = new RssChannelGlobal();

        Map<String, String> nameSpaceMap = new HashMap<>();

        //This is the list which shall be populated while parsing the XML.
        private List<RssItem> items = new LinkedList<>();

        private Stack<String> elementStack = new Stack<>();
        private Stack<RssItem> objectStack = new Stack<>();
        private String currentPath = "/";

//        public void startDocument() throws SAXException {
//            System.out.println("start of the document   : ");
//        }
//
//        public void endDocument() throws SAXException {
//            System.out.println("end of the document document     : ");
//        }

        public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
            this.elementStack.push(qName);

//            System.out.println(String.join("/",elementStack));

            if ("rss".equals(qName)) {
                if (attributes != null && attributes.getLength() > 0) {
                    for (int i = 0; i < attributes.getLength(); i++) {
                        String attrName = attributes.getQName(i);

                        if ("version".equals(attrName)) {
                            continue;
                        }

                        String nameSpace = attrName;
                        int idx = attrName.indexOf(":");//xmlns:
                        if (idx >= 0) {
                            nameSpace = attrName.substring(idx + 1);
                        }

                        nameSpaceMap.put(nameSpace, attributes.getValue(i));
//                        System.out.println(attributes.getQName(i) + ":" + attributes.getValue(i));
                    }
                }
            }



            if (attributes != null && attributes.getLength() == 1) {
//                    user.setId(Integer.parseInt(attributes.getValue(0)));
            }
//                this.objectStack.push(user);
            this.objectStack.push(null);
        }

        public void endElement(String uri, String localName, String qName) throws SAXException {
            //Remove last added  element
            this.elementStack.pop();

            //User instance has been constructed so pop it from object stack and push in items
//            if ("item".equals(qName)) {
//                RssItem object = this.objectStack.pop();
//                this.items.add(object);
//            }
        }

        /**
         * This will be called everytime parser encounter a value node
         */
        public void characters(char[] ch, int start, int length) throws SAXException {
            String value = new String(ch, start, length).trim();

            if (value.length() == 0) {
                return; // ignore white space
            }
        }

        /**
         * Utility method for getting the current element in processing
         */
        private String currentElement() {
            return this.elementStack.peek();
        }

        //Accessor for items object
//        public List<RssItem> getUsers() {
//            return items;
//        }
    }

}
