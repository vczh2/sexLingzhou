package net.lzsb.SexLingzhou.clickgui;

import net.lzsb.SexLingzhou.module.Module;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Copyright © 2015 - 2017 | lzsb | All rights reserved.
 * <p>
 * SexLingzhou - By lzsb(Marco)
 */
@SideOnly(Side.CLIENT)
public class Button {

    private Panel panel;
    private Module module;

    public Button(Panel panel, Module module) {
        this.panel = panel;
        this.module = module;
    }

    public void click() {
        module.setState(!module.getState());
    }

    public Module getModule() {
        return module;
    }

    public boolean isHover(final int x, final int y, final int widht, final int height, final int mouseX, final int mouseY) {
        return mouseX >= x && mouseX <= x + widht && mouseY >= y && mouseY <= y + height;
    }
}