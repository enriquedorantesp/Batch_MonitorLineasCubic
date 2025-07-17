package mx.com.telcel.di.sds.gsac.dsapp.Batch_2_MonitorLineasEnviaDatosDsc.beans;

import mx.com.telcel.di.sds.gsac.dsapp.Batch_2_MonitorLineasEnviaDatosDsc.dto.FolioSisactDto;
import mx.com.telcel.di.sds.gsac.dsapp.Batch_2_MonitorLineasEnviaDatosDsc.dto.FoliosEnviaDatosDscDto;

public class InfoUpDateEnviaDatosDscBean {

	private String I_IDDSC;
	private String V_FUERZAVENTA;
	private String D_FOLIOSISACT;
	private String I_REGION;
	private String V_CELULAR;
	private String V_CUENTA;
	private String I_INTENTOS_P1;
	private String LV_REQUEST_P1;
	private String DT_FECHAREQUEST_P1;
	private String DT_FECHARESPONSE_P1;
	private String LV_RESPONSE_P1;
	private String V_ESTATUS_P1;
	private String I_INTENTOS_P2;
	private String LV_REQUEST_P2;
	private String DT_FECHAREQUEST_P2;
	private String DT_FECHARESPONSE_P2;
	private String LV_RESPONSE_P2;
	private String V_ESTATUS_P2;
	private String I_INTENTOS_P3;
	private String LV_REQUEST_P3;
	private String DT_FECHAREQUEST_P3;
	private String DT_FECHARESPONSE_P3;
	private String LV_RESPONSE_P3;
	private String V_ESTATUS_P3;
	private String I_REPORTE_1;
	private String DT_FECHAREPORTE_1;
	private String I_REPORTE_2;
	private String DT_FECHAREPORTE_2;
	private String BANDERA;

