package mx.com.telcel.di.sds.gsac.dsapp.Batch_2_MonitorLineasEnviaDatosDsc.json.clase;

public class PeticionAServicioBeanJson {

	private String correlatorId;
	private String enterpriseId;
	private String equipo;
	private String iccid;
	private String imei;
	private String modelo;
	private String planId;
	private String providerId;
	private String region;
	private String serviceName;
	private String msisdn;
	private String estado;
	private String descripcion;
	private String simStatus;
	private String tipo;

	@Override
	public String toString() {
		return "PeticionAServicioBeanJson [correlatorId=" + correlatorId
				+ ", enterpriseId=" + enterpriseId + ", equipo=" + equipo
				+ ", iccid=" + iccid + ", imei=" + imei + ", modelo=" + modelo
				+ ", planId=" + planId + ", providerId=" + providerId
				+ ", region=" + region + ", serviceName=" + serviceName
				+ ", msisdn=" + msisdn + ", estado=" + estado
				+ ", descripcion=" + descripcion + ", simStatus=" + simStatus
				+ ", tipo=" + tipo + "]";
	}

	public String getCorrelatorId() {
		return correlatorId;
	}

	public void setCorrelatorId(String correlatorId) {
		this.correlatorId = correlatorId;
	}

	public String getEnterpriseId() {
		return enterpriseId;
	}

	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getEquipo() {
		return equipo;
	}

	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}

	public String getIccid() {
		return iccid;
	}

	public void setIccid(String iccid) {
		this.iccid = iccid;
	}

	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlanId() {
		return planId;
	}

	public void setPlanId(String planId) {
		this.planId = planId;
	}

	public String getProviderId() {
		return providerId;
	}

	public void setProviderId(String providerId) {
		this.providerId = providerId;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getMsisdn() {
		return msisdn;
	}

	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getSimStatus() {
		return simStatus;
	}

	public void setSimStatus(String simStatus) {
		this.simStatus = simStatus;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
