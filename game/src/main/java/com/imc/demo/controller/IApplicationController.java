package com.imc.demo.controller;

import com.imc.demo.model.actions.IAction;
import com.imc.demo.oldfashion.gui.layout.StringListener;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.List;

public interface IApplicationController extends  ActionListener {

    public void setTextListener(StringListener textListener);

    public String getOutputText() ;

    public JFrame createFrame(List<IAction> items);

}
