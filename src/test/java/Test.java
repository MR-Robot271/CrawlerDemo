import com.kbwind.CrawlerDemo;
import com.kbwind.Product;

import java.io.IOException;
import java.util.Set;

public class Test {
    public static void main(String[] args) throws IOException {
        // 搜索的地址
        String url="https://www.ehsy.com/search?k=";
        // 搜索的产品名
        String pName="伊内";
        CrawlerDemo crawlerDemo = new CrawlerDemo(url,pName);
        Set<Product> crawlerResult = crawlerDemo.Crawler();
        System.out.println("得到的数据量:"+crawlerResult.size());
        for(Product product:crawlerResult){
            System.out.println(product);
        }
    }
}
