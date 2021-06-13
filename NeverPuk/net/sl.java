package net;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import net.db;
import net.gn;
import net.ij;
import net.mc;
import net.mk;
import net.mr;
import net.or;
import net.pf;
import net.ue;
import net.xh;
import net.xn;
import net.zf;
import net.zg;
import net.m.m;
import net.n2.k;
import net.u.e;
import net.u.j;
import net.y.d;
import net.y9.l;
import net.yw.n;
import net.yz.aq;
import net.z.t;

public class sl extends mk {
   ArrayList w = new ArrayList();
   ArrayList f = new ArrayList();
   public static int l;
   public static int V;
   private final mc s;
   private final mc v;
   private final mc J;
   private final mc b;
   private final mc G;
   private final mc Y;
   private final mc O;
   private final mc h;

   public sl() {
      super("XrayBypass", or.World);
      ArrayList var1 = new ArrayList();
      var1.add("FullBox");
      var1.add("Frame");
      gn.Q.J.R(new mc("BlockOutline Mode", this, "FullBox", var1));
      gn.Q.J.R(this.s = new mc("Diamond", this, true));
      gn.Q.J.R(this.v = new mc("Gold", this, false));
      gn.Q.J.R(this.J = new mc("Iron", this, false));
      gn.Q.J.R(this.b = new mc("Emerald", this, false));
      gn.Q.J.R(this.G = new mc("Redstone", this, false));
      gn.Q.J.R(this.Y = new mc("Lapis", this, false));
      gn.Q.J.R(this.O = new mc("Coal", this, false));
      gn.Q.J.R(this.h = new mc("CheckSpeed", this, 4.0D, 1.0D, 5.0D, 1.0D));
      gn.Q.J.R(new mc("Radius XZ", this, 20.0D, 5.0D, 200.0D, 1.0D));
      gn.Q.J.R(new mc("Radius Y", this, 6.0D, 2.0D, 50.0D, 1.0D));
   }

   public void c() {
      this.w.clear();
      this.f.clear();
      int var1 = gn.Q.J.S("Radius XZ").W();
      int var2 = gn.Q.J.S("Radius Y").W();

      for(j var5 : this.i(var1, var2, var1)) {
         n var6 = pf.Y(var5);
         if(this.y(l.h(var6.Q()))) {
            this.f.add(var5);
         }
      }

      V = this.f.size();
      l = 0;
      super.c();
   }

   public void H() {
      p.o.n();
      super.H();
   }

   @mr
   public void c(zg var1) {
      String var2 = l == V?"Done: " + V:"" + l;
      String var3 = gn.Q.J.S("BlockOutline Mode").M();
      this.t(var3 + ", " + var2);

      for(int var4 = 0; var4 < this.h.W(); ++var4) {
         if(this.f.size() < 1) {
            return;
         }

         j var5 = (j)this.f.remove(0);
         ++l;
         p.d().L((k)(new m(m.n.START_DESTROY_BLOCK, var5, aq.UP)));
      }

   }

   @mr
   public void z(zf var1) {
      if(var1.w() instanceof net.no.sq) {
         net.no.sq var2 = (net.no.sq)var1.w();
         if(this.v(l.h(var2.R().Q()))) {
            this.w.add(var2.r());
         }
      } else if(var1.w() instanceof net.no.ss) {
         net.no.ss var7 = (net.no.ss)var1.w();

         for(net.no.ss var6 : var7.y()) {
            if(this.v(l.h(var6.l().Q()))) {
               this.w.add(var6.C());
            }
         }
      }

   }

   @mr
   public void y(db var1) {
      t var2 = new t(p);
      ij var3 = p.n;
      byte var4 = 125;
      float var5 = (float)var2.u() / 2.0F - (float)var4 / 2.0F;
      float var6 = 5.0F;
      gn.y().l("Done: " + l + " / All: " + V, (double)(var5 + 30.0F), (double)(var6 + (float)var3.f() + 4.0F), -1);
      d.E();
   }

