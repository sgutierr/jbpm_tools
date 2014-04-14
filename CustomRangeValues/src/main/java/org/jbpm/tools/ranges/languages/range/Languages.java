package org.jbpm.tools.ranges.languages.range;

import org.jbpm.formModeler.api.model.RangeProvider;

import java.util.HashMap;
import java.util.Map;

/**
* This is a very simple example to create your custom Range Values
* - getType
* - getRangesMap
* Contact to: sgutierr@redhat.com
*/

public class Languages implements RangeProvider {
    @Override
    public String getType() {
        return "languagesList";
    }

    @Override
    public Map<String, String> getRangesMap(String namespace) {
        Map<String, String> result = new HashMap<String, String>();

        result.put("sp", "Spanish");
        result.put("fr", "French");
        result.put("en", "English");
        result.put("it", "Italian");
        result.put("gr", "German");
        result.put("du", "Dutch");

        return result;
    }
}
