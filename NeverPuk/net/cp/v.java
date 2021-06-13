package net.cp;

import com.google.common.collect.Sets;
import java.util.Random;
import java.util.Set;
import javax.annotation.Nullable;
import net._i;
import net.bb;
import net.i6;
import net.oq;
import net.xn;
import net.z9;
import net.cg.b;
import net.cg.q;
import net.cp.o;
import net.cp.w;
import net.n0.ks;
import net.n0.y;
import net.n2.k;
import net.nn.j;
import net.u.p;
import net.yh.cf;
import net.yv.c;
import net.yv.l;
import net.yv.o9;
import net.yv.r;
import net.yw.n;
import net.yy.g;
import net.yz.ai;

public class v extends r {
   private final net.yp.v Y;
   private o j;
   private final Set Ms = Sets.newHashSet();
   private final Set Z = Sets.newHashSet();
   private final j t = j.b();
   private final Set I = Sets.newHashSet();
   private int X;
   protected Set e;
   private int MD = Integer.MIN_VALUE;
   private int w = Integer.MIN_VALUE;
   private boolean p = false;
   private static String[] MQ;

   public v(net.yp.v var1, net.yv.t var2, int var3, l var4, net.yk.t var5) {
      super(new q(), new net.cg.z(var2, "MpServer"), a(var3), var5, true);
      this.X = this.G.nextInt(12000);
      this.e = Sets.newHashSet();
      this.Y = var1;
      this.B().b(var4);
      this.F.z(this);
      this.B(new net.u.j(8, 64, 8));
      this.m = this.X();
      this.i = new b();
      this.u();
      this.Q();
      i6.b(this, i6.B3, new Object[0]);
      i6.C(i6.BJ, new Object[]{this});
      if(this.t.sE != null && this.t.sE.getClass() == w.class) {
         this.t.sE = new bb(this.t, var1);
         _i.M((bb)this.t.sE);
      }

   }

   private static c a(int var0) {
      return i6.Mz.r()?(c)i6.H(i6.Mz, new Object[]{Integer.valueOf(var0)}):net.yv.h.M(var0).H();
   }

   public void k() {
      super.k();
      this.c(this.y() + 1L);
      if(this.N().b("doDaylightCycle")) {
         this.N(this.j() + 1L);
      }

      this.M.K("reEntryProcessing");

      for(int var1 = 0; !this.Z.isEmpty(); ++var1) {
         net.ne.l var2 = (net.ne.l)this.Z.iterator().next();
         this.Z.remove(var2);
         if(!this.J.contains(var2)) {
            this.S(var2);
         }
      }

      this.M.F("chunkCache");
      this.j.Y();
      this.M.F("blocks");
      this.s();
      this.M.N();
   }

   public void H(int var1, int var2, int var3, int var4, int var5, int var6) {
   }

   protected net.l.h X() {
      this.j = new o(this);
      return this.j;
   }

   protected boolean T(int var1, int var2, boolean var3) {
      return !this.m().N(var1, var2).z();
   }

   protected void R() {
      int var1 = net.u.t.L(this.t.sf.b / 16.0D);
      int var2 = net.u.t.L(this.t.sf.hr / 16.0D);
      if(var1 != this.MD || var2 != this.w) {
         this.MD = var1;
         this.w = var2;
         this.e.clear();
         int var3 = this.t.T.ij;
         this.M.K("buildList");
         int var4 = net.u.t.L(this.t.sf.b / 16.0D);
         int var5 = net.u.t.L(this.t.sf.hr / 16.0D);

         for(int var6 = -var3; var6 <= var3; ++var6) {
            for(int var7 = -var3; var7 <= var3; ++var7) {
               this.e.add(new p(var6 + var4, var7 + var5));
            }
         }

         this.M.N();
      }

   }

   protected void s() {
      this.R();
      if(this.X > 0) {
         --this.X;
      }

      this.I.retainAll(this.e);
      if(this.I.size() == this.e.size()) {
         this.I.clear();
      }

      int var1 = 0;

      for(p var3 : this.e) {
         if(!this.I.contains(var3)) {
            int var4 = var3.i * 16;
            int var5 = var3.y * 16;
            this.M.K("getChunk");
            net.l.q var6 = this.q(var3.i, var3.y);
            this.c(var4, var5, var6);
            this.M.N();
            this.I.add(var3);
            ++var1;
            if(var1 >= 10) {
               return;
            }
         }
      }

   }

   public void B(int var1, int var2, boolean var3) {
      this.j.J(var1, var2);
   }

   public boolean S(net.ne.l var1) {
      boolean var2 = super.S(var1);
      this.Ms.add(var1);
      if(var1 instanceof net.nm.w) {
         this.t.n().g((net.h.d)(new net.h.v((net.nm.w)var1)));
      }

      return var2;
   }

