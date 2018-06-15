@XmlSchema(
    namespace="http://www.example.org/model",
    elementFormDefault=XmlNsForm.QUALIFIED)
@XmlJavaTypeAdapters({
    @XmlJavaTypeAdapter(type=LocalDate.class, value=LocalDateAdapter.class),
})
package org.example.model;
 
import java.time.LocalDate;
import javax.xml.bind.annotation.XmlNsForm;
import javax.xml.bind.annotation.XmlSchema;import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapters;
import org.example.adapter.LocalDateAdapter;
