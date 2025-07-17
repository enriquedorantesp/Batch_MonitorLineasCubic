package mx.com.telcel.di.sds.gsac.dsapp.Batch_2_MonitorLineasEnviaDatosDsc.seguridad;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;

public class Cifrar {
	private static final String clave = "miClaveSecreta12";// longitud 16*

	public static String desencriptar(String cadenaEncriptada) throws Exception {
		SecretKeySpec key = new SecretKeySpec(clave.getBytes(), "AES");
		Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
		cipher.init(Cipher.DECRYPT_MODE, key);

		byte[] decryptedBytes = cipher.doFinal(Base64
				.decodeBase64(cadenaEncriptada));// java 17
		return new String(decryptedBytes);
	}
}
