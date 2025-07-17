package mx.com.telcel.di.sds.gsac.dsapp.Batch_2_MonitorLineasEnviaDatosDsc.enviaDatosEnviaDatosDsc.job;

import mx.com.telcel.di.sds.gsac.dsapp.Batch_2_MonitorLineasEnviaDatosDsc.enviaDatosEnviaDatosDsc.util.Estaticos;
import mx.com.telcel.di.sds.gsac.dsapp.Batch_2_MonitorLineasEnviaDatosDsc.service.EstatusInicialEnviaDatosDscService;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class IniciaBatchJob {
	@Autowired
	private EstatusInicialEnviaDatosDscService estatusIncialEnviaDatosDscService;
	private final static Logger log = Logger.getLogger(IniciaBatchJob.class);

	private int i = 0;

	@Scheduled(cron = "1 57 * * * *")
	// se ejecuta en el segundo 0 de cada minuto
	public void actualizarEstatusInicialCorreoElectronico() {

		if (i == 0 && Estaticos.miVariable == 10) {
			log.info("\n-*******************************************************************************************************************************************************************************");
			log.info("Se inicia ejecución de ENVIA CORREO ENVIADATOSDSC");

			estatusIncialEnviaDatosDscService.inicializaProperties();
			// estatusIncialEnviaDatosDscService.actualizarEstatusInicialEnviaDatosDsc();//AQUI
			// AQUI AQUI

			log.info("Se ejecuto actualización de estatus");
			log.info("-***************IMPORTANTE-***************");
			log.info("-***************IMPORTANTE-***************Se inicia   ejecución de envio de correo electronico SE A COMENTADO PARA PRUEBAS EN PRODUCCION");
			log.info("-***************IMPORTANTE-***************Se finaliza ejecutión de envio de correo electronico SE A COMENTADO PARA PRUEBAS EN PRODUCCION");
			log.info("-***************IMPORTANTE-***************");
			log.info("-*******************************************************************************************************************************************************************************\n");

			i = 1;
			Estaticos.miVariable = 20;
			log.info("\n*******************************************************************************************************************************************************************************"
					+ "\n\t\t\t\tAplicación iniciada ...!!!!"
					+ "\n*******************************************************************************************************************************************************************************\n");
		}
	}

	public EstatusInicialEnviaDatosDscService getEstatusIncialEnviaDatosDscService() {
		return estatusIncialEnviaDatosDscService;
	}

	public void setEstatusIncialEnviaDatosDscService(
			EstatusInicialEnviaDatosDscService estatusIncialEnviaDatosDscService) {
		this.estatusIncialEnviaDatosDscService = estatusIncialEnviaDatosDscService;
	}

}