   public void W(net.ne.l var1) {
      super.W(var1);
      this.Ms.remove(var1);
   }

   protected void z(net.ne.l var1) {
      super.z(var1);
      this.Z.remove(var1);
   }

   protected void d(net.ne.l var1) {
      super.d(var1);
      if(this.Ms.contains(var1)) {
         if(var1.P()) {
            this.Z.add(var1);
         } else {
            this.Ms.remove(var1);
         }
      }

   }

   public void J(int var1, net.ne.l var2) {
      net.ne.l var3 = this.S(var1);
      this.W(var3);
      this.Ms.add(var2);
      var2.K(var1);
      if(!this.S(var2)) {
         this.Z.add(var2);
      }

      this.Q.t(var1, var2);
   }

   @Nullable
   public net.ne.l S(int var1) {
      return (net.ne.l)(var1 == this.t.sf.G()?this.t.sf:super.S(var1));
   }

   public net.ne.l a(int var1) {
      net.ne.l var2 = (net.ne.l)this.Q.J(var1);
      this.Ms.remove(var2);
      this.W(var2);
      return var2;
   }

   /** @deprecated */
   @Deprecated
   public boolean z(net.u.j var1, n var2) {
      int var3 = var1.t();
      int var4 = var1.h();
      int var5 = var1.y();
      this.H(var3, var4, var5, var3, var4, var5);
      return super.k(var1, var2, 3);
   }

   public void Z() {
      this.Y.q().R(new net.cb.l("Quitting"));
   }

   protected void n() {
   }

   protected void c(int var1, int var2, net.l.q var3) {
      s();
      super.c(var1, var2, var3);
      if(this.X == 0) {
         g var5 = this.t.sf;
         if(var5 == null) {
            return;
         }

         if(Math.abs(var5.Q - var3.Q) > 1 || Math.abs(var5.f - var3.U) > 1) {
            return;
         }

         this.D = this.D * 3 + 1013904223;
         int var6 = this.D >> 2;
         int var7 = var6 & 15;
         int var8 = var6 >> 8 & 15;
         int var9 = var6 >> 16 & 255;
         var9 = var9 / 2;
         if(Double.compare(var5.hS, 160.0D) > 0) {
            var9 += 128;
         }

         if(var5.hS > 96.0D) {
            var9 += 64;
         }

         net.u.j var10 = new net.u.j(var7 + var1, var9, var8 + var2);
         n var11 = var3.u(var10);
         var7 = var7 + var1;
         var8 = var8 + var2;
         double var12 = this.t.sf.o((double)var7 + 0.5D, (double)var9 + 0.5D, (double)var8 + 0.5D);
         if(Double.compare(var12, 4.0D) < 0) {
            return;
         }

         if(var12 > 255.0D) {
            return;
         }

         if(var11.n() == net.y1.l.q && this.s(var10) <= this.G.nextInt(8) && this.d(net.yv.w.SKY, var10) <= 0) {
            this.m((double)var7 + 0.5D, (double)var9 + 0.5D, (double)var8 + 0.5D, net.nb.l.Hi, net.yz.p.AMBIENT, 0.7F, 0.8F + this.G.nextFloat() * 0.2F, false);
            this.X = this.G.nextInt(12000) + 6000;
         }
      }

   }

   public void w(int var1, int var2, int var3) {
      boolean var10000 = true;
      Random var5 = new Random();
      ks var6 = this.t.sf.S();
      if(net.y9.l.F(var6.Z()) != net.nb.f.dr) {
         var6 = this.t.sf.L();
      }

      boolean var7 = this.t.sE.O() == o9.CREATIVE && !var6.B() && var6.Z() == y.q(net.nb.f.dr);
      net.u.j var8 = new net.u.j();
      int var9 = 0;

      while(true) {
         this.L(var1, var2, var3, 16, var5, var7, var8);
         this.L(var1, var2, var3, 32, var5, var7, var8);
         ++var9;
      }
   }

   public void L(int var1, int var2, int var3, int var4, Random var5, boolean var6, net.u.j var7) {
      int var8 = var1 + this.G.nextInt(var4) - this.G.nextInt(var4);
      int var9 = var2 + this.G.nextInt(var4) - this.G.nextInt(var4);
      int var10 = var3 + this.G.nextInt(var4) - this.G.nextInt(var4);
      var7.V(var8, var9, var10);
      n var11 = this.Z(var7);
      var11.Q().Y(var11, this, var7, var5);
      if(var11.Q() == net.nb.f.dr) {
         this.n(ai.BARRIER, (double)((float)var8 + 0.5F), (double)((float)var9 + 0.5F), (double)((float)var10 + 0.5F), 0.0D, 0.0D, 0.0D, new int[0]);
      }

   }

