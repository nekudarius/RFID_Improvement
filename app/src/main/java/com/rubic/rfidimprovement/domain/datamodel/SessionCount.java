package com.rubic.rfidimprovement.domain.datamodel;

import com.google.gson.annotations.SerializedName;

public class SessionCount {

	@SerializedName("count_destroyed")
	private int countDestroyed;

	@SerializedName("count_missing")
	private int countMissing;

	@SerializedName("count_total")
	private int countTotal;

	@SerializedName("count_transfer")
	private int countTransfer;

	@SerializedName("count_new")
	private int countNew;

	@SerializedName("count_destroyable")
	private int countDestroyable;

	@SerializedName("count_return")
	private int countReturn;

	@SerializedName("count_borrow")
	private int countBorrow;

	@SerializedName("count_scanned")
	private int countScanned;

	public void setCountDestroyed(int countDestroyed){
		this.countDestroyed = countDestroyed;
	}

	public int getCountDestroyed(){
		return countDestroyed;
	}

	public void setCountMissing(int countMissing){
		this.countMissing = countMissing;
	}

	public int getCountMissing(){
		return countMissing;
	}

	public void setCountTotal(int countTotal){
		this.countTotal = countTotal;
	}

	public int getCountTotal(){
		return countTotal;
	}

	public void setCountTransfer(int countTransfer){
		this.countTransfer = countTransfer;
	}

	public int getCountTransfer(){
		return countTransfer;
	}

	public void setCountNew(int countNew){
		this.countNew = countNew;
	}

	public int getCountNew(){
		return countNew;
	}

	public void setCountDestroyable(int countDestroyable){
		this.countDestroyable = countDestroyable;
	}

	public int getCountDestroyable(){
		return countDestroyable;
	}

	public void setCountReturn(int countReturn){
		this.countReturn = countReturn;
	}

	public int getCountReturn(){
		return countReturn;
	}

	public void setCountBorrow(int countBorrow){
		this.countBorrow = countBorrow;
	}

	public int getCountBorrow(){
		return countBorrow;
	}

	public void setCountScanned(int countScanned){
		this.countScanned = countScanned;
	}

	public int getCountScanned(){
		return countScanned;
	}
}