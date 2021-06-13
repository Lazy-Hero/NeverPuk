package net;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import javax.imageio.ImageIO;
import net.dr;
import net.xn;
import net.nn.j;
import net.u.d;
import org.lwjgl.BufferUtils;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL15;

public class __ {
   private static final Random s = new Random();
   public static List k = new ArrayList();
   public static List h = new ArrayList();

   public static void r(int[] var0) {
      y((float)var0[0], (float)var0[1], (float)(var0[0] + var0[2]), (float)(var0[1] + var0[3]));
   }

   public static void y(float var0, float var1, float var2, float var3) {
      int var4 = c();
      GL11.glScissor((int)(var0 * (float)var4), (int)((float)j.b().st - var3 * (float)var4), (int)((var2 - var0) * (float)var4), (int)((var3 - var1) * (float)var4));
   }

   public static int c() {
      int var0 = 1;
      boolean var1 = j.b().c();
      int var2 = j.b().T.iL;

      for(var2 = 1000; j.b().sB / (var0 + 1) >= 320 && j.b().st / (var0 + 1) >= 240; ++var0) {
         ;
      }

      int var10001 = var0 % 2;
      return var0;
   }

   public static int Z() {
      return Mouse.getX() * y() / j.b().sB;
   }

   public static int s() {
      return u() - Mouse.getY() * u() / j.b().sB - 1;
   }

   public static int y() {
      return j.b().sB / c();
   }

   public static int u() {
      return j.b().st / c();
   }

   public static boolean O(int var0, int var1, int var2, int var3, int var4, int var5) {
      return var4 >= var0 && var4 <= var0 + var2 && var5 >= var1 && var5 < var1 + var3;
   }

   public static int p() {
      int var0 = GL15.glGenBuffers();
      k.add(Integer.valueOf(var0));
      GL15.glBindBuffer('袒', var0);
      return var0;
   }

   public static int F() {
      int var0 = GL11.glGenTextures();
      h.add(Integer.valueOf(var0));
      return var0;
   }

   public static int T(int var0, File var1, int var2, int var3) throws IOException {
      L(var0, ImageIO.read(var1), var2, var3);
      return var0;
   }

   public static int L(int var0, BufferedImage var1, int var2, int var3) {
      int var10000 = dr.Q();
      int[] var5 = new int[var1.getWidth() * var1.getHeight()];
      int var4 = var10000;
      var1.getRGB(0, 0, var1.getWidth(), var1.getHeight(), var5, 0, var1.getWidth());
      ByteBuffer var6 = BufferUtils.createByteBuffer(var1.getWidth() * var1.getHeight() * 4);
      int var7 = 0;
      if(var7 < var1.getHeight()) {
         int var8 = 0;
         if(var8 < var1.getWidth()) {
            int var9 = var5[var7 * var1.getWidth() + var8];
            var6.put((byte)(var9 >> 16 & 255));
            var6.put((byte)(var9 >> 8 & 255));
            var6.put((byte)(var9 & 255));
            var6.put((byte)(var9 >> 24 & 255));
            ++var8;
         }

         ++var7;
      }

      var6.flip();
      O(var0, var1.getWidth(), var1.getHeight(), var6, var2, var3);
      if(d.y() == null) {
         ++var4;
         dr.z(var4);
      }

      return var0;
   }

   public static int O(int var0, int var1, int var2, ByteBuffer var3, int var4, int var5) {
      GL11.glBindTexture(3553, var0);
      GL11.glTexParameteri(3553, 10241, var4);
      GL11.glTexParameteri(3553, 10240, var4);
      GL11.glTexParameteri(3553, 10242, var5);
      GL11.glTexParameteri(3553, 10243, var5);
      GL11.glPixelStorei(3317, 1);
      GL11.glTexImage2D(3553, 0, '聘', var1, var2, 0, 6408, 5121, var3);
      GL11.glBindTexture(3553, 0);
      return var0;
   }

   public static void Z() {
      GL15.glBindBuffer('袒', 0);
      GL11.glBindTexture(3553, 0);
      Iterator var0 = k.iterator();

      while(var0.hasNext()) {
         int var1 = ((Integer)var0.next()).intValue();
         GL15.glDeleteBuffers(var1);
      }

      var0 = h.iterator();

      while(var0.hasNext()) {
         int var3 = ((Integer)var0.next()).intValue();
         GL11.glDeleteTextures(var3);
      }

   }

   public static void F(float var0, float var1, float var2, float var3) {
      net.y.d.T(var0, var1, var2, var3);
   }

   public static void X(Color var0) {
      net.y.d.T((float)var0.getRed() / 255.0F, (float)var0.getGreen() / 255.0F, (float)var0.getBlue() / 255.0F, (float)var0.getAlpha() / 255.0F);
   }

   public static void U(int var0) {
      net.y.d.T((float)(var0 >> 16 & 255) / 255.0F, (float)(var0 >> 8 & 255) / 255.0F, (float)(var0 & 255) / 255.0F, (float)(var0 >> 24 & 255) / 255.0F);
   }

   public static Color s(float var0, float var1, float var2) {
      return Color.getHSBColor(var0, var1, var2);
   }

   public static Color K(int var0, float var1) {
      float var2 = s.nextFloat();
      float var3 = (float)((s.nextInt(var0) + var0) / var0 + var0);
      return s(var2, var3, var1);
   }

   public static Color O() {
      return K(1000, 0.6F);
   }

   private static xn a(xn var0) {
      return var0;
   }
}
