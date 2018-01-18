public class Singer {
	
	static Singer singers[]=new Singer [10];
	private String name;
	private int id;
	
	static int counter=0;
	
	public Singer(String name) {
		this.name=name;
		singers[counter]=this;
		id=++counter;
	} 
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public String toString() {
		return "Singer [name=" + name + ","+ "id=" + id +"]";
	}

}
