package com.imc.demo.model.players;

import com.imc.demo.model.actions.IAction;

import java.util.Optional;

public interface IPlayer {

    public  Optional<IAction> play();


}
