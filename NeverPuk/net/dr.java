package net;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import net.uk;
import net.xn;
import net.nn.j;
import net.y.d;
import net.z.t;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

public class dr {
   public CopyOnWriteArrayList F = Lists.newCopyOnWriteArrayList();
   public float l;
   public float J;
   private static int E;

   public static void e(double var0, double var2, float var4, int var5) {
      float var6 = (float)(var5 >> 24 & 255) / 255.0F;
      float var7 = (float)(var5 >> 16 & 255) / 255.0F;
      float var8 = (float)(var5 >> 8 & 255) / 255.0F;
      float var9 = (float)(var5 & 255) / 255.0F;
      GL11.glColor4f(var7, var8, var9, var6);
      GL11.glBegin(9);
      int var10 = 0;

      while(true) {
         GL11.glVertex2d(var0 + Math.sin((double)var10 * 3.141526D / 180.0D) * (double)var4, var2 + Math.cos((double)var10 * 3.141526D / 180.0D) * (double)var4);
         ++var10;
      }
   }

   public static void j(int var0) {
      float var1 = (float)(var0 >> 24 & 255) / 255.0F;
      float var2 = (float)(var0 >> 16 & 255) / 255.0F;
      float var3 = (float)(var0 >> 8 & 255) / 255.0F;
      float var4 = (float)(var0 & 255) / 255.0F;
      GL11.glColor4f(var2, var3, var4, var1 == 0.0F?1.0F:var1);
   }

   public void C(float var1, float var2) {
      d.C();
      d.d();
      Q();
      d.T(1.0F, 1.0F, 1.0F, 1.0F);
      t var4 = new t(j.b());
      float var5 = 0.0F;
      float var6 = 0.0F;
      if((float)this.F.size() < (float)var4.u() / 8.0F) {
         this.F.add(new uk(var4, (new Random()).nextFloat() + 1.0F, (new Random()).nextFloat() * 5.0F + 5.0F));
         net.u.d.h(new net.u.d[2]);
      }

      ArrayList var7 = Lists.newArrayList();
      byte var8 = 52;
      int var9 = -570425345;
      Iterator var10 = this.F.iterator();
      if(var10.hasNext()) {
         uk var11 = (uk)var10.next();
         double var12 = (double)var11.o + Math.sin((double)(var11.t / 2.0F)) * 50.0D + (double)(-var5 / 5.0F * (float)Mouse.getX());
         double var14 = (double)(var11.t * var11.F * var11.t / 10.0F + -var6 / 5.0F);
         if(Double.compare(var14, (double)var4.v()) < 0) {
            if(Float.compare(var11.r, (float)var8) < 0) {
               var11.r += 2.0F;
            }

            if(var11.r > (float)var8) {
               var11.r = (float)var8;
            }

            d.C();
            this.g(var12, var14, var11.p * var11.r / (float)var8, var9, var9);
         }

         var11.t = (float)((double)var11.t + 0.025D);
         if(Double.compare(var14, (double)var4.v()) > 0 || Double.compare(var14, 0.0D) < 0 || Double.compare(var12, (double)var4.u()) > 0 || Double.compare(var12, 0.0D) < 0) {
            var7.add(var11);
         }
      }

      this.F.removeAll(var7);
      d.T(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      d.C();
      d.d();
      this.l = (float)Mouse.getX();
      this.J = (float)Mouse.getY();
   }

   public void g(double var1, double var3, float var5, int var6, int var7) {
      GL11.glDisable(3553);
      GL11.glBlendFunc(770, 771);
      GL11.glEnable(2848);
      GL11.glPushMatrix();
      GL11.glScalef(0.1F, 0.1F, 0.1F);
      e(var1 * 10.0D, var3 * 10.0D, var5 * 10.0F, var7);
      GL11.glScalef(10.0F, 10.0F, 10.0F);
      GL11.glPopMatrix();
      GL11.glEnable(3553);
      GL11.glDisable(2848);
   }

   public static void z(int var0) {
      E = var0;
   }

   public static int Q() {
      return E;
   }

   public static int M() {
      int var0 = Q();
      return 67;
   }

   private static xn a(xn var0) {
      return var0;
   }

   static {
      if(Q() != 0) {
         z(85);
      }

   }
}
