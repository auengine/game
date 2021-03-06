package com.imc.demo.model.actions;


import com.imc.demo.constants.ActionEnum;
import com.imc.demo.constants.ApplicationConstants;

import java.util.Optional;

public class Rock  extends BaseAction {


    public Rock(String iconUrl,ActionEnum actionEnum) {
        super(iconUrl,actionEnum);
    }


    @Override
    public String compare(Optional<IAction> action) {

        if(!action.isPresent()){
            return  buildMessage(ApplicationConstants.INVALID_INPUT,"");
        }
        if(ActionEnum.ROCK == action.get().getType()) {
            return  buildMessage(ApplicationConstants.C_TIE,"");
        }else  if(ActionEnum.SCISSORS == action.get().getType()) {
            return  buildMessage(ApplicationConstants.C_ROCK_VS_SCISSORS, ApplicationConstants.C_WIN);
        }else if(ActionEnum.PAPER == action.get().getType()) {
            return  buildMessage(ApplicationConstants.C_PAPER_VS_ROCK, ApplicationConstants.C_LOSE);
        }

        return  buildMessage(ApplicationConstants.INVALID_INPUT,"");

    }
}
