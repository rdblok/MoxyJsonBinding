package org.example.adapter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class LocalDateAdapter  extends XmlAdapter<String, LocalDate>{

    private static DateTimeFormatter datumFormatter = DateTimeFormatter.ofPattern("yyyy-MMM-dd");

    @Override
    public LocalDate unmarshal(String v) throws Exception {
        return LocalDate.parse(v, datumFormatter);
    }

    @Override
    public String marshal(LocalDate v) throws Exception {
        return v.format(datumFormatter);
    }
}
