package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;


    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        id = nextId;
        nextId++;
    }


    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }
// TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public String toString() {
        String newline = System.getProperty("line.separator");
//        if ( !this.getName() && this.getEmployer() && this.getLocation()  && this.getPositionType() && this.getCoreCompetency()))
//        {
//            return "OOPS! This job does not seem to exist";
//
//        } else {
            if (this.name.toString() == "")
                this.name = "Data not available";
            if (this.employer.toString() == "")
                this.employer.setValue("Data not available");
            if (this.location.toString() == "")
                this.location.setValue("Data not available");
            if (this.positionType.toString() == "")
                this.positionType.setValue("Data not available");
            if (this.coreCompetency.toString() == "")
                this.coreCompetency.setValue("Data not available");


            String returnString = newline + "ID:  " + this.id + newline +
                    "Name: " + this.name + newline +
                    "Employer: " + this.employer + newline +
                    "Location: " + this.location + newline +
                    "Position Type: " + this.positionType + newline +
                    "Core Competency: " + this.coreCompetency + newline;


            return returnString;
        }
//    }

    @Override
    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public Location getLocation() {
        return location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}
