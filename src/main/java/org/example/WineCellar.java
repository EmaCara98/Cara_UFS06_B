package org.example;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class WineCellar {
    private static WineCellar istance;
    private static List<Wine> winelist = new ArrayList();
    private static List<ClientHandler> clientList = new ArrayList<>();

    private WineCellar() {
        buildList();
    }

    public static WineCellar getInstance() {
        if (istance == null) {
            istance = new WineCellar();
        }
        return istance;
    }

    static void buildList() {
        winelist.add(new Wine(13,"Dom Perignon Vintage Moet Chandon 2008",225.94, "white"));
        winelist.add(new Wine(14,"Pignoli Radikon Radikon 2009",133.0, "red"));
        winelist.add(new Wine(124,"Pinot Nero Elena Walch Elena Walch 2018",43.0, "red"));
        System.out.println(winelist);
    }

    void add(ClientHandler clientHandler)
    {
        this.clientList.add(clientHandler);
    }

    void remove(ClientHandler clientHandler)
    {
        this.clientList.remove(clientHandler);
    }

    int nOfClients()
    {
        return this.clientList.size();
    }


    public String red()
    {
        List<Wine> redlist = new ArrayList();

        for(Wine w : winelist)
        {
            if(w.getType() == "red")
            {
                redlist.add(w);
            }
        }

        Gson gson = new Gson();
        String s = gson.toJson(redlist);

        return s;
    }

    public String white()
    {
        List<Wine> whitelist = new ArrayList();

        for(Wine w : winelist)
        {
            if(w.getType() == "white")
            {
                whitelist.add(w);
            }
        }

        Gson gson = new Gson();
        String s = gson.toJson(whitelist);

        return s;
    }

    public String sorted_by_name()
    {
        List<Wine> sortedlist = new ArrayList(winelist);

        sortedlist.sort((o1, o2) -> {
            return o1.getName().compareTo(o2.getName());
        });

        Gson gson = new Gson();
        String s = gson.toJson(sortedlist);

        return s;
    }

    public String sorted_by_price()
    {
        List<Wine> sortedlist = new ArrayList(winelist);

        sortedlist.sort((o1, o2) -> {
            if (o1.getPrice()>o2.getPrice())
                return 1;
            if (o1.getPrice()<o2.getPrice())
                return -1;
            return 0;
        });

        Gson gson = new Gson();
        String s = gson.toJson(sortedlist);

        return s;
    }


}