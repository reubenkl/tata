package com.cg.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Channel {
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private Long Id; 
	
	private String channelName;

	@ManyToOne
	@JoinColumn
	private Pack pack;
	
	@ManyToOne
	@JoinColumn
	private Recharge recharge;
	
	
	//================================================//	
  	//===============CONSTRUCTORS=====================//
  	//================================================//

	public Channel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Channel(String channelName, Pack pack) {
		super();
		this.pack = pack;
		this.channelName = channelName;
	}

	
	//===========================================================================//
	//==========================SETTERS AND GETTERS==============================//
	//===========================================================================//
	
	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getChannelName() {
		return channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

	public Pack getPack() {
		return pack;
	}

	public void setPack(Pack pack) {
		this.pack = pack;
	}
	
	public Recharge getRecharges() {
		return recharge;
	}

	public void setRecharges(Recharge recharges) {
		this.recharge = recharges;
	}
	
	@Override
	public String toString() {
		return "Channel [Id=" + Id + ", channelName=" + channelName + ", pack=" + pack + "]";
	}
	
	
	
	
}
