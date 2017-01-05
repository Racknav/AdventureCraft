package adc.core.adventurer.gui;

import java.io.IOException;

import adc.core.adventurer.capabilities.AdventurerCapabilityHandler;
import adc.core.adventurer.capabilities.attributes.AttributesProvider;
import adc.core.adventurer.capabilities.attributes.EAttributes;
import adc.core.adventurer.capabilities.attributes.IAttributes;
import adc.core.adventurer.capabilities.stats.IStats;
import adc.core.adventurer.capabilities.stats.StatsProvider;
import adc.core.utils.Log;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.EntityPlayer;

public class GuiAttributesInterface extends GuiScreen {
	private int xSize;
	private int ySize;
	private int guiTop;
	private int guiLeft;

	private EntityPlayer player;
	private IAttributes attributes;
	private IStats stats;

	private boolean changingStats;
	
	private GuiButton 	exitButton, bConfirmStat, bStrPluse, bStrMinus, bDexPluse, bDexMinus, bConPluse, bConMinus,
						bWisPluse, bWisMinus, bIntPluse, bIntMinus, bChaPluse, bChaMinus;
	
	public GuiAttributesInterface(EntityPlayer playerIn) {
		this.player = playerIn;
		this.xSize = 220;
		this.ySize = 220;
	}
	
