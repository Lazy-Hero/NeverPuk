package net.c2;

import com.google.common.collect.Sets;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import net.c2.j;
import net.n0.ks;
import net.nl.c;
import net.nl.o;
import net.nl.v;
import net.y.u1;
import net.y.ui;
import net.yz.m_;
import net.z.tu;
import org.lwjgl.input.Keyboard;

public abstract class n extends tu {
   public static final m_ K = new m_("textures/gui/container/inventory.png");
   protected int s = 176;
   protected int W = 166;
   public v f;
   protected int Y;
   protected int F;
   private o R;
   private o J;
   private boolean Z;
   private ks z = ks.a;
   private int b;
   private int w;
   private o o;
   private long Q;
   private ks n = ks.a;
   private o I;
   private long D;
   protected final Set p = Sets.newHashSet();
   protected boolean U;
   private int B;
   private int l;
   private boolean r;
   private int y;
   private long a;
   private o S;
   private int H;
   private boolean T;
   private ks u = ks.a;

   public n(v var1) {
      this.f = var1;
      this.r = true;
   }

   public void L() {
      super.L();
      this.A.sf.aG = this.f;
      this.Y = (q - this.s) / 2;
      this.F = (V - this.W) / 2;
   }

   public void v(int var1, int var2, float var3) {
      int var4 = this.Y;
      int var5 = this.F;
      this.j(var3, var1, var2);
      net.y.d.g();
      u1.m();
      net.y.d.i();
      net.y.d.z();
      super.v(var1, var2, var3);
      u1.A();
      net.y.d.c();
      net.y.d.O((float)var4, (float)var5, 0.0F);
      net.y.d.T(1.0F, 1.0F, 1.0F, 1.0F);
      net.y.d.F();
      this.R = null;
      boolean var10000 = true;
      var10000 = true;
      ui.c(ui.w, 240.0F, 240.0F);
      net.y.d.T(1.0F, 1.0F, 1.0F, 1.0F);

      for(int var8 = 0; var8 < this.f.e.size(); ++var8) {
         o var9 = (o)this.f.e.get(var8);
         if(var9.c()) {
            this.W(var9);
         }

         if(this.o(var9, var1, var2) && var9.c()) {
            this.R = var9;
            net.y.d.i();
            net.y.d.z();
            int var10 = var9.Y;
            int var11 = var9.S;
            net.y.d.q(true, true, true, false);
            this.T(var10, var11, (double)(var10 + 16), (double)(var11 + 16), -2130706433, -2130706433);
            net.y.d.q(true, true, true, true);
            net.y.d.K();
            net.y.d.B();
         }
      }

      u1.m();
      this.z(var1, var2);
      u1.A();
      net.r.i var15 = this.A.sf.a8;
      ks var16 = this.z.B()?var15.j():this.z;
      if(!var16.B()) {
         boolean var17 = true;
         int var19 = this.z.B()?8:16;
         String var12 = null;
         if(!this.z.B() && this.Z) {
            var16 = var16.s();
            var16.u(net.u.t.Y((float)var16.U() / 2.0F));
         } else if(this.U && this.p.size() > 1) {
            var16 = var16.s();
            var16.u(this.y);
            if(var16.B()) {
               var12 = "" + net.cb.z.YELLOW + "0";
            }
         }

         this.c(var16, var1 - var4 - 8, var2 - var5 - var19, var12);
      }

      if(!this.n.B()) {
         float var18 = (float)(net.nn.j.E() - this.Q) / 100.0F;
         if(var18 >= 1.0F) {
            var18 = 1.0F;
            this.n = ks.a;
         }

         int var20 = this.o.Y - this.b;
         int var21 = this.o.S - this.w;
         int var13 = this.b + (int)((float)var20 * var18);
         int var14 = this.w + (int)((float)var21 * var18);
         this.c(this.n, var13, var14, (String)null);
      }

      net.y.d.Y();
      net.y.d.K();
      net.y.d.B();
      u1.B();
   }

   protected void X(int var1, int var2) {
      if(this.A.sf.a8.j().B() && this.R != null && this.R.T()) {
         this.C(this.R.y(), var1, var2);
      }

   }

   private void c(ks var1, int var2, int var3, String var4) {
      net.y.d.O(0.0F, 0.0F, 32.0F);
      d = 200.0F;
      this.t.t = 200.0F;
      this.t.M(var1, var2, var3);
      this.t.G(this.O, var1, var2, var3 - (this.z.B()?0:8), var4);
      d = 0.0F;
      this.t.t = 0.0F;
   }

   protected void z(int var1, int var2) {
   }

   protected abstract void j(float var1, int var2, int var3);

