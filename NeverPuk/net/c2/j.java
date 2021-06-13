package net.c2;

import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.annotation.Nullable;
import net.xn;
import net.c2.h;
import net.c2.x;
import net.n0.ks;
import net.nl.c;
import net.nl.o;
import net.nl.v;
import net.nl.z1;
import net.nl.zq;
import net.y.u1;
import net.ys.r;
import net.yz.m_;
import net.z.wd;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

public class j extends net.y.s {
   private static final m_ xe = new m_("textures/gui/container/creative_inventory/tabs.png");
   private static final zq xc = new zq("tmp", true, 45);
   private static int xG = r.M.t();
   private float xS;
   private boolean x1;
   private boolean xK;
   private wd xy;
   private List xC;
   private o x7;
   private boolean xx;
   private x xg;

   public j(net.r.r var1) {
      super(new j.u(var1));
      var1.aG = this.f;
      this.E = true;
      this.W = 136;
      this.s = 195;
   }

   public void K() {
      if(!this.A.sE.f()) {
         this.A.s(new h(this.A.sf));
      }

   }

   public void Z(@Nullable o var1, int var2, int var3, c var4) {
      j.u.s;
      this.xx = true;
      boolean var6 = var4 == c.QUICK_MOVE;
      var4 = var2 == -999 && var4 == c.PICKUP?c.THROW:var4;
      if(var1 == null && xG != r.D.t() && var4 != c.QUICK_CRAFT) {
         net.r.i var7 = this.A.sf.a8;
         if(!var7.j().B()) {
            if(var3 == 0) {
               this.A.sf.Y(var7.j(), true);
               this.A.sE.M(var7.j());
               var7.F(ks.a);
            }

            if(var3 == 1) {
               ks var8 = var7.j().w(1);
               this.A.sf.Y(var8, true);
               this.A.sE.M(var8);
            }
         }
      }

      if(var1 == null || var1.I(this.A.sf)) {
         if(var1 == this.x7) {
            ;
         }

         if(xG == r.D.t()) {
            if(var1 == this.x7) {
               this.A.sf.a8.F(ks.a);
            }

            if(var4 == c.THROW && var1 != null && var1.T()) {
               ks var12 = var1.h(var3 == 0?1:var1.y().j());
               ks var15 = var1.y();
               this.A.sf.Y(var12, true);
               this.A.sE.M(var12);
               this.A.sE.J(var15, ((j.w)var1).a.d);
            }

            if(var4 == c.THROW && !this.A.sf.a8.j().B()) {
               this.A.sf.Y(this.A.sf.a8.j(), true);
               this.A.sE.M(this.A.sf.a8.j());
               this.A.sf.a8.F(ks.a);
            }

            this.A.sf.aW.p(var1 == null?var2:((j.w)var1).a.d, var3, var4, this.A.sf);
            this.A.sf.aW.u();
         }

         if(var4 != c.QUICK_CRAFT && var1.M == xc) {
            label660: {
               net.r.i var13 = this.A.sf.a8;
               ks var16 = var13.j();
               ks var9 = var1.y();
               if(var4 == c.SWAP) {
                  if(!var9.B() && var3 >= 0 && var3 < 9) {
                     ks var24 = var9.s();
                     var24.u(var24.j());
                     this.A.sf.a8.S(var3, var24);
                     this.A.sf.aW.u();
                  }

                  return;
               }

               if(var4 == c.CLONE) {
                  if(var13.j().B() && var1.T()) {
                     ks var23 = var1.y().s();
                     var23.u(var23.j());
                     var13.F(var23);
                  }

                  return;
               }

               if(var4 == c.THROW) {
                  if(!var9.B()) {
                     ks var22 = var9.s();
                     var22.u(var3 == 0?1:var22.j());
                     this.A.sf.Y(var22, true);
                     this.A.sE.M(var22);
                  }

                  return;
               }

               if(!var16.B() && !var9.B() && var16.g(var9) && ks.a(var16, var9)) {
                  if(var3 == 0) {
                     if(var16.U() >= var16.j()) {
                        break label660;
                     }

                     var16.A(1);
                  }

                  var16.H(1);
               }

               if(!var9.B() && var16.B()) {
                  var13.F(var9.s());
                  var16 = var13.j();
                  var16.u(var16.j());
               }

               if(var3 == 0) {
                  var13.F(ks.a);
               }

               var13.j().H(1);
            }
         }

         if(this.f != null) {
            ks var14 = var1 == null?ks.a:this.f.f(var1.d).y();
            this.f.p(var1 == null?var2:var1.d, var3, var4, this.A.sf);
            if(v.A(var3) == 2) {
               int var18 = 0;
               this.A.sE.J(this.f.f(45 + var18).y(), 36 + var18);
               ++var18;
            }

            if(var1 != null) {
               ks var20 = this.f.f(var1.d).y();
               this.A.sE.J(var20, var1.d - this.f.e.size() + 9 + 36);
               int var21 = 45 + var3;
               if(var4 == c.SWAP) {
                  this.A.sE.J(var14, var21 - this.f.e.size() + 9 + 36);
               }

               if(var4 == c.THROW && !var14.B()) {
                  ks var10 = var14.s();
                  var10.u(var3 == 0?1:var10.j());
                  this.A.sf.Y(var10, true);
                  this.A.sE.M(var10);
               }

               this.A.sf.aW.u();
            }
         }

      }
   }

