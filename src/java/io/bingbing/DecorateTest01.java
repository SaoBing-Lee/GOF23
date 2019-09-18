package io.bingbing;

/**
 * @ClassName DecorateTest01
 * @descripetion 实现放大器对声音对放大功能
 * @Author liyanbing
 * @Date 2019-09-17
 */
public class DecorateTest01 {

    public static void main(String[] args) {
        Person p = new Person();
        p.say();

        //装饰
        Amplifier amplifier = new Amplifier( p);
        amplifier.say();
    }
}

interface Say {
    void say();
}

class Person implements Say {
    private int voice = 10;

    public void say() {
        System.out.println("人有说话：" + this.getVoice());
    }

    public int getVoice() {
        return voice;
    }

    public void setVoice(int voice) {
        this.voice = voice;
    }
}

/**
 * 放大器
 */
class Amplifier implements Say {
    private Person p;

    Amplifier(Person p) {
        this.p = p;
    }

    @Override
    public void say() {
        System.out.println("扩音器后：" + p.getVoice() * 10);
    }
}

