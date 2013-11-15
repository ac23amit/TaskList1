package com.ac23amit.tasklist;

/**
 * Created by pc on 05/11/13.
 */
public class ItemDetails
{
    private String name;
    private String btnText;
    private String price;

    public ItemDetails ()
    {
        this.name = "";
        this.btnText = "";
        this.price = "";
    }
    public ItemDetails (String name, String btnText, String price)
    {
        this.name = name;
        this.btnText = btnText;
        this.price = price;
    }

    public String getName () { return name; }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getbtnText () { return btnText; }

    public void setbtnText (String btnText) { this.btnText = btnText; }

    public String getPrice ()
    {
        return price;
    }

    public void setPrice (String price)
    {
        this.price = price;
    }
}

