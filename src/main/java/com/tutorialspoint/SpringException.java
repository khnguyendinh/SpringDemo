package com.tutorialspoint;

/**
 * Created by KHOAND on 12/7/2017.
 */
public class SpringException extends RuntimeException{
    private String exceptionMsg;

    public SpringException(String exceptionMsg) {
        System.out.println("SpringException.SpringException");
        this.exceptionMsg = exceptionMsg;
    }
    public String getExceptionMsg(){
        return this.exceptionMsg;
    }
    public void setExceptionMsg(String exceptionMsg) {
        this.exceptionMsg = exceptionMsg;
    }
}
