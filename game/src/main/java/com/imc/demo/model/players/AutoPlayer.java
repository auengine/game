package com.imc.demo.model.players;

import com.imc.demo.constants.ActionEnum;
import com.imc.demo.factory.ActionFactory;
import com.imc.demo.model.actions.IAction;

import java.util.Optional;
import java.util.Random;

public class AutoPlayer  implements IPlayer {


    @Override
    public Optional<IAction> play() {
        Random generator = new Random();
        Integer order = generator.nextInt(ActionEnum.values().length);
        return  ActionFactory.getInstance().getActionByOrder(order);


    }
}