   private void W(o var1) {
      int var2 = var1.Y;
      int var3 = var1.S;
      ks var4 = var1.y();
      boolean var5 = false;
      boolean var6 = var1 == this.J && !this.z.B() && !this.Z;
      ks var7 = this.A.sf.a8.j();
      String var8 = null;
      if(var1 == this.J && !this.z.B() && this.Z && !var4.B()) {
         var4 = var4.s();
         var4.u(var4.U() / 2);
      } else if(this.U && this.p.contains(var1) && !var7.B()) {
         if(this.p.size() == 1) {
            return;
         }

         if(v.n(var1, var7, true) && this.f.V(var1)) {
            var4 = var7.s();
            var5 = true;
            v.P(this.p, this.B, var4, var1.y().B()?0:var1.y().U());
            int var9 = Math.min(var4.j(), var1.v(var4));
            if(var4.U() > var9) {
               var8 = net.cb.z.YELLOW.toString() + var9;
               var4.u(var9);
            }
         } else {
            this.p.remove(var1);
            this.H();
         }
      }

      d = 100.0F;
      this.t.t = 100.0F;
      if(var4.B() && var1.c()) {
         String var13 = var1.L();
         net.n9.v var10 = this.A.p().O(var13);
         net.y.d.i();
         this.A.n().E(net.n9.b.N);
         this.P(var2, var3, var10, 16, 16);
         net.y.d.K();
         var6 = true;
      }

      u(var2, var3, var2 + 16, var3 + 16, -2130706433);
      net.y.d.B();
      this.t.g(this.A.sf, var4, var2, var3);
      this.t.G(this.O, var4, var2, var3, var8);
      this.t.t = 0.0F;
      d = 0.0F;
   }

   private void H() {
      ks var1 = this.A.sf.a8.j();
      if(!var1.B() && this.U) {
         if(this.B == 2) {
            this.y = var1.j();
         } else {
            this.y = var1.U();

            for(o var3 : this.p) {
               ks var4 = var1.s();
               ks var5 = var3.y();
               int var6 = var5.B()?0:var5.U();
               v.P(this.p, this.B, var4, var6);
               int var7 = Math.min(var4.j(), var3.v(var4));
               if(var4.U() > var7) {
                  var4.u(var7);
               }

               this.y -= var4.U() - var6;
            }
         }
      }

   }

   private o A(int var1, int var2) {
      for(int var3 = 0; var3 < this.f.e.size(); ++var3) {
         o var4 = (o)this.f.e.get(var3);
         if(this.o(var4, var1, var2) && var4.c()) {
            return var4;
         }
      }

      return null;
   }

   protected void C(int var1, int var2, int var3) throws IOException {
      super.C(var1, var2, var3);
      boolean var4 = var3 == this.A.T.Z.m() + 100;
      o var5 = this.A(var1, var2);
      long var6 = net.nn.j.E();
      this.T = this.S == var5 && var6 - this.a < 250L && this.H == var3;
      this.r = false;
      if(var3 != 1) {
         ;
      }

      int var8 = this.Y;
      int var9 = this.F;
      boolean var10 = this.Y(var1, var2, var8, var9);
      int var11 = -1;
      var11 = var5.d;
      var11 = -999;
      if(this.A.T.iI && this.A.sf.a8.j().B()) {
         this.A.s((tu)null);
      } else {
         if(this.A.T.iI) {
            if(var5.T()) {
               this.J = var5;
               this.z = ks.a;
               this.Z = var3 == 1;
            } else {
               this.J = null;
            }
         } else if(!this.U) {
            if(this.A.sf.a8.j().B()) {
               if(var3 == this.A.T.Z.m() + 100) {
                  this.Z(var5, var11, var3, c.CLONE);
               } else {
                  boolean var12 = false;
                  c var13 = c.PICKUP;
                  this.u = var5.T()?var5.y().s():ks.a;
                  var13 = c.QUICK_MOVE;
                  this.Z(var5, var11, var3, var13);
               }

               this.r = true;
            } else {
               this.U = true;
               this.l = var3;
               this.p.clear();
               this.B = 0;
            }
         }

         this.S = var5;
         this.a = var6;
         this.H = var3;
      }
   }

   protected boolean Y(int var1, int var2, int var3, int var4) {
      return var1 < var3 || var2 < var4 || var1 >= var3 + this.s || var2 >= var4 + this.W;
   }

   protected void f(int var1, int var2, int var3, long var4) {
      o var6 = this.A(var1, var2);
      ks var7 = this.A.sf.a8.j();
      if(this.J != null && this.A.T.iI) {
         if(var3 == 1) {
            if(this.z.B()) {
               if(var6 != this.J && !this.J.y().B()) {
                  this.z = this.J.y().s();
               }
            } else if(this.z.U() > 1 && v.n(var6, this.z, false)) {
               long var8 = net.nn.j.E();
               if(this.I == var6) {
                  if(var8 - this.D > 500L) {
                     this.Z(this.J, this.J.d, 0, c.PICKUP);
                     this.Z(var6, var6.d, 1, c.PICKUP);
                     this.Z(this.J, this.J.d, 0, c.PICKUP);
                     this.D = var8 + 750L;
                     this.z.H(1);
                  }
               } else {
                  this.I = var6;
                  this.D = var8;
               }
            }
         }
      } else if(this.U && !var7.B() && (var7.U() > this.p.size() || this.B == 2) && v.n(var6, var7, true) && var6.s(var7) && this.f.V(var6)) {
         this.p.add(var6);
         this.H();
      }

   }

