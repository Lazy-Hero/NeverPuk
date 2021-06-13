package net;

import java.util.Comparator;
import net.mf;
import net.xn;
import org.lwjgl.opengl.DisplayMode;

public class wx implements Comparator {
   public int compare(Object var1, Object var2) {
      mf.O();
      DisplayMode var4 = (DisplayMode)var1;
      DisplayMode var5 = (DisplayMode)var2;
      return var4.getWidth() != var5.getWidth()?var4.getWidth() - var5.getWidth():(var4.getHeight() != var5.getHeight()?var4.getHeight() - var5.getHeight():(var4.getBitsPerPixel() != var5.getBitsPerPixel()?var4.getBitsPerPixel() - var5.getBitsPerPixel():(var4.getFrequency() != var5.getFrequency()?var4.getFrequency() - var5.getFrequency():0)));
   }

   private static xn a(xn var0) {
      return var0;
   }
}