   public void c() {
      this.J.removeAll(this.q);

      for(int var1 = 0; var1 < this.q.size(); ++var1) {
         net.ne.l var2 = (net.ne.l)this.q.get(var1);
         int var3 = var2.Q;
         int var4 = var2.f;
         if(var2.U && this.T(var3, var4, true)) {
            this.q(var3, var4).f(var2);
         }
      }

      for(int var6 = 0; var6 < this.q.size(); ++var6) {
         this.d((net.ne.l)this.q.get(var6));
      }

      this.q.clear();

      for(int var7 = 0; var7 < this.J.size(); ++var7) {
         net.ne.l var8 = (net.ne.l)this.J.get(var7);
         net.ne.l var9 = var8.D();
         if(var9.Z || !var9.m(var8)) {
            var8.O();
            if(var8.Z) {
               int var10 = var8.Q;
               int var5 = var8.f;
               if(var8.U && this.T(var10, var5, true)) {
                  this.q(var10, var5).f(var8);
               }

               this.J.remove(var7--);
               this.d(var8);
            }
         }
      }

   }

   public net.d.l W(net.d.w var1) {
      net.d.l var2 = super.W(var1);
      var2.L("Forced entities", new net.d.t() {
         public String f() {
            return v.this.Ms.size() + " total; " + v.this.Ms;
         }
      });
      var2.L("Retry entities", new net.d.t() {
         public String O() {
            return v.this.Z.size() + " total; " + v.this.Z;
         }
      });
      var2.L("Server brand", new net.d.t() {
         public String v() throws Exception {
            return v.this.t.sf.e();
         }
      });
      var2.L("Server type", new net.d.t() {
         public String c() throws Exception {
            return v.this.t.V() == null?"Non-integrated multiplayer server":"Integrated singleplayer server";
         }

         private static Exception a(Exception var0) {
            return var0;
         }
      });
      return var2;
   }

   public void L(@Nullable net.r.r var1, double var2, double var4, double var6, net.yz.a var8, net.yz.p var9, float var10, float var11) {
      if(var1 == this.t.sf) {
         this.m(var2, var4, var6, var8, var9, var10, var11, false);
      }

   }

   public void z(net.u.j var1, net.yz.a var2, net.yz.p var3, float var4, float var5, boolean var6) {
      this.m((double)var1.t() + 0.5D, (double)var1.h() + 0.5D, (double)var1.y() + 0.5D, var2, var3, var4, var5, var6);
   }

   public void m(double var1, double var3, double var5, net.yz.a var7, net.yz.p var8, float var9, float var10, boolean var11) {
      double var12 = this.t.A().o(var1, var3, var5);
      net.h.a var14 = new net.h.a(var7, var8, var9, var10, (float)var1, (float)var3, (float)var5);
      if(var12 > 100.0D) {
         double var15 = Math.sqrt(var12) / 40.0D;
         this.t.n().C(var14, (int)(var15 * 20.0D));
      } else {
         this.t.n().g((net.h.d)var14);
      }

   }

   public void u(double var1, double var3, double var5, double var7, double var9, double var11, @Nullable net.nj.f var13) {
      this.t.sv.N(new cf.w(this, var1, var3, var5, var7, var9, var11, this.t.sv, var13));
   }

   public void Q(k var1) {
      this.Y.L(var1);
   }

   public void R(net.nc.b var1) {
      this.H = var1;
   }

   public void N(long var1) {
      if(var1 < 0L) {
         var1 = -var1;
         this.N().T("doDaylightCycle", "false");
      } else {
         this.N().T("doDaylightCycle", "true");
      }

      super.N(var1);
   }

   public o m() {
      return (o)super.G();
   }

   public int z(net.u.j var1, int var2) {
      int var3 = super.z(var1, var2);
      if(z9.I()) {
         var3 = oq.K(var1, var3);
      }

      return var3;
   }

   public boolean k(net.u.j var1, n var2, int var3) {
      this.p = this.g();
      boolean var4 = super.k(var1, var2, var3);
      this.p = false;
      return var4;
   }

   private boolean g() {
      if(this.t.sE instanceof bb) {
         bb var1 = (bb)this.t.sE;
         return var1.Z();
      } else {
         return false;
      }
   }

   public boolean B() {
      return this.p;
   }

   public static void T(String[] var0) {
      MQ = var0;
   }

   public static String[] s() {
      return MQ;
   }

   private static xn a(xn var0) {
      return var0;
   }

   static {
      T((String[])null);
   }
}
