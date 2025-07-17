package mx.com.telcel.di.sds.gsac.dsapp.Batch_2_MonitorLineasEnviaDatosDsc.service;

import java.util.Date;

public interface GestionarCorreoElectronicoServices {
	public void mandarCorreoLineaEmpresa();

	public void mandarCorreoLineaEmpresaPorFecha(Date fechaInicial,
			Date fechaFinal);
}
