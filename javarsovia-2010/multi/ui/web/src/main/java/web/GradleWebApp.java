package web;

import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;

public class GradleWebApp extends WebApplication {
    /**
     * Constructor.
     */
    public GradleWebApp()
    {

    }

	@Override
	public Class<? extends Page> getHomePage() {
		return IndexPage.class;
	}

}
