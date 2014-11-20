package sk.upjs.ics.novotnyr.springmvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.HttpSessionRequiredException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SessionDemoController {
	@RequestMapping("/")
	public String createSession(HttpSession httpSession) {
		return "OK";
	}
	
	@RequestMapping("/session-status")
	public String getSessionInfo(HttpServletRequest request) throws HttpSessionRequiredException {
		HttpSession session = request.getSession(/*do not create*/ false);
		if(session == null) {
			throw new HttpSessionRequiredException("A session has expired or is not available");
		}
		return session.getId();
	}	
}
