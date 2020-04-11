package com.imc.demo.model.actions;

import com.imc.demo.constants.ActionEnum;

import java.util.Optional;

public interface IAction {

    public  String getName();

    public default ActionEnum getType(){
        return ActionEnum.PAPER;
    }
    public  String getIcon();

    public String compare(Optional<IAction> action);
}
