package Day2;

import Day2.Doctor;

public class PedeatricDoctor extends Doctor {
    int experiance;
    public PedeatricDoctor(String name , int experiance) { // public 2 parameter condtructor
        super(name);//super will reference to parent class; initializing parent class variable name
        this.experiance = experiance;//this will reference to current class; initializing current class variable experiance
    }
    @Override
    public String toString(){
        return "Name: "+super.getName() + ",Experiance: " + experiance ;
        }

    }