	public InfoUpDateEnviaDatosDscBean(
			FoliosEnviaDatosDscDto foliosEnviaDatosDsc,
			FolioSisactDto folioDetalleSolactDto) {

		this.I_IDDSC = foliosEnviaDatosDsc.getI_IDDSC();
		this.V_FUERZAVENTA = foliosEnviaDatosDsc.getV_FUERZAVENTA();
		this.D_FOLIOSISACT = foliosEnviaDatosDsc.getD_FOLIOSISACT();
		this.I_REGION = foliosEnviaDatosDsc.getI_REGION();
		this.LV_REQUEST_P1 = foliosEnviaDatosDsc.getLV_REQUEST_P1();
		this.LV_REQUEST_P2 = foliosEnviaDatosDsc.getLV_REQUEST_P2();
		this.LV_REQUEST_P3 = foliosEnviaDatosDsc.getLV_REQUEST_P3();

		if (folioDetalleSolactDto != null) {
			this.V_CELULAR = folioDetalleSolactDto.getMsisdn() != null ? folioDetalleSolactDto
					.getMsisdn() : foliosEnviaDatosDsc.getV_CELULAR();
			this.V_CUENTA = folioDetalleSolactDto.getV_CUENTAM2K() != null ? (folioDetalleSolactDto
					.getV_CUENTAM2K().length() == 0 ? "0"
					: folioDetalleSolactDto.getV_CUENTAM2K())
					: (foliosEnviaDatosDsc.getV_CUENTA().length() == 0 ? "0"
							: foliosEnviaDatosDsc.getV_CUENTA());
			this.I_INTENTOS_P1 = folioDetalleSolactDto.getI_INTENTOS_P1() != null ? folioDetalleSolactDto
					.getI_INTENTOS_P1() : foliosEnviaDatosDsc
					.getI_INTENTOS_P1();
			this.DT_FECHAREQUEST_P1 = folioDetalleSolactDto
					.getFECHAREQUEST_P1() != null ? folioDetalleSolactDto
					.getFECHAREQUEST_P1() : foliosEnviaDatosDsc
					.getDT_FECHAREQUEST_P1();
			this.DT_FECHARESPONSE_P1 = folioDetalleSolactDto
					.getFECHARESPONSE_P1() != null ? folioDetalleSolactDto
					.getFECHARESPONSE_P1() : foliosEnviaDatosDsc
					.getDT_FECHARESPONSE_P1();
			this.LV_RESPONSE_P1 = folioDetalleSolactDto.getRESPONSE_P1() != null ? folioDetalleSolactDto
					.getRESPONSE_P1() : foliosEnviaDatosDsc.getLV_RESPONSE_P1();
			this.V_ESTATUS_P1 = folioDetalleSolactDto.getESTATUS_P1() != null ? folioDetalleSolactDto
					.getESTATUS_P1() : foliosEnviaDatosDsc.getV_ESTATUS_P1();
			this.I_INTENTOS_P2 = folioDetalleSolactDto.getI_INTENTOS_P2() != null ? folioDetalleSolactDto
					.getI_INTENTOS_P2() : foliosEnviaDatosDsc
					.getI_INTENTOS_P2();
			this.DT_FECHAREQUEST_P2 = folioDetalleSolactDto
					.getFECHAREQUEST_P2() != null ? folioDetalleSolactDto
					.getFECHAREQUEST_P2() : foliosEnviaDatosDsc
					.getDT_FECHAREQUEST_P2();
			this.DT_FECHARESPONSE_P2 = folioDetalleSolactDto
					.getFECHARESPONSE_P2() != null ? folioDetalleSolactDto
					.getFECHARESPONSE_P2() : foliosEnviaDatosDsc
					.getDT_FECHARESPONSE_P2();
			this.LV_RESPONSE_P2 = folioDetalleSolactDto.getRESPONSE_P2() != null ? folioDetalleSolactDto
					.getRESPONSE_P2() : foliosEnviaDatosDsc.getLV_RESPONSE_P2();
			this.V_ESTATUS_P2 = folioDetalleSolactDto.getESTATUS_P2() != null ? folioDetalleSolactDto
					.getESTATUS_P2() : foliosEnviaDatosDsc.getV_ESTATUS_P2();
			this.I_INTENTOS_P3 = folioDetalleSolactDto.getI_INTENTOS_P3() != null ? folioDetalleSolactDto
					.getI_INTENTOS_P3() : foliosEnviaDatosDsc
					.getI_INTENTOS_P3();
			this.DT_FECHAREQUEST_P3 = folioDetalleSolactDto
					.getFECHAREQUEST_P3() != null ? folioDetalleSolactDto
					.getFECHAREQUEST_P3() : foliosEnviaDatosDsc
					.getDT_FECHAREQUEST_P3();
			this.DT_FECHARESPONSE_P3 = folioDetalleSolactDto
					.getFECHARESPONSE_P3() != null ? folioDetalleSolactDto
					.getFECHARESPONSE_P3() : foliosEnviaDatosDsc
					.getDT_FECHARESPONSE_P3();
			this.LV_RESPONSE_P3 = folioDetalleSolactDto.getRESPONSE_P3() != null ? folioDetalleSolactDto
					.getRESPONSE_P3() : foliosEnviaDatosDsc.getLV_RESPONSE_P3();
			this.V_ESTATUS_P3 = folioDetalleSolactDto.getESTATUS_P3() != null ? folioDetalleSolactDto
					.getESTATUS_P3() : foliosEnviaDatosDsc.getV_ESTATUS_P3();
			this.BANDERA = folioDetalleSolactDto.getBANDERA() != null ? folioDetalleSolactDto
					.getBANDERA() : foliosEnviaDatosDsc.getBANDERA();
		} else {
			this.V_CELULAR = foliosEnviaDatosDsc.getV_CELULAR() != null ? foliosEnviaDatosDsc
					.getV_CELULAR() : "";
			this.V_CUENTA = foliosEnviaDatosDsc.getV_CUENTA() != null ? (foliosEnviaDatosDsc
					.getV_CUENTA().length() == 0 ? "0" : foliosEnviaDatosDsc
					.getV_CUENTA()) : "";
			this.I_INTENTOS_P1 = foliosEnviaDatosDsc.getI_INTENTOS_P1() != null ? foliosEnviaDatosDsc
					.getI_INTENTOS_P1() : "";
			this.DT_FECHAREQUEST_P1 = foliosEnviaDatosDsc
					.getDT_FECHAREQUEST_P1() != null ? foliosEnviaDatosDsc
					.getDT_FECHAREQUEST_P1() : "";
			this.DT_FECHARESPONSE_P1 = foliosEnviaDatosDsc
					.getDT_FECHARESPONSE_P1() != null ? foliosEnviaDatosDsc
					.getDT_FECHARESPONSE_P1() : "";
			this.LV_RESPONSE_P1 = foliosEnviaDatosDsc.getLV_RESPONSE_P1() != null ? foliosEnviaDatosDsc
					.getLV_RESPONSE_P1() : "";
			this.V_ESTATUS_P1 = foliosEnviaDatosDsc.getV_ESTATUS_P1() != null ? foliosEnviaDatosDsc
					.getV_ESTATUS_P1() : "";
			this.I_INTENTOS_P2 = foliosEnviaDatosDsc.getI_INTENTOS_P2() != null ? foliosEnviaDatosDsc
					.getI_INTENTOS_P2() : "";
			this.DT_FECHAREQUEST_P2 = foliosEnviaDatosDsc
					.getDT_FECHAREQUEST_P2() != null ? foliosEnviaDatosDsc
					.getDT_FECHAREQUEST_P2() : "";
			this.DT_FECHARESPONSE_P2 = foliosEnviaDatosDsc
					.getDT_FECHARESPONSE_P2() != null ? foliosEnviaDatosDsc
					.getDT_FECHARESPONSE_P2() : "";
			this.LV_RESPONSE_P2 = foliosEnviaDatosDsc.getLV_RESPONSE_P2() != null ? foliosEnviaDatosDsc
					.getLV_RESPONSE_P2() : "";
			this.V_ESTATUS_P2 = foliosEnviaDatosDsc.getV_ESTATUS_P2() != null ? foliosEnviaDatosDsc
					.getV_ESTATUS_P2() : "";
			this.I_INTENTOS_P3 = foliosEnviaDatosDsc.getI_INTENTOS_P3() != null ? foliosEnviaDatosDsc
					.getI_INTENTOS_P3() : "";
			this.DT_FECHAREQUEST_P3 = foliosEnviaDatosDsc
					.getDT_FECHAREQUEST_P3() != null ? foliosEnviaDatosDsc
					.getDT_FECHAREQUEST_P3() : "";
			this.DT_FECHARESPONSE_P3 = foliosEnviaDatosDsc
					.getDT_FECHARESPONSE_P3() != null ? foliosEnviaDatosDsc
					.getDT_FECHARESPONSE_P3() : "";
			this.LV_RESPONSE_P3 = foliosEnviaDatosDsc.getLV_RESPONSE_P3() != null ? foliosEnviaDatosDsc
					.getLV_RESPONSE_P3() : "";
			this.V_ESTATUS_P3 = foliosEnviaDatosDsc.getV_ESTATUS_P3() != null ? foliosEnviaDatosDsc
					.getV_ESTATUS_P3() : "";
			this.BANDERA = foliosEnviaDatosDsc.getBANDERA() != null ? foliosEnviaDatosDsc
					.getBANDERA() : "";
		}

	}

