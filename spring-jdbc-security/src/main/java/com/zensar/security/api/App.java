package com.zensar.security.api;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class App {
	@Id
	private int appCode;
	private String appLink;
	private int appCost;
	private App() {
		super();
	}
	public int getAppCode() {
		return appCode;
	}
	public void setAppCode(int appCode) {
		this.appCode = appCode;
	}
	public String getAppLink() {
		return appLink;
	}
	public void setAppLink(String appLink) {
		this.appLink = appLink;
	}
	public int getAppCost() {
		return appCost;
	}
	public void setAppCost(int appCost) {
		this.appCost = appCost;
	}
	@Override
	public String toString() {
		return "Application [appCode=" + appCode + ", appLink=" + appLink + ", appCost=" + appCost + "]";
	}
}
