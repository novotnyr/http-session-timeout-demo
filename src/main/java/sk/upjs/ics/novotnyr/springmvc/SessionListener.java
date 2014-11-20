package sk.upjs.ics.novotnyr.springmvc;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

@WebListener
public class SessionListener implements HttpSessionListener {
	private Log logger = LogFactory.getLog(SessionListener.class);
	
	private static final int ONE_MINUTE = 1 * 60 /* seconds */;
	
	private static final int TEN_SECONDS = 10 /* seconds */;
	
	private int sessionDuration = TEN_SECONDS;

	public void sessionCreated(HttpSessionEvent sessionEvent) {		
		sessionEvent.getSession().setMaxInactiveInterval(sessionDuration);
		logger.info("Session created and timeout set to " + sessionDuration + " seconds");
	}

	public void sessionDestroyed(HttpSessionEvent sessionEvent) {
		logger.info("Session destroyed");
	}

}