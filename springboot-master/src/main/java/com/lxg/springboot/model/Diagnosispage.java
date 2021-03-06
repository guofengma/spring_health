package com.lxg.springboot.model;

import java.io.Serializable;
import java.util.List;

public class Diagnosispage implements Serializable {

	/**
	 * author zhenghong@xrfinance.com
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int totalpage;

	private List<Diagnosis> diagnosis;

	public int getTotalpage() {
		return totalpage;
	}

	public void setTotalpage(int totalpage) {
		this.totalpage = totalpage;
	}

	public List<Diagnosis> getDiagnosis() {
		return diagnosis;
	}

	public void setDiagnosis(List<Diagnosis> diagnosis) {
		this.diagnosis = diagnosis;
	}

	@Override
	public String toString() {
		return "Diagnosispage [totalpage=" + totalpage + ", diagnosis=" + diagnosis + "]";
	}	
}