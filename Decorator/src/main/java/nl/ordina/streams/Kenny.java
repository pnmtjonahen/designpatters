package nl.tjonahen.streams;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Kenny {
	private boolean isNonAlpha(char str) {
		return str < 'A' || (str > 'Z' && str < 'a') || str > 'z';
	}

	public String toKenny(String str)
	{
		if (str.length() == 0) 	return "";
		if (isNonAlpha(str.charAt(0))) 	return str.charAt(0) + toKenny(str.substring(1));
		return (String)asciiToKenny.get(""+str.charAt(0)) +  toKenny(str.substring(1));
	}


	public String toASCII(String str)
	{
		if (str.length() == 0) return "";
		if (str.length() < 3) return str;
		if (isNonAlpha(str.charAt(0))) return str.charAt(0) + toASCII(str.substring(1));
		return kennyToAscii.get(str.substring(0,3)) + toASCII(str.substring(3));
	}


	private Map<String, String> asciiToKenny = new HashMap<String, String>();
	private Map<String, String> kennyToAscii = new HashMap<String, String>();


//	 initialization
	{
		asciiToKenny.put("e","mpp");
		asciiToKenny.put("t","fmp");
		asciiToKenny.put("a","mmm");
		asciiToKenny.put("o","ppf");
		asciiToKenny.put("i","mff");
		asciiToKenny.put("n","ppp");
		asciiToKenny.put("s","fmm");
		asciiToKenny.put("h","mfp");
		asciiToKenny.put("r","pff");
		asciiToKenny.put("d","mpm");
		asciiToKenny.put("l","pmf");
		asciiToKenny.put("c","mmf");
		asciiToKenny.put("u","fmf");
		asciiToKenny.put("m","ppm");
		asciiToKenny.put("w","fpp");
		asciiToKenny.put("f","mpf");
		asciiToKenny.put("g","mfm");
		asciiToKenny.put("y","ffm");
		asciiToKenny.put("p","pfm");
		asciiToKenny.put("b","mmp");
		asciiToKenny.put("v","fpm");
		asciiToKenny.put("k","pmp");
		asciiToKenny.put("j","pmm");
		asciiToKenny.put("x","fpf");
		asciiToKenny.put("q","pfp");
		asciiToKenny.put("z","ffp");
		asciiToKenny.put("E","Mpp");
		asciiToKenny.put("T","Fmp");
		asciiToKenny.put("A","Mmm");
		asciiToKenny.put("O","Ppf");
		asciiToKenny.put("I","Mff");
		asciiToKenny.put("N","Ppp");
		asciiToKenny.put("S","Fmm");
		asciiToKenny.put("H","Mfp");
		asciiToKenny.put("R","Pff");
		asciiToKenny.put("D","Mpm");
		asciiToKenny.put("L","Pmf");
		asciiToKenny.put("C","Mmf");
		asciiToKenny.put("U","Fmf");
		asciiToKenny.put("M","Ppm");
		asciiToKenny.put("W","Fpp");
		asciiToKenny.put("F","Mpf");
		asciiToKenny.put("G","Mfm");
		asciiToKenny.put("Y","Ffm");
		asciiToKenny.put("P","Pfm");
		asciiToKenny.put("B","Mmp");
		asciiToKenny.put("V","Fpm");
		asciiToKenny.put("K","Pmp");
		asciiToKenny.put("J","Pmm");
		asciiToKenny.put("X","Fpf");
		asciiToKenny.put("Q","Pfp");
		asciiToKenny.put("Z","Ffp");
	}

	{
		Iterator<String> it = asciiToKenny.keySet().iterator();
		while (it.hasNext()) {
			String key = it.next();
			kennyToAscii.put((String)asciiToKenny.get(key),key);
		}
	}

}
