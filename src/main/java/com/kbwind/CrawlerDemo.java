package com.kbwind;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class CrawlerDemo {
    public String url;
    public String pName;

    public CrawlerDemo(String url, String pName) {
        this.url = url;
        this.pName = pName;
    }

    /**
    * @Description: 爬虫程序
    * @Param: []
    * @return: java.util.Set<com.kbwind.Product>
    * @Date: 2023/10/13
    */
    public Set<Product> Crawler() throws IOException {
        // 随机等待时间
        int waitTime = (int) (Math.random() * 1000);
        // 通过Jsoup连接url 获取Document对象
        Document document = Jsoup.connect(this.url + pName).get();
        // 通过class获取所有的product
        Elements products = document.body().getElementsByClass("product");
        // 用于存储Product对象实例
        Set<Product> productSet = new HashSet<>();
        // 用遍历从 Elements 中获取相应信息，利用这些信息生成Product对象
        for (Element product:products) {
            // 获取图片地址
            String pImage = product.getElementsByClass("image-div").first().select("img[src]").attr("src");
            // 获取价格
            float price = Float.parseFloat(product.getElementsByClass("yen").first().text().split(" ")[1]);
            // 获取产品名称
            String pName = product.select("a[title]").attr("title");
            // 生成Product对象
            Product prod = new Product(pImage, price, pName);
            productSet.add(prod);
        }
        return productSet;
    }
}