   protected void N() {
      int var1 = this.Y;
      super.N();
      if(this.xy != null && this.Y != var1) {
         this.xy.N = this.Y + 82;
      }

   }

   public void L() {
      if(this.A.sE.f()) {
         super.L();
         this.m.clear();
         Keyboard.enableRepeatEvents(true);
         this.xy = new wd(0, this.O, this.Y + 82, this.F + 6, 80, this.O.R);
         this.xy.r(50);
         this.xy.S(false);
         this.xy.l(false);
         this.xy.b(16777215);
         int var1 = xG;
         xG = -1;
         this.I(r.m[var1]);
         this.xg = new x(this.A);
         this.A.sf.aW.w(this.xg);
      } else {
         this.A.s(new h(this.A.sf));
      }

   }

   public void x() {
      super.x();
      if(this.A.sf != null && this.A.sf.a8 != null) {
         this.A.sf.aW.T(this.xg);
      }

      Keyboard.enableRepeatEvents(false);
   }

   protected void Q(char var1, int var2) throws IOException {
      if(xG != r.B.t()) {
         if(net.nr.d.C(this.A.T.wg)) {
            this.I(r.B);
         } else {
            super.Q(var1, var2);
         }
      } else {
         if(this.xx) {
            this.xx = false;
            this.xy.u("");
         }

         if(!this.q(var2)) {
            if(this.xy.l(var1, var2)) {
               this.P();
            } else {
               super.Q(var1, var2);
            }
         }
      }

   }

   private void P() {
      j.u var1 = (j.u)this.f;
      var1.K.clear();
      if(this.xy.u().isEmpty()) {
         for(net.n0.y var3 : net.n0.y.V) {
            var3.M(r.B, var1.K);
         }
      } else {
         var1.K.addAll(this.A.T(net.yf.b.G).z(this.xy.u().toLowerCase(Locale.ROOT)));
      }

      this.xS = 0.0F;
      var1.a(0.0F);
   }

   protected void z(int var1, int var2) {
      r var3 = r.m[xG];
      if(var3.B()) {
         net.y.d.E();
         this.O.v(net.c9.b.x(var3.S(), new Object[0]), 8.0F, 6.0F, 4210752);
      }

   }

   protected void C(int var1, int var2, int var3) throws IOException {
      int var4 = var1 - this.Y;
      int var5 = var2 - this.F;

      for(r var9 : r.m) {
         if(this.Z(var9, var4, var5)) {
            return;
         }
      }

      super.C(var1, var2, var3);
   }

   protected void E(int var1, int var2, int var3) {
      int var4 = var1 - this.Y;
      int var5 = var2 - this.F;

      for(r var9 : r.m) {
         if(this.Z(var9, var4, var5)) {
            this.I(var9);
            return;
         }
      }

      super.E(var1, var2, var3);
   }

