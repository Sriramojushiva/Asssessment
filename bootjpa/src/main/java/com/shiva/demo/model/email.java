package com.shiva.demo.model;

import javax.persistence.Embeddable;



@Embeddable
public class email {

	private int eid;
	private String From;
	private String To;
	private String Sub;
	private String Body;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getFrom() {
		return From;
	}
	public void setFrom(String from) {
		From = from;
	}
	public String getTo() {
		return To;
	}
	public void setTo(String to) {
		To = to;
	}
	public String getSub() {
		return Sub;
	}
	public void setSub(String sub) {
		Sub = sub;
	}
	public String getBody() {
		return Body;
	}
	public void setBody(String body) {
		Body = body;
	}
	@Override
	public String toString() {
		return "email [eid=" + eid + ", From=" + From + ", To=" + To + ", Sub=" + Sub + ", Body=" + Body + "]";
	}
	
	
}