	@Override
	public void drawScreen(int mouseX, int mouseY, float partialTicks) {
		
		this.drawDefaultBackground();

		GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
		// this.drawRect(guiLeft, guiTop, guiLeft + xSize, guiTop + ySize,
		// 0xFF909090);
		this.drawBox(guiLeft, guiTop, xSize, ySize, 0xFF909090);

		this.drawCenteredStringNoShadow(this.fontRendererObj, this.player.getName(), guiLeft + (xSize / 2), guiTop + 6,
				0x404040);

		this.displayStats();

		super.drawScreen(mouseX, mouseY, partialTicks);
	}
	private void displayStats() {
		// Draw Names
		this.drawBox(guiLeft + 10, guiTop + 10, 30, 20, 0xFFB0B0B0);
		this.drawCenteredStringNoShadow(this.fontRendererObj, I18n.format("STR"), guiLeft + 25, guiTop + 20, 0x404040);
		this.drawBox(guiLeft + 10, guiTop + 35, 30, 20, 0xFFB0B0B0);
		this.drawCenteredStringNoShadow(this.fontRendererObj, I18n.format("DEX"), guiLeft + 25, guiTop + 45, 0x404040);
		this.drawBox(guiLeft + 10, guiTop + 60, 30, 20, 0xFFB0B0B0);
		this.drawCenteredStringNoShadow(this.fontRendererObj, I18n.format("CON"), guiLeft + 25, guiTop + 70, 0x404040);
		this.drawBox(guiLeft + 10, guiTop + 85, 30, 20, 0xFFB0B0B0);
		this.drawCenteredStringNoShadow(this.fontRendererObj, I18n.format("WIS"), guiLeft + 25, guiTop + 95, 0x404040);
		this.drawBox(guiLeft + 10, guiTop + 110, 30, 20, 0xFFB0B0B0);
		this.drawCenteredStringNoShadow(this.fontRendererObj, I18n.format("INT"), guiLeft + 25, guiTop + 120, 0x404040);
		this.drawBox(guiLeft + 10, guiTop + 135, 30, 20, 0xFFB0B0B0);
		this.drawCenteredStringNoShadow(this.fontRendererObj, I18n.format("CHA"), guiLeft + 25, guiTop + 145, 0x404040);
		
		// Draw Values
		this.drawBox(guiLeft + 80, guiTop + 10, 30, 20, 0xFFB0B0B0);
		this.drawCenteredStringNoShadow(this.fontRendererObj, I18n.format(Integer.toString(attributes.getBaseAttribute(EAttributes.STRENGTH))),
				guiLeft + 95, guiTop + 20, 0x404040);
		this.drawBox(guiLeft + 80, guiTop + 35, 30, 20, 0xFFB0B0B0);
		this.drawCenteredStringNoShadow(this.fontRendererObj, I18n.format(Integer.toString(attributes.getBaseAttribute(EAttributes.DEXTERITY))),
				guiLeft + 95, guiTop + 45, 0x404040);
		this.drawBox(guiLeft + 80, guiTop + 60, 30, 20, 0xFFB0B0B0);
		this.drawCenteredStringNoShadow(this.fontRendererObj, I18n.format(Integer.toString(attributes.getBaseAttribute(EAttributes.CONSTITUTION))),
				guiLeft + 95, guiTop + 70, 0x404040);
		this.drawBox(guiLeft + 80, guiTop + 85, 30, 20, 0xFFB0B0B0);
		this.drawCenteredStringNoShadow(this.fontRendererObj, I18n.format(Integer.toString(attributes.getBaseAttribute(EAttributes.WISDOM))),
				guiLeft + 95, guiTop + 95, 0x404040);
		this.drawBox(guiLeft + 80, guiTop + 110, 30, 20, 0xFFB0B0B0);
		this.drawCenteredStringNoShadow(this.fontRendererObj, I18n.format(Integer.toString(attributes.getBaseAttribute(EAttributes.INTELLIGENCE))),
				guiLeft + 95, guiTop + 120, 0x404040);
		this.drawBox(guiLeft + 80, guiTop + 135, 30, 20, 0xFFB0B0B0);
		this.drawCenteredStringNoShadow(this.fontRendererObj, I18n.format(Integer.toString(attributes.getBaseAttribute(EAttributes.CHARISMA))),
				guiLeft + 95, guiTop + 145, 0x404040);

		//this.drawBox(guiLeft + 10, guiTop + 160, 200, 20, 0xFFB0B0B0);
		//fontRendererObj.drawString("Dragon Experience: " + Integer.toString(stats.getDragonExp()), guiLeft + 12, guiTop + 170 - fontRendererObj.FONT_HEIGHT / 2, 0x404040);
		//this.drawBox(guiLeft + 10, guiTop + 190, 200, 20, 0xFFB0B0B0);
		//fontRendererObj.drawString("Dragon Level: "    + Integer.toString(stats.getDragonLevel()), guiLeft + 12, guiTop + 200 - fontRendererObj.FONT_HEIGHT / 2, 0x404040);
		
		// Button Options
		if (changingStats) {
			this.bStrPluse.visible = true;
			this.bDexPluse.visible = true;
			this.bConPluse.visible = true;
			this.bWisPluse.visible = true;
			this.bIntPluse.visible = true;
			this.bChaPluse.visible = true;

			if (stats.isFirstSet()) {
				this.bStrMinus.visible = true;
				this.bDexMinus.visible = true;
				this.bConMinus.visible = true;
				this.bWisMinus.visible = true;
				this.bIntMinus.visible = true;
				this.bChaMinus.visible = true;
			} else {
				this.bStrMinus.visible = false;
				this.bDexMinus.visible = false;
				this.bConMinus.visible = false;
				this.bWisMinus.visible = false;
				this.bIntMinus.visible = false;
				this.bChaMinus.visible = false;
			}

			boolean flag = stats.getStatPoints() > 0;
			
			this.bStrMinus.enabled = attributes.getBaseAttribute(EAttributes.STRENGTH) > 8;
			this.bStrPluse.enabled = attributes.getBaseAttribute(EAttributes.STRENGTH) < 20 && flag;
			this.bDexMinus.enabled = attributes.getBaseAttribute(EAttributes.DEXTERITY) > 8;
			this.bDexPluse.enabled = attributes.getBaseAttribute(EAttributes.DEXTERITY) < 20 && flag;
			this.bConMinus.enabled = attributes.getBaseAttribute(EAttributes.CONSTITUTION) > 8;
			this.bConPluse.enabled = attributes.getBaseAttribute(EAttributes.CONSTITUTION) < 20 && flag;
			this.bWisMinus.enabled = attributes.getBaseAttribute(EAttributes.WISDOM) > 8;
			this.bWisPluse.enabled = attributes.getBaseAttribute(EAttributes.WISDOM) < 20 && flag;
			this.bIntMinus.enabled = attributes.getBaseAttribute(EAttributes.INTELLIGENCE) > 8;
			this.bIntPluse.enabled = attributes.getBaseAttribute(EAttributes.INTELLIGENCE) < 20 && flag;
			this.bChaMinus.enabled = attributes.getBaseAttribute(EAttributes.CHARISMA) > 8;
			this.bChaPluse.enabled = attributes.getBaseAttribute(EAttributes.CHARISMA) < 20 && flag;

			this.drawBox(guiLeft + 150, guiTop + 60, 60, 20, 0xFFB0B0B0);
			this.drawCenteredStringNoShadow(this.fontRendererObj, I18n.format(Integer.toString(stats.getStatPoints())),
					guiLeft + 180, guiTop + 70, 0x404040);
			this.bConfirmStat.enabled = (stats.getStatPoints() <= 0);
			this.bConfirmStat.visible = true;
		} else {
			this.bStrMinus.visible = false;
			this.bStrPluse.visible = false;
			this.bDexMinus.visible = false;
			this.bDexPluse.visible = false;
			this.bConMinus.visible = false;
			this.bConPluse.visible = false;
			this.bWisMinus.visible = false;
			this.bWisPluse.visible = false;
			this.bIntMinus.visible = false;
			this.bIntPluse.visible = false;
			this.bChaMinus.visible = false;
			this.bChaPluse.visible = false;
			this.bConfirmStat.visible = false;
		}

	}
	private void drawBox(int x, int y, int sizeX, int sizeY, int Color) {
		this.drawRect(x, y, x + sizeX, y + sizeY, Color);
	}

