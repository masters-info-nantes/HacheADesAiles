package org.univnantes.alma.hadl.m2.autres;

import org.univnantes.alma.hadl.m2.interfaces.Port;
import org.univnantes.alma.hadl.m2.interfaces.Role;

public class Attachement {

	private String label;
	private Port port;
	private Role role;
	
	public Attachement(String label,Port port,Role role) {
		super();
		this.label = label;
		this.port = port;
		this.role = role;
		
		this.role.addObserver(port);
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

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	
}
