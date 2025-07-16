package br.com.study.introduction;

// Inheritance,Composition,Encapsulation

public class Inheritance {
    public String name;
    private InheritanceChild child;

    public void setName(String name) {
        this.name = name;
    }

    public void setChildName(String name){
        if (child == null){
            instanceChild();
        }
        this.child.setName(name);
    }

    public void instanceChild(){
        this.child = new InheritanceChild();

    }
    @Override
    public String toString() {
        return "Dad's name: "+ this.name + " Son's name "+ this.child.name;
    }
}
class InheritanceChild extends Inheritance{
    public void speak(){
        System.out.println("I am Child");
    }
}


