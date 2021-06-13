package net.ym;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;
import net.xn;
import net.ym.g;
import net.ym.h;
import net.ym.q;
import net.ym.t;
import net.ym.y;
import net.yz.aq;
import net.yz.m_;
import org.lwjgl.util.vector.Vector3f;

public class k {
   public static final List w = Lists.newArrayList(new String[]{"layer0", "layer1", "layer2", "layer3", "layer4"});

   @Nullable
   public y C(net.n9.b var1, y var2) {
      HashMap var3 = Maps.newHashMap();
      ArrayList var4 = Lists.newArrayList();

      for(int var5 = 0; var5 < w.size(); ++var5) {
         String var6 = (String)w.get(var5);
         if(!var2.Y(var6)) {
            break;
         }

         String var7 = var2.Y(var6);
         var3.put(var6, var7);
         net.n9.v var8 = var1.O((new m_(var7)).toString());
         var4.addAll(this.K(var5, var6, var8));
      }

      if(var4.isEmpty()) {
         return null;
      } else {
         var3.put("particle", var2.Y("particle")?var2.Y("particle"):(String)var3.get("layer0"));
         return new y((m_)null, var4, var3, false, false, var2.H(), var2.X());
      }
   }

   private List K(int var1, String var2, net.n9.v var3) {
      HashMap var4 = Maps.newHashMap();
      var4.put(aq.SOUTH, new net.ym.z((aq)null, var1, var2, new q(new float[]{0.0F, 0.0F, 16.0F, 16.0F}, 0)));
      var4.put(aq.NORTH, new net.ym.z((aq)null, var1, var2, new q(new float[]{16.0F, 0.0F, 0.0F, 16.0F}, 0)));
      ArrayList var5 = Lists.newArrayList();
      var5.add(new g(new Vector3f(0.0F, 0.0F, 7.5F), new Vector3f(16.0F, 16.0F, 8.5F), var4, (h)null, true));
      var5.addAll(this.H(var3, var2, var1));
      return var5;
   }

   private List H(net.n9.v var1, String var2, int var3) {
      float var5 = (float)var1.d();
      t.V();
      float var6 = (float)var1.z();
      ArrayList var7 = Lists.newArrayList();
      Iterator var8 = this.j(var1).iterator();
      if(var8.hasNext()) {
         k.y var9 = (k.y)var8.next();
         float var10 = 0.0F;
         float var11 = 0.0F;
         float var12 = 0.0F;
         float var13 = 0.0F;
         float var14 = 0.0F;
         float var15 = 0.0F;
         float var16 = 0.0F;
         float var17 = 0.0F;
         float var18 = 0.0F;
         float var19 = 0.0F;
         float var20 = (float)var9.k();
         float var21 = (float)var9.e();
         float var22 = (float)var9.D();
         k.b var23 = var9.Q();
         switch(null.A[var23.ordinal()]) {
         case 1:
            var15 = var21 + 1.0F;
            var18 = 16.0F / var5;
            var19 = 16.0F / (var6 - 1.0F);
         case 2:
            var15 = var21 + 1.0F;
            var11 = var22 + 1.0F;
            var13 = var22 + 1.0F;
            var18 = 16.0F / var5;
            var19 = 16.0F / (var6 - 1.0F);
         case 3:
            var16 = var21 + 1.0F;
            var18 = 16.0F / (var5 - 1.0F);
            var19 = 16.0F / var6;
         case 4:
            var15 = var22;
            var14 = var22;
            var10 = var22 + 1.0F;
            var12 = var22 + 1.0F;
            var17 = var20;
            var11 = var20;
            var13 = var16 = var21 + 1.0F;
            var18 = 16.0F / (var5 - 1.0F);
            var19 = 16.0F / var6;
         default:
            float var24 = 16.0F / var5;
            float var25 = 16.0F / var6;
            var10 = var10 * var24;
            var12 = var12 * var24;
            var11 = var11 * var25;
            var13 = var13 * var25;
            var11 = 16.0F - var11;
            var13 = 16.0F - var13;
            var14 = var14 * var18;
            var15 = var15 * var18;
            var16 = var16 * var19;
            var17 = var17 * var19;
            HashMap var26 = Maps.newHashMap();
            var26.put(var23.z(), new net.ym.z((aq)null, var3, var2, new q(new float[]{var14, var16, var15, var17}, 0)));
            switch(null.A[var23.ordinal()]) {
            case 1:
               var7.add(new g(new Vector3f(var10, var11, 7.5F), new Vector3f(var12, var11, 8.5F), var26, (h)null, true));
            case 2:
               var7.add(new g(new Vector3f(var10, var13, 7.5F), new Vector3f(var12, var13, 8.5F), var26, (h)null, true));
            case 3:
               var7.add(new g(new Vector3f(var10, var11, 7.5F), new Vector3f(var10, var13, 8.5F), var26, (h)null, true));
            case 4:
               var7.add(new g(new Vector3f(var12, var11, 7.5F), new Vector3f(var12, var13, 8.5F), var26, (h)null, true));
            }
         }
      }

      return var7;
   }

