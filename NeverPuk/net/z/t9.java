package net.z;

import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import java.awt.Color;
import java.io.IOException;
import java.util.List;
import net.d1;
import net.dr;
import net.gn;
import net.m4;
import net.xh;
import net.yz.m_;
import net.z.a;
import net.z.g;
import net.z.k;
import net.z.m;
import net.z.t;
import net.z.tq;
import net.z.tu;
import net.z.w4;
import net.z.wj;
import net.z.wx;
import net.z.wz;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Keyboard;

public class t9 extends tu {
   private static final Logger T = LogManager.getLogger();
   private final net.yp.q J = new net.yp.q();
   public static dr f = new dr();
   private final tu I;
   private a U;
   private net.cp.t a;
   private m z;
   private m W;
   private m F;
   private boolean w;
   private boolean s;
   private boolean R;
   private boolean n;
   private String S;
   private net.cp.d u;
   private net.yp.p o;
   private net.yp.p Z;
   private boolean b;

   public t9(tu var1) {
      this.I = var1;
   }

   public void L() {
      Keyboard.enableRepeatEvents(true);
      this.m.clear();
      if(this.b) {
         this.U.C(q, V, 32, V - 64);
      } else {
         this.b = true;
         this.a = new net.cp.t(this.A);
         this.a.C();
         this.o = new net.yp.p();
         this.Z = new net.yp.p(this.o);
         this.Z.start();
         this.U = new a(this, this.A, q, V, 32, V - 64, 36);
         this.U.E(this.a);
      }

      this.c();
   }

   public void m() throws IOException {
      super.m();
      this.U.q();
   }

   public void c() {
      this.z = this.x(new m(7, q / 2 - 154, V - 28, 70, 20, net.c9.b.x("selectServer.edit", new Object[0])));
      this.F = this.x(new m(2, q / 2 - 74, V - 28, 70, 20, net.c9.b.x("selectServer.delete", new Object[0])));
      this.W = this.x(new m(1, q / 2 - 154, V - 52, 100, 20, net.c9.b.x("selectServer.select", new Object[0])));
      this.m.add(new m(4, q / 2 - 50, V - 52, 100, 20, net.c9.b.x("selectServer.direct", new Object[0])));
      this.m.add(new m(3, q / 2 + 4 + 50, V - 52, 100, 20, net.c9.b.x("selectServer.add", new Object[0])));
      this.m.add(new m(8, q / 2 + 4, V - 28, 70, 20, net.c9.b.x("selectServer.refresh", new Object[0])));
      this.m.add(new m(0, q / 2 + 4 + 76, V - 28, 75, 20, net.c9.b.x("gui.cancel", new Object[0])));
      this.M(this.U.w());
   }

   public void K() {
      super.K();
      if(this.o.e()) {
         List var1 = this.o.O();
         this.o.V();
         this.U.W(var1);
      }

      this.J.h();
   }

   public void x() {
      Keyboard.enableRepeatEvents(false);
      if(this.Z != null) {
         this.Z.interrupt();
         this.Z = null;
      }

      this.J.I();
   }

   protected void t(m var1) throws IOException {
      if(var1.O) {
         net.z.z var2 = this.U.w() < 0?null:this.U.m(this.U.w());
         if(var1.g == 2 && var2 instanceof w4) {
            String var9 = ((w4)var2).S().U;
            this.w = true;
            String var4 = net.c9.b.x("selectServer.deleteQuestion", new Object[0]);
            String var5 = "\'" + var9 + "\' " + net.c9.b.x("selectServer.deleteWarning", new Object[0]);
            String var6 = net.c9.b.x("selectServer.deleteButton", new Object[0]);
            String var7 = net.c9.b.x("gui.cancel", new Object[0]);
            wz var8 = new wz(this, var4, var5, var6, var7, this.U.w());
            this.A.s(var8);
         } else if(var1.g == 1) {
            this.v();
         } else if(var1.g == 4) {
            this.n = true;
            this.u = new net.cp.d(net.c9.b.x("selectServer.defaultName", new Object[0]), "", false);
            this.A.s(new wj(this, this.u));
         } else if(var1.g == 3) {
            this.s = true;
            this.u = new net.cp.d(net.c9.b.x("selectServer.defaultName", new Object[0]), "", false);
            this.A.s(new tq(this, this.u));
         } else if(var1.g == 7 && var2 instanceof w4) {
            this.R = true;
            net.cp.d var3 = ((w4)var2).S();
            this.u = new net.cp.d(var3.U, var3.C, false);
            this.u.I(var3);
            this.A.s(new tq(this, this.u));
         } else if(var1.g == 0) {
            this.A.s(this.I);
         } else if(var1.g == 8) {
            this.X();
         }
      }

   }

   private void X() {
      this.A.s(new t9(this.I));
   }

   public void y(boolean var1, int var2) {
      net.z.z var3 = this.U.w() < 0?null:this.U.m(this.U.w());
      if(this.w) {
         this.w = false;
         if(var3 instanceof w4) {
            this.a.l(this.U.w());
            this.a.h();
            this.U.n(-1);
            this.U.E(this.a);
         }

         this.A.s(this);
      } else if(this.n) {
         this.n = false;
         this.i(this.u);
      } else if(this.s) {
         this.s = false;
         this.a.f(this.u);
         this.a.h();
         this.U.n(-1);
         this.U.E(this.a);
         this.A.s(this);
      } else if(this.R) {
         this.R = false;
         if(var3 instanceof w4) {
            net.cp.d var4 = ((w4)var3).S();
            var4.U = this.u.U;
            var4.C = this.u.C;
            var4.I(this.u);
            this.a.h();
            this.U.E(this.a);
         }

         this.A.s(this);
      }

   }

