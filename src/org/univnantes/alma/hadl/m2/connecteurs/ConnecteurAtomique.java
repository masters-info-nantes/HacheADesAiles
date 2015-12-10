package org.univnantes.alma.hadl.m2.connecteurs;

import java.util.Observable;

import org.univnantes.alma.hadl.m2.interfaces.RoleFournis;
import org.univnantes.alma.hadl.m2.interfaces.RoleRequis;

public class ConnecteurAtomique extends Connecteur {

	public ConnecteurAtomique(String label) {
		super(label);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update(Observable o, Object arg) {
		//this.setChanged();
		if(o instanceof RoleRequis){
			System.out.println("Connecteur : "+super.getLabel()+", Caller : "+((RoleRequis) o).getLabel());
			for (RoleFournis rf : getRolesfournis()){
				rf.sendRequest((String)arg);
			}
			//((RoleRequis) o).receiveRequest((String)arg);
		}else if(o instanceof RoleFournis){
			System.out.println("Connecteur : "+super.getLabel()+", Called : "+((RoleFournis) o).getLabel());
			for (RoleRequis rq : getRolesrequis()){
				rq.receiveRequest((String) arg);
			}
			//((RoleFournis) o).sendRequest((String)arg);
		}
		//notifyObservers(arg);
	}

}
