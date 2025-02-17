package com.uce.edu.ec.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="recursos_servidor")
public class RecursoServidor {
	
	@Id
    private Long id;

    private double cpuSy;
    private double cpuUs;
    private String fecha;
    private String hora;
    private String ip;
    private double ramTotalKb;
    private double ramUsedKb;
    private double swapTotalKb;
    private double swapUsedKb;
    private int tasksTotal;
    private int upDays;
    private String cpuUsColor;
    private String ramUsedKbColor;
    private String swapUsedKbColor;
    private String ramTotalKbColor;
    private String tasksTotalColor;
    private String upDaysColor;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public double getCpuSy() {
		return cpuSy;
	}
	public void setCpuSy(double cpuSy) {
		this.cpuSy = cpuSy;
	}
	public double getCpuUs() {
		return cpuUs;
	}
	public void setCpuUs(double cpuUs) {
		this.cpuUs = cpuUs;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public double getRamTotalKb() {
		return ramTotalKb;
	}
	public void setRamTotalKb(double ramTotalKb) {
		this.ramTotalKb = ramTotalKb;
	}
	public double getRamUsedKb() {
		return ramUsedKb;
	}
	public void setRamUsedKb(double ramUsedKb) {
		this.ramUsedKb = ramUsedKb;
	}
	public double getSwapTotalKb() {
		return swapTotalKb;
	}
	public void setSwapTotalKb(double swapTotalKb) {
		this.swapTotalKb = swapTotalKb;
	}
	public double getSwapUsedKb() {
		return swapUsedKb;
	}
	public void setSwapUsedKb(double swapUsedKb) {
		this.swapUsedKb = swapUsedKb;
	}
	public int getTasksTotal() {
		return tasksTotal;
	}
	public void setTasksTotal(int tasksTotal) {
		this.tasksTotal = tasksTotal;
	}
	public int getUpDays() {
		return upDays;
	}
	public void setUpDays(int upDays) {
		this.upDays = upDays;
	}
	public String getCpuUsColor() {
		return cpuUsColor;
	}
	public void setCpuUsColor(String cpuUsColor) {
		this.cpuUsColor = cpuUsColor;
	}
	public String getRamUsedKbColor() {
		return ramUsedKbColor;
	}
	public void setRamUsedKbColor(String ramUsedKbColor) {
		this.ramUsedKbColor = ramUsedKbColor;
	}
	public String getSwapUsedKbColor() {
		return swapUsedKbColor;
	}
	public void setSwapUsedKbColor(String swapUsedKbColor) {
		this.swapUsedKbColor = swapUsedKbColor;
	}
	public String getRamTotalKbColor() {
		return ramTotalKbColor;
	}
	public void setRamTotalKbColor(String ramTotalKbColor) {
		this.ramTotalKbColor = ramTotalKbColor;
	}
	public String getTasksTotalColor() {
		return tasksTotalColor;
	}
	public void setTasksTotalColor(String tasksTotalColor) {
		this.tasksTotalColor = tasksTotalColor;
	}
	public String getUpDaysColor() {
		return upDaysColor;
	}
	public void setUpDaysColor(String upDaysColor) {
		this.upDaysColor = upDaysColor;
	}


    
}
