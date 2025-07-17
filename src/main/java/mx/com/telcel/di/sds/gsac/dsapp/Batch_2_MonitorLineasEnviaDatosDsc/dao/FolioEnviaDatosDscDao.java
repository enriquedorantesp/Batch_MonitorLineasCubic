package mx.com.telcel.di.sds.gsac.dsapp.Batch_2_MonitorLineasEnviaDatosDsc.dao;

import java.util.List;

public interface FolioEnviaDatosDscDao {
	List obtenerDatosTablaEnviaDatosDsc();

	List obtenerInfoCorreoElectronicoTablaEnviaDatosDsc();

	int InsertEnviaDatosDsc(String queryInsertEnviaDatosDsc);

	int UpDate_P1_EnviaDatosDsc(String queryInsertEnviaDatosDsc);

	int UpDate_P2_EnviaDatosDsc(String queryInsertEnviaDatosDsc);

	int UpDate_P3_EnviaDatosDsc(String queryInsertEnviaDatosDsc);

	List SelectEnviaDatosDsc(String queryInsertEnviaDatosDsc);

	int DeleteEnviaDatosDsc(String queryDeleteEnviaDatosDsc);

}
