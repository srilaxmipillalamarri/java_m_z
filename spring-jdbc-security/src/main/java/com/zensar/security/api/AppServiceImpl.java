package com.zensar.security.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class AppServiceImpl implements AppService{
	@Autowired
private AppRepository appRepository;
	@Override
	public App getApp(int appCode) {
		// TODO Auto-generated method stub
		return appRepository.findById(appCode).get();
	}

	@Override
	public List<App> getApps() {
		// TODO Auto-generated method stub
		return appRepository.findAll();
	}

	@Override
	public App insertApp(App app) {
		// TODO Auto-generated method stub
		return appRepository.save(app);
	}

	@Override
	public void deleteApp(int appCode) {
		// TODO Auto-generated method stub
		appRepository.deleteById(appCode);
		
	}

	@Override
	public App updateApp(int appCode, App app) {
		// TODO Auto-generated method stub
		return appRepository.save(app);
	}

}
