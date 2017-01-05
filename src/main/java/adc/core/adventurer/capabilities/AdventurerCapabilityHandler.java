package adc.core.adventurer.capabilities;

import adc.core.adventurer.capabilities.attributes.Attributes;
import adc.core.adventurer.capabilities.attributes.AttributesProvider;
import adc.core.adventurer.capabilities.attributes.AttributesStorage;
import adc.core.adventurer.capabilities.attributes.IAttributes;
import adc.core.adventurer.capabilities.skills.ISkills;
import adc.core.adventurer.capabilities.skills.Skills;
import adc.core.adventurer.capabilities.skills.SkillsProvider;
import adc.core.adventurer.capabilities.skills.SkillsStorage;
import adc.core.adventurer.capabilities.stats.IStats;
import adc.core.adventurer.capabilities.stats.Stats;
import adc.core.adventurer.capabilities.stats.StatsProvider;
import adc.core.adventurer.capabilities.stats.StatsStorage;
import adc.core.config.Constants;
import adc.core.utils.Log;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class AdventurerCapabilityHandler {
	
	public static final ResourceLocation ATTRIBUTES_CAP = new ResourceLocation(Constants.MOD_ID, "attributes");
	public static final ResourceLocation SKILLS_CAP     = new ResourceLocation(Constants.MOD_ID, "skills");
	public static final ResourceLocation STATS_CAP     = new ResourceLocation(Constants.MOD_ID, "stats");
	
	public AdventurerCapabilityHandler() {
		CapabilityManager.INSTANCE.register(IAttributes.class,  new AttributesStorage(), 	Attributes.class);
		CapabilityManager.INSTANCE.register(ISkills.class, 		new SkillsStorage(), 		Skills.class);
		CapabilityManager.INSTANCE.register(IStats.class,	 	new StatsStorage(), 		Stats.class);
		MinecraftForge.EVENT_BUS.register(this);
	}
	
	@SubscribeEvent
    public void attachCapability(AttachCapabilitiesEvent<Entity> event)
    {
        if (!(event.getObject() instanceof EntityPlayer)) return;

        Log.info("Found Player, adding capabilities");
        event.addCapability(ATTRIBUTES_CAP, new AttributesProvider());
        event.addCapability(SKILLS_CAP, 	new SkillsProvider());
        event.addCapability(STATS_CAP, 		new StatsProvider());
        
    }
}
