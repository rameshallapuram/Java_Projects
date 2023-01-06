package SpringProject.Demo1.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Emp {
	private String name;
	private List<String> addresses;
	private Set<Integer> phones;
	private Map<String, String> courses;
	private Properties props;
	
	public Properties getProps() {
		return props;
	}
	public void setProps(Properties props) {
		this.props = props;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<String> addresses) {
		this.addresses = addresses;
	}
	public Set<Integer> getPhones() {
		return phones;
	}
	public void setPhones(Set<Integer> phones) {
		this.phones = phones;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	public Emp(String name, List<String> addresses, Set<Integer> phones, Map<String, String> courses, Properties props) {
		super();
		this.name = name;
		this.addresses = addresses;
		this.phones = phones;
		this.courses = courses;
		this.props = props;
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}	
}
