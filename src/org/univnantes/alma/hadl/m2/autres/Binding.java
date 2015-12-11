package org.univnantes.alma.hadl.m2.autres;

import org.univnantes.alma.hadl.m2.interfaces.ConfigPort;
import org.univnantes.alma.hadl.m2.interfaces.ConfigPortFournis;
import org.univnantes.alma.hadl.m2.interfaces.ConfigPortRequis;
import org.univnantes.alma.hadl.m2.interfaces.Port;
import org.univnantes.alma.hadl.m2.interfaces.PortFournis;
import org.univnantes.alma.hadl.m2.interfaces.PortRequis;
import org.univnantes.alma.hadl.m2.interfaces.RoleFournis;
import org.univnantes.alma.hadl.m2.interfaces.RoleRequis;

public class Binding {

	private String label;
	private Port port;
	private ConfigPort configport;
	
	public Binding(String label, Port port, ConfigPort configport) {
		super();
		this.label = label;
		this.port = port;
		this.configport = configport;

		//this.configport.addObserver(port);
		//this.port.addObserver(configport);
		if(this.port instanceof PortRequis && this.configport instanceof ConfigPortRequis){
			//this.port.addObserver(this.configport);
			this.configport.addObserver(this.port);
		}else if(this.port instanceof PortFournis && this.configport instanceof ConfigPortFournis){
			//this.configport.addObserver(this.port);
			this.port.addObserver(this.configport);
		}
// else if(this.port instanceof ConfigPortRequis && this.configport instanceof ConfigPortFournis){
//			this.port.addObserver(this.configport);
//		}

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
