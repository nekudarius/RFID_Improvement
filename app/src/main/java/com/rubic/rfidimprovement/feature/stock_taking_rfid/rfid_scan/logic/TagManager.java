package com.rubic.rfidimprovement.feature.stock_taking_rfid.rfid_scan.logic;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TagManager {
    private Map<String, Map<String, Set<String>>> tagMap = new HashMap<>();

    /** Used to add a printer in a rack */
    public void addValue(String rack, String printer) {
        String group = extractGroup(printer);
        if (group == null) {
            // Handle the case where the printer does not have a group identifier.
            // You can choose to ignore it or handle it differently.
            return;
        }

        Map<String, Set<String>> rackPrinters = tagMap.get(rack);
        if (rackPrinters == null) {
            rackPrinters = new HashMap<>();
            tagMap.put(rack, rackPrinters);
        }

        Set<String> printerGroup = rackPrinters.computeIfAbsent(group, k -> new HashSet<>());
        printerGroup.add(printer);
    }

    /** Used to get values in a certain rack and group */
    public Set<String> getValues(String rack, String group) {
        Map<String, Set<String>> rackPrinters = tagMap.get(rack);
        if (rackPrinters != null) {
            return rackPrinters.get(group);
        }
        return null;
    }

    /** Used to remove a printer from a rack and group */
    public void removePrinterOnRack(String rack, String printer) {
        String group = extractGroup(printer);
        if (group == null) {
            // Handle the case where the printer does not have a group identifier.
            // You can choose to ignore it or handle it differently.
            return;
        }

        Map<String, Set<String>> rackPrinters = tagMap.get(rack);
        if (rackPrinters != null) {
            Set<String> printerGroup = rackPrinters.get(group);
            if (printerGroup != null) {
                printerGroup.remove(printer);
                if (printerGroup.isEmpty()) {
                    rackPrinters.remove(group);
                }
                if (rackPrinters.isEmpty()) {
                    tagMap.remove(rack);
                }
            }
        }
    }

    /** Used to remove all printers in a specific group in a rack */
    public void removeGroupInRack(String rack, String group) {
        Map<String, Set<String>> rackPrinters = tagMap.get(rack);
        if (rackPrinters != null) {
            rackPrinters.remove(group);
            if (rackPrinters.isEmpty()) {
                tagMap.remove(rack);
            }
        }
    }

    /** Used to remove a printer from a group in a rack */
    public void removePrinterFromGroup(String rack, String group, String printer) {
        Map<String, Set<String>> rackPrinters = tagMap.get(rack);
        if (rackPrinters != null) {
            Set<String> printerGroup = rackPrinters.get(group);
            if (printerGroup != null) {
                printerGroup.remove(printer);
            }
        }
    }

    private String extractGroup(String printer) {
        // Implement the logic to extract the group identifier from the printer string.
        // For example, if your group identifier is the part before the hyphen, you can do:
        String[] parts = printer.split("-");
        if (parts.length > 1) {
            return parts[0];
        }
        return null;
    }
}
