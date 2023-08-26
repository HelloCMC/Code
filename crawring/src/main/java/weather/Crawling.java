package weather;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Crawling {
	private static final String URL = "http://www.weather.go.kr/weather/forecast/mid-term-rss3.jsp?stnId=109"; //크롤링할 url지정
	
	public List<Weather> getWeatherInformation() throws IOException{
		List<Weather> lists = new ArrayList<>();
		
		Document doc = Jsoup.connect(URL).get();
		
		Elements locations = doc.select("location");
		
		
		for(Element element: locations) {
            String city = element.select("city").text();
            
            Elements datas = element.select("data");
            
            for(Element data : datas) {
                String tmEf = data.select("tmEf").text();
                String wf = data.select("wf").text();
                String tmn = data.select("tmn").text();
                String tmx = data.select("tmx").text();
                
                lists.add(new Weather(city, tmEf, wf, tmn, tmx));
            }
        }
		
		return lists;
	}
}