   protected void E(int var1, int var2, int var3) {
      o var5 = this.A(var1, var2);
      j.u.C();
      int var6 = this.Y;
      int var7 = this.F;
      boolean var8 = this.Y(var1, var2, var6, var7);
      int var9 = -1;
      if(var5 != null) {
         var9 = var5.d;
      }

      if(var8) {
         var9 = -999;
      }

      if(this.T && var3 == 0 && this.f.g(ks.a, var5)) {
         label130: {
            if(s()) {
               if(this.u.B()) {
                  break label130;
               }

               Iterator var10 = this.f.e.iterator();
               if(var10.hasNext()) {
                  o var11 = (o)var10.next();
                  if(var11 != null && var11.I(this.A.sf) && var11.T() && var11.M == var5.M && v.n(var11, this.u, true)) {
                     this.Z(var11, var11.d, var3, c.QUICK_MOVE);
                  }
               }
            }

            this.Z(var5, var9, var3, c.PICKUP_ALL);
         }

         this.T = false;
         this.a = 0L;
      }

      if(this.U && this.l != var3) {
         this.U = false;
         this.p.clear();
         this.r = true;
      } else if(this.r) {
         this.r = false;
      } else {
         label414: {
            if(this.J != null && this.A.T.iI) {
               if(var3 != 0 && var3 != 1) {
                  break label414;
               }

               if(this.z.B() && var5 != this.J) {
                  this.z = this.J.y();
               }

               v.n(var5, this.z, false);
               if(!this.z.B()) {
                  this.b = var1 - var6;
                  this.w = var2 - var7;
                  this.o = this.J;
                  this.n = this.z;
                  this.Q = net.nn.j.E();
               }

               this.z = ks.a;
               this.J = null;
            }

            if(this.U && !this.p.isEmpty()) {
               this.Z((o)null, -999, v.V(0, this.B), c.QUICK_CRAFT);
               Iterator var12 = this.p.iterator();
               if(var12.hasNext()) {
                  o var13 = (o)var12.next();
                  this.Z(var13, var13.d, v.V(1, this.B), c.QUICK_CRAFT);
               }

               this.Z((o)null, -999, v.V(2, this.B), c.QUICK_CRAFT);
            }

            if(!this.A.sf.a8.j().B()) {
               if(var3 == this.A.T.Z.m() + 100) {
                  this.Z(var5, var9, var3, c.CLONE);
               }

               if(!Keyboard.isKeyDown(42) && !Keyboard.isKeyDown(54)) {
                  boolean var14 = false;
               } else {
                  boolean var10000 = true;
               }

               this.u = var5 != null && var5.T()?var5.y().s():ks.a;
               this.Z(var5, var9, var3, c.QUICK_MOVE);
            }
         }

         if(this.A.sf.a8.j().B()) {
            this.a = 0L;
         }

         this.U = false;
      }
   }

   private boolean o(o var1, int var2, int var3) {
      return this.f(var1.Y, var1.S, 16, 16, var2, var3);
   }

   protected boolean f(int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = this.Y;
      int var8 = this.F;
      var5 = var5 - var7;
      var6 = var6 - var8;
      return var5 >= var1 - 1 && var5 < var1 + var3 + 1 && var6 >= var2 - 1 && var6 < var2 + var4 + 1;
   }

   protected void Z(o var1, int var2, int var3, c var4) {
      var2 = var1.d;
      this.A.sE.K(this.f.S, var2, var3, var4, this.A.sf);
   }

   protected void Q(char var1, int var2) throws IOException {
      if(var2 == 1 || var2 == this.A.T.iH.m()) {
         this.A.sf.x();
      }

      this.q(var2);
      if(this.R != null && this.R.T()) {
         if(var2 == this.A.T.Z.m()) {
            this.Z(this.R, this.R.d, 0, c.CLONE);
         } else if(var2 == this.A.T.wX.m()) {
            this.Z(this.R, this.R.d, T()?1:0, c.THROW);
         }
      }

   }

   protected boolean q(int var1) {
      if(this.A.sf.a8.j().B() && this.R != null) {
         int var2;
         for(var2 = 0; var1 != this.A.T.ww[var2].m(); ++var2) {
            ;
         }

         this.Z(this.R, this.R.d, var2, c.SWAP);
         return true;
      } else {
         return false;
      }
   }

   public void x() {
      if(this.A.sf != null) {
         this.f.K(this.A.sf);
      }

   }

   public boolean b() {
      return false;
   }

   public void K() {
      super.K();
      if(!this.A.sf.P() || this.A.sf.Z) {
         this.A.sf.x();
      }

   }

   private static Exception b(Exception var0) {
      return var0;
   }
}
