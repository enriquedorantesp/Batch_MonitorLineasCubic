package mx.com.telcel.di.sds.gsac.dsapp.Batch_2_MonitorLineasEnviaDatosDsc.beans;

public class CurrentResponseBean {
	private String actor;
	private String status;
	private String description;
	private String documentNumber;
	private String binary;
	private String signatureRepresentation;

	public CurrentResponseBean() {
		this.actor = "SISACT";
		this.status = "-1";
		this.description = "";
		this.documentNumber = "";
		this.binary = "";
		this.signatureRepresentation = "";
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDocumentNumber() {
		return documentNumber;
	}

	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}

	public String getBinary() {
		return binary;
	}

	public void setBinary(String binary) {
		this.binary = binary;
	}

	public String getSignatureRepresentation() {
		return signatureRepresentation;
	}

	public void setSignatureRepresentation(String signatureRepresentation) {
		this.signatureRepresentation = signatureRepresentation;
	}

	@Override
	public String toString() {
		return "CurrentResponseBean [actor=" + actor + ", status=" + status
				+ ", description=" + description + ", documentNumber="
				+ documentNumber + ", binary=" + binary
				+ ", signatureRepresentation=" + signatureRepresentation + "]";
	}

}
