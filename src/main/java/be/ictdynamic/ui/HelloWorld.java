package be.ictdynamic.ui;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloWorld extends WebPage
{
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    public HelloWorld()
    {
        LOGGER.info(">>>executing HelloWorld()");
        add(new Label("message", "Hello World using Wicket!!"));
    }
}
