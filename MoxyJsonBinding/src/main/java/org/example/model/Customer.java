package org.example.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import org.eclipse.persistence.oxm.annotations.XmlPath;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Customer {
 
    @XmlAttribute(name="id")
    private int identifier;
    
    @XmlPath("personalInfo/firstName/text()")
    private String firstName;
     
    @XmlPath("personalInfo/lastName/text()")
    @XmlElement(nillable=true)
    private String lastName;
 
    @XmlElementWrapper
    @XmlElement(name="phoneNumber")
    private List<PhoneNumber> phoneNumbers = null;

    public int getIdentifier() {
        return identifier;
    }

    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<PhoneNumber> getPhoneNumbers() {
        if (phoneNumbers == null)
        {
            phoneNumbers = new ArrayList<PhoneNumber>();
        }
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<PhoneNumber> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }
 
}