   private List j(net.n9.v var1) {
      int var2 = var1.d();
      int var3 = var1.z();
      ArrayList var4 = Lists.newArrayList();

      for(int var5 = 0; var5 < var1.D(); ++var5) {
         int[] var6 = var1.d(var5)[0];

         for(int var7 = 0; var7 < var3; ++var7) {
            for(int var8 = 0; var8 < var2; ++var8) {
               boolean var9 = !this.P(var6, var8, var7, var2, var3);
               this.P(k.b.UP, var4, var6, var8, var7, var2, var3, var9);
               this.P(k.b.DOWN, var4, var6, var8, var7, var2, var3, var9);
               this.P(k.b.LEFT, var4, var6, var8, var7, var2, var3, var9);
               this.P(k.b.RIGHT, var4, var6, var8, var7, var2, var3, var9);
            }
         }
      }

      return var4;
   }

   private void P(k.b var1, List var2, int[] var3, int var4, int var5, int var6, int var7, boolean var8) {
      boolean var9 = this.P(var3, var4 + var1.U(), var5 + var1.t(), var6, var7);
      this.I(var2, var1, var4, var5);
   }

   private void I(List var1, k.b var2, int var3, int var4) {
      Object var5 = null;

      for(k.y var7 : var1) {
         if(var7.Q() == var2) {
            int var8 = var2.C()?var4:var3;
            if(var7.D() == var8) {
               break;
            }
         }
      }

      int var9 = var2.C()?var4:var3;
      int var10 = var2.C()?var3:var4;
      var1.add(new k.y(var2, var10, var9));
   }

   private boolean P(int[] var1, int var2, int var3, int var4, int var5) {
      return var2 < var4 && var3 < var5?(var1[var3 * var4 + var2] >> 24 & 255) == 0:true;
   }

   private static xn a(xn var0) {
      return var0;
   }

   static enum b {
      UP(aq.UP, 0, -1),
      DOWN(aq.DOWN, 0, 1),
      LEFT(aq.EAST, -1, 0),
      RIGHT(aq.WEST, 1, 0);

      private final aq T;
      private final int B;
      private final int w;

      private b(aq var3, int var4, int var5) {
         this.T = var3;
         this.B = var4;
         this.w = var5;
      }

      public aq z() {
         return this.T;
      }

      public int U() {
         return this.B;
      }

      public int t() {
         return this.w;
      }

      private boolean C() {
         int var1 = t.V();
         return this == DOWN || this == UP;
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   static class y {
      private final k.b R;
      private int A;
      private int k;
      private final int S;

      public y(k.b var1, int var2, int var3) {
         this.R = var1;
         this.A = var2;
         this.k = var2;
         this.S = var3;
      }

      public void L(int var1) {
         int var2 = t.v();
         if(var1 < this.A) {
            this.A = var1;
         }

         if(var1 > this.k) {
            this.k = var1;
         }

      }

      public k.b Q() {
         return this.R;
      }

      public int k() {
         return this.A;
      }

      public int e() {
         return this.k;
      }

      public int D() {
         return this.S;
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
