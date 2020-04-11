package com.imc.demo;



import com.imc.demo.constants.ApplicationConstants;
import com.imc.demo.controller.ApplicationController;
import com.imc.demo.factory.ActionFactory;
import com.imc.demo.model.players.AutoPlayer;

import javax.swing.*;


public class GameApplication {

	public static void main(String[] args) {

		ApplicationController controller=new ApplicationController(ApplicationConstants.C_APP_NAME,new AutoPlayer());

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				controller.createFrame(ActionFactory.getInstance().getItems());
			}
		});

		//new SpringApplicationBuilder(SpringDesktopSampleApplication.class).headless(false).run(args);
	}

}
