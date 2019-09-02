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
