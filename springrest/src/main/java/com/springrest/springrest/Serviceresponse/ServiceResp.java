package com.springrest.springrest.Serviceresponse;

public class ServiceResp {
	
	private int responseCode;
	private String responseMessage;
	private Object responseData;

	public ServiceResp(int responseCode, String responseMessage) {
		super();
		this.responseCode = responseCode;
		this.responseMessage = responseMessage;
	}

	public ServiceResp(){}

	public ServiceResp(int responseCode, Object responseData){
		this.responseCode = responseCode;
		this.responseData=responseData;
	}

	public int getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(int responseCode) {
		this.responseCode = responseCode;
	}
	public String getResponseMessage() {
		return responseMessage;
	}
	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}
	public Object getResponseData() {
		return responseData;
	}
	public void setResponseData(Object responseData) {
		this.responseData = responseData;
	}

	@Override
	public String toString() {
		return "ServiceRespVO [responseCode=" + responseCode + ", responseMessage=" + responseMessage
				+ ", responseData=" + responseData +" ]";
	}

	

}
