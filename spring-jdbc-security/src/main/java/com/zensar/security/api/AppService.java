package com.zensar.security.api;

import java.util.List;

public interface AppService {
	public App getApp(int appCode);

	public List<App> getApps();

	public App insertApp(App app);

	public void deleteApp(int studentId);

	public App updateApp(int appCode, App app);
}