   private boolean i() {
      return xG != r.D.t() && r.m[xG].F() && ((j.u)this.f).j();
   }

   private void I(r var1) {
      int var2 = xG;
      xG = var1.t();
      j.u var3 = (j.u)this.f;
      this.p.clear();
      var3.K.clear();
      if(var1 == r.T) {
         int var10 = 0;

         while(true) {
            net.nr.f var11 = this.A.O.T(var10);
            if(var11.isEmpty()) {
               int var12 = 0;

               while(true) {
                  ks var7 = new ks(net.nb.j.YZ);
                  var7.c("CustomCreativeLock");
                  String var8 = net.nr.d.y(this.A.T.ww[var10].m());
                  String var9 = net.nr.d.y(this.A.T.x.m());
                  var7.m((new net.cb.h("inventory.hotbarInfo", new Object[]{var9, var8})).l());
                  var3.K.add(var7);
                  ++var12;
               }
            }

            var3.K.addAll(var11);
            ++var10;
         }
      }

      if(var1 != r.B) {
         var1.g(var3.K);
      }

      if(var1 == r.D) {
         v var4 = this.A.sf.aW;
         if(this.xC == null) {
            this.xC = var3.e;
         }

         var3.e = Lists.newArrayList();

         for(int var5 = 0; var5 < var4.e.size(); ++var5) {
            j.w var6 = new j.w((o)var4.e.get(var5), var5);
            var3.e.add(var6);
            var6.Y = -2000;
            var6.S = -2000;
         }

         this.x7 = new o(xc, 0, 173, 112);
         var3.e.add(this.x7);
      } else if(var2 == r.D.t()) {
         var3.e = this.xC;
         this.xC = null;
      }

      if(this.xy != null) {
         if(var1 == r.B) {
            this.xy.l(true);
            this.xy.O(false);
            this.xy.n(true);
            this.xy.u("");
            this.P();
         } else {
            this.xy.l(false);
            this.xy.O(true);
            this.xy.n(false);
         }
      }

      this.xS = 0.0F;
      var3.a(0.0F);
   }

   public void m() throws IOException {
      super.m();
      int var1 = Mouse.getEventDWheel();
      if(this.i()) {
         int var2 = (((j.u)this.f).K.size() + 9 - 1) / 9 - 5;
         var1 = 1;
         var1 = -1;
         this.xS = (float)((double)this.xS - (double)var1 / (double)var2);
         this.xS = net.u.t.T(this.xS, 0.0F, 1.0F);
         ((j.u)this.f).a(this.xS);
      }

   }

   public void v(int var1, int var2, float var3) {
      this.C();
      boolean var4 = Mouse.isButtonDown(0);
      int var5 = this.Y;
      int var6 = this.F;
      int var7 = var5 + 175;
      int var8 = var6 + 18;
      int var9 = var7 + 14;
      int var10 = var8 + 112;
      if(!this.xK && var1 >= var7 && var2 >= var8 && var1 < var9 && var2 < var10) {
         this.x1 = this.i();
      }

      this.x1 = false;
      this.xK = var4;
      if(this.x1) {
         this.xS = ((float)(var2 - var8) - 7.5F) / ((float)(var10 - var8) - 15.0F);
         this.xS = net.u.t.T(this.xS, 0.0F, 1.0F);
         ((j.u)this.f).a(this.xS);
      }

      super.v(var1, var2, var3);

      for(r var14 : r.m) {
         if(this.Y(var14, var1, var2)) {
            break;
         }
      }

      if(this.x7 != null && xG == r.D.t() && this.f(this.x7.Y, this.x7.S, 16, 16, var1, var2)) {
         this.B(net.c9.b.x("inventory.binSlot", new Object[0]), var1, var2);
      }

      net.y.d.T(1.0F, 1.0F, 1.0F, 1.0F);
      net.y.d.i();
      this.X(var1, var2);
   }