   protected void Q(char var1, int var2) throws IOException {
      g.C();
      int var4 = this.U.w();
      Object var5 = null;
      if(var2 == 63) {
         this.X();
      }

      if(var4 >= 0) {
         if(var2 == 200) {
            if(s()) {
               if(var4 <= 0 || !(var5 instanceof w4)) {
                  return;
               }

               this.a.y(var4, var4 - 1);
               this.M(this.U.w() - 1);
               this.U.O(-this.U.W());
               this.U.E(this.a);
            }

            if(var4 > 0) {
               this.M(this.U.w() - 1);
               this.U.O(-this.U.W());
               if(!(this.U.m(this.U.w()) instanceof wx)) {
                  return;
               }

               if(this.U.w() > 0) {
                  this.M(this.U.V() - 1);
                  this.U.O(-this.U.W());
               }

               this.M(-1);
            }

            this.M(-1);
         }

         if(var2 == 208) {
            if(s()) {
               if(var4 >= this.a.u() - 1) {
                  return;
               }

               this.a.y(var4, var4 + 1);
               this.M(var4 + 1);
               this.U.O(this.U.W());
               this.U.E(this.a);
            }

            if(var4 < this.U.V()) {
               this.M(this.U.w() + 1);
               this.U.O(this.U.W());
               if(!(this.U.m(this.U.w()) instanceof wx)) {
                  return;
               }

               if(this.U.w() < this.U.V() - 1) {
                  this.M(this.U.V() + 1);
                  this.U.O(this.U.W());
               }

               this.M(-1);
            }

            this.M(-1);
         }

         if(var2 != 28 && var2 != 156) {
            super.Q(var1, var2);
         }

         this.t((m)this.m.get(2));
      }

      super.Q(var1, var2);
   }

   public void v(int var1, int var2, float var3) {
      this.S = null;
      new t(this.A);
      this.U.f(var1, var2, var3);
      xh.T(new m_("neverhook/skeet.png"), 1.0F, 1.0F, 958.0F, 1.0F, Color.white);
      this.A.x.I(net.c9.b.x("multiplayer.title", new Object[0]), (float)q / 2.0F, 14.0F, 16777215);
      this.A.x.i("Session Name: §a" + (gn.Q.j.d(d1.class).v()?"Protected":this.A.L().w()), 3.0F, 7.0F, 16777215);
      switch(m4.R()) {
      case 0:
         this.A.x.i("Os: §aLinux", 3.0F, 16.0F, -1);
         break;
      case 1:
         this.A.x.i("Os: §aSolaris", 3.0F, 16.0F, -1);
         break;
      case 2:
         this.A.x.i("Os: §aWindows", 3.0F, 16.0F, -1);
         break;
      case 3:
         this.A.x.i("Os: §aMacOs", 3.0F, 16.0F, -1);
      }

      f.C((float)var1, (float)var2);
      super.v(var1, var2, var3);
      if(this.S != null) {
         this.U(Lists.newArrayList(Splitter.on("\n").split(this.S)), var1, var2);
      }

   }

   public void v() {
      net.z.z var1 = this.U.w() < 0?null:this.U.m(this.U.w());
      if(var1 instanceof w4) {
         this.i(((w4)var1).S());
      } else if(var1 instanceof k) {
         net.yp.o var2 = ((k)var1).k();
         this.i(new net.cp.d(var2.Z(), var2.o(), true));
      }

   }

   private void i(net.cp.d var1) {
      this.A.s(new net.cp.e(this, this.A, var1));
   }

   public void M(int var1) {
      this.U.n(var1);
      Object var2 = null;
      this.W.O = false;
      this.z.O = false;
      this.F.O = false;
      if(!(var2 instanceof wx)) {
         this.W.O = true;
         if(var2 instanceof w4) {
            this.z.O = true;
            this.F.O = true;
         }
      }

   }

   public net.yp.q N() {
      return this.J;
   }

   public void r(String var1) {
      this.S = var1;
   }

   protected void C(int var1, int var2, int var3) throws IOException {
      super.C(var1, var2, var3);
      this.U.x(var1, var2, var3);
   }

   protected void E(int var1, int var2, int var3) {
      super.E(var1, var2, var3);
      this.U.U(var1, var2, var3);
   }

   public net.cp.t N() {
      return this.a;
   }

   public boolean Z(w4 var1, int var2) {
      return true;
   }

   public boolean G(w4 var1, int var2) {
      return var2 < this.a.u() - 1;
   }

   public void W(w4 var1, int var2, boolean var3) {
      byte var4 = 0;
      this.a.y(var2, var4);
      if(this.U.w() == var2) {
         this.M(var4);
      }

      this.U.E(this.a);
   }

   public void x(w4 var1, int var2, boolean var3) {
      int var4 = this.a.u() - 1;
      this.a.y(var2, var4);
      if(this.U.w() == var2) {
         this.M(var4);
      }

      this.U.E(this.a);
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
