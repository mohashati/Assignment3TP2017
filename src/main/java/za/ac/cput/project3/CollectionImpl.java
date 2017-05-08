package za.ac.cput.project3;

import za.ac.cput.project3.config.CollectionInterface;

import java.util.*;

/**
 * Created by tmoshasha on 04/27/2017
 */
public class CollectionImpl implements CollectionInterface {


    public List<String> names() {

        List names = new ArrayList();
        names.add("Ethon");
        names.add("Owen");
        names.add("Breyten");

        return names;
    }


    public Set<String> clours() {

        Set colours = new HashSet();
        colours.add("Blue");
        colours.add("Black");
        colours.add("Red");

        return colours;
    }


    public Map<String, String> brands() {

        Map brands = new HashMap();
        brands.put("Nike","AirMax");
        brands.put("Puma","BMW");
        brands.put("Jordan","Air");

        return brands;
    }
}
