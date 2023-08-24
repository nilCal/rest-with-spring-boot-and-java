package br.com.projeto.restwithspringbootandjava;

public class Hello {
	private final long id;
	private final String content;

	public Hello(long id, String content) {
		super();
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
