package com.benarutomod.tbroski.common;

import com.benarutomod.tbroski.init.ClanInit;
import com.benarutomod.tbroski.init.DojutsuInit;

public class BeNMClan {

    private final String clan;

    private BeNMDojutsu dojutsu = DojutsuInit.NULL;
    private String message = "";
    private Nature nature = Nature.NULL;
    private float startingChakra = 300F;

    public BeNMClan(String clan) {
        this.clan = clan;
    }

    public String getString() {
        return this.clan;
    }

    public BeNMClan setClanDojutsu(BeNMDojutsu dojutsu) {
        this.dojutsu = dojutsu;
        return this;
    }

    public BeNMClan setClanMessage(String message) {
        this.message = message;
        return this;
    }

    public BeNMClan setClanNature(Nature nature) {
        this.nature = nature;
        return this;
    }

    public BeNMClan setStartingChakra(float amount) {
        this.startingChakra = amount;
        return this;
    }

    public BeNMDojutsu getClanDojutsu() {
        return this.dojutsu;
    }

    public String getClanMessage() {
        return this.message;
    }

    public Nature getClanNature() {
        return this.nature;
    }

    public float getStartingChakra() {
        return this.startingChakra;
    }

    public enum Nature {
        NULL, FIRE, WATER, EARTH, WIND, LIGHTNING,
    }
}
