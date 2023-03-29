package com.goleb.wojciech.bottle;

import java.text.DecimalFormat;

public class Bottle {
    private static final DecimalFormat df = new DecimalFormat("0.00");
    private double volume;
    private double capacity;

    public Bottle() {
        volume = 1;
        capacity = 1;
    }

    public Bottle(double volume, double capacity) {
        if (volume <= capacity) {
            this.volume = volume;
        } else {
            this.volume = capacity;
            System.out.println("You have spilled " + df.format(volume - capacity) + "L");
        }
        this.capacity = capacity;
    }

    public void showInfo() {
        System.out.println("The bottle has " + df.format(volume) + "L of liquid and the capacity is " + df.format(capacity) + "L");
        if (volume == capacity) {
            System.out.println("Bottle is full\n");
        }
    }

    public void emptyTheBottle() {
        setVolume(0);
        System.out.println("You emptied the bottle\n");
    }

    public void pour(double volume) {
        if (this.volume > volume) {
            System.out.println("pouring...\n");
            setVolume(this.volume - volume);
        } else if (this.volume == volume) {
            System.out.print("pouring... ");
            setVolume(0);
            System.out.println("bottle is empty\n");
        } else {
            double used = ((this.volume + volume) - capacity);
            System.out.print("pouring... ");
            System.out.print("the bottle is empty... ");
            System.out.println("only" + df.format(used) + "L" + " was left\n");
            setVolume(0);
        }
    }

    public void evenOut(Bottle bottle) {
        double halfTheVolumes = (this.volume + bottle.volume) / 2;
        System.out.println("Both bottles will be filled with " + df.format(halfTheVolumes) + "L because:");
        System.out.print("bottle 1 volume: \t" + df.format(this.volume) + "L \t");
        System.out.println("bottle 2 volume: \t" + df.format(bottle.volume) + "L");
        System.out.print("bottle 1 capacity: \t" + df.format(this.capacity) + "L \t");
        System.out.println("bottle 2 capacity: \t" + df.format(bottle.capacity) + "L\n");

        if (halfTheVolumes <= this.capacity && halfTheVolumes <= bottle.capacity) {
            this.volume = halfTheVolumes;
            bottle.volume = halfTheVolumes;
            System.out.println("first bottle has " + df.format(this.volume) + "L in it");
            System.out.println("second bottle has " + df.format(bottle.volume) + "L in it\n");
        } else {
            System.out.println("Cannot even out the volumes\n");
        }

    }


    public void fill(double volume) {
        if (this.volume + volume <= capacity) {
            System.out.println("filling...\n");
            setVolume(this.volume + volume);
        } else if (this.volume + volume == capacity) {
            System.out.print("filling... ");
            setVolume(this.volume + volume);
            System.out.println("bottle is full \n");
        } else {
            double spill = ((this.volume + volume) - capacity);
            System.out.print("Filling... ");
            setVolume(capacity);
            System.out.print("bottle is full... ");
            System.out.println(df.format(spill) + "L" + " has spilled\n");
        }
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}
