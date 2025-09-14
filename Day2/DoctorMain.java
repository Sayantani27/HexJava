package Day2;

import Day2.Doctor;

public class DoctorMain{
    public static void main(String[] args){
        Doctor doctor =  new PedeatricDoctor("Sayan" , 10);//referance is doctor and object is new PedeatricDoctor
        System.out.println(doctor);
        doctor = new Doctor("John");
        System.out.println(doctor);
    }
}

// this concept is runtime polymorphism ; at run time it decides which toString() to call depending on object
// by default toString method of PedatricDoctor will be executed
// row non 9 created object of Doctor
// same reference holder can be used multiple times;  here doctor is refenrence not object

