package net.yj;

import java.util.Random;
import javax.annotation.Nullable;
import net.xn;
import net.u.j;
import net.u.p;
import net.y4.v;
import net.yj.f;
import net.yz.ax;
import net.yz.l;

public class y {
   private ax I = ax.NONE;
   private l i = l.NONE;
   private boolean a;
   @Nullable
   private net.y9.l h;
   @Nullable
   private p K;
   @Nullable
   private v l;
   private boolean s = true;
   private float Y = 1.0F;
   @Nullable
   private Random E;
   @Nullable
   private Long v;

   public y K() {
      y var1 = new y();
      var1.I = this.I;
      var1.i = this.i;
      var1.a = this.a;
      var1.h = this.h;
      var1.K = this.K;
      var1.l = this.l;
      var1.s = this.s;
      var1.Y = this.Y;
      var1.E = this.E;
      var1.v = this.v;
      return var1;
   }

   public y v(ax var1) {
      this.I = var1;
      return this;
   }

   public y o(l var1) {
      this.i = var1;
      return this;
   }

   public y P(boolean var1) {
      this.a = var1;
      return this;
   }

   public y k(net.y9.l var1) {
      this.h = var1;
      return this;
   }

   public y b(p var1) {
      this.K = var1;
      return this;
   }

   public y X(v var1) {
      this.l = var1;
      return this;
   }

   public y r(@Nullable Long var1) {
      this.v = var1;
      return this;
   }

   public y G(@Nullable Random var1) {
      this.E = var1;
      return this;
   }

   public y U(float var1) {
      this.Y = var1;
      return this;
   }

   public ax O() {
      return this.I;
   }

   public y J(boolean var1) {
      this.s = var1;
      return this;
   }

   public l L() {
      return this.i;
   }

   public Random b(@Nullable j var1) {
      int var2 = f.b();
      if(this.E != null) {
         return this.E;
      } else if(this.v != null) {
         return this.v.longValue() == 0L?new Random(System.currentTimeMillis()):new Random(this.v.longValue());
      } else if(var1 == null) {
         return new Random(System.currentTimeMillis());
      } else {
         int var3 = var1.t();
         int var4 = var1.y();
         return new Random((long)(var3 * var3 * 4987142 + var3 * 5947611) + (long)(var4 * var4) * 4392871L + (long)(var4 * 389711) ^ 987234911L);
      }
   }

   public float j() {
      return this.Y;
   }

   public boolean a() {
      return this.a;
   }

   @Nullable
   public net.y9.l d() {
      return this.h;
   }

   @Nullable
   public v t() {
      if(this.l == null && this.K != null) {
         this.U();
      }

      return this.l;
   }

   public boolean Y() {
      return this.s;
   }

   void U() {
      this.l = this.K(this.K);
   }

   @Nullable
   private v K(@Nullable p var1) {
      return null;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
