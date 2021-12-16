package com.e.crudnetworkinglab;

public class Model {
    String id,uid,name,phone,address;

    public Model(String id ,String uid, String name, String phone, String address ) {
        this.id = id;
        this.uid = uid;
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    public Model() {

    }

    public String getId(){
        return id;
    }
    public String getUId(){
        return uid;
    }
    public String getName(){
        return name;
    }

    public String getPhone(){
        return phone;
    }

    public String getAddress(){

        return address;
    }
}
