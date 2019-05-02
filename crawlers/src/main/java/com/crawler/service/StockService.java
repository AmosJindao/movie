package com.crawler.service;

import com.crawler.bean.FileHttpResponse;
import com.crawler.bean.StockBean;
import com.crawler.bean.StringHttpResponse;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.LinkedList;
import java.util.List;

/**
 * https://www.nasdaq.com/screening/companies-by-name.aspx?letter=0&exchange=amex&render=download
 * https://www.nasdaq.com/screening/companies-by-name.aspx?letter=0&exchange=nyse&render=download
 * https://www.nasdaq.com/screening/companies-by-name.aspx?letter=0&exchange=nasdaq&render=download
 *
 * @author shengri
 * @date 4/30/19
 */
public class StockService {

    private HttpServiceImpl httpService = new HttpServiceImpl();

    public void getStockList() {
        String nasdq = "https://www.nasdaq.com/screening/companies-by-name.aspx?letter=0&exchange=nasdaq&render=download";

        try {
            FileHttpResponse pathReponse = httpService.downloadFile(nasdq);

            System.out.println(pathReponse.getContent());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void parseStockFile(String filePath) {
        try {
            List<StockBean> stockBeans = new LinkedList<>();

            List<String> lines = Files.readAllLines(Paths.get(filePath));

            lines.forEach(line -> {
                String[] strs = line.split(",");

                if (strs.length >= 8) {
                    StockBean stockBean = new StockBean();

                    stockBean.setSymbol(StringUtils.removeEnd(StringUtils.removeStart(strs[0], "\""), "\""));
                    stockBean.setName(StringUtils.removeEnd(StringUtils.removeStart(strs[1], "\""), "\""));
                    stockBean.setLastSale(StringUtils.removeEnd(StringUtils.removeStart(strs[2], "\""), "\""));
                    stockBean.setMarketCap(StringUtils.removeEnd(StringUtils.removeStart(strs[3], "\""), "\""));
                    stockBean.setIpoYear(StringUtils.removeEnd(StringUtils.removeStart(strs[4], "\""), "\""));
                    stockBean.setSector(StringUtils.removeEnd(StringUtils.removeStart(strs[5], "\""), "\""));
                    stockBean.setIndustry(StringUtils.removeEnd(StringUtils.removeStart(strs[6], "\""), "\""));
                    stockBean.setSummaryQuote(StringUtils.removeEnd(StringUtils.removeStart(strs[7], "\""), "\""));

                    stockBeans.add(stockBean);
                }

            });

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public String getStockDetail(String stockCode) {
        String url = "https://www.nasdaq.com/symbol/qiwi";

        try {
            StringHttpResponse result = (StringHttpResponse) httpService.getData(url, null
                    , null);

            return result.getContent();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static void main(String[] args) {
        StockService stockService = new StockService();
////
////        System.out.println(stockService.getStockDetail("qiwi"));

//        stockService.getStockList();

        stockService.parseStockFile("/tmp/netD_2811864321436671907.tmp");
    }
}
