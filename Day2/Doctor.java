package Day2;

public class Doctor{
    private String name;
    public Doctor(String name){//public 1 parameter constructor
        this.name = name;
    }
    public String getName(){
        return name;
    }
    @Override
    public String toString(){
        return this.name;
    }
}