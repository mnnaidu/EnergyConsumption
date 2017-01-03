package com.oroprise.enc.dto;

import java.io.Serializable;
import java.util.Comparator;

@SuppressWarnings("serial")
public class Fraction implements Serializable {

	private Integer id;
	private String month;
	private String profile;
	private String year;
	private String fraction;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getFraction() {
		return fraction;
	}

	public void setFraction(String fraction) {
		this.fraction = fraction;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		if (obj instanceof Fraction) {
			final Fraction fraction = (Fraction) obj;
			if (this.month != null && this.profile != null && this.year != null) {
				if (this.month.equals(fraction.month)
						&& this.profile.equals(fraction.profile)
						&& this.year.equals(fraction.year)) {
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
	
	public final Comparator<Fraction>  bymonth = new Comparator<Fraction>() {
        public int compare(Fraction f1, Fraction f2) {
            return f1.month.compareTo(f2.month);
        }
        public boolean equals(Object o) {
            return o == this;
        }
    };

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Fraction [id=").append(id).append(", month=")
				.append(month).append(", profile=").append(profile)
				.append(", fraction=").append(fraction).append("]");
		return builder.toString();
	}

}
