package com.company;

public class patient {
    private String name;
    private int age;
    private eye lefteye;
    private eye righteye;
    private heart Heart;
    private stomach Stomach;
    private skin Skin;

    public patient(String name, int age, eye lefteye, eye righteye, heart heart, stomach stomach, skin skin) {
        this.name = name;
        this.age = age;
        this.lefteye = lefteye;
        this.righteye = righteye;
        Heart = heart;
        Stomach = stomach;
        Skin = skin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public eye getLefteye() {
        return lefteye;
    }

    public void setLefteye(eye lefteye) {
        this.lefteye = lefteye;
    }

    public eye getRighteye() {
        return righteye;
    }

    public void setRighteye(eye righteye) {
        this.righteye = righteye;
    }

    public heart getHeart() {
        return Heart;
    }

    public void setHeart(heart heart) {
        Heart = heart;
    }

    public stomach getStomach() {
        return Stomach;
    }

    public void setStomach(stomach stomach) {
        Stomach = stomach;
    }

    public skin getSkin() {
        return Skin;
    }

    public void setSkin(skin skin) {
        Skin = skin;
    }
}
