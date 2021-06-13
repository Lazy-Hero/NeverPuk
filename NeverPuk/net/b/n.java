package net.b;

import javax.annotation.Nullable;
import net.xn;
import net.b.c;
import net.b.r;
import net.b.t;
import net.b.u;
import net.nb.f;
import net.ne.d;
import net.ne.y;
import net.u.e;
import net.u.j;

public abstract class n {
   protected y U;
   protected net.yv.r P;
   @Nullable
   protected t a;
   protected double A;
   private final net.s.i u;
   protected int f;
   private int G;
   private net.u.r Z = net.u.r.r;
   private net.u.r l = net.u.r.r;
   private long N;
   private long V;
   private double I;
   protected float r = 0.5F;
   protected boolean B;
   private long y;
   protected r e;
   private j d;
   private final u O;
   private static String R;

   public n(y var1, net.yv.r var2) {
      this.U = var1;
      this.P = var2;
      this.u = var1.t(d.L);
      this.O = this.O();
   }

   protected abstract u O();

   public void f(double var1) {
      this.A = var1;
   }

   public float R() {
      return (float)this.u.K();
   }

   public boolean L() {
      return this.B;
   }

   public void v() {
      if(this.P.y() - this.y > 20L) {
         if(this.d != null) {
            this.a = null;
            this.a = this.S(this.d);
            this.y = this.P.y();
            this.B = false;
         }
      } else {
         this.B = true;
      }

   }

   @Nullable
   public final t h(double var1, double var3, double var5) {
      return this.S(new j(var1, var3, var5));
   }

   @Nullable
   public t S(j var1) {
      if(!this.w()) {
         return null;
      } else if(this.a != null && !this.a.P() && var1.equals(this.d)) {
         return this.a;
      } else {
         this.d = var1;
         float var2 = this.R();
         this.P.M.K("pathfind");
         j var3 = new j(this.U);
         int var4 = (int)(var2 + 8.0F);
         net.yv.q var5 = new net.yv.q(this.P, var3.F(-var4, -var4, -var4), var3.F(var4, var4, var4), 0);
         t var6 = this.O.C(var5, this.U, this.d, var2);
         this.P.M.N();
         return var6;
      }
   }

   @Nullable
   public t v(net.ne.l var1) {
      if(!this.w()) {
         return null;
      } else {
         j var2 = new j(var1);
         if(this.a != null && !this.a.P() && var2.equals(this.d)) {
            return this.a;
         } else {
            this.d = var2;
            float var3 = this.R();
            this.P.M.K("pathfind");
            j var4 = (new j(this.U)).h();
            int var5 = (int)(var3 + 16.0F);
            net.yv.q var6 = new net.yv.q(this.P, var4.F(-var5, -var5, -var5), var4.F(var5, var5, var5), 0);
            t var7 = this.O.d(var6, this.U, var1, var3);
            this.P.M.N();
            return var7;
         }
      }
   }

   public boolean k(double var1, double var3, double var5, double var7) {
      return this.Y(this.h(var1, var3, var5), var7);
   }

   public boolean F(net.ne.l var1, double var2) {
      t var4 = this.v(var1);
      return this.Y(var4, var2);
   }

   public boolean Y(@Nullable t var1, double var2) {
      this.a = null;
      return false;
   }

   @Nullable
   public t N() {
      return this.a;
   }

   public void I() {
      ++this.f;
      if(this.B) {
         this.v();
      }

      if(!this.q()) {
         if(this.w()) {
            this.e();
         } else if(this.a != null && this.a.P() < this.a.R()) {
            net.u.r var1 = this.U();
            net.u.r var2 = this.a.C(this.U, this.a.P());
            if(var1.H > var2.H && !this.U.k && net.u.t.L(var1.p) == net.u.t.L(var2.p) && net.u.t.L(var1.a) == net.u.t.L(var2.a)) {
               this.a.X(this.a.P() + 1);
            }
         }

         this.M();
         if(!this.q()) {
            net.u.r var4 = this.a.i(this.U);
            j var6 = (new j(var4)).b();
            e var3 = this.P.Z(var6).q(this.P, var6);
            var4 = var4.I(0.0D, 1.0D - var3.c, 0.0D);
            this.U.m().Q(var4.p, var4.H, var4.a, this.A);
         }
      }

   }

