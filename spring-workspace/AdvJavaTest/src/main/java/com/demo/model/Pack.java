package com.demo.model;


public class Pack {

	private String custNo;
	private String basePack;
	private String optPack;
	
	public Pack() {
		super();
	}

	public Pack(String custNo, String basePack, String optPack) {
		super();
		this.custNo = custNo;
		this.basePack = basePack;
		this.optPack = optPack;
	}

	public String getCustNo() {
		return custNo;
	}

	public void setCustNo(String custNo) {
		this.custNo = custNo;
	}

	public String getBasePack() {
		return basePack;
	}

	public void setBasePack(String basePack) {
		this.basePack = basePack;
	}

	public String getOptPack() {
		return optPack;
	}

	public void setOptPack(String optPack) {
		this.optPack = optPack;
	}

	@Override
	public String toString() {
		return "Pack [custNo=" + custNo + ", basePack=" + basePack + ", optPack=" + optPack + "]";
	}
		
}
