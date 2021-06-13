package net.yn;

import com.google.common.base.Predicate;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import javax.annotation.Nullable;
import net.xn;
import net.n0.ks;
import net.nk.f0;
import net.nk.f2;
import net.nk.f8;
import net.nk.f_;
import net.nk.fb;
import net.nk.fo;
import net.nk.fu;
import net.nk.fy;
import net.y9.gh;
import net.y9.l2;
import net.y_.o0;
import net.y_.o4;
import net.y_.o7;
import net.y_.ok;
import net.y_.op;
import net.y_.oy;
import net.yn.r;
import net.yn.w;
import net.yn.wv;
import net.yn.x;
import net.yz.m_;

public class k extends r implements wv {
   private static final net.k.v ZE = net.k.n.q(k.class, net.k.y.d);
   private static final Predicate Z8 = new Predicate() {
      public boolean E(@Nullable net.ne.y var1) {
         int var2 = net.yn.z.B();
         return k.Zf.containsKey(net.ne.v.S.D(var1.getClass()));
      }

      private static xn a(xn var0) {
         return var0;
      }
   };
   private static final net.n0.y Zb = net.nb.j.Ss;
   private static final Set ZC = Sets.newHashSet(new net.n0.y[]{net.nb.j.Q, net.nb.j.Y3, net.nb.j.Y, net.nb.j.WY});
   private static final Int2ObjectMap Zf = new Int2ObjectOpenHashMap(32);
   public float Z6;
   public float ZO;
   public float ZK;
   public float ZD;
   public float Z0 = 1.0F;
   private boolean Z5;
   private net.u.j Zj;

   public k(net.yv.r var1) {
      super(var1);
      this.S(0.5F, 0.9F);
      this.pn = new net.y_.a(this);
   }

   @Nullable
   public net.ne.g t(net.yv.g var1, @Nullable net.ne.g var2) {
      this.o(this.p.nextInt(5));
      return super.t(var1, var2);
   }

   protected void D() {
      this.I9 = new o0(this);
      this.p_.X(0, new oy(this, 1.25D));
      this.p_.X(0, new op(this));
      this.p_.X(1, new ok(this, net.r.r.class, 8.0F));
      this.p_.X(2, this.I9);
      this.p_.X(2, new net.y_.m(this, 1.0D, 5.0F, 1.0F));
      this.p_.X(2, new o7(this, 1.0D));
      this.p_.X(3, new o4(this));
      this.p_.X(3, new net.y_.j(this, 1.0D, 3.0F, 7.0F));
   }

   protected void W() {
      super.W();
      this.T().i(net.ne.d.c);
      this.t(net.ne.d.C).t(6.0D);
      this.t(net.ne.d.c).t(0.4000000059604645D);
      this.t(net.ne.d.G).t(0.20000000298023224D);
   }

   protected net.b.n I(net.yv.r var1) {
      net.b.k var2 = new net.b.k(this, var1);
      var2.o(false);
      var2.B(true);
      var2.N(true);
      return var2;
   }

   public float A() {
      return this.m * 0.6F;
   }

   public void d() {
      k(this.hl, this);
      if(this.Zj == null || this.Zj.s(this.b, this.hS, this.hr) > 12.0D || this.hl.Z(this.Zj).Q() != net.nb.f.ue) {
         this.Z5 = false;
         this.Zj = null;
      }

      super.d();
      this.MG();
   }

   public void U(net.u.j var1, boolean var2) {
      this.Zj = var1;
      this.Z5 = var2;
   }

   public boolean yl() {
      return this.Z5;
   }

   private void MG() {
      this.ZD = this.Z6;
      this.ZK = this.ZO;
      this.ZO = (float)((double)this.ZO + (double)(this.k?-1:4) * 0.3D);
      this.ZO = net.u.t.T(this.ZO, 0.0F, 1.0F);
      if(!this.k && this.Z0 < 1.0F) {
         this.Z0 = 1.0F;
      }

      this.Z0 = (float)((double)this.Z0 * 0.9D);
      if(!this.k && this.K < 0.0D) {
         this.K *= 0.6D;
      }

      this.Z6 += this.Z0 * 2.0F;
   }

