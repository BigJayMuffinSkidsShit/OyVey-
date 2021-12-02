package me.muffin.oyveyplus.impl.modules.client;

import me.muffin.oyveyplus.api.module.Module;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.input.Keyboard;
import me.muffin.oyveyplus.OyVeyPlus;
import me.muffin.oyveyplus.api.settings.Setting;

public class Gui extends Module {
    public static Gui instance;

    public Gui() {
        super("Gui", "mod menu + management i guess", Category.Client);
        setKey(Keyboard.KEY_RCONTROL);
        instance = this;
    }
    public static double scrollspeed;
    public Setting<Boolean> particles = register("Particles",true);
    public Setting<Double> scrollSpeed = this.register("ScrollSpeed",10,0,50,0);
    public Setting<Double> red = register("Red", 255, 0, 255, 0);
    public Setting<Double> green = register("Green", 0, 0, 255, 0);
    public Setting<Double> blue = register("Blue", 255, 0, 255, 0);
    public Setting<Double> rainbowHue = this.register("Rainbow H",255,0,255, 0);
    public Setting<Double> rainbowBrightness = this.register("Rainbow B",255,0,255,0);
    public Setting<Double> rainbowSaturation = this.register("Rainbow S",255,0,255,0);

    @Override
    public void onEnable() {
    	this.scrollspeed=scrollSpeed.getValue.doubleValue();
        mc.displayGuiScreen(OyVeyPlus.gui);
        disable();
    }
}