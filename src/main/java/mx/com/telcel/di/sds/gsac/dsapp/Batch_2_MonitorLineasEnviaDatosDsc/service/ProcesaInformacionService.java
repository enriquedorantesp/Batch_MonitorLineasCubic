package mx.com.telcel.di.sds.gsac.dsapp.Batch_2_MonitorLineasEnviaDatosDsc.service;

import java.util.List;

import mx.com.telcel.di.sds.gsac.dsapp.Batch_2_MonitorLineasEnviaDatosDsc.correoElectronico.ServidorDestino;
import mx.com.telcel.di.sds.gsac.dsapp.Batch_2_MonitorLineasEnviaDatosDsc.dto.FoliosCorreoElectronicoEnviaDatosDscDto;

public interface ProcesaInformacionService {

	public void enviaCorreoElectronico(
			List<FoliosCorreoElectronicoEnviaDatosDscDto> registros,
			ServidorDestino servidor);
}