   protected void C(ks var1, int var2, int var3) {
      if(xG == r.B.t()) {
         List var4 = var1.G(this.A.sf, this.A.T.p?net.yf.f.ADVANCED:net.yf.f.NORMAL);
         r var5 = var1.Z().V();
         if(var1.Z() == net.nb.j.r) {
            Map var6 = net.c1.y.n(var1);
            if(var6.size() == 1) {
               net.c1.c var7 = (net.c1.c)var6.keySet().iterator().next();

               for(r var11 : r.m) {
                  if(var11.X(var7.a)) {
                     var5 = var11;
                     break;
                  }
               }
            }
         }

         var4.add(1, "" + net.cb.z.BOLD + net.cb.z.BLUE + net.c9.b.x(var5.S(), new Object[0]));

         for(int var12 = 0; var12 < var4.size(); ++var12) {
            var4.set(var12, var1.p().rarityColor + (String)var4.get(var12));
         }

         this.U(var4, var2, var3);
      } else {
         super.C(var1, var2, var3);
      }

   }

   protected void j(float var1, int var2, int var3) {
      net.y.d.T(1.0F, 1.0F, 1.0F, 1.0F);
      u1.A();
      r var4 = r.m[xG];

      for(r var8 : r.m) {
         this.A.n().E(xe);
         if(var8.t() != xG) {
            this.D(var8);
         }
      }

      this.A.n().E(new m_("textures/gui/container/creative_inventory/tab_" + var4.J()));
      this.g(this.Y, this.F, 0, 0, this.s, this.W);
      this.xy.Z();
      net.y.d.T(1.0F, 1.0F, 1.0F, 1.0F);
      int var9 = this.Y + 175;
      int var10 = this.F + 18;
      int var11 = var10 + 112;
      this.A.n().E(xe);
      if(var4.F()) {
         this.g(var9, var10 + (int)((float)(var11 - var10 - 17) * this.xS), 232 + (this.i()?0:12), 0, 12, 15);
      }

      this.D(var4);
      if(var4 == r.D) {
         h.i((float)(this.Y + 88), (float)(this.F + 45), 20, (float)(this.Y + 88 - var2), (float)(this.F + 45 - 30 - var3), this.A.sf);
      }

   }

   protected boolean Z(r var1, int var2, int var3) {
      int var4 = var1.T();
      int var5 = 28 * var4;
      int var6 = 0;
      if(var1.a()) {
         var5 = this.s - 28 * (6 - var4) + 2;
      } else {
         var5 = var5 + var4;
      }

      if(var1.Z()) {
         var6 = var6 - 32;
      } else {
         var6 = var6 + this.W;
      }

      return var2 >= var5 && var2 <= var5 + 28 && var3 >= var6 && var3 <= var6 + 32;
   }

   protected boolean Y(r var1, int var2, int var3) {
      int var4 = var1.T();
      int var5 = 28 * var4;
      int var6 = 0;
      if(var1.a()) {
         var5 = this.s - 28 * (6 - var4) + 2;
      } else {
         var5 = var5 + var4;
      }

      if(var1.Z()) {
         var6 = var6 - 32;
      } else {
         var6 = var6 + this.W;
      }

      if(this.f(var5 + 3, var6 + 3, 23, 27, var2, var3)) {
         this.B(net.c9.b.x(var1.S(), new Object[0]), var2, var3);
         return true;
      } else {
         return false;
      }
   }

   protected void D(r var1) {
      boolean var2 = var1.t() == xG;
      boolean var3 = var1.Z();
      int var4 = var1.T();
      int var5 = var4 * 28;
      int var6 = 0;
      int var7 = this.Y + 28 * var4;
      int var8 = this.F;
      boolean var10000 = true;
      var6 = var6 + 32;
      if(var1.a()) {
         var7 = this.Y + this.s - 28 * (6 - var4);
      } else {
         var7 = var7 + var4;
      }

      var8 = var8 - 28;
      net.y.d.i();
      this.g(var7, var8, var5, var6, 28, 32);
      d = 100.0F;
      this.t.t = 100.0F;
      var7 = var7 + 6;
      var8 = var8 + 8 + 1;
      net.y.d.K();
      net.y.d.F();
      ks var10 = var1.X();
      this.t.M(var10, var7, var8);
      this.t.q(this.O, var10, var7, var8);
      net.y.d.i();
      this.t.t = 0.0F;
      d = 0.0F;
   }

