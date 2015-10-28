package springtraining.interceptors;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class MaintenanceInterceptor extends HandlerInterceptorAdapter {

	private int maintenanceStartTime = 18;
	private int maintenanceEndTime = 19;
	private String maintenanceMapping = "maintenancepage";

	public void setMaintenanceMapping(String maintenanceMapping) {
		this.maintenanceMapping = maintenanceMapping;
	}

	// before the actual handler will be executed
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("MaintenanceInterceptor: REQUEST Intercepted for URI: " + request.getRequestURI());

		Calendar cal = Calendar.getInstance();
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		if (hour >= maintenanceStartTime && hour <= maintenanceEndTime) {
			// maintenance time, send to maintenance page
			System.out.println("Page redirected");
			response.sendRedirect(maintenanceMapping);
			return false;
		} else {
			return true;
		}
	}

	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler,Exception exceptionIfAny) {
		System.out.println(
				"MaintenanceInterceptor afterCompletion(): REQUEST Intercepted for URI: " + request.getRequestURI());
	}
}