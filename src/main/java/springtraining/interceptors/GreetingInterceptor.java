package springtraining.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

@Component
public class GreetingInterceptor extends HandlerInterceptorAdapter {
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("GreetingInterceptor preHandle(): REQUEST Intercepted for URI: " + request.getRequestURI());
		request.setAttribute("greeting", "Hi, Have a good day!");
		return true;
	}

	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) {
		System.out.println("GreetingInterceptor postHandle(): REQUEST Intercepted for URI: " + request.getRequestURI());
	}

	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler,Exception ex) {
		System.out.println(
				"GreetingInterceptor afterCompletion(): REQUEST Intercepted for URI: " + request.getRequestURI());
	}
}