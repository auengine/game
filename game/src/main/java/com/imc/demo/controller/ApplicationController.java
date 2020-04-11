package com.imc.demo.controller;

import com.imc.demo.constants.ApplicationConstants;
import com.imc.demo.factory.ActionFactory;
import com.imc.demo.model.actions.IAction;
import com.imc.demo.model.players.IPlayer;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.Optional;

public class ApplicationController extends ApplicationControllerBase  {

    public ApplicationController(String appName, IPlayer player) {
        super(appName, player);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        JButton clicked = (JButton) actionEvent.getSource();
        Optional<IAction> userChoice = ActionFactory.getInstance().getActionByName(clicked.getText());

        Optional<IAction> autoChoice = autoPlayer.play();
        String text = ApplicationConstants.INVALID_INPUT;
        if (userChoice.isPresent()) {
            text = userChoice.get().compare(autoChoice);
        }
        textListener.textEmitted(userChoice.get().getName(), autoChoice.get().getName(), text);
    }


}
