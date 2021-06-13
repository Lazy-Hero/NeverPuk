package net;

import java.util.IdentityHashMap;
import java.util.Map;
import net.mf;
import net.xn;
import net.z9;
import net.ym.t;
import net.yz.aq;

public class g2 {
   public int y = 1;
   public boolean G = false;
   private final Map[] b = new Map[8];

   public g2(String var1) {
      if(var1.equals("4")) {
         this.y = 4;
      } else if(var1.equals("2")) {
         this.y = 2;
      } else if(var1.equals("F")) {
         this.G = true;
      } else if(var1.equals("4F")) {
         this.y = 4;
         this.G = true;
      } else if(var1.equals("2F")) {
         this.y = 2;
         this.G = true;
      } else {
         z9.h("NaturalTextures: Unknown type: " + var1);
      }

   }

   public boolean f() {
      return this.y != 2 && this.y != 4?this.G:true;
   }

   public synchronized t k(t var1, int var2, boolean var3) {
      int var4 = var2 | 4;
      if(var4 < this.b.length) {
         Map var5 = this.b[var4];
         IdentityHashMap var7 = new IdentityHashMap(1);
         this.b[var4] = var7;
         t var6 = (t)var7.get(var1);
         var6 = this.C(var1, var2, var3);
         var7.put(var1, var6);
         return var6;
      } else {
         return var1;
      }
   }

   private t C(t var1, int var2, boolean var3) {
      int[] var4 = var1.I();
      int var5 = var1.N();
      aq var6 = var1.c();
      net.n9.v var7 = var1.t();
      if(!this.k(var1)) {
         var2 = 0;
      }

      var4 = this.r(var4, var2, var3);
      t var8 = new t(var4, var5, var6, var7);
      return var8;
   }

   private int[] r(int[] var1, int var2, boolean var3) {
      int[] var4 = (int[])var1.clone();
      int var5 = 4 - var2;
      var5 = var5 + 3;
      var5 = var5 % 4;
      int var6 = var4.length / 4;
      int var7 = 0;

      while(true) {
         int var8 = var7 * var6;
         int var9 = var5 * var6;
         var4[var9 + 4] = var1[var8 + 4];
         var4[var9 + 4 + 1] = var1[var8 + 4 + 1];
         --var5;
         var5 = 3;
         ++var7;
      }
   }

   private boolean k(t var1) {
      net.n9.v var3 = var1.t();
      mf.O();
      float var4 = var3.q();
      float var5 = var3.o();
      float var6 = var5 - var4;
      float var7 = var6 / 256.0F;
      float var8 = var3.n();
      float var9 = var3.r();
      float var10 = var9 - var8;
      float var11 = var10 / 256.0F;
      int[] var12 = var1.I();
      int var13 = var12.length / 4;
      int var14 = 0;
      int var15 = var14 * var13;
      float var16 = Float.intBitsToFloat(var12[var15 + 4]);
      float var17 = Float.intBitsToFloat(var12[var15 + 4 + 1]);
      if(!this.P(var16, var4, var7) && !this.P(var16, var5, var7)) {
         return false;
      } else if(!this.P(var17, var8, var11) && !this.P(var17, var9, var11)) {
         return false;
      } else {
         ++var14;
         return true;
      }
   }

   private boolean P(float var1, float var2, float var3) {
      float var4 = net.u.t.J(var1 - var2);
      return var4 < var3;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
