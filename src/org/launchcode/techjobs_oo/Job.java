package org.launchcode.techjobs_oo;

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
    public Job(){
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency){
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
    public boolean equals(Object o) {
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

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    @Override
        public String toString () {
        try {
            String nameString = this.getName();
            String employerString = this.getEmployer().getValue();
            String positionTypeString = this.getPositionType().getValue();
            String locationString = this.getLocation().getValue();
            String coreCompetencyString = this.getCoreCompetency().getValue();

            // conditional for null value passed into constructor; can this be shortened?
            if (Objects.isNull(nameString) || nameString.equals("")) {
                nameString = "Data not available";
            }
            if (Objects.isNull(employerString) || employerString.equals("")) {
                employerString = "Data not available";
            }
            if (Objects.isNull(locationString) || locationString.equals("")) {
                locationString = "Data not available";
            }
            if (Objects.isNull(positionTypeString) || positionTypeString.equals("")) {
                positionTypeString = "Data not available";
            }
            if (Objects.isNull(coreCompetencyString) || coreCompetencyString.equals("")) {
                coreCompetencyString = "Data not available";
            }
            return "\n"
                    + "ID: " + this.getId() + "\n"
                    + "Name: " + nameString + "\n"
                    + "Employer: " + employerString + "\n"
                    + "Location: " + locationString + "\n"
                    + "Position Type: " + positionTypeString + "\n"
                    + "Core Competency: " + coreCompetencyString + "\n";
        }
        //returns message if all fields but id are null
        catch (NullPointerException e){
        return "OOPS! This job does not seem to exist.";
        }
        }
}


