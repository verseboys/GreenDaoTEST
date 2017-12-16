package com.wellhome.cloudgroup.greendaogenerate;


import de.greenrobot.daogenerator.Entity;
import de.greenrobot.daogenerator.Schema;

public class myClass {

    public static  void  main(String args[]){


        Schema schema=new Schema(1,"www.imooc.com");

        Entity son=schema.addEntity("Son");
        son.addStringProperty("name");

    }
}
