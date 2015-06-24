package be.ictdynamic.application;

import be.ictdynamic.ui.HelloWorld;
import org.apache.wicket.protocol.http.WebApplication;

public class HelloWorldApplication extends WebApplication {

    protected void init() {
    }

    public Class getHomePage() {
        return HelloWorld.class;
    }
}
