package rest;

public class GetDocument {
	private final long id;
	private final String content;

	public GetDocument(long id, String content) {
		this.id = id;
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}

}
