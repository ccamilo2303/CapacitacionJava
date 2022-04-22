package com.mch.validators;

import com.mch.constans.ValidatorConstans;
import com.mch.excepciones.ValidationRequestException;

public class RequestValidator {

    public void validateRequestPostUser(String email, String pass) throws ValidationRequestException {

        if (email.isEmpty())
            throw new ValidationRequestException(ValidatorConstans.MESSAGE_EMAIL_VALIDATOR);

    }

}
