package org.univnantes.alma.hadl.m2.autres;

import org.univnantes.alma.hadl.m2.interfaces.ConfigPortFournis;
import org.univnantes.alma.hadl.m2.interfaces.ConfigPortRequis;
import org.univnantes.alma.hadl.m2.interfaces.Port;
import org.univnantes.alma.hadl.m2.interfaces.PortFournis;
import org.univnantes.alma.hadl.m2.interfaces.PortRequis;
import org.univnantes.alma.hadl.m2.interfaces.Role;
import org.univnantes.alma.hadl.m2.interfaces.RoleFournis;
import org.univnantes.alma.hadl.m2.interfaces.RoleRequis;

public class Attachement {

	private String label;
	private Port port;
	private Role role;
	
	public Attachement(String label,Port port,Role role) {
		super();
		this.label = label;
		this.port = port;
		this.role = role;
		
		//this.role.addObserver(port);
		//this.port.addObserver(role);
		if((this.port instanceof PortRequis || this.port instanceof ConfigPortRequis) && this.role instanceof RoleFournis){
			this.role.addObserver(this.port);
		}else if((this.port instanceof PortFournis || this.port instanceof ConfigPortFournis) && this.role instanceof RoleRequis){
			this.port.addObserver(this.role);
		}
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
