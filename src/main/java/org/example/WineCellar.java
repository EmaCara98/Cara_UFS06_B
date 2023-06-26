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
        winelist.add(new Wine(999,"Domaine Servin Chablis 2018",22.50, "white"));
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

    public String red_html()
    {
        String s = "<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<style>\n" +
                "* {font-family: \"Lucida Console\", \"Courier New\", monospace;}\n" +
                "body {margin: 0;display: flex;justify-content: center;align-items: center;min-height: 100vh;}\n" +
                ".items {border: 3px solid #800000;padding: 15px;font-family: Georgia, serif;}\n" +
                "table {text-align: center;border-collapse: collapse;border: 5px solid #ad0000;background-color: #fff9e5;}\n" +
                ".title {color: #f00;font-family: Verdana, Geneva, sans-serif;}\n" +
                "</style>\n" +
                "</head>\n" +
                "<body>\n" +
                "<table>\n" +
                "    <tr>\n" +
                "        <th class=\"items title\">ID</th>\n" +
                "        <th class=\"items title\">NAME</th>\n" +
                "        <th class=\"items title\">PRICE</th>\n" +
                "        <th class=\"items title\">TYPE</th>\n" +
                "    </tr>\n";

        List<Wine> redlist = new ArrayList();

        for(Wine w : winelist)
        {
            if(w.getType() == "red")
            {
                redlist.add(w);
            }
        }

        for (Wine wine : redlist) {
            s += "    <tr>\n";
            s += "        <td class=\"items\">" + wine.getId() + "</td>\n";
            s += "        <td class=\"items\">" + wine.getName() + "</td>\n";
            s += "        <td class=\"items\">" + wine.getPrice() + "</td>\n";
            s += "        <td class=\"items\">" + wine.getType() + "</td>\n";
            s += "    </tr>\n";
        }

        s += "</table>\n</body>\n</html>";

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

    public String white_html()
    {
        String s = "<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<style>\n" +
                "* {font-family: \"Lucida Console\", \"Courier New\", monospace;}\n" +
                "body {margin: 0;display: flex;justify-content: center;align-items: center;min-height: 100vh;}\n" +
                ".items {border: 3px solid #800000;padding: 15px;font-family: Georgia, serif;}\n" +
                "table {text-align: center;border-collapse: collapse;border: 5px solid #ad0000;background-color: #fff9e5;}\n" +
                ".title {color: #f00;font-family: Verdana, Geneva, sans-serif;}\n" +
                "</style>\n" +
                "</head>\n" +
                "<body>\n" +
                "<table>\n" +
                "    <tr>\n" +
                "        <th class=\"items title\">ID</th>\n" +
                "        <th class=\"items title\">NAME</th>\n" +
                "        <th class=\"items title\">PRICE</th>\n" +
                "        <th class=\"items title\">TYPE</th>\n" +
                "    </tr>\n";

        List<Wine> whitelist = new ArrayList();

        for(Wine w : winelist)
        {
            if(w.getType() == "white")
            {
                whitelist.add(w);
            }
        }

        for (Wine wine : whitelist) {
            s += "    <tr>\n";
            s += "        <td class=\"items\">" + wine.getId() + "</td>\n";
            s += "        <td class=\"items\">" + wine.getName() + "</td>\n";
            s += "        <td class=\"items\">" + wine.getPrice() + "</td>\n";
            s += "        <td class=\"items\">" + wine.getType() + "</td>\n";
            s += "    </tr>\n";
        }

        s += "</table>\n</body>\n</html>";

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

    public String sorted_by_name_html()
    {
        String s = "<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<style>\n" +
                "* {font-family: \"Lucida Console\", \"Courier New\", monospace;}\n" +
                "body {margin: 0;display: flex;justify-content: center;align-items: center;min-height: 100vh;}\n" +
                ".items {border: 3px solid #800000;padding: 15px;font-family: Georgia, serif;}\n" +
                "table {text-align: center;border-collapse: collapse;border: 5px solid #ad0000;background-color: #fff9e5;}\n" +
                ".title {color: #f00;font-family: Verdana, Geneva, sans-serif;}\n" +
                "#sort {background-color: hsla(332, 83%, 40%, 0.77);color:white}\n" +
                "</style>\n" +
                "</head>\n" +
                "<body>\n" +
                "<table>\n" +
                "    <tr>\n" +
                "        <th class=\"items title\">ID</th>\n" +
                "        <th id=\"sort\" class=\"items title\">NAME</th>\n" +
                "        <th class=\"items title\">PRICE</th>\n" +
                "        <th class=\"items title\">TYPE</th>\n" +
                "    </tr>\n";

        List<Wine> sortedlist = new ArrayList(winelist);

        sortedlist.sort((o1, o2) -> {
            return o1.getName().compareTo(o2.getName());
        });

        for (Wine wine : sortedlist) {
            s += "    <tr>\n";
            s += "        <td class=\"items\">" + wine.getId() + "</td>\n";
            s += "        <td class=\"items\">" + wine.getName() + "</td>\n";
            s += "        <td class=\"items\">" + wine.getPrice() + "</td>\n";
            s += "        <td class=\"items\">" + wine.getType() + "</td>\n";
            s += "    </tr>\n";
        }

        s += "</table>\n</body>\n</html>";

        return s;
    }

    public String sorted_by_price()
    {
        List<Wine> sortedlist = new ArrayList(winelist);

        sortedlist.sort((o1, o2) -> {
            if (o1.getPrice()>o2.getPrice())
                return -1;
            if (o1.getPrice()<o2.getPrice())
                return 1;
            return 0;
        });

        Gson gson = new Gson();
        String s = gson.toJson(sortedlist);

        return s;
    }

    public String sorted_by_price_html()
    {
        String s = "<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<style>\n" +
                "* {font-family: \"Lucida Console\", \"Courier New\", monospace;}\n" +
                "body {margin: 0;display: flex;justify-content: center;align-items: center;min-height: 100vh;}\n" +
                ".items {border: 3px solid #800000;padding: 15px;font-family: Georgia, serif;}\n" +
                "table {text-align: center;border-collapse: collapse;border: 5px solid #ad0000;background-color: #fff9e5;}\n" +
                ".title {color: #f00;font-family: Verdana, Geneva, sans-serif;}\n" +
                "#sort {background-color: hsla(332, 83%, 40%, 0.77);color:white}\n" +
                "</style>\n" +
                "</head>\n" +
                "<body>\n" +
                "<table>\n" +
                "    <tr>\n" +
                "        <th class=\"items title\">ID</th>\n" +
                "        <th class=\"items title\">NAME</th>\n" +
                "        <th id=\"sort\" class=\"items title\">PRICE</th>\n" +
                "        <th class=\"items title\">TYPE</th>\n" +
                "    </tr>\n";

        List<Wine> sortedlist = new ArrayList(winelist);

        sortedlist.sort((o1, o2) -> {
            if (o1.getPrice()>o2.getPrice())
                return -1;
            if (o1.getPrice()<o2.getPrice())
                return 1;
            return 0;
        });

        for (Wine wine : sortedlist) {
            s += "    <tr>\n";
            s += "        <td class=\"items\">" + wine.getId() + "</td>\n";
            s += "        <td class=\"items\">" + wine.getName() + "</td>\n";
            s += "        <td class=\"items\">" + wine.getPrice() + "</td>\n";
            s += "        <td class=\"items\">" + wine.getType() + "</td>\n";
            s += "    </tr>\n";
        }

        s += "</table>\n</body>\n</html>";

        return s;
    }


}