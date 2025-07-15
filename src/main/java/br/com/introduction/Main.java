package br.com.introduction;

public class Main {
    public static void main(String[] args) {
        Inheritance pai = new Inheritance();
        pai.setName("Watson");
        pai.setChildName("Tobias");
        System.out.println(pai);
        InheritanceChild son = new InheritanceChild();
        son.speak();
    }
}
