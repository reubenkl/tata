package com.cg.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Pack {
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private Long id;
	
    private Double cost;
    
    private Integer daysValidity;
   
    private String description;
    
    private String planName;
    
    @OneToMany(mappedBy = "pack")
    private List<Channel> channels;
    
    
    //================================================//
	//===============CONSTRUCTORS=====================//
	//================================================//
    
    public Pack() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pack(Double cost, Integer daysValidity, String description, String planName) {
		super();
		this.cost = cost;
		this.daysValidity = daysValidity;
		this.description = description;
		this.planName = planName;
	}

	//===========================================================================//
	//==========================SETTERS AND GETTERS==============================//
	//===========================================================================//
	
	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Integer getDaysValidity() {
        return daysValidity;
    }

    public void setDaysValidity(Integer daysValidity) {
        this.daysValidity = daysValidity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public List<Channel> getChannels() {
        return channels;
    }

    public void setChannels(List<Channel> channels) {
        this.channels = channels;
    }

	@Override
	public String toString() {
		return "Pack [id=" + id + ", cost=" + cost + ", daysValidity=" + daysValidity + ", description=" + description
				+ ", planName=" + planName + ", channels=" + channels + "]";
	}
    
    
    
}
