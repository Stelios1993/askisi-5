
public class Song {
	
	static Song songs[] = new Song [10];
	static int countSong=0; 
	private String title;
	private Singer singer;
	private String url;
	
	public Song (String title , Singer singer , String url) {
		
		this.title=title;
		this.singer=singer;
		this.url=url;
		songs[countSong]=this;
		++countSong;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title=title;
	}
	public Singer getSinger() {
		return singer;
	}
	public void setSinger(Singer singer) {
		this.singer=singer;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url=url;
	}
	public String toString() {
		return "[Song=" + title +","  + "url to listen=" + url + "]";
	}
}