   @mr
   public void R(ue var1) {
      e.T();
      Iterator var3 = this.w.iterator();
      if(var3.hasNext()) {
         j var4 = (j)var3.next();
         n var5 = pf.Y(var4);
         l var6 = var5.Q();
         String var7 = gn.Q.J.S("BlockOutline Mode").M();
         if(var7.equalsIgnoreCase("FullBox")) {
            if(l.h(var6) != 0 && l.h(var6) == 56 && this.s.Q() && l.h(var6) == 56) {
               xh.H(var4, new Color(0, 255, 255, 50), 1.0D, 1.0D);
            }

            if(l.h(var6) != 0 && l.h(var6) == 14 && this.v.Q() && l.h(var6) == 14) {
               xh.H(var4, new Color(255, 215, 0, 100), 1.0D, 1.0D);
            }

            if(l.h(var6) != 0 && l.h(var6) == 15 && this.J.Q() && l.h(var6) == 15) {
               xh.H(var4, new Color(213, 213, 213, 100), 1.0D, 1.0D);
            }

            if(l.h(var6) != 0 && l.h(var6) == 129 && this.b.Q() && l.h(var6) == 129) {
               xh.H(var4, new Color(0, 255, 77, 100), 1.0D, 1.0D);
            }

            if(l.h(var6) != 0 && l.h(var6) == 73 && this.G.Q() && l.h(var6) == 73) {
               xh.H(var4, new Color(255, 0, 0, 100), 1.0D, 1.0D);
            }

            if(l.h(var6) != 0 && l.h(var6) == 16 && this.O.Q() && l.h(var6) == 16) {
               xh.H(var4, new Color(0, 0, 0, 100), 1.0D, 1.0D);
            }

            if(l.h(var6) == 0 || l.h(var6) != 21 || !this.Y.Q() || l.h(var6) != 21) {
               return;
            }

            xh.H(var4, new Color(38, 97, 156, 100), 1.0D, 1.0D);
         }

         if(var7.equalsIgnoreCase("Frame")) {
            if(l.h(var6) != 0 && l.h(var6) == 56 && this.s.Q() && l.h(var6) == 56) {
               xh.B(var4, 0.0D, 255.0D, 255.0D);
            }

            if(l.h(var6) != 0 && l.h(var6) == 14 && this.v.Q() && l.h(var6) == 14) {
               xh.B(var4, 255.0D, 215.0D, 0.0D);
            }

            if(l.h(var6) != 0 && l.h(var6) == 15 && this.J.Q() && l.h(var6) == 15) {
               xh.B(var4, 213.0D, 213.0D, 213.0D);
            }

            if(l.h(var6) != 0 && l.h(var6) == 129 && this.b.Q() && l.h(var6) == 129) {
               xh.B(var4, 0.0D, 255.0D, 77.0D);
            }

            if(l.h(var6) != 0 && l.h(var6) == 73 && this.G.Q() && l.h(var6) == 73) {
               xh.B(var4, 255.0D, 0.0D, 0.0D);
            }

            if(l.h(var6) != 0 && l.h(var6) == 16 && this.O.Q() && l.h(var6) == 16) {
               xh.B(var4, 0.0D, 0.0D, 0.0D);
            }

            if(l.h(var6) != 0 && l.h(var6) == 21 && this.Y.Q() && l.h(var6) == 21) {
               xh.B(var4, 38.0D, 97.0D, 156.0D);
            }
         }
      }

   }

   private boolean y(int var1) {
      boolean var10000 = false;
      var10000 = false;
      var10000 = false;
      var10000 = false;
      var10000 = false;
      var10000 = false;
      var10000 = false;
      if(this.s.Q()) {
         var10000 = true;
      }

      if(this.v.Q()) {
         var10000 = true;
      }

      if(this.J.Q()) {
         var10000 = true;
      }

      if(this.b.Q()) {
         var10000 = true;
      }

      if(this.G.Q()) {
         var10000 = true;
      }

      if(this.O.Q()) {
         var10000 = true;
      }

      if(this.Y.Q()) {
         var10000 = true;
      }

      return false;
   }

   private boolean v(int var1) {
      boolean var10000 = false;
      var10000 = false;
      var10000 = false;
      var10000 = false;
      var10000 = false;
      var10000 = false;
      var10000 = false;
      if(this.s.Q()) {
         var10000 = true;
      }

      if(this.v.Q()) {
         var10000 = true;
      }

      if(this.J.Q()) {
         var10000 = true;
      }

      if(this.b.Q()) {
         var10000 = true;
      }

      if(this.G.Q()) {
         var10000 = true;
      }

      if(this.O.Q()) {
         var10000 = true;
      }

      if(this.Y.Q()) {
         var10000 = true;
      }

      return false;
   }

   private ArrayList i(int var1, int var2, int var3) {
      j var4 = new j(p.sf.b - (double)var1, p.sf.hS - (double)var2, p.sf.hr - (double)var3);
      j var5 = new j(p.sf.b + (double)var1, p.sf.hS + (double)var2, p.sf.hr + (double)var3);
      return pf.l(var4, var5);
   }

   private static xn b(xn var0) {
      return var0;
   }
}
