package com.tutorialmod.tutorialmod.blocks;

import com.tutorialmod.tutorialmod.TutorialMod;
import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;

public class FirstBlockScreen extends ContainerScreen<FirstBlockContainer> {

    private ResourceLocation GUI = new ResourceLocation(TutorialMod.MODID, "textures/gui/firstblock_gui.png");

    public FirstBlockScreen(FirstBlockContainer container, PlayerInventory inv, ITextComponent name) {
        super(container, inv, name);
    }
    
    @Override
    public void render(MatrixStack ms, int mouseX, int mouseY, float partialTicks) {
    	this.renderBackground(ms);
    	super.render(ms, mouseX, mouseY, partialTicks);
    	this.renderHoveredTooltip(ms, mouseX, mouseY);
    }
    
    
    @Override
    protected void drawGuiContainerForegroundLayer(MatrixStack ms, int mouseX, int mouseY) {
    	drawString(ms, Minecraft.getInstance().fontRenderer, "Energy: " + container.getEnergy(), 10, 10, 0xffffff);
    	drawString(ms, Minecraft.getInstance().fontRenderer, "Ticks: " + container.getTicksLeft(), 10, 20, 0xffffff);
    }
    
    @Override
    protected void drawGuiContainerBackgroundLayer(MatrixStack ms, float partialTicks, int mouseX, int mouseY) {
        RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.minecraft.getTextureManager().bindTexture(GUI);
        int relX = (this.width - this.xSize) / 2;
        int relY = (this.height - this.ySize) / 2;
        this.blit(ms, relX, relY, 0, 0, this.xSize, this.ySize);
    }
    
}
