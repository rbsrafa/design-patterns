/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structural.proxy;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author apont
 */
public class InternetProxy implements Internet{
    
    private Internet internet = new RealInternet();
    private static List<String> restrictedSites;
    
    static{
        restrictedSites = new ArrayList<String>();
        restrictedSites.add("notHappenig.com");
        restrictedSites.add("noWayDude.com");
        restrictedSites.add("youMustBeJocking.com");
        restrictedSites.add("facebook.com");
        
    }

    @Override
    public void connectTo(String host) throws Exception{
        if (!restrictedSites.contains(host)){
            internet.connectTo(host);
        }
        else{
            throw new Exception("The boss said no! get back to work");
        }
    }
}
