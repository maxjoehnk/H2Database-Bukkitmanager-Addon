package org.efreak.bukkitmanager.addon.h2;

import org.efreak.bukkitmanager.Database;
import org.efreak.bukkitmanager.addons.BukkitmanagerAddon;

public class H2Support extends BukkitmanagerAddon {

	@Override
	public void onLoad() {
		super.onLoad();
		name = "H2Database";
		Database.registerDatabaseSystem("H2", new H2());
	}
	
	@Override
	public void onEnable() {
		super.onEnable();
	}
	
}