	public InfoUpDateEnviaDatosDscBean(
			FoliosEnviaDatosDscDto foliosEnviaDatosDsc) {

		this.I_IDDSC = foliosEnviaDatosDsc.getI_IDDSC();
		this.V_FUERZAVENTA = foliosEnviaDatosDsc.getV_FUERZAVENTA();
		this.D_FOLIOSISACT = foliosEnviaDatosDsc.getD_FOLIOSISACT();
		this.I_REGION = foliosEnviaDatosDsc.getI_REGION();
		this.LV_REQUEST_P1 = foliosEnviaDatosDsc.getLV_REQUEST_P1();
		this.LV_REQUEST_P2 = foliosEnviaDatosDsc.getLV_REQUEST_P2();
		this.LV_REQUEST_P3 = foliosEnviaDatosDsc.getLV_REQUEST_P3();

		this.V_CELULAR = foliosEnviaDatosDsc.getV_CELULAR();
		this.V_CUENTA = (foliosEnviaDatosDsc.getV_CUENTA().length() == 0 ? "0"
				: foliosEnviaDatosDsc.getV_CUENTA());
		this.I_INTENTOS_P1 = foliosEnviaDatosDsc.getI_INTENTOS_P1();
		this.DT_FECHAREQUEST_P1 = foliosEnviaDatosDsc.getDT_FECHAREQUEST_P1();
		this.DT_FECHARESPONSE_P1 = foliosEnviaDatosDsc.getDT_FECHARESPONSE_P1();
		this.LV_RESPONSE_P1 = foliosEnviaDatosDsc.getLV_RESPONSE_P1();
		this.V_ESTATUS_P1 = foliosEnviaDatosDsc.getV_ESTATUS_P1();
		this.I_INTENTOS_P2 = foliosEnviaDatosDsc.getI_INTENTOS_P2();
		this.DT_FECHAREQUEST_P2 = foliosEnviaDatosDsc.getDT_FECHAREQUEST_P2();
		this.DT_FECHARESPONSE_P2 = foliosEnviaDatosDsc.getDT_FECHARESPONSE_P2();
		this.LV_RESPONSE_P2 = foliosEnviaDatosDsc.getLV_RESPONSE_P2();
		this.V_ESTATUS_P2 = foliosEnviaDatosDsc.getV_ESTATUS_P2();
		this.I_INTENTOS_P3 = foliosEnviaDatosDsc.getI_INTENTOS_P3();
		this.DT_FECHAREQUEST_P3 = foliosEnviaDatosDsc.getDT_FECHAREQUEST_P3();
		this.DT_FECHARESPONSE_P3 = foliosEnviaDatosDsc.getDT_FECHARESPONSE_P3();
		this.LV_RESPONSE_P3 = foliosEnviaDatosDsc.getLV_RESPONSE_P3();
		this.V_ESTATUS_P3 = foliosEnviaDatosDsc.getV_ESTATUS_P3();
		this.BANDERA = foliosEnviaDatosDsc.getBANDERA();

	}

