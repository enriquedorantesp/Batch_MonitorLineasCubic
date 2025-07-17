package mx.com.telcel.di.sds.gsac.dsapp.Batch_2_MonitorLineasEnviaDatosDsc.main;

import mx.com.telcel.di.sds.gsac.dsapp.Batch_2_MonitorLineasEnviaDatosDsc.enviaDatosEnviaDatosDsc.util.Estaticos;
import mx.com.telcel.di.sds.gsac.dsapp.Batch_2_MonitorLineasEnviaDatosDsc.enviaDatosEnviaDatosDsc.util.MetodosVarios;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	private final static Logger log = Logger.getLogger(App.class);

	public static void main(String[] args) {
		avisaCierre();
		// 09:00:00 a 12:59:59 hrs HORARIO DE LA MAÑANA
		// 13:00:00 a 18:00:00 hrs HORARIO DE LA TARDE

		String varMarcaTiempoEntreHorario = MetodosVarios
				.MarcaTiempoEntreHorario();
		// ********************************************************************************
		if ((varMarcaTiempoEntreHorario.equalsIgnoreCase(""))) {
			log.info("NO LLEGO AL HORARIO DE LA MAÑANA");
			log.info("NO LLEGO AL HORARIO DE LA TARDE");
			log.info("ADIOS ...!!!!");
			System.exit(-1);
		}
		// ********************************************************************************

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		Estaticos.miVariable = 10;
		log.info("Iniciado Proceso Correo Electronico batch\n");

	}

	private static void avisaCierre() {

		Runtime.getRuntime().addShutdownHook(new Thread() {
			public void run() {

				log.info("El archivo JAR se está cerrando...\n\n");

			}
		});

	}

}