	public void drawCenteredStringNoShadow(FontRenderer fontRendererIn, String text, int x, int y, int color) {
		fontRendererIn.drawString(text, (x - fontRendererIn.getStringWidth(text) / 2),
				(y - fontRendererIn.FONT_HEIGHT / 2), color);
	}

	@Override
	public boolean doesGuiPauseGame() {
		return false;
	}

	@Override
	public void onGuiClosed() {
		super.onGuiClosed();
		//stats.savePlayerStats();
	}

	@Override
	public void initGui() {
		if(!player.hasCapability(AttributesProvider.ATTRIBUTES_CAP, null)){
			Log.error("PLAYER DOESNT HAVE ATTRIBUTES CAPABILITY");
		}
		if(!player.hasCapability(StatsProvider.STATS_CAP, null)){
			Log.error("PLAYER DOENST HAVE STATS CAPABILITY");
		}
		
		attributes = player.getCapability(AttributesProvider.ATTRIBUTES_CAP, null);
		stats = player.getCapability(StatsProvider.STATS_CAP, null);
		
		changingStats = (stats.getStatPoints() > 0);

		super.initGui();

		this.xSize = (this.xSize > this.width) ? this.width - 6 : this.xSize;
		this.ySize = (this.ySize > this.height) ? this.height - 6 : this.ySize;

		this.guiLeft = (this.width - this.xSize) / 2;
		this.guiTop = (this.height - this.ySize) / 2;

		buttonList
				.add(this.exitButton = new GuiButton(0, this.guiLeft + this.xSize - 30, this.guiTop + 10, 20, 20, "X"));

		buttonList.add(this.bStrMinus = new GuiButton(1, guiLeft + 50, guiTop + 10, 20, 20, "-"));
		buttonList.add(this.bDexMinus = new GuiButton(2, guiLeft + 50, guiTop + 35, 20, 20, "-"));
		buttonList.add(this.bConMinus = new GuiButton(3, guiLeft + 50, guiTop + 60, 20, 20, "-"));
		buttonList.add(this.bWisMinus = new GuiButton(4, guiLeft + 50, guiTop + 85, 20, 20, "-"));
		buttonList.add(this.bIntMinus = new GuiButton(5, guiLeft + 50, guiTop + 110, 20, 20, "-"));
		buttonList.add(this.bChaMinus = new GuiButton(6, guiLeft + 50, guiTop + 135, 20, 20, "-"));

		buttonList.add(this.bStrPluse = new GuiButton(7, guiLeft + 120, guiTop + 10, 20, 20, "+"));
		buttonList.add(this.bDexPluse = new GuiButton(8, guiLeft + 120, guiTop + 35, 20, 20, "+"));
		buttonList.add(this.bConPluse = new GuiButton(9, guiLeft + 120, guiTop + 60, 20, 20, "+"));
		buttonList.add(this.bWisPluse = new GuiButton(10, guiLeft + 120, guiTop + 85, 20, 20, "+"));
		buttonList.add(this.bIntPluse = new GuiButton(11, guiLeft + 120, guiTop + 110, 20, 20, "+"));
		buttonList.add(this.bChaPluse = new GuiButton(12, guiLeft + 120, guiTop + 135, 20, 20, "+"));

		buttonList.add(this.bConfirmStat = new GuiButton(13, guiLeft + 150, guiTop + 85, 60, 20, "Confirm"));
	}

