package weather;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "Weather")
public class Weather implements Serializable{
	public Weather() {}
	
	
	@Override
	public String toString() {
		return "Weather [city=" + city + ", tmEf=" + tmEf + ", wf=" + wf + ", tmn=" + tmn + ", tmx=" + tmx + "]";
	}

	public Weather(String city, String tmEf, String wf, String tmn, String tmx) {
		this.city = city;
		this.tmEf = tmEf;
		this.wf = wf;
		this.tmn = tmn;
		this.tmx = tmx;
	}
	
	@Id
	@Column(name = "city")
	private String city;
	
	@Id
   @Column(name = "dt")
	private String tmEf;
   




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((tmEf == null) ? 0 : tmEf.hashCode());
		result = prime * result + ((tmn == null) ? 0 : tmn.hashCode());
		result = prime * result + ((tmx == null) ? 0 : tmx.hashCode());
		result = prime * result + ((wf == null) ? 0 : wf.hashCode());
		return result;
	}


@Column(name = "wf")
	private String wf;
   
   @Column(name = "tmn")
	private String tmn;
   
   @Column(name = "tmx")
	private String tmx;

	
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getTmEf() {
		return tmEf;
	}
	
	public void setTmEf(String tmEf) {
		this.tmEf = tmEf;
	}
	
	public String getWf() {
		return wf;
	}
	
	public void setWf(String wf) {
		this.wf = wf;
	}
	
	public String getTmn() {
		return tmn;
	}
	
	public void setTmn(String tmn) {
		this.tmn = tmn;
	}
	
	public String getTmx() {
		return tmx;
	}
	
	public void setTmx(String tmx) {
		this.tmx = tmx;
	}

}
