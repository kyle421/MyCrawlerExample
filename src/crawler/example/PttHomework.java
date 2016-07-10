package crawler.example;

import com.github.abola.crawler.CrawlerPack;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


/**
 * 簡易練習
 * 
 * 找出所有文章中按推的id
 * 
 * @author Abola Lee
 *
 */
public class PttHomework {
	
	public static void main(String[] args) {
		String uri = "https://www.ptt.cc/bbs/Gossiping/M.1468114062.A.3B4.html";
		

//		System.out.println(
//			CrawlerPack.start()
//			    .addCookie("over18", "1")
//				.getFromHtml(uri)
//					.select("div.push")
////				.select(".push-tag:matchesOwn(推),.push-userid,.push-content")
////					.select(".push-tag:matchesOwn(推),.push-tag:matchesOwn(推)+.push-userid")
////				.select("body:matches()")
//				.toString()
//		);
		Document jsoup=CrawlerPack.start()
				.addCookie("over18", "1")
				.getFromHtml(uri);
		Elements feed=jsoup.select("div.push");
		System.out.print(feed);
		for(Element ele :feed){
			System.out.print(ele.select(".push-tag").text());
			System.out.print(","+ele.select(".push-userid").text());
			System.out.print(","+ele.select(".push-content").text());
			System.out.println();
		}

	}

}

