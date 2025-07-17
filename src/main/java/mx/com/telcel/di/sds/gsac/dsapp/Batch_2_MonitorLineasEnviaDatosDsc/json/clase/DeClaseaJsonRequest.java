package mx.com.telcel.di.sds.gsac.dsapp.Batch_2_MonitorLineasEnviaDatosDsc.json.clase;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class DeClaseaJsonRequest {

	public static String obtenJson(PeticionAServicioBeanJson claseJson) {// USADO
																			// PARA
																			// EL
																			// REQUEST
		String RespuestaobtenJson;

		Gson gson = new GsonBuilder().setPrettyPrinting().create();

		RespuestaobtenJson = gson.toJson(PeticionAServicioBeanJson.class);

		return RespuestaobtenJson;
	}
}
