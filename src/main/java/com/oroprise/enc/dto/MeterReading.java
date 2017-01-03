package com.oroprise.enc.dto;

import java.io.Serializable;

@SuppressWarnings("serial")
public class MeterReading implements Serializable {

	private Integer id;
	private String connectionID;
	private String profile;
	private String month;
	private String year;
	private String meterReading;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getConnectionID() {
		return connectionID;
	}

	public void setConnectionID(String connectionID) {
		this.connectionID = connectionID;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getMeterReading() {
		return meterReading;
	}

	public void setMeterReading(String meterReading) {
		this.meterReading = meterReading;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		if (obj instanceof MeterReading) {
			final MeterReading meterReading = (MeterReading) obj;
			if (this.month != null && this.profile != null && this.year != null) {
				if (this.month.equals(meterReading.month)
						&& this.profile.equals(meterReading.profile)
						&& this.year.equals(meterReading.year)) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		int hash = 5;
		hash = 47 * hash + (this.month != null ? this.month.hashCode() : 0);
		hash = 47 * hash + (this.profile != null ? this.profile.hashCode() : 0);
		hash = 47 * hash + (this.year != null ? this.year.hashCode() : 0);
		return hash;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MeterReading [connectionID=").append(connectionID)
				.append(", profile=").append(profile).append(", month=")
				.append(month).append(", year=").append(year)
				.append(", meterReading=").append(meterReading).append("]");
		return builder.toString();
	}

}
