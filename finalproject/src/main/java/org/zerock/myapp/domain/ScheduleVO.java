package org.zerock.myapp.domain;

public class ScheduleVO {

	private int rowNo;
	private int pid;
	private String uids;
	private String descript;
	private String place;
	private String addr;
	private int planDay;
	private int startTime;
	private double longitude;
	private double latitude;
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getUids() {
		return uids;
	}
	public void setUids(String uids) {
		this.uids = uids;
	}
	public String getDescript() {
		return descript;
	}
	public void setDescript(String descript) {
		this.descript = descript;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public int getPlanDay() {
		return planDay;
	}
	public void setPlanDay(int planDay) {
		this.planDay = planDay;
	}
	public int getStartTime() {
		return startTime;
	}
	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}
	
	public int getRowNo() {
		return rowNo;
	}
	public void setRowNo(int rowNo) {
		this.rowNo = rowNo;
	}
	
	@Override
	public String toString() {
		return "ScheduleVO [pid=" + pid + ", uids=" + uids + ", descript=" + descript + ", place=" + place
				+ ", addr=" + addr + ", longitude=" + longitude + ", latitude=" + latitude + ", planDay=" + planDay
				+ ", startTime=" + startTime + ", rowNo=" + rowNo + "]";
	}
	
	
	
}
