class Animal{
    void eat(){
        System.out.println("eating... Animal Class... eat method");
    }
}

class Lion extends Animal{
    void roar(){
        System.out.println("roar... Lion Class... roar method");
    }
}

class BabyLion extends Lion{
    void weep(){
        System.out.println("weeping... BabyLion Class... weep method");
    }
}

public class Animals {
    public static void main(String[] args) {
        BabyLion obj = new BabyLion();
        obj.weep();
        obj.roar();
        obj.eat();
    }
}
