package org.univnantes.alma.hadl.m2.autres;

import org.univnantes.alma.hadl.m2.interfaces.ConfigPort;
import org.univnantes.alma.hadl.m2.interfaces.Port;

public class Binding {

	private String label;
	private Port port;
	private ConfigPort configport;
	
	public Binding(String label, Port port, ConfigPort configport) {
		super();
		this.label = label;
		this.port = port;
		this.configport = configport;
		
		this.configport.addObserver(port);
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public Port getPort() {
		return port;
	}

	public void setPort(Port port) {
		this.port = port;
	}

	public ConfigPort getConfigport() {
		return configport;
	}

	public void setConfigport(ConfigPort configport) {
		this.configport = configport;
	}
	

}
