package ro.ase.acs.main;

import java.util.HashMap;
import java.util.Map;

public class IoC {

	Map<Class, Class> map = new HashMap<>();
	
	public void register(Class contract, Class implementation) {
		if (!map.containsKey(contract)) {
			map.put(contract, implementation);
		}
	}
	
}
