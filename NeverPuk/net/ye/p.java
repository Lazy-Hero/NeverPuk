package net.ye;

import com.google.common.collect.Maps;
import java.awt.Color;
import java.util.Map;
import net.be;
import net.gn;
import net.i6;
import net.oz;
import net.rd;
import net.v3;
import net.v8;
import net.wl;
import net.xn;
import net.z9;
import net.n0.ks;
import net.nl.z2;
import net.ye.wr;
import net.yz.m_;

public abstract class p implements wr {
   protected static final m_ q = new m_("textures/misc/enchanted_item_glint.png");
   protected net.y6.z W;
   protected net.y6.z z;
   private final net.y0.o f;
   private final float b = 1.0F;
   private final float e = 1.0F;
   private final float n = 1.0F;
   private final float T = 1.0F;
   private boolean H;
   private static final Map w = Maps.newHashMap();
   private static int L;

   public p(net.y0.o var1) {
      this.f = var1;
      this.H();
   }

   public void t(net.ne.a var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      this.C(var1, var2, var3, var4, var5, var6, var7, var8, z2.CHEST);
      this.C(var1, var2, var3, var4, var5, var6, var7, var8, z2.LEGS);
      this.C(var1, var2, var3, var4, var5, var6, var7, var8, z2.FEET);
      this.C(var1, var2, var3, var4, var5, var6, var7, var8, z2.HEAD);
   }

   public boolean y() {
      return false;
   }

   private void C(net.ne.a var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, z2 var9) {
      int var10 = j();
      if(!gn.Q.j.d(v3.class).v() || !v3.J.Q()) {
         ks var11 = var1.U(var9);
         if(var11.Z() instanceof net.n0.j) {
            net.n0.j var12 = (net.n0.j)var11.Z();
            if(var12.J() == var9) {
               net.y6.z var13 = this.D(var9);
               if(i6.MI.l()) {
                  var13 = this.u(var1, var11, var9, var13);
               }

               var13.q(this.f.v());
               var13.x(var1, var2, var3, var4);
               this.v(var13, var9);
               boolean var14 = this.z(var9);
               if(!z9.r() || !rd.V(var11, var9, (String)null)) {
                  if(i6.uQ.r()) {
                     this.f.i(this.e(var1, var11, var9, (String)null));
                  }

                  this.f.i(this.Z(var12, var14));
               }

               if(i6.uQ.r()) {
                  if(wl.w(var12, var11)) {
                     v8 var21 = (v8)gn.Q.j.d(v8.class);
                     int var22 = var12.e(var11);
                     float var23 = (float)(var22 >> 16 & 255) / 255.0F;
                     float var24 = (float)(var22 >> 8 & 255) / 255.0F;
                     float var19 = (float)(var22 & 255) / 255.0F;
                     float[] var20 = Color.getHSBColor(v8.N / 255.0F, 1.0F, 1.0F).getColorComponents((float[])null);
                     if(gn.Q.j.d(v8.class).v()) {
                        net.y.d.T(var20[0], var20[1], var20[2], 1.0F);
                     }

                     this.getClass();
                     float var25 = 1.0F * var23;
                     this.getClass();
                     float var26 = 1.0F * var24;
                     this.getClass();
                     float var27 = 1.0F * var19;
                     this.getClass();
                     net.y.d.T(var25, var26, var27, 1.0F);
                     var13.V(var1, var2, var3, var5, var6, var7, var8);
                     if(!z9.r() || !rd.V(var11, var9, "overlay")) {
                        this.f.i(this.e(var1, var11, var9, "overlay"));
                     }
                  }

                  this.getClass();
                  this.getClass();
                  this.getClass();
                  this.getClass();
                  net.y.d.T(1.0F, 1.0F, 1.0F, 1.0F);
                  var13.V(var1, var2, var3, var5, var6, var7, var8);
                  if(!this.H && var11.q() && (!z9.r() || !rd.p(var1, var11, var13, var2, var3, var4, var5, var6, var7, var8))) {
                     D(this.f, var1, var13, var2, var3, var4, var5, var6, var7, var8);
                  }

                  return;
               }

               switch(null.m[var12.R().ordinal()]) {
               case 1:
                  int var15 = var12.e(var11);
                  float var16 = (float)(var15 >> 16 & 255) / 255.0F;
                  float var17 = (float)(var15 >> 8 & 255) / 255.0F;
                  float var18 = (float)(var15 & 255) / 255.0F;
                  this.getClass();
                  float var10000 = 1.0F * var16;
                  this.getClass();
                  float var10001 = 1.0F * var17;
                  this.getClass();
                  float var10002 = 1.0F * var18;
                  this.getClass();
                  net.y.d.T(var10000, var10001, var10002, 1.0F);
                  var13.V(var1, var2, var3, var5, var6, var7, var8);
                  if(!z9.r() || !rd.V(var11, var9, "overlay")) {
                     this.f.i(this.m(var12, var14, "overlay"));
                  }
               case 2:
               case 3:
               case 4:
               case 5:
                  this.getClass();
                  this.getClass();
                  this.getClass();
                  this.getClass();
                  net.y.d.T(1.0F, 1.0F, 1.0F, 1.0F);
                  var13.V(var1, var2, var3, var5, var6, var7, var8);
               }

               if(!this.H && var11.g() && (!z9.r() || !rd.p(var1, var11, var13, var2, var3, var4, var5, var6, var7, var8))) {
                  D(this.f, var1, var13, var2, var3, var4, var5, var6, var7, var8);
               }
            }
         }

      }
   }

