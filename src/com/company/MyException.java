package com.company;

public class MyException extends Exception {
    MyException(String st){
        super("Error");
    }
    public void fail(){
        String message=Exception1();
    }
    public String Exception1(){
        return "Некорректная фамилия";
    }
    public void Exception2(){
        System.out.println("Некорректное имя");
    }
    public void Exception3(){
        System.out.println("Некорректное отчество");
    }
    public void Exception4(){
        System.out.println("Некорректное ИНН");
    }
}