	public InfoUpDateEnviaDatosDscBean(FolioSisactDto folioDetalleSolactDto) {

		this.V_FUERZAVENTA = folioDetalleSolactDto.getFZAVENTA();
		this.D_FOLIOSISACT = folioDetalleSolactDto.getFOLIOSISACT();
		this.I_REGION = folioDetalleSolactDto.getI_regionDST();
		this.V_CELULAR = folioDetalleSolactDto.getMsisdn();
		this.V_CUENTA = (folioDetalleSolactDto.getV_CUENTAM2K().length() == 0 ? "0"
				: folioDetalleSolactDto.getV_CUENTAM2K());
		this.I_INTENTOS_P1 = folioDetalleSolactDto.getI_INTENTOS_P1();
		this.LV_REQUEST_P1 = folioDetalleSolactDto.getREQUEST_P1();
		this.DT_FECHAREQUEST_P1 = folioDetalleSolactDto.getFECHAREQUEST_P1();
		this.DT_FECHARESPONSE_P1 = folioDetalleSolactDto.getFECHARESPONSE_P1();
		this.LV_RESPONSE_P1 = folioDetalleSolactDto.getRESPONSE_P1();
		this.V_ESTATUS_P1 = folioDetalleSolactDto.getESTATUS_P1();
		this.I_INTENTOS_P2 = folioDetalleSolactDto.getI_INTENTOS_P2();
		this.LV_REQUEST_P2 = folioDetalleSolactDto.getREQUEST_P2();
		this.DT_FECHAREQUEST_P2 = folioDetalleSolactDto.getFECHAREQUEST_P2();
		this.DT_FECHARESPONSE_P2 = folioDetalleSolactDto.getFECHARESPONSE_P2();
		this.LV_RESPONSE_P2 = folioDetalleSolactDto.getRESPONSE_P2();
		this.V_ESTATUS_P2 = folioDetalleSolactDto.getESTATUS_P2();
		this.I_INTENTOS_P3 = folioDetalleSolactDto.getI_INTENTOS_P3();
		this.LV_REQUEST_P3 = folioDetalleSolactDto.getREQUEST_P3();
		this.DT_FECHAREQUEST_P3 = folioDetalleSolactDto.getFECHAREQUEST_P3();
		this.DT_FECHARESPONSE_P3 = folioDetalleSolactDto.getFECHARESPONSE_P3();
		this.LV_RESPONSE_P3 = folioDetalleSolactDto.getRESPONSE_P3();
		this.V_ESTATUS_P3 = folioDetalleSolactDto.getESTATUS_P3();
		this.BANDERA = folioDetalleSolactDto.getBANDERA();

	}

