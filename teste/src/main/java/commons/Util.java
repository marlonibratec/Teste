package commons;

import java.text.Normalizer;

public class Util {

	public static String removerMascara(String valor){
		return valor.replaceAll("\\D", "");
	}
	
	public static String formataMoedaSemTipo(String v) {
		v = removerMascara(v);
		return v.substring(0, v.length() - 2) + "." + v.substring(v.length() - 2, v.length());	
	}
	
	public static String removerAcentos(String src) {
		return Normalizer.normalize(src, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
	}
}