package adc.core.adventurer.capabilities;

import adc.core.adventurer.capabilities.attributes.AttributesProvider;
import adc.core.adventurer.capabilities.skills.SkillsProvider;
import adc.core.config.Constants;
import adc.core.utils.Log;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class AdventurerCapabilityHandler {
	
	public static final ResourceLocation ATTRIBUTES_CAP = new ResourceLocation(Constants.MOD_ID, "attributes");
	public static final ResourceLocation SKILLS_CAP     = new ResourceLocation(Constants.MOD_ID, "skills");
	
	@SubscribeEvent
    public void attachCapability(AttachCapabilitiesEvent<Entity> event)
    {
        if (!(event.getObject() instanceof EntityPlayer)) return;

        Log.info("Found Player, adding capabilities");
        event.addCapability(ATTRIBUTES_CAP, new AttributesProvider());
        event.addCapability(SKILLS_CAP, 	new SkillsProvider());
        
    }
}
