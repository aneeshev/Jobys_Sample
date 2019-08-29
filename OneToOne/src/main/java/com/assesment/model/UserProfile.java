package com.assesment.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class UserProfile {
	
	@Id
	@GeneratedValue
	private long profileId;
	private String profileName;
	private String profileCode;
	@OneToOne
	private User user;
	
	public UserProfile() {
		super();
	}

	public UserProfile(String profileName, String profileCode) {
		super();
		this.profileName = profileName;
		this.profileCode = profileCode;
	}

	public long getProfileId() {
		return profileId;
	}

	public void setProfileId(long profileId) {
		this.profileId = profileId;
	}

	public String getProfileName() {
		return profileName;
	}
	public void setProfileName(String profileName) {
		this.profileName = profileName;
	}
	public String getProfileCode() {
		return profileCode;
	}
	public void setProfileCode(String profileCode) {
		this.profileCode = profileCode;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

//	@Override
//	public String toString() {
//		return "UserProfile [profileId=" + profileId + ", profileName=" + profileName + ", profileCode=" + profileCode
//				+ ", user=" + user + "]";
//	}
//	
	
}
