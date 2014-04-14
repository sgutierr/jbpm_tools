package org.jbpm.tools.ranges.languages.cutomfield;

import org.jbpm.formModeler.core.fieldTypes.CustomFieldType;

import java.util.Locale;
import java.util.Map;

/**
* This is a very simple example to customize a Field Type
* You can extend of CustomFieldType and override the next methods
* - getDescription
* - getShowHTML
* - getInputHTML
* - getValue
* Contact to: sgutierr@redhat.com
*/

public class LanguagesField implements CustomFieldType {
    @Override
    public String getDescription(Locale locale) {
        return "Languages list";
    }

    @Override
    public String getShowHTML(Object value, String fieldName, String namespace, boolean required, boolean readonly, String... params) {
        return "<div style='background-color:red;border:solid blue 1px;'>" + value + "</div>";
    }

    @Override
    public String getInputHTML(Object value, String fieldName, String namespace, boolean required, boolean readonly, String... params) {
        String html =  "<div style='background-color:red;border:solid blue 1px;'><select name='myselect'>";
        html += "<option value='sp'>Spanish</option>";
        html += "<option value='fr'>French</option>";
        html += "<option value='en'>English</option>";
        html += "<option value='gr'>German</option>";
        html += "<option value='it'>Italian</option>";
        html += "<option value='du'>Dutch</option>";
        html += "</div>";
        return html;
    }

    @Override
    public Object getValue(Map requestParameters, Map requestFiles, String fieldName, String namespace, Object previousValue, boolean required, boolean readonly, String... params) {
        String[] value = (String[]) requestParameters.get("myselect");

        if (value == null || value.length == 0) return "";

        return value[0];

    }
}
