package adc.core.adventurer;

import adc.core.adventurer.capabilities.AdventurerCapabilityHandler;
import adc.core.adventurer.capabilities.attributes.AttributesProvider;
import adc.core.adventurer.capabilities.attributes.EAttributes;
import adc.core.adventurer.capabilities.attributes.IAttributes;
import adc.core.adventurer.input.KeyBindingReg;
import adc.core.utils.Log;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class AdventurerCore {

	public AdventurerCapabilityHandler CapabilityHandler;
	
	public AdventurerCore() {
		MinecraftForge.EVENT_BUS.register(this);
		
		CapabilityHandler = new AdventurerCapabilityHandler();
		KeyBindingReg.init();
	}
	
	//// Strength \\\\
	@SubscribeEvent
	public void onEntityhit(LivingHurtEvent event) {
		if(!event.getEntityLiving().worldObj.isRemote){
			if(event.getSource().getEntity() instanceof EntityPlayer) {
				EntityPlayer player = (EntityPlayer) event.getSource().getEntity();
				if(player.hasCapability(AttributesProvider.ATTRIBUTES_CAP, null)){
					IAttributes cap = player.getCapability(AttributesProvider.ATTRIBUTES_CAP, null);
					if(event.getSource().damageType == "player") {
						Log.debug("Player delt " + event.getAmount() + " damage with a Str of " 
								+ cap.getCurrentAttributeBonus(EAttributes.STRENGTH) + ", upping damge to " + (event.getAmount() + cap.getCurrentAttributeBonus(EAttributes.STRENGTH)));
						event.setAmount(event.getAmount() + cap.getCurrentAttributeBonus(EAttributes.STRENGTH)); // Adds strength bonus to Melee
					}
					else if(event.getSource().damageType == "arrow"){
						event.setAmount(event.getAmount() + cap.getCurrentAttributeBonus(EAttributes.DEXTERITY)); // Adds dex bonus to ranged attack
					}
				}
			}
		}
	}
	
	
	//TODO: Attribute Event Listeners
	/*
	 * Strength:
	 *  - Melee Damage Bonus
	 * Dexterity:
	 * 	- Range Damage Bonus
	 * Constitution:
	 *  - Health Bonus
	 * Wisdom:
	 *  * Magic?
	 * Intelligence:
	 *  * Magic?
	 *  * Crafting?
	 * Charisma:
	 *  * Magic?
	 *  * Trading?
	 */
	
}
