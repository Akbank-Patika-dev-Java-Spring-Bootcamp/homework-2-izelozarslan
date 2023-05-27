package com.izelozarslan.homework2.errormessages;

import com.izelozarslan.homework2.general.BaseErrorMessage;

public enum CustomerErrorMessage implements BaseErrorMessage {

    CUSTOMER_NOT_FOUND("Customer not found");

    private final String message;

    CustomerErrorMessage(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return message;
    }
}
