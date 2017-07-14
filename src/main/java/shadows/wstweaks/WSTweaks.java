package shadows.wstweaks;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import shadows.wstweaks.proxy.CommonProxy;

@Mod(modid = WSTweaks.MODID, version = WSTweaks.VERSION, name = WSTweaks.MODNAME)

public class WSTweaks {
	public static final String MODID = "witherskelefix";
	public static final String MODNAME = "Wither Skeleton Tweaks";
	public static final String VERSION = "2.2.2";

	@SidedProxy(clientSide = "shadows.soul.proxy.ClientProxy", serverSide = "shadows.soul.proxy.CommonProxy")
	public static CommonProxy proxy;

	@Mod.Instance
	public static WSTweaks instance;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		proxy.preInit(event);
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent e) {
		proxy.init(e);
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		proxy.postInit(e);
	}

}