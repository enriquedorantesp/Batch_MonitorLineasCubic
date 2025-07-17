package mx.com.telcel.di.sds.gsac.dsapp.Batch_2_MonitorLineasEnviaDatosDsc.enviaDatosEnviaDatosDsc.job;

import mx.com.telcel.di.sds.gsac.dsapp.Batch_2_MonitorLineasEnviaDatosDsc.enviaDatosEnviaDatosDsc.util.Estaticos;
import mx.com.telcel.di.sds.gsac.dsapp.Batch_2_MonitorLineasEnviaDatosDsc.service.GestionarCorreoElectronicoServices;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class CorreoElectronicoJob {
	@Autowired
	private GestionarCorreoElectronicoServices gestionarCorreoElectronicoServices;
	private final static Logger log = Logger
			.getLogger(CorreoElectronicoJob.class);

	@Scheduled(cron = "2 58 * * * *")
	// se ejecuta en el segundo 2 de cada minuto
	public void ejecutaEnvioCorreo() {

		if (Estaticos.miVariable == 20) {
			log.info("Inicia Ejecución envio correo");
			gestionarCorreoElectronicoServices.mandarCorreoLineaEmpresa();
			log.info("Se ejecuto envio correo ...\n");
			System.exit(0);
		}
	}

	public GestionarCorreoElectronicoServices getGestionarCorreoElectronicoServices() {
		return gestionarCorreoElectronicoServices;
	}

	public void setGestionarCorreoElectronicoServices(
			GestionarCorreoElectronicoServices gestionarCorreoElectronicoServices) {
		this.gestionarCorreoElectronicoServices = gestionarCorreoElectronicoServices;
	}

}
