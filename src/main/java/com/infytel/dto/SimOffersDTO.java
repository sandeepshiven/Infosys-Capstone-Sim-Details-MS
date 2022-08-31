package com.infytel.dto;






public class SimOffersDTO {
	

	private Long offerId;
	private Long callQty;
	private Long cost;
	private Long dataQty;
	private Long duration;
	private String offerName;
	private Long simId;
	

	
	public SimOffersDTO() {
	}

	public SimOffersDTO(Long offerId, Long callQty, Long cost, Long dataQty, Long duration, String offerName, Long simId) {
		this.offerId = offerId;
		this.callQty = callQty;
		this.cost = cost;
		this.dataQty = dataQty;
		this.duration = duration;
		this.offerName = offerName;
		this.simId = simId;
	
	}

	
	public Long getOfferId() {
		return offerId;
	}

	public void setOfferId(Long offerId) {
		this.offerId = offerId;
	}

	public Long getCallQty() {
		return callQty;
	}

	public void setCallQty(Long callQty) {
		this.callQty = callQty;
	}

	public Long getCost() {
		return cost;
	}

	public void setCost(Long cost) {
		this.cost = cost;
	}

	public Long getDataQty() {
		return dataQty;
	}

	public void setDataQty(Long dataQty) {
		this.dataQty = dataQty;
	}

	public Long getDuration() {
		return duration;
	}

	public void setDuration(Long duration) {
		this.duration = duration;
	}

	public String getOfferName() {
		return offerName;
	}

	public void setOfferName(String offerName) {
		this.offerName = offerName;
	}

	public Long getSimId() {
		return simId;
	}

	public void setSimId(Long simId) {
		this.simId = simId;
	}

	
}
