package com.ankush.pubsub.config;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import com.spotify.google.cloud.pubsub.client.Pubsub;

//import com.google.auth.Credentials;
//import com.google.auth.oauth2.ServiceAccountCredentials;
//import com.google.cloud.datastore.Datastore;
//import com.google.cloud.datastore.DatastoreOptions;

@Configuration
public class DataStoreConfiguration {

	@Autowired
	private ProjectConfig projectConfig;
	
	@Autowired
	private Pubsub pubSub;

//	@Value("{spring.profiles.active}")
	@Value("${spring.profiles.active}")
	private String profiles;
	@PostConstruct
	public void init() {
		System.out.println("In post construct..!!!");
		System.out.println(profiles);
		System.out.println(projectConfig.getEnv());
		System.out.println(projectConfig.getApplication());
		System.out.println(projectConfig.getGroup());
		System.out.println(projectConfig.getTeam());
		System.out.println(projectConfig.getGcp().getCredentials());
	}

//	public Datastore cloudDatastoreService() {
//		ServiceAccountCredentials credential = null;
//		Credentials credentials = null;
//		DatastoreOptions.newBuilder().setCredentials(credential);
//		return DatastoreOptions.getDefaultInstance().getService();
//	}
}