	@Override
	public String toString() {
		return "InfoUpDateEnviaDatosDscBean [I_IDDSC=" + I_IDDSC
				+ ", V_FUERZAVENTA=" + V_FUERZAVENTA + ", D_FOLIOSISACT="
				+ D_FOLIOSISACT + ", I_REGION=" + I_REGION + ", V_CELULAR="
				+ V_CELULAR + ", V_CUENTA=" + V_CUENTA + ", I_INTENTOS_P1="
				+ I_INTENTOS_P1 + ", LV_REQUEST_P1=" + LV_REQUEST_P1
				+ ", DT_FECHAREQUEST_P1=" + DT_FECHAREQUEST_P1
				+ ", DT_FECHARESPONSE_P1=" + DT_FECHARESPONSE_P1
				+ ", LV_RESPONSE_P1=" + LV_RESPONSE_P1 + ", V_ESTATUS_P1="
				+ V_ESTATUS_P1 + ", I_INTENTOS_P2=" + I_INTENTOS_P2
				+ ", LV_REQUEST_P2=" + LV_REQUEST_P2 + ", DT_FECHAREQUEST_P2="
				+ DT_FECHAREQUEST_P2 + ", DT_FECHARESPONSE_P2="
				+ DT_FECHARESPONSE_P2 + ", LV_RESPONSE_P2=" + LV_RESPONSE_P2
				+ ", V_ESTATUS_P2=" + V_ESTATUS_P2 + ", I_INTENTOS_P3="
				+ I_INTENTOS_P3 + ", LV_REQUEST_P3=" + LV_REQUEST_P3
				+ ", DT_FECHAREQUEST_P3=" + DT_FECHAREQUEST_P3
				+ ", DT_FECHARESPONSE_P3=" + DT_FECHARESPONSE_P3
				+ ", LV_RESPONSE_P3=" + LV_RESPONSE_P3 + ", V_ESTATUS_P3="
				+ V_ESTATUS_P3 + ", I_REPORTE_1=" + I_REPORTE_1
				+ ", DT_FECHAREPORTE_1=" + DT_FECHAREPORTE_1 + ", I_REPORTE_2="
				+ I_REPORTE_2 + ", DT_FECHAREPORTE_2=" + DT_FECHAREPORTE_2
				+ ", BANDERA=" + BANDERA + "]";
	}

	public String getI_IDDSC() {
		return I_IDDSC;
	}

	public void setI_IDDSC(String i_IDDSC) {
		I_IDDSC = i_IDDSC;
	}

	public String getV_FUERZAVENTA() {
		return V_FUERZAVENTA;
	}

	public void setV_FUERZAVENTA(String v_FUERZAVENTA) {
		V_FUERZAVENTA = v_FUERZAVENTA;
	}

	public String getD_FOLIOSISACT() {
		return D_FOLIOSISACT;
	}

	public void setD_FOLIOSISACT(String d_FOLIOSISACT) {
		D_FOLIOSISACT = d_FOLIOSISACT;
	}

	public String getI_REGION() {
		return I_REGION;
	}

	public void setI_REGION(String i_REGION) {
		I_REGION = i_REGION;
	}

	public String getV_CELULAR() {
		return V_CELULAR;
	}

	public void setV_CELULAR(String v_CELULAR) {
		V_CELULAR = v_CELULAR;
	}

	public String getV_CUENTA() {
		return V_CUENTA;
	}

	public void setV_CUENTA(String v_CUENTA) {
		V_CUENTA = v_CUENTA;
	}

	public String getI_INTENTOS_P1() {
		return I_INTENTOS_P1;
	}

	public void setI_INTENTOS_P1(String i_INTENTOS_P1) {
		I_INTENTOS_P1 = i_INTENTOS_P1;
	}

	public String getLV_REQUEST_P1() {
		return LV_REQUEST_P1;
	}

	public void setLV_REQUEST_P1(String lV_REQUEST_P1) {
		LV_REQUEST_P1 = lV_REQUEST_P1;
	}

	public String getDT_FECHAREQUEST_P1() {
		return DT_FECHAREQUEST_P1;
	}

	public void setDT_FECHAREQUEST_P1(String dT_FECHAREQUEST_P1) {
		DT_FECHAREQUEST_P1 = dT_FECHAREQUEST_P1;
	}

	public String getDT_FECHARESPONSE_P1() {
		return DT_FECHARESPONSE_P1;
	}

	public void setDT_FECHARESPONSE_P1(String dT_FECHARESPONSE_P1) {
		DT_FECHARESPONSE_P1 = dT_FECHARESPONSE_P1;
	}

	public String getLV_RESPONSE_P1() {
		return LV_RESPONSE_P1;
	}

	public void setLV_RESPONSE_P1(String lV_RESPONSE_P1) {
		LV_RESPONSE_P1 = lV_RESPONSE_P1;
	}

	public String getV_ESTATUS_P1() {
		return V_ESTATUS_P1;
	}

	public void setV_ESTATUS_P1(String v_ESTATUS_P1) {
		V_ESTATUS_P1 = v_ESTATUS_P1;
	}

