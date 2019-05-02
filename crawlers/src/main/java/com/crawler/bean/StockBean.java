package com.crawler.bean;

/**
 * "Symbol","Name","LastSale","MarketCap","IPOyear","Sector","industry","Summary Quote",
 * "YI","111, Inc.","8.15","$664.58M","2018","Health Care","Medical/Nursing Services","https://www.nasdaq.com/symbol/yi",
 * "PIH","1347 Property Insurance Holdings, Inc.","5.05","$30.36M","2014","Finance","Property-Casualty Insurers","https://www.nasdaq.com/symbol/pih",
 *
 * @author shengri
 * @date 5/1/19
 */
public class StockBean {

    private String country;
    private String exchange;

    private String symbol;
    private String name;
    private String lastSale;
    private String marketCap;
    private String ipoYear;
    private String sector;
    private String industry;
    private String summaryQuote;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastSale() {
        return lastSale;
    }

    public void setLastSale(String lastSale) {
        this.lastSale = lastSale;
    }

    public String getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(String marketCap) {
        this.marketCap = marketCap;
    }

    public String getIpoYear() {
        return ipoYear;
    }

    public void setIpoYear(String ipoYear) {
        this.ipoYear = ipoYear;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getSummaryQuote() {
        return summaryQuote;
    }

    public void setSummaryQuote(String summaryQuote) {
        this.summaryQuote = summaryQuote;
    }
}
