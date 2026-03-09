package com.isrdc.exceptions;

import java.time.LocalDateTime;

public class ExcepInfo {
	private String excepCode;
	private String excepDescription;
	private LocalDateTime excepDateTime;
	
	public String getExcepCode() {
		return excepCode;
	}
	public void setExcepCode(String excepCode) {
		this.excepCode = excepCode;
	}
	public String getExcepDescription() {
		return excepDescription;
	}
	public void setExcepDescription(String excepDescription) {
		this.excepDescription = excepDescription;
	}
	public LocalDateTime getExcepDateTime() {
		return excepDateTime;
	}
	public void setExcepDateTime(LocalDateTime excepDateTime) {
		this.excepDateTime = excepDateTime;
	}
}
