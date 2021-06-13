package net.cg;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import net.xn;
import net.cg.h;
import net.cg.n;
import net.n0.ks;
import net.nj.f;
import net.no.u;
import net.u.t;

public class s extends h {
   public int f;
   public int o;
   public byte q;
   public boolean i;
   public boolean V;
   public byte J;
   public byte[] E = new byte[16384];
   public List y = Lists.newArrayList();
   private final Map h = Maps.newHashMap();
   public Map Q = Maps.newLinkedHashMap();

   public s(String var1) {
      super(var1);
   }

   public void g(double var1, double var3, int var5) {
      int var6 = 128 * (1 << var5);
      int var7 = t.L((var1 + 64.0D) / (double)var6);
      int var8 = t.L((var3 + 64.0D) / (double)var6);
      this.f = var7 * var6 + var6 / 2 - 64;
      this.o = var8 * var6 + var6 / 2 - 64;
   }

   public void I(f var1) {
      this.q = var1.R("dimension");
      this.f = var1.P("xCenter");
      this.o = var1.P("zCenter");
      this.J = var1.R("scale");
      this.J = (byte)t.g(this.J, 0, 4);
      if(var1.K("trackingPosition", 1)) {
         this.i = var1.i("trackingPosition");
      } else {
         this.i = true;
      }

      this.V = var1.i("unlimitedTracking");
      short var2 = var1.E("width");
      short var3 = var1.E("height");
      if(var2 == 128 && var3 == 128) {
         this.E = var1.q("colors");
      } else {
         byte[] var4 = var1.q("colors");
         this.E = new byte[16384];
         int var5 = (128 - var2) / 2;
         int var6 = (128 - var3) / 2;

         for(int var7 = 0; var7 < var3; ++var7) {
            int var8 = var7 + var6;
            if(var8 < 128) {
               for(int var9 = 0; var9 < var2; ++var9) {
                  int var10 = var9 + var5;
                  if(var10 < 128) {
                     this.E[var10 + var8 * 128] = var4[var9 + var7 * var2];
                  }
               }
            }
         }
      }

   }

   public f v(f var1) {
      var1.D("dimension", this.q);
      var1.r("xCenter", this.f);
      var1.r("zCenter", this.o);
      var1.D("scale", this.J);
      var1.h("width", (short)128);
      var1.h("height", (short)128);
      var1.S("colors", this.E);
      var1.c("trackingPosition", this.i);
      var1.c("unlimitedTracking", this.V);
      return var1;
   }

   public void i(net.r.r var1, ks var2) {
      boolean var3 = net.cg.z.V();
      if(!this.h.containsKey(var1)) {
         s.i var4 = new s.i(var1);
         this.h.put(var1, var4);
         this.y.add(var4);
      }

      if(!var1.a8.z(var2)) {
         this.Q.remove(var1.Q());
      }

      int var7 = 0;
      if(var7 < this.y.size()) {
         label108: {
            s.i var5 = (s.i)this.y.get(var7);
            if(!var5.O.Z && (var5.O.a8.z(var2) || var2.E())) {
               if(var2.E() || var5.O.y != this.q || !this.i) {
                  break label108;
               }

               this.d(n.q.PLAYER, var5.O.hl, var5.O.Q(), var5.O.b, var5.O.hr, (double)var5.O.hN);
            }

            this.h.remove(var5.O);
            this.y.remove(var5);
         }

         ++var7;
      }

      if(var2.E() && this.i) {
         net.nm.e var9 = var2.o();
         net.u.j var11 = var9.r();
         this.d(n.q.FRAME, var1.hl, "frame-" + var9.G(), (double)var11.t(), (double)var11.y(), (double)(var9.uz.u() * 90));
      }

      if(var2.D() && var2.o().K("Decorations", 9)) {
         net.nj.h var10 = var2.o().A("Decorations", 10);
         int var12 = 0;
         if(var12 < var10.z()) {
            f var6 = var10.i(var12);
            if(!this.Q.containsKey(var6.J("id"))) {
               this.d(n.q.V(var6.R("type")), var1.hl, var6.J("id"), var6.g("x"), var6.g("z"), var6.g("rot"));
            }

            ++var12;
         }
      }

   }

