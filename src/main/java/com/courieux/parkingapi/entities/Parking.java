package com.courieux.parkingapi.entities;

import java.util.Set;
import java.util.HashSet;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.data.geo.Point;

@Entity
@Table(name = "parking")
public class Parking {
	@Id
	private Long id;
	private String key;
	private String status;
	private int capacity;
	private int free;
	private Point geo;
	private String schedule;
	private String recordTimestamp;
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "parking_id")
	private Set<Fee> fees = new HashSet<>();
	
	public Parking() {
		super();
	}
	
	//GETTERS AND SETTERS
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public int getFree() {
		return free;
	}
	public void setFree(int free) {
		this.free = free;
	}
	public Point getGeo() {
		return geo;
	}
	public void setGeo(Point geo) {
		this.geo = geo;
	}
	public String getSchedule() {
		return schedule;
	}
	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}
	public String getRecordTimestamp() {
		return recordTimestamp;
	}
	public void setRecordTimestamp(String recordTimestamp) {
		this.recordTimestamp = recordTimestamp;
	}
	
	public Set<Fee> getFees() {
		return fees;
	}
	
	public void setFees(Set<Fee> fees) {
		this.fees = fees;
	}
}
