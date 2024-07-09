package springclasspackage;

public class Library {
	
	private String lib_id,lib_name;
	private Book b;
	
	public Book getB() {
		return b;
	}
	public void setB(Book b) {
		this.b = b;
	}
	public String getLib_id() {
		return lib_id;
	}
	public void setLib_id(String lib_id) {
		this.lib_id = lib_id;
	}
	public String getLib_name() {
		return lib_name;
	}
	public void setLib_name(String lib_name) {
		this.lib_name = lib_name;
	}
	
	
}
