package net;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import net.n9.x;
import net.u.d;
import org.lwjgl.opengl.GL11;

public class im {
   private final float P = 512.0F;
   protected im.a[] z = new im.a[167];
   protected Font p;
   protected boolean E;
   protected boolean W;
   protected int e = -1;
   protected int V = 0;
   protected x S;
   private static String[] s;

   public im(Font var1, boolean var2, boolean var3) {
      this.p = var1;
      this.E = var2;
      this.W = var3;
      this.S = this.u(var1, var2, var3, this.z);
   }

   protected x u(Font var1, boolean var2, boolean var3, im.a[] var4) {
      BufferedImage var5 = this.D(var1, var2, var3, var4);
      return new x(var5);
   }

   protected BufferedImage D(Font var1, boolean var2, boolean var3, im.a[] var4) {
      short var6 = 512;
      BufferedImage var7 = new BufferedImage(var6, var6, 2);
      C();
      Graphics2D var8 = (Graphics2D)var7.getGraphics();
      var8.setFont(var1);
      var8.setColor(new Color(255, 255, 255, 0));
      var8.fillRect(0, 0, var6, var6);
      var8.setColor(Color.WHITE);
      var8.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_ON);
      var8.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
      var8.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
      FontMetrics var9 = var8.getFontMetrics();
      int var10 = 0;
      byte var11 = 0;
      int var12 = 1;
      int var13 = 0;
      if(var13 < var4.length) {
         char var14 = (char)var13;
         im.a var15 = new im.a();
         Rectangle2D var16 = var9.getStringBounds(String.valueOf(var14), var8);
         var15.U = var16.getBounds().width + 8;
         var15.L = var16.getBounds().height;
         if(var11 + var15.U >= var6) {
            var11 = 0;
            var12 += var10;
            var10 = 0;
         }

         if(var15.L > var10) {
            var10 = var15.L;
         }

         var15.a = var11;
         var15.y = var12;
         if(var15.L > this.e) {
            this.e = var15.L;
         }

         var4[var13] = var15;
         var8.drawString(String.valueOf(var14), var11 + 2, var12 + var9.getAscent());
         int var10000 = var11 + var15.U;
         ++var13;
         d.h(new d[2]);
      }

      return var7;
   }

   public void w(im.a[] var1, char var2, float var3, float var4) throws ArrayIndexOutOfBoundsException {
      this.V(var3, var4, (float)var1[var2].U, (float)var1[var2].L, (float)var1[var2].a, (float)var1[var2].y, (float)var1[var2].U, (float)var1[var2].L);
   }

   protected void V(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      float var9 = var5 / 512.0F;
      float var10 = var6 / 512.0F;
      float var11 = var7 / 512.0F;
      float var12 = var8 / 512.0F;
      GL11.glTexCoord2f(var9 + var11, var10);
      GL11.glVertex2d((double)(var1 + var3), (double)var2);
      GL11.glTexCoord2f(var9, var10);
      GL11.glVertex2d((double)var1, (double)var2);
      GL11.glTexCoord2f(var9, var10 + var12);
      GL11.glVertex2d((double)var1, (double)(var2 + var4));
      GL11.glTexCoord2f(var9, var10 + var12);
      GL11.glVertex2d((double)var1, (double)(var2 + var4));
      GL11.glTexCoord2f(var9 + var11, var10 + var12);
      GL11.glVertex2d((double)(var1 + var3), (double)(var2 + var4));
      GL11.glTexCoord2f(var9 + var11, var10);
      GL11.glVertex2d((double)(var1 + var3), (double)var2);
   }

   public int S(String var1) {
      return this.f();
   }

   public int f() {
      return (this.e - 8) / 2;
   }

   public int s(String var1) {
      int var2 = 0;

      char[] var3;
      for(char var6 : var3 = var1.toCharArray()) {
         if(var6 < this.z.length) {
            var2 += this.z[var6].U - 8 + this.V;
         }
      }

      return var2 / 2;
   }

   public boolean f() {
      return this.E;
   }

   public void J(boolean var1) {
      if(this.E != var1) {
         this.E = var1;
         this.S = this.u(this.p, var1, this.W, this.z);
      }

   }

   public void c(boolean var1) {
      if(this.W != var1) {
         this.W = var1;
         this.S = this.u(this.p, this.E, var1, this.z);
      }

   }

   public Font C() {
      return this.p;
   }

   public void i(Font var1) {
      this.p = var1;
      this.S = this.u(var1, this.E, this.W, this.z);
   }

   public static void e(String[] var0) {
      s = var0;
   }

   public static String[] C() {
      return s;
   }

   private static ArrayIndexOutOfBoundsException a(ArrayIndexOutOfBoundsException var0) {
      return var0;
   }

   static {
      if(C() == null) {
         e(new String[3]);
      }

   }

   protected class a {
      public int U;
      public int L;
      public int a;
      public int y;
   }
}
