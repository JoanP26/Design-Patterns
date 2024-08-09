package Creators;

import AbstractClass.Knife;
import AbstractClass.KnifeStore;
import Products.EuropeChefKnife;
import Products.EuropeSteakKnife;

public class EuropeKnifeStore extends KnifeStore {

    @Override
    public Knife createKnife(String type) {
        if (type.equals("chef")) {
            return new EuropeChefKnife();
        } else if (type.equals("steak")) {
            return new EuropeSteakKnife();
        } else return null;
    }
}