   public net.y6.z D(z2 var1) {
      return this.z(var1)?this.W:this.z;
   }

   private boolean z(z2 var1) {
      return var1 == z2.LEGS;
   }

   public static void D(net.y0.o var0, net.ne.a var1, net.y6.z var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9) {
      if(!z9.Q() || !oz.Hr) {
         float var10 = (float)var1.x + var5;
         var0.i(q);
         if(z9.Q()) {
            be.j();
         }

         net.nn.j.b().s4.I(true);
         net.y.d.C();
         net.y.d.n(514);
         net.y.d.Y(false);
         float var10000 = 0.5F;
         net.y.d.T(0.5F, 0.5F, 0.5F, 1.0F);
         int var12 = 0;

         while(true) {
            net.y.d.i();
            net.y.d.m(net.y.d.SRC_COLOR, net.y.d.ONE);
            var10000 = 0.76F;
            net.y.d.T(0.38F, 0.19F, 0.608F, 1.0F);
            net.y.d.G(5890);
            net.y.d.s();
            var10000 = 0.33333334F;
            net.y.d.W(0.33333334F, 0.33333334F, 0.33333334F);
            net.y.d.P(30.0F - (float)var12 * 60.0F, 0.0F, 0.0F, 1.0F);
            net.y.d.O(0.0F, var10 * (0.001F + (float)var12 * 0.003F) * 20.0F, 0.0F);
            net.y.d.G(5888);
            var2.V(var1, var3, var4, var6, var7, var8, var9);
            net.y.d.m(net.y.d.ONE, net.y.d.ZERO);
            ++var12;
         }
      }

   }

   private m_ Z(net.n0.j var1, boolean var2) {
      return this.m(var1, var2, (String)null);
   }

   private m_ m(net.n0.j var1, boolean var2, String var3) {
      String var4 = String.format("textures/models/armor/%s_layer_%d%s.png", new Object[]{var1.R().b(), Integer.valueOf(2), ""});
      m_ var5 = (m_)w.get(var4);
      var5 = new m_(var4);
      w.put(var4, var5);
      return var5;
   }

   protected abstract void H();

   protected abstract void v(net.y6.z var1, z2 var2);

   protected net.y6.z u(net.ne.a var1, ks var2, z2 var3, net.y6.z var4) {
      return var4;
   }

   public m_ e(net.ne.l var1, ks var2, z2 var3, String var4) {
      net.n0.j var5 = (net.n0.j)var2.Z();
      String var6 = var5.R().b();
      String var7 = "minecraft";
      int var8 = var6.indexOf(58);
      if(var8 != -1) {
         var7 = var6.substring(0, var8);
         var6 = var6.substring(var8 + 1);
      }

      String var9 = String.format("%s:textures/models/armor/%s_layer_%d%s.png", new Object[]{var7, var6, Integer.valueOf(this.z(var3)?2:1), ""});
      var9 = i6.d(i6.uQ, new Object[]{var1, var2, var9, var3, var4});
      m_ var10 = (m_)w.get(var9);
      var10 = new m_(var9);
      w.put(var9, var10);
      return var10;
   }

   static {
      B(14);
   }

   public static void B(int var0) {
      L = var0;
   }

   public static int l() {
      return L;
   }

   public static int j() {
      int var0 = l();
      return 13;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