	@Override
	protected void actionPerformed(GuiButton button) throws IOException {
		if (button == this.exitButton) {
			this.mc.displayGuiScreen(null);
			if (this.mc.currentScreen == null)
				this.mc.setIngameFocus();
		}
		if (button == this.bStrMinus) {
			attributes.setBaseAttribute(EAttributes.STRENGTH, attributes.getBaseAttribute(EAttributes.STRENGTH) - 1);
			stats.raiseStatPoints();
		}
		if (button == this.bStrPluse) {
			attributes.setBaseAttribute(EAttributes.STRENGTH, attributes.getBaseAttribute(EAttributes.STRENGTH) + 1);
			stats.lowerStatPoints();
		}
		if (button == this.bDexMinus) {
			attributes.setBaseAttribute(EAttributes.DEXTERITY, attributes.getBaseAttribute(EAttributes.DEXTERITY) - 1);
			stats.raiseStatPoints();
		}
		if (button == this.bDexPluse) {
			attributes.setBaseAttribute(EAttributes.DEXTERITY, attributes.getBaseAttribute(EAttributes.DEXTERITY) + 1);
			stats.lowerStatPoints();
		}
		if (button == this.bConMinus) {
			attributes.setBaseAttribute(EAttributes.CONSTITUTION, attributes.getBaseAttribute(EAttributes.CONSTITUTION) - 1);
			stats.raiseStatPoints();
		}
		if (button == this.bConPluse) {
			attributes.setBaseAttribute(EAttributes.CONSTITUTION, attributes.getBaseAttribute(EAttributes.CONSTITUTION) + 1);
			stats.lowerStatPoints();
		}
		if (button == this.bWisMinus) {
			attributes.setBaseAttribute(EAttributes.WISDOM, attributes.getBaseAttribute(EAttributes.WISDOM) - 1);
			stats.lowerStatPoints();
			stats.raiseStatPoints();
		}
		if (button == this.bWisPluse) {
			attributes.setBaseAttribute(EAttributes.WISDOM, attributes.getBaseAttribute(EAttributes.WISDOM) + 1);
			stats.lowerStatPoints();
		}
		if (button == this.bIntMinus) {
			attributes.setBaseAttribute(EAttributes.INTELLIGENCE, attributes.getBaseAttribute(EAttributes.INTELLIGENCE) - 1);
			stats.raiseStatPoints();
		}
		if (button == this.bIntPluse) {
			attributes.setBaseAttribute(EAttributes.INTELLIGENCE, attributes.getBaseAttribute(EAttributes.INTELLIGENCE) + 1);
			stats.lowerStatPoints();
		}
		if (button == this.bChaMinus) {
			attributes.setBaseAttribute(EAttributes.CHARISMA, attributes.getBaseAttribute(EAttributes.CHARISMA) - 1);
			stats.raiseStatPoints();
		}
		if (button == this.bChaPluse) {
			attributes.setBaseAttribute(EAttributes.CHARISMA, attributes.getBaseAttribute(EAttributes.CHARISMA) + 1);
			stats.lowerStatPoints();
		}
		if (button == this.bConfirmStat) {
			//ModPacketHandler.INSTANCE.sendToServer(
			//			new AttributeMessage(player.getCapability(AttributesProvider.ATTRIBUTES_CAP, null)));
			stats.setFirstSet(false);
			this.changingStats = false;
		}
	}
	
}
