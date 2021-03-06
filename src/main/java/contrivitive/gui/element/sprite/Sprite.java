package contrivitive.gui.element.sprite;

import contrivitive.gui.GuiBlueprint;
import contrivitive.gui.IContrivitiveGui;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public abstract class Sprite {
	public final int width;
	public final int height;
	public int offsetX = 0;
	public int offsetY = 0;

	public Sprite(int width, int height, int offsetX, int offsetY) {
		this.width = width;
		this.height = height;
		this.offsetX = offsetX;
		this.offsetY = offsetY;
	}

	public Sprite(int width, int height) {
		this(width, height, 0, 0);
	}

	@SideOnly(Side.CLIENT)
	public abstract <G extends GuiScreen, B extends GuiBlueprint> void draw(IContrivitiveGui<G,B> gui, int posX, int posY, float elapsedTicks);
}