   private static boolean k(net.yv.r var0, net.ne.l var1) {
      if(!var1.c() && var0.G.nextInt(50) == 0) {
         List var2 = var0.L(net.ne.y.class, var1.i().x(20.0D), Z8);
         if(!var2.isEmpty()) {
            net.ne.y var3 = (net.ne.y)var2.get(var0.G.nextInt(var2.size()));
            if(!var3.c()) {
               net.yz.a var4 = u(net.ne.v.S.D(var3.getClass()));
               var0.L((net.r.r)null, var1.b, var1.hS, var1.hr, var4, var1.E(), 0.7F, Y(var0.G));
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   public boolean R(net.r.r var1, net.yz.k var2) {
      net.yn.z.B();
      ks var4 = var1.o((net.yz.k)var2);
      if(!this.D() && ZC.contains(var4.Z())) {
         if(!var1.a6.V) {
            var4.H(1);
         }

         if(!this.c()) {
            this.hl.L((net.r.r)null, this.b, this.hS, this.hr, net.nb.l.Z, this.E(), 1.0F, 1.0F + (this.p.nextFloat() - this.p.nextFloat()) * 0.2F);
         }

         if(!this.hl.x) {
            if(this.p.nextInt(10) == 0) {
               this.q(var1);
               this.P(true);
               this.hl.k(this, (byte)7);
            }

            this.P(false);
            this.hl.k(this, (byte)6);
         }

         return true;
      } else if(var4.Z() == Zb) {
         if(!var1.a6.V) {
            var4.H(1);
         }

         this.o((net.n_.i)(new net.n_.i(net.nb.b.j, 900)));
         if(var1.V8() || !this.s()) {
            this.H(net.yz.z.Q(var1), Float.MAX_VALUE);
         }

         return true;
      } else {
         if(!this.hl.x && !this.yk() && this.D() && this.s(var1)) {
            this.I9.n(!this.Ke());
         }

         return super.R(var1, var2);
      }
   }

   public boolean V(ks var1) {
      return false;
   }

   public boolean l4() {
      int var1 = net.u.t.L(this.b);
      int var2 = net.u.t.L(this.i().u);
      int var3 = net.u.t.L(this.hr);
      net.u.j var4 = new net.u.j(var1, var2, var3);
      net.y9.l var5 = this.hl.Z(var4.b()).Q();
      return var5 instanceof gh || var5 == net.nb.f.p || var5 instanceof l2 || var5 == net.nb.f.ou && this.hl.s(var4) > 8 && super.l4();
   }

   public void v(float var1, float var2) {
   }

   protected void s(double var1, boolean var3, net.yw.n var4, net.u.j var5) {
   }

   public boolean b(w var1) {
      return false;
   }

   @Nullable
   public net.ne.j r(net.ne.j var1) {
      return null;
   }

   public static void z(net.yv.r var0, net.ne.l var1) {
      if(!var1.c() && !k(var0, var1) && var0.G.nextInt(200) == 0) {
         var0.L((net.r.r)null, var1.b, var1.hS, var1.hr, o(var0.G), var1.E(), 1.0F, Y(var0.G));
      }

   }

   public boolean S(net.ne.l var1) {
      return var1.H(net.yz.z.O(this), 3.0F);
   }

   @Nullable
   public net.yz.a T() {
      return o(this.p);
   }

   private static net.yz.a o(Random var0) {
      if(var0.nextInt(1000) == 0) {
         ArrayList var1 = new ArrayList(Zf.keySet());
         return u(((Integer)var1.get(var0.nextInt(var1.size()))).intValue());
      } else {
         return net.nb.l.PS;
      }
   }

   public static net.yz.a u(int var0) {
      return Zf.containsKey(var0)?(net.yz.a)Zf.get(var0):net.nb.l.PS;
   }

   protected net.yz.a m(net.yz.z var1) {
      return net.nb.l.KU;
   }

   protected net.yz.a r() {
      return net.nb.l.PE;
   }

   protected void B(net.u.j var1, net.y9.l var2) {
      this.I(net.nb.l.K8, 0.15F, 1.0F);
   }

   protected float r(float var1) {
      this.I(net.nb.l.MR, 0.15F, 1.0F);
      return var1 + this.ZO / 2.0F;
   }

   protected boolean u() {
      return true;
   }

   protected float s() {
      return Y(this.p);
   }

   private static float Y(Random var0) {
      return (var0.nextFloat() - var0.nextFloat()) * 0.2F + 1.0F;
   }

   public net.yz.p E() {
      return net.yz.p.NEUTRAL;
   }

   public boolean b() {
      return true;
   }

   protected void I(net.ne.l var1) {
      if(!(var1 instanceof net.r.r)) {
         super.I(var1);
      }

   }

   public boolean H(net.yz.z var1, float var2) {
      if(this.w(var1)) {
         return false;
      } else {
         if(this.I9 != null) {
            this.I9.n(false);
         }

         return super.H(var1, var2);
      }
   }

   public int C() {
      return net.u.t.g(((Integer)this.G.a(ZE)).intValue(), 0, 4);
   }

   public void o(int var1) {
      this.G.d(ZE, Integer.valueOf(var1));
   }

   protected void g() {
      super.g();
      this.G.r(ZE, Integer.valueOf(0));
   }

   public void I(net.nj.f var1) {
      super.I(var1);
      var1.r("Variant", this.C());
   }

   public void o(net.nj.f var1) {
      super.o(var1);
      this.o(var1.P("Variant"));
   }

   @Nullable
   protected m_ N() {
      return net.y7.p.n;
   }

   public boolean yk() {
      return !this.k;
   }

   static {
      Zf.put(net.ne.v.S.D(net.nk.x.class), net.nb.l.PI);
      Zf.put(net.ne.v.S.D(net.nk.o.class), net.nb.l.o5);
      Zf.put(net.ne.v.S.D(net.nk.m.class), net.nb.l.HI);
      Zf.put(net.ne.v.S.D(net.nk.l.class), net.nb.l.on);
      Zf.put(net.ne.v.S.D(net.a.t.class), net.nb.l.Dh);
      Zf.put(net.ne.v.S.D(net.nk.u.class), net.nb.l.HU);
      Zf.put(net.ne.v.S.D(net.nk.y.class), net.nb.l.Pe);
      Zf.put(net.ne.v.S.D(net.nk.p.class), net.nb.l.Cu);
      Zf.put(net.ne.v.S.D(fb.class), net.nb.l.Cv);
      Zf.put(net.ne.v.S.D(fo.class), net.nb.l.w);
      Zf.put(net.ne.v.S.D(net.nk.w.class), net.nb.l.MC);
      Zf.put(net.ne.v.S.D(f8.class), net.nb.l.Do);
      Zf.put(net.ne.v.S.D(f2.class), net.nb.l.d);
      Zf.put(net.ne.v.S.D(net.nk.f.class), net.nb.l.Ke);
      Zf.put(net.ne.v.S.D(net.nk.j.class), net.nb.l.CO);
      Zf.put(net.ne.v.S.D(net.nk.e.class), net.nb.l.KX);
      Zf.put(net.ne.v.S.D(net.nk.g.class), net.nb.l.Hs);
      Zf.put(net.ne.v.S.D(f0.class), net.nb.l.Mo);
      Zf.put(net.ne.v.S.D(net.nk.a.class), net.nb.l.o5);
      Zf.put(net.ne.v.S.D(net.nk.s.class), net.nb.l.M);
      Zf.put(net.ne.v.S.D(net.nk.t.class), net.nb.l.Pn);
      Zf.put(net.ne.v.S.D(net.nk.h.class), net.nb.l.wS);
      Zf.put(net.ne.v.S.D(f_.class), net.nb.l.P6);
      Zf.put(net.ne.v.S.D(net.a.z.class), net.nb.l.MN);
      Zf.put(net.ne.v.S.D(net.nk.k.class), net.nb.l.x);
      Zf.put(net.ne.v.S.D(x.class), net.nb.l.oJ);
      Zf.put(net.ne.v.S.D(fu.class), net.nb.l.oz);
      Zf.put(net.ne.v.S.D(fy.class), net.nb.l.KY);
   }

   private static xn d(xn var0) {
      return var0;
   }
}
