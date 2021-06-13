package net.yx;

import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;
import net.g4;
import net.xc;
import net.xn;
import net.n0.ks;
import net.nn.j;
import net.y.d;
import net.y.t;
import net.yx.e;
import net.yx.g;
import net.yx.q;
import net.yx.r;
import net.yz.m_;

public class k extends net.z.g {
   private final j T;
   private final e E;
   private final g N;
   private final int y;
   private final xc F;
   private final g4 f;
   private final ks S;
   private final String r;
   private final r Y;
   private final Map W = Maps.newLinkedHashMap();
   private int z;
   private int s;
   private int k = Integer.MAX_VALUE;
   private int m = Integer.MAX_VALUE;
   private int H = Integer.MIN_VALUE;
   private int I = Integer.MIN_VALUE;
   private float u;
   private boolean j;

   public k(j var1, e var2, g var3, int var4, xc var5, g4 var6) {
      this.T = var1;
      this.E = var2;
      this.N = var3;
      this.y = var4;
      this.F = var5;
      this.f = var6;
      this.S = var6.C();
      this.r = var6.s().c();
      this.Y = new r(this, var1, var5, var6);
      this.I(this.Y, var5);
   }

   public xc r() {
      return this.F;
   }

   public String k() {
      return this.r;
   }

   public void a(int var1, int var2, boolean var3) {
      this.N.E(this, var1, var2, var3, this.y);
   }

   public void U(int var1, int var2, t var3) {
      this.N.m(var1, var2, this.y, var3, this.S);
   }

   public void N() {
      int[] var1 = q.c();
      if(!this.j) {
         this.z = 117 - (this.H + this.k) / 2;
         this.s = 56 - (this.I + this.m) / 2;
         this.j = true;
      }

      d.n(518);
      u(0, 0, 234, 113, -16777216);
      d.n(515);
      m_ var2 = this.f.W();
      this.T.n().E(var2);
      this.T.n().E(net.n9.e.g);
      d.T(1.0F, 1.0F, 1.0F, 1.0F);
      int var3 = this.z % 16;
      int var4 = this.s % 16;
      int var5 = -1;
      int var6 = -1;
      r((float)(var3 + 16 * var5), (float)(var4 + 16 * var6), 0.0F, 0.0F, 16.0F, 16.0F, 16.0F, 16.0F);
      ++var6;
      ++var5;
      this.Y.Q(this.z, this.s, true);
      this.Y.Q(this.z, this.s, false);
      this.Y.d(this.z, this.s);
      if(net.u.d.y() == null) {
         q.E(new int[1]);
      }

   }

   public void F(int var1, int var2, int var3, int var4) {
      d.c();
      d.O(0.0F, 0.0F, 200.0F);
      u(0, 0, 234, 113, net.u.t.M(this.u * 255.0F) << 24);
      boolean var5 = false;
      if(var1 < 234 && var2 < 113) {
         for(r var7 : this.W.values()) {
            if(var7.O(this.z, this.s, var1, var2)) {
               var5 = true;
               var7.q(this.z, this.s, this.u, var3, var4);
               break;
            }
         }
      }

      d.Y();
      this.u = net.u.t.T(this.u + 0.02F, 0.0F, 0.3F);
   }

   public boolean D(int var1, int var2, int var3, int var4) {
      return this.N.q(var1, var2, this.y, var3, var4);
   }

   @Nullable
   public static k Q(j var0, e var1, int var2, xc var3) {
      if(var3.y() == null) {
         return null;
      } else {
         for(g var7 : g.values()) {
            if(var2 < var7.j()) {
               return new k(var0, var1, var7, var2, var3, var3.y());
            }

            var2 -= var7.j();
         }

         return null;
      }
   }

   public void z(int var1, int var2) {
      if(this.H - this.k > 234) {
         this.z = net.u.t.g(this.z + var1, -(this.H - 234), 0);
      }

      if(this.I - this.m > 113) {
         this.s = net.u.t.g(this.s + var2, -(this.I - 113), 0);
      }

   }

   public void m(xc var1) {
      if(var1.y() != null) {
         r var2 = new r(this, this.T, var1, var1.y());
         this.I(var2, var1);
      }

   }

   private void I(r var1, xc var2) {
      this.W.put(var2, var1);
      int var3 = var1.v();
      int var4 = var3 + 28;
      int var5 = var1.n();
      int var6 = var5 + 27;
      this.k = Math.min(this.k, var3);
      this.H = Math.max(this.H, var4);
      this.m = Math.min(this.m, var5);
      this.I = Math.max(this.I, var6);

      for(r var8 : this.W.values()) {
         var8.s();
      }

   }

   @Nullable
   public r B(xc var1) {
      return (r)this.W.get(var1);
   }

   public e O() {
      return this.E;
   }

   private static xn b(xn var0) {
      return var0;
   }
}
