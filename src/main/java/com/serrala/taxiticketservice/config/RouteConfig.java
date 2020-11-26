package com.serrala.taxiticketservice.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Configuration;

@Configuration
public class RouteConfig {
	List<Route> routeMap = new ArrayList<Route>();

	//Initializing the route details
	{
		Route punMum = new Route("PUNE","MUMBAI",120);
		Route punNas = new Route("PUNE","NASIK",200);
		Route mumNas = new Route("MUMBAI","NASIK",180);
		Route mumGoa = new Route("MUMBAI","GOA",380);
		
		routeMap.add(mumGoa);
		routeMap.add(mumNas);
		routeMap.add(punMum);
		routeMap.add(punNas);
	}
	/**
	 * @return the routeMap
	 */
	public List<Route> getRouteMap() {
		return routeMap;
	}

	/**
	 * @param routeMap the routeMap to set
	 */
	public void setRouteMap(List<Route> routeMap) {
		this.routeMap = routeMap;
	}

}
