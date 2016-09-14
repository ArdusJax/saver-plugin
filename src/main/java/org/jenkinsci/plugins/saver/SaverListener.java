package org.jenkinsci.plugins.saver;


import hudson.Extension;
import hudson.model.Item;
import hudson.model.listeners.ItemListener;

import java.util.logging.Level;
import java.util.logging.Logger;

@Extension
public class SaverListener extends ItemListener {

    private static final Logger LOGGER = Logger.getLogger(SaverListener.class.getName());
    
    @Override
    public void onUpdated(Item item) {
        LOGGER.log(Level.FINE,"Item updated: " + item.getFullName(),new Throwable());
    }
}
