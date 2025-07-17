package mx.com.telcel.di.sds.gsac.dsapp.Batch_2_MonitorLineasEnviaDatosDsc.json;

import mx.com.telcel.di.sds.gsac.dsapp.Batch_2_MonitorLineasEnviaDatosDsc.json.clase.RespuestaServicioBeanJson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class DeJsonaClaseResponse {

	public static RespuestaServicioBeanJson obtenJson(String cadenaJson) {// USADO
																			// PARA
																			// EL
																			// RESPONSE
		RespuestaServicioBeanJson RespuestaJson = new RespuestaServicioBeanJson();

		Gson gson = new GsonBuilder().setPrettyPrinting().create();

		RespuestaJson = gson.fromJson(cadenaJson,
				RespuestaServicioBeanJson.class);

		return RespuestaJson;
	}

}
