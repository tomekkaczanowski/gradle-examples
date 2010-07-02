package web;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;

public class IndexPage extends WebPage {
	/**
	 * Constructor
	 */
	public IndexPage() {
		add(new Label("title", "Gradle Web App"));
		add(new Label("info", "A simple Wicket-based web app just to present how Gradle can handle it."));
	}

}
