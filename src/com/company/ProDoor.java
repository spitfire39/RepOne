package com.company;
public class ProDoor
{
    public int high;
    public int length;
    public boolean Opened;
    public boolean Locked;
    public int door;

    public ProDoor(int y, int x, boolean isOpen, boolean isLocked)
    {
        this.high = y;
        this.length = x;
        this.Opened = isOpen;
        this.Locked = isLocked;
        door = x+y;
    }

    public void doorPrint ()
    {
        System.out.println("Size: " + door);
        System.out.println("Opened: " + Opened);
        System.out.println("Locked: " + Locked);
    }
}