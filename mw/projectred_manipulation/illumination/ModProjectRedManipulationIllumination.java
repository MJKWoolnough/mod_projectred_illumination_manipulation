package mw.projectred_manipulation.illumination;

import mw.fmp_manipulation.ForgeMultiPartManipulator;
import mw.fmp_manipulation.IMultiPartManipulator;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;

@Mod(modid="mw.projectred_manipulation.illumination", name="ModProjectRedManipulationIllumination", version="1.0.0", dependencies = "required-after:mw.fmp_manipulation")
//@NetworkMod(clientSideRequired=false, serverSideRequired=true)
public class ModProjectRedManipulationIllumination {
	@EventHandler
	public void postInit(FMLPostInitializationEvent postInitEvent) {
		IMultiPartManipulator all = new AllFaces();
		ForgeMultiPartManipulator.registerMultiPartManipulator("pr_fixture", all);
		ForgeMultiPartManipulator.registerMultiPartManipulator("pr_cagelamp", all);
		ForgeMultiPartManipulator.registerMultiPartManipulator("pr_lantern", all);
		
		ForgeMultiPartManipulator.registerMultiPartManipulator("pr_lightbutton", new VerticalFaces());
	}
}