	public String getI_INTENTOS_P2() {
		return I_INTENTOS_P2;
	}

	public void setI_INTENTOS_P2(String i_INTENTOS_P2) {
		I_INTENTOS_P2 = i_INTENTOS_P2;
	}

	public String getLV_REQUEST_P2() {
		return LV_REQUEST_P2;
	}

	public void setLV_REQUEST_P2(String lV_REQUEST_P2) {
		LV_REQUEST_P2 = lV_REQUEST_P2;
	}

	public String getDT_FECHAREQUEST_P2() {
		return DT_FECHAREQUEST_P2;
	}

	public void setDT_FECHAREQUEST_P2(String dT_FECHAREQUEST_P2) {
		DT_FECHAREQUEST_P2 = dT_FECHAREQUEST_P2;
	}

	public String getDT_FECHARESPONSE_P2() {
		return DT_FECHARESPONSE_P2;
	}

	public void setDT_FECHARESPONSE_P2(String dT_FECHARESPONSE_P2) {
		DT_FECHARESPONSE_P2 = dT_FECHARESPONSE_P2;
	}

	public String getLV_RESPONSE_P2() {
		return LV_RESPONSE_P2;
	}

	public void setLV_RESPONSE_P2(String lV_RESPONSE_P2) {
		LV_RESPONSE_P2 = lV_RESPONSE_P2;
	}

	public String getV_ESTATUS_P2() {
		return V_ESTATUS_P2;
	}

	public void setV_ESTATUS_P2(String v_ESTATUS_P2) {
		V_ESTATUS_P2 = v_ESTATUS_P2;
	}

	public String getI_INTENTOS_P3() {
		return I_INTENTOS_P3;
	}

	public void setI_INTENTOS_P3(String i_INTENTOS_P3) {
		I_INTENTOS_P3 = i_INTENTOS_P3;
	}

	public String getLV_REQUEST_P3() {
		return LV_REQUEST_P3;
	}

	public void setLV_REQUEST_P3(String lV_REQUEST_P3) {
		LV_REQUEST_P3 = lV_REQUEST_P3;
	}

	public String getDT_FECHAREQUEST_P3() {
		return DT_FECHAREQUEST_P3;
	}

	public void setDT_FECHAREQUEST_P3(String dT_FECHAREQUEST_P3) {
		DT_FECHAREQUEST_P3 = dT_FECHAREQUEST_P3;
	}

	public String getDT_FECHARESPONSE_P3() {
		return DT_FECHARESPONSE_P3;
	}

	public void setDT_FECHARESPONSE_P3(String dT_FECHARESPONSE_P3) {
		DT_FECHARESPONSE_P3 = dT_FECHARESPONSE_P3;
	}

	public String getLV_RESPONSE_P3() {
		return LV_RESPONSE_P3;
	}

	public void setLV_RESPONSE_P3(String lV_RESPONSE_P3) {
		LV_RESPONSE_P3 = lV_RESPONSE_P3;
	}

	public String getV_ESTATUS_P3() {
		return V_ESTATUS_P3;
	}

	public void setV_ESTATUS_P3(String v_ESTATUS_P3) {
		V_ESTATUS_P3 = v_ESTATUS_P3;
	}

	public String getI_REPORTE_1() {
		return I_REPORTE_1;
	}

	public void setI_REPORTE_1(String i_REPORTE_1) {
		I_REPORTE_1 = i_REPORTE_1;
	}

	public String getDT_FECHAREPORTE_1() {
		return DT_FECHAREPORTE_1;
	}

	public void setDT_FECHAREPORTE_1(String dT_FECHAREPORTE_1) {
		DT_FECHAREPORTE_1 = dT_FECHAREPORTE_1;
	}

	public String getI_REPORTE_2() {
		return I_REPORTE_2;
	}

	public void setI_REPORTE_2(String i_REPORTE_2) {
		I_REPORTE_2 = i_REPORTE_2;
	}

	public String getDT_FECHAREPORTE_2() {
		return DT_FECHAREPORTE_2;
	}

	public void setDT_FECHAREPORTE_2(String dT_FECHAREPORTE_2) {
		DT_FECHAREPORTE_2 = dT_FECHAREPORTE_2;
	}

	public String getBANDERA() {
		return BANDERA;
	}

	public void setBANDERA(String bANDERA) {
		BANDERA = bANDERA;
	}

}
