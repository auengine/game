package com.imc.demo.utils;

import javax.swing.*;
import java.net.URL;

public class Utils {

	public static ImageIcon createIcon(String path) {
		URL url = Utils.class.getClassLoader().getResource(path);
		ImageIcon icon = new ImageIcon(url);

		return icon;
	}


}
