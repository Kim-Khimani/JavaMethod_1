package javaMethods;
//This is an example of method overriding in java
class Accounts{
    public void enrollBio(){//if a private method was used then the override would have been forbidden
        System.out.println("The customers biometrics have been enrolled successfully");
    }
}
class businessAccount extends Accounts{
    @Override public void enrollBio(){
        //super keyword forbids overriding. If you remove the super keyword then the child class overrides the parent class
        super.enrollBio();
        System.out.println("Error occurred during transaction process");
    }
}
public class Main {
    public static void main(String[] args) {
        //4 overriding to occur,the subclass object must be created and called
    businessAccount business=new businessAccount();
    business.enrollBio();
    }
}
