package com.tectes.OneToOneMappingEx;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Tutorials_Details")
public class TutorialDetails
{
    @Id
    private  long id;
    @Column
    private Date createdOn;
    @Column
    private  String createdBy;
    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    @JoinColumn(name = "Tutorial_Id")
    private  Tutorial tutorial;

    public TutorialDetails()
    {
    }

    public TutorialDetails(String createdBy)
    {
        this.createdOn=new Date();
        this.createdBy = createdBy;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Tutorial getTutorial() {
        return tutorial;
    }

    public void setTutorial(Tutorial tutorial) {
        this.tutorial = tutorial;
    }
}