   protected void M() {
   }

   protected void e() {
      net.u.r var2 = this.U();
      q();
      int var3 = this.a.R();
      int var4 = this.a.P();
      if(var4 < this.a.R()) {
         if(Double.compare((double)this.a.y(var4).E, Math.floor(var2.H)) != 0) {
            var3 = var4;
         }

         ++var4;
      }

      this.r = this.U.h9 > 0.75F?this.U.h9 / 2.0F:0.75F - this.U.h9 / 2.0F;
      net.u.r var10 = this.a.k();
      if(Float.compare(net.u.t.J((float)(this.U.b - (var10.p + 0.5D))), this.r) < 0 && Float.compare(net.u.t.J((float)(this.U.hr - (var10.a + 0.5D))), this.r) < 0 && Double.compare(Math.abs(this.U.hS - var10.H), 1.0D) < 0) {
         this.a.X(this.a.P() + 1);
      }

      int var5 = net.u.t.Y(this.U.h9);
      int var6 = net.u.t.Y(this.U.m);
      int var8 = var3 - 1;
      if(var8 >= this.a.P()) {
         if(this.D(var2, this.a.C(this.U, var8), var5, var6, var5)) {
            this.a.X(var8);
         }

         --var8;
      }

      this.h(var2);
   }

   protected void h(net.u.r var1) {
      if(this.f - this.G > 100) {
         if(var1.Y(this.Z) < 2.25D) {
            this.u();
         }

         this.G = this.f;
         this.Z = var1;
      }

      if(this.a != null && !this.a.P()) {
         net.u.r var2 = this.a.k();
         if(var2.equals(this.l)) {
            this.N += System.currentTimeMillis() - this.V;
         } else {
            this.l = var2;
            double var3 = var1.w(this.l);
            this.I = this.U.q() > 0.0F?var3 / (double)this.U.q() * 1000.0D:0.0D;
         }

         if(this.I > 0.0D && (double)this.N > this.I * 3.0D) {
            this.l = net.u.r.r;
            this.N = 0L;
            this.I = 0.0D;
            this.u();
         }

         this.V = System.currentTimeMillis();
      }

   }

   public boolean q() {
      return this.a == null || this.a.P();
   }

   public void u() {
      this.a = null;
   }

   protected abstract net.u.r U();

   protected abstract boolean w();

   protected boolean c() {
      return this.U.p() || this.U.h();
   }

   protected void q() {
      if(this.a != null) {
         for(int var1 = 0; var1 < this.a.R(); ++var1) {
            c var2 = this.a.y(var1);
            c var3 = var1 + 1 < this.a.R()?this.a.y(var1 + 1):null;
            net.yw.n var4 = this.P.Z(new j(var2.H, var2.E, var2.i));
            net.y9.l var5 = var4.Q();
            if(var5 == f.dh) {
               this.a.a(var1, var2.F(var2.H, var2.E + 1, var2.i));
               if(var2.E >= var3.E) {
                  this.a.a(var1 + 1, var3.F(var3.H, var2.E + 1, var3.i));
               }
            }
         }
      }

   }

   protected abstract boolean D(net.u.r var1, net.u.r var2, int var3, int var4, int var5);

   public boolean n(j var1) {
      return this.P.Z(var1.b()).E();
   }

   public r o() {
      return this.e;
   }

   public static void N(String var0) {
      R = var0;
   }

   public static String q() {
      return R;
   }

   private static xn a(xn var0) {
      return var0;
   }

   static {
      N((String)null);
   }
}
