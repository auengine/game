package com.imc.demo.controller;

import com.imc.demo.model.actions.IAction;
import com.imc.demo.model.players.IPlayer;
import com.imc.demo.oldfashion.gui.MainFrame;
import com.imc.demo.oldfashion.gui.layout.StringListener;

import javax.swing.*;
import java.util.List;

public abstract class ApplicationControllerBase implements IApplicationController {

    protected IPlayer autoPlayer;
    protected StringListener textListener;
    protected String appName;

    public ApplicationControllerBase(String appName, IPlayer player) {
        this.autoPlayer = player;
        this.appName = appName;

    }

    public void setTextListener(StringListener textListener) {
        this.textListener = textListener;
    }

    public String getOutputText() {
        return this.textListener.getText();
    }

    public JFrame createFrame(List<IAction> items, boolean visible) {
        return new MainFrame(appName, items, this, visible);
    }

    public JFrame createFrame(List<IAction> items) {
        return createFrame(items, true);
    }


}