   protected void t(net.z.m var1) throws IOException {
      if(var1.g == 1) {
         this.A.s(new net.n7.c(this, this.A.sf.q()));
      }

   }

   public int E() {
      return xG;
   }

   public static void A(net.nn.j var0, int var1, boolean var2, boolean var3) {
      net.yy.g var4 = var0.sf;
      net.nr.k var5 = var0.O;
      net.nr.f var6 = var5.T(var1);

      for(int var7 = 0; var7 < net.r.i.d(); ++var7) {
         ks var8 = ((ks)var6.get(var7)).s();
         var4.a8.S(var7, var8);
         var0.sE.J(var8, 36 + var7);
      }

      var4.aW.u();
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   static class p extends o {
      public p(z1 var1, int var2, int var3, int var4) {
         super(var1, var2, var3, var4);
      }

      public boolean I(net.r.r var1) {
         int var2 = j.u.C();
         return super.I(var1) && this.T()?this.y().j("CustomCreativeLock") == null:!this.T();
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   public static class u extends v {
      public net.yz.w K = net.yz.w.T();
      private static int s;

      public u(net.r.r var1) {
         net.r.i var10000 = var1.a8;
         byte var3 = 0;
         int var4 = 0;

         while(true) {
            this.U(new j.p(j.xc, var3 * 9 + var4, 9 + var4 * 18, 18 + var3 * 18));
            ++var4;
         }
      }

      public boolean N(net.r.r var1) {
         return true;
      }

      public void a(float var1) {
         int var3 = (this.K.size() + 9 - 1) / 9 - 5;
         g();
         int var4 = (int)((double)(var1 * (float)var3) + 0.5D);
         if(var4 < 0) {
            var4 = 0;
         }

         int var5 = 0;
         int var6 = 0;
         int var7 = var6 + (var5 + var4) * 9;
         if(var7 >= 0 && var7 < this.K.size()) {
            j.xc.S(var6 + var5 * 9, (ks)this.K.get(var7));
         }

         j.xc.S(var6 + var5 * 9, ks.a);
         ++var6;
         ++var5;
      }

      public boolean j() {
         return this.K.size() > 45;
      }

      public ks a(net.r.r var1, int var2) {
         if(var2 >= this.e.size() - 9 && var2 < this.e.size()) {
            o var3 = (o)this.e.get(var2);
            if(var3.T()) {
               var3.e(ks.a);
            }
         }

         return ks.a;
      }

      public boolean g(ks var1, o var2) {
         return var2.S > 90;
      }

      public boolean V(o var1) {
         return var1.M instanceof net.r.i || var1.S > 90 && var1.Y <= 162;
      }

      public static void r(int var0) {
         s = var0;
      }

      public static int g() {
         return s;
      }

      public static int C() {
         int var0 = g();
         return 97;
      }

      private static xn a(xn var0) {
         return var0;
      }

      static {
         if(g() == 0) {
            r(110);
         }

      }
   }

   class w extends o {
      private final o a;

      public w(o var2, int var3) {
         super(var2.M, var3, 0, 0);
         this.a = var2;
      }

      public ks H(net.r.r var1, ks var2) {
         this.a.H(var1, var2);
         return var2;
      }

      public boolean s(ks var1) {
         return this.a.s(var1);
      }

      public ks y() {
         return this.a.y();
      }

      public boolean T() {
         return this.a.T();
      }

      public void e(ks var1) {
         this.a.e(var1);
      }

      public void y() {
         this.a.y();
      }

      public int t() {
         return this.a.t();
      }

      public int v(ks var1) {
         return this.a.v(var1);
      }

      @Nullable
      public String L() {
         return this.a.L();
      }

      public ks h(int var1) {
         return this.a.h(var1);
      }

      public boolean e(z1 var1, int var2) {
         return this.a.e(var1, var2);
      }

      public boolean c() {
         return this.a.c();
      }

      public boolean I(net.r.r var1) {
         return this.a.I(var1);
      }
   }
}
