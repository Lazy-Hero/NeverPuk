package net.c5;

import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;
import net.i6;
import net.c5.b;
import net.c5.c;
import net.c5.e;
import net.c5.f;
import net.c5.j;
import net.c5.k;
import net.c5.m;
import net.c5.n;
import net.c5.o;
import net.c5.p;
import net.c5.s;
import net.c5.t;
import net.c5.u;
import net.c5.w;
import net.ne.l;
import net.ni.h;
import net.ni.s0;
import net.ni.sg;
import net.ni.sl;
import net.ni.su;
import net.ni.v;
import net.u.d;
import net.y.u1;
import net.y.ui;
import net.y6.e4;
import net.y8.x;
import net.z.r;

public class g {
   public final Map t = Maps.newHashMap();
   public static g E = new g();
   public r Q;
   public static double T;
   public static double w;
   public static double i;
   public net.n9.e c;
   public net.yv.r s;
   public l F;
   public float H;
   public float X;
   public net.u.m j;
   public double D;
   public double J;
   public double f;
   public v B;
   private final net.y.r p = new net.y.r(2097152);
   private boolean b = false;

   private g() {
      this.t.put(sg.class, new net.c5.z());
      this.t.put(net.ni.u.class, new k());
      this.t.put(su.class, new o());
      this.t.put(net.ni.k.class, new n());
      this.t.put(net.ni.n.class, new u());
      this.t.put(net.ni.j.class, new j());
      this.t.put(net.ni.c.class, new c());
      this.t.put(net.ni.z.class, new w());
      this.t.put(h.class, new m());
      this.t.put(s0.class, new p());
      this.t.put(net.ni.g.class, new t());
      this.t.put(sl.class, new f());
      this.t.put(net.ni.e.class, new s(new e4()));
      this.t.put(net.ni.y.class, new b());

      for(e var2 : this.t.values()) {
         var2.m(this);
      }

   }

   public e E(Class var1) {
      e var2 = (e)this.t.get(var1);
      if(var1 != v.class) {
         var2 = this.E(var1.getSuperclass());
         this.t.put(var1, var2);
      }

      return var2;
   }

   @Nullable
   public e m(@Nullable v var1) {
      return null;
   }

   public void I(net.yv.r var1, net.n9.e var2, r var3, l var4, net.u.m var5, float var6) {
      if(this.s != var1) {
         this.V(var1);
      }

      this.c = var2;
      this.F = var4;
      this.Q = var3;
      this.j = var5;
      this.H = var4.hq + (var4.hN - var4.hq) * var6;
      this.X = var4.d + (var4.V - var4.d) * var6;
      this.D = var4.hL + (var4.b - var4.hL) * (double)var6;
      this.J = var4.F + (var4.hS - var4.F) * (double)var6;
      this.f = var4.A + (var4.hr - var4.A) * (double)var6;
   }

   public void b(v var1, float var2, int var3) {
      d[] var4 = e.F();
      if(Double.compare(var1.Q(this.D, this.J, this.f), var1.K()) < 0) {
         u1.B();
         boolean var5 = true;
         if(i6.Cc.r()) {
            if(this.b && i6.I(var1, i6.Cc, new Object[0])) {
               boolean var10 = false;
            } else {
               boolean var10000 = true;
            }
         }

         int var6 = this.s.z(var1.C(), 0);
         int var7 = var6 % 65536;
         int var8 = var6 / 65536;
         ui.c(ui.w, (float)var7, (float)var8);
         net.y.d.T(1.0F, 1.0F, 1.0F, 1.0F);
         net.u.j var9 = var1.C();
         this.r(var1, (double)var9.t() - T, (double)var9.h() - w, (double)var9.y() - i, var2, var3, 1.0F);
      }

   }

   public void f(v var1, double var2, double var4, double var6, float var8) {
      this.s(var1, var2, var4, var6, var8, 1.0F);
   }

   public void s(v var1, double var2, double var4, double var6, float var8, float var9) {
      this.r(var1, var2, var4, var6, var8, -1, var9);
   }

   public void r(v var1, double var2, double var4, double var6, float var8, int var9, float var10) {
      e var11 = this.m(var1);
      this.B = var1;
      if(this.b && i6.I(var1, i6.Cc, new Object[0])) {
         var11.o(var1, var2, var4, var6, var8, var9, var10, this.p.k());
      } else {
         var11.A(var1, var2, var4, var6, var8, var9, var10);
      }

      this.B = null;
   }

   public void V(@Nullable net.yv.r var1) {
      this.s = var1;
      this.F = null;
   }

   public r T() {
      return this.Q;
   }

   public void H() {
      this.p.k().m(7, x.M);
      this.b = true;
   }

   public void t(int var1) {
      this.c.E(net.n9.b.N);
      u1.m();
      net.y.d.D(770, 771);
      net.y.d.C();
      net.y.d.j();
      if(net.nn.j.K()) {
         net.y.d.Q(7425);
      } else {
         net.y.d.Q(7424);
      }

      this.p.k().w(0.0F, 0.0F, 0.0F);
      this.p.p();
      u1.B();
      this.b = false;
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }
}
