package com.rubic.rfidimprovement.domain.datamodel;

import com.google.gson.annotations.SerializedName;

public class GetSessionActiveModel {

	@SerializedName("pst_id")
	private String pstId;

	@SerializedName("pic2_id")
	private String pic2Id;

	@SerializedName("pic1_id")
	private String pic1Id;

	@SerializedName("finish_date")
	private String finishDate;

	@SerializedName("session_count")
	private SessionCount sessionCount;

	@SerializedName("start_date")
	private String startDate;

	@SerializedName("status")
	private String status;

	public void setPstId(String pstId){
		this.pstId = pstId;
	}

	public String getPstId(){
		return pstId;
	}

	public void setPic2Id(String pic2Id){
		this.pic2Id = pic2Id;
	}

	public String getPic2Id(){
		return pic2Id;
	}

	public void setPic1Id(String pic1Id){
		this.pic1Id = pic1Id;
	}

	public String getPic1Id(){
		return pic1Id;
	}

	public void setFinishDate(String finishDate){
		this.finishDate = finishDate;
	}

	public String getFinishDate(){
		return finishDate;
	}

	public void setSessionCount(SessionCount sessionCount){
		this.sessionCount = sessionCount;
	}

	public SessionCount getSessionCount(){
		return sessionCount;
	}

	public void setStartDate(String startDate){
		this.startDate = startDate;
	}

	public String getStartDate(){
		return startDate;
	}

	public void setStatus(String status){
		this.status = status;
	}

	public String getStatus(){
		return status;
	}
}