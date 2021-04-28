package ar.edu.unq.po2.wallpost;

public class Wallpost {

	private String text;
	private Integer likes;
	private boolean isFeatured;
	
	public Wallpost() {
		this.text="Undefined post";
		this.likes=0;
		this.isFeatured=false;
		
	}
	
	public String getText() {
		
		return this.text;
	}

	public Integer getLikes() {
		
		return this.likes;
	}

	public boolean isFeatured() {
		
		return this.isFeatured;
	}

	public void setText(String string) {
		this.text=string;
		
	}

	public void like() {
		this.likes = this.likes +1;
		
	}

	public void dislike() {
		this.likes = Math.max(this.likes-1, 0);
		
	}

	public void toggleFeatured() {
		this.isFeatured=! (this.isFeatured);
		
	}
}
