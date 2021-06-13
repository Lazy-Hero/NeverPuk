package net;

import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;
import net.xc;
import net.zk;

public class pn {
   private final xc V;
   private final pn J;
   private final pn j;
   private final int A;
   private final List d = Lists.newArrayList();
   private pn q;
   private pn g;
   private int l;
   private float P;
   private float t;
   private float I;
   private float n;

   public pn(xc var1, @Nullable pn var2, @Nullable pn var3, int var4, int var5) {
      if(var1.y() == null) {
         throw new IllegalArgumentException("Can\'t position an invisible advancement!");
      } else {
         this.V = var1;
         this.J = var2;
         this.j = var3;
         this.A = var4;
         this.q = this;
         this.l = var5;
         this.P = -1.0F;
         pn var6 = null;

         for(xc var8 : var1.W()) {
            var6 = this.J(var8, var6);
         }

      }
   }

   @Nullable
   private pn J(xc var1, @Nullable pn var2) {
      if(var1.y() != null) {
         var2 = new pn(var1, this, var2, this.d.size() + 1, this.l + 1);
         this.d.add(var2);
      } else {
         for(xc var4 : var1.W()) {
            var2 = this.J(var4, var2);
         }
      }

      return var2;
   }

   private void J() {
      if(this.d.isEmpty()) {
         if(this.j != null) {
            this.P = this.j.P + 1.0F;
         } else {
            this.P = 0.0F;
         }
      } else {
         pn var1 = null;

         for(pn var3 : this.d) {
            var3.J();
            var1 = var3.i(var3);
         }

         this.m();
         float var5 = (((pn)this.d.get(0)).P + ((pn)this.d.get(this.d.size() - 1)).P) / 2.0F;
         if(this.j != null) {
            this.P = this.j.P + 1.0F;
            this.t = this.P - var5;
         } else {
            this.P = var5;
         }
      }

   }

   private float v(float var1, int var2, float var3) {
      this.P += var1;
      this.l = var2;
      if(this.P < var3) {
         var3 = this.P;
      }

      for(pn var5 : this.d) {
         var3 = var5.v(var1 + this.t, var2 + 1, var3);
      }

      return var3;
   }

   private void B(float var1) {
      this.P += var1;

      for(pn var3 : this.d) {
         var3.B(var1);
      }

   }

   private void m() {
      float var1 = 0.0F;
      float var2 = 0.0F;
      int var3 = this.d.size() - 1;

      while(true) {
         pn var4 = (pn)this.d.get(var3);
         var4.P += var1;
         var4.t += var1;
         var2 += var4.I;
         var1 += var4.n + var2;
         --var3;
      }
   }

   @Nullable
   private pn l() {
      return this.g != null?this.g:(!this.d.isEmpty()?(pn)this.d.get(0):null);
   }

   @Nullable
   private pn R() {
      return this.g != null?this.g:(!this.d.isEmpty()?(pn)this.d.get(this.d.size() - 1):null);
   }

   private pn i(pn var1) {
      boolean var2 = zk.l.p();
      if(this.j == null) {
         return var1;
      } else {
         pn var3 = this;
         pn var4 = this;
         pn var5 = this.j;
         pn var6 = (pn)this.J.d.get(0);
         float var7 = this.t;
         float var8 = this.t;
         float var9 = var5.t;
         float var10 = var6.t;
         if(var5.R() != null && this.l() != null) {
            var5 = var5.R();
            var3 = this.l();
            var6 = var6.l();
            var4 = this.R();
            var4.q = this;
            float var11 = var5.P + var9 - (var3.P + var7) + 1.0F;
            if(var11 > 0.0F) {
               var5.l(this, var1).X(this, var11);
               var7 += var11;
               var8 += var11;
            }

            var9 += var5.t;
            var7 += var3.t;
            var10 += var6.t;
            var8 += var4.t;
         }

         if(var5.R() != null && var4.R() == null) {
            var4.g = var5.R();
            var4.t += var9 - var8;
         }

         if(var3.l() != null && var6.l() == null) {
            var6.g = var3.l();
            var6.t += var7 - var10;
         }

         return this;
      }
   }

   private void X(pn var1, float var2) {
      float var3 = (float)(var1.A - this.A);
      if(var3 != 0.0F) {
         var1.I -= var2 / var3;
         this.I += var2 / var3;
      }

      var1.n += var2;
      var1.P += var2;
      var1.t += var2;
   }

   private pn l(pn var1, pn var2) {
      return this.q != null && var1.J.d.contains(this.q)?this.q:var2;
   }

   private void S() {
      if(this.V.y() != null) {
         this.V.y().K((float)this.l, this.P);
      }

      if(!this.d.isEmpty()) {
         for(pn var2 : this.d) {
            var2.S();
         }
      }

   }

   public static void B(xc var0) {
      if(var0.y() == null) {
         throw new IllegalArgumentException("Can\'t position children of an invisible root!");
      } else {
         pn var1 = new pn(var0, (pn)null, (pn)null, 1, 0);
         var1.J();
         float var2 = var1.v(0.0F, 0, var1.P);
         if(var2 < 0.0F) {
            var1.B(-var2);
         }

         var1.S();
      }
   }

   private static IllegalArgumentException a(IllegalArgumentException var0) {
      return var0;
   }
}
