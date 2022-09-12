package com.example.firstservice;

public class Customer {
    private String ID;
    private String name;
    private boolean sex;
    private int age;

    public Customer(String ID,String n, String s, int a) {
        setAge(a);
        setID(ID);
        setSex(s);
        setName(n);
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if(age > 0){
            this.age = age;
        }
        else{
            this.age = 0;
        }
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getID() {
        return ID;
    }
    public void setID(String ID) {
        this.ID = ID;
    }
    public boolean getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex.toLowerCase().equals("male");

    }
    public Customer(){
        this("",null,"female",0);
    }

}