package myjackson.bus;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;


public class MessageBody {
	@JacksonXmlProperty		//	xml의 엘리먼트임을 명시, 엘리먼트 이름을 지정하지 않으면 멤버변수인 'busRouteList'로 지정
    @JacksonXmlElementWrapper(useWrapping = false)
	private List<MessageBodyBus> busRouteList;
	
	public MessageBody() {
		// TODO Auto-generated constructor stub
	}
	public List<MessageBodyBus> getBusRouteList() {
		return busRouteList;
	}
	public void setBusRouteList(List<MessageBodyBus> busRouteList) {
		this.busRouteList = busRouteList;
	}

}