   public static void o(ks var0, net.u.j var1, String var2, n.q var3) {
      net.nj.h var4;
      if(var0.D() && var0.o().K("Decorations", 9)) {
         var4 = var0.o().A("Decorations", 10);
      } else {
         var4 = new net.nj.h();
         var0.Q("Decorations", var4);
      }

      f var5 = new f();
      var5.D("type", var3.U());
      var5.b("id", var2);
      var5.a("x", (double)var1.t());
      var5.a("z", (double)var1.y());
      var5.a("rot", 180.0D);
      var4.m(var5);
      if(var3.l()) {
         f var6 = var0.c("display");
         var6.r("MapColor", var3.D());
      }

   }

   private void d(n.q var1, net.yv.r var2, String var3, double var4, double var6, double var8) {
      int var10 = 1 << this.J;
      float var11 = (float)(var4 - (double)this.f) / (float)var10;
      float var12 = (float)(var6 - (double)this.o) / (float)var10;
      byte var13 = (byte)((int)((double)(var11 * 2.0F) + 0.5D));
      byte var14 = (byte)((int)((double)(var12 * 2.0F) + 0.5D));
      boolean var10000 = true;
      byte var16;
      if(var11 >= -63.0F && var12 >= -63.0F && var11 <= 63.0F && var12 <= 63.0F) {
         var8 = var8 + (var8 < 0.0D?-8.0D:8.0D);
         var16 = (byte)((int)(var8 * 16.0D / 360.0D));
         if(this.q < 0) {
            int var19 = (int)(var2.B().A() / 10L);
            var16 = (byte)(var19 * var19 * 34187121 + var19 * 121 >> 15 & 15);
         }
      } else {
         if(var1 != n.q.PLAYER) {
            this.Q.remove(var3);
            return;
         }

         boolean var17 = true;
         if(Math.abs(var11) < 320.0F && Math.abs(var12) < 320.0F) {
            var1 = n.q.PLAYER_OFF_MAP;
         } else {
            if(!this.V) {
               this.Q.remove(var3);
               return;
            }

            var1 = n.q.PLAYER_OFF_LIMITS;
         }

         var16 = 0;
         if(var11 <= -63.0F) {
            var13 = -128;
         }

         if(var12 <= -63.0F) {
            var14 = -128;
         }

         if(var11 >= 63.0F) {
            var13 = 127;
         }

         if(var12 >= 63.0F) {
            var14 = 127;
         }
      }

      this.Q.put(var3, new n(var1, var13, var14, var16));
   }

   @Nullable
   public net.n2.k K(ks var1, net.yv.r var2, net.r.r var3) {
      s.i var4 = (s.i)this.h.get(var3);
      return null;
   }

   public void n(int var1, int var2) {
      super.f();

      for(s.i var4 : this.y) {
         var4.l(var1, var2);
      }

   }

   public s.i D(net.r.r var1) {
      s.i var2 = (s.i)this.h.get(var1);
      var2 = new s.i(var1);
      this.h.put(var1, var2);
      this.y.add(var2);
      return var2;
   }

   private static xn a(xn var0) {
      return var0;
   }

   public class i {
      public final net.r.r O;
      private boolean i = true;
      private int f;
      private int a;
      private int M = 127;
      private int v = 127;
      private int X;
      public int V;

      public i(net.r.r var2) {
         this.O = var2;
      }

      @Nullable
      public net.n2.k p(ks var1) {
         boolean var2 = net.cg.z.z();
         if(this.i) {
            this.i = false;
            return new u(var1.n(), s.this.J, s.this.i, s.this.Q.values(), s.this.E, this.f, this.a, this.M + 1 - this.f, this.v + 1 - this.a);
         } else {
            return this.X++ % 5 == 0?new u(var1.n(), s.this.J, s.this.i, s.this.Q.values(), s.this.E, 0, 0, 0, 0):null;
         }
      }

      public void l(int var1, int var2) {
         boolean var3 = net.cg.z.V();
         if(this.i) {
            this.f = Math.min(this.f, var1);
            this.a = Math.min(this.a, var2);
            this.M = Math.max(this.M, var1);
            this.v = Math.max(this.v, var2);
         }

         this.i = true;
         this.f = var1;
         this.a = var2;
         this.M = var1;
         this.v = var2;
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
