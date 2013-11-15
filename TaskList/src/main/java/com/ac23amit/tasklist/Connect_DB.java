package com.ac23amit.tasklist;

import android.content.Context;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by pc on 05/11/13.
 */
public class Connect_DB
{
    private static Connect_DB ourInstance = null;
    private Context context;
    private ArrayList<ItemDetails> itemsArr = null;

    private Connect_DB (Context context)
    {
        this.context = context;
        itemsArr = new ArrayList<ItemDetails>();
    }

    public int getSize ()
    {
        return itemsArr.size();
    }
    public void deleteInstruction ()
    {
        if (itemsArr.get(0).getName().equals("enter todo activities"))
            itemsArr.remove(0);

    }
    public ItemDetails getElm(int position)
    {
        // if (itemsArr.get(0).getName().equals("enter todo activities"))
        return itemsArr.get(position);

    }
    public void deleteElm(int position)
    {
        // if (itemsArr.get(0).getName().equals("enter todo activities"))
        itemsArr.remove(position);

    }

    public void addItem (ItemDetails ItemP)
    {
        try
        {
            itemsArr.add(ItemP);         //   Toast.makeText(this.context,ItemP.getName(), Toast.LENGTH_LONG).show();
        }
        catch (Exception e)
        {
            Toast.makeText(this.context, "cant do", Toast.LENGTH_LONG).show();
            e.printStackTrace();
        }
    }

    public ArrayList<ItemDetails> getItems ()
    {
        return itemsArr;
    }

    public static synchronized Connect_DB getInstance (Context context)
    {
        if (ourInstance == null) ourInstance = new Connect_DB(context);
        return ourInstance;
    }

}

