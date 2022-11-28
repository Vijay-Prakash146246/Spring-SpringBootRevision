package com.tectes.OneToOneMappingEx;

import javax.persistence.*;

@Entity
@Table(name = "tutorials")
public class Tutorial
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private  long id;
    @Column(name = "Title")
    private  String title;
    @Column(name = "Description")
    private  String description;
    @Column(name = "Published")
    private  boolean published;

    //generate constructor


    public Tutorial()
    {
    }

    public Tutorial
            (
            String title,
            String description,
            boolean published
            )
    {
        this.title = title;
        this.description = description;
        this.published = published;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public boolean isPublished() {
        return published;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPublished(boolean published) {
        this.published = published;
    }
}
