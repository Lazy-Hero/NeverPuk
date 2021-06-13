package net;

import com.mojang.realmsclient.gui.ChatFormatting;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import net._6;
import net.ba;
import net.d1;
import net.db;
import net.gm;
import net.gn;
import net.mc;
import net.mk;
import net.mr;
import net.mw;
import net.o0;
import net.or;
import net.ox;
import net.uy;
import net.w9;
import net.x7;
import net.xh;
import net.xn;
import net.xs;
import net.zg;
import net.zm;
import net.zn;
import net.c2.h;
import net.c9.b;
import net.m.m;
import net.m.p;
import net.m.r;
import net.n0.k1;
import net.n0.k3;
import net.n0.kq;
import net.n0.ks;
import net.n_.f;
import net.n_.i;
import net.ne.a;
import net.u.j;
import net.y.d;
import net.yz.aq;
import net.yz.k;
import net.z.g;
import net.z.t;
import org.lwjgl.opengl.GL11;

public class si extends mk {
   public static boolean K;
   public static mc s;
   public static mc H;
   public static mc N;
   public static mc O;
   public static mc k;
   public static a d;
   public static _6 Y;
   private final _6 J = new _6();
   public static mc n;
   public static mc F;
   public static mc b;
   public static mc o;
   List P = new ArrayList();
   private double q;

   public si() {
      super("KillAura", or.Combat);
      ArrayList var1 = new ArrayList();
      var1.add("Packet");
      var1.add("Client");
      var1.add("None");
      gn.Q.J.d(new mc("Rotation Mode", this, "Packet", var1));
      ArrayList var2 = new ArrayList();
      var2.add("Astolfo");
      var2.add("Dev");
      gn.Q.J.d(new mc("TargetHud Mode", this, "Astolfo", var2));
      ArrayList var3 = new ArrayList();
      var3.add("Distance");
      var3.add("Health");
      gn.Q.J.d(new mc("TargetSort Mode", this, "Distance", var3));
      ArrayList var4 = new ArrayList();
      var4.add("Wellmore");
      var4.add("Other");
      gn.Q.J.d(new mc("Attack Mode", this, "Wellmore", var4));
      gn.Q.J.d(F = new mc("FOV", this, 360.0D, 0.0D, 360.0D, 1.0D));
      gn.Q.J.d(n = new mc("AttackRange", this, 4.0D, 3.0D, 7.0D, 0.1D));
      gn.Q.J.d(s = new mc("Players", this, true));
      gn.Q.J.d(H = new mc("Mobs", this, false));
      gn.Q.J.d(N = new mc("Invisible", this, false));
      gn.Q.J.d(k = new mc("Walls", this, true));
      gn.Q.J.d(new mc("Weapon Only", this, false));
      gn.Q.J.d(new mc("Using Item Check", this, false));
      gn.Q.J.d(new mc("Shield Breaker", this, false));
      gn.Q.J.d(new mc("Shield Fixer", this, true));
      gn.Q.J.d(O = new mc("Ray-Trace", this, false));
      gn.Q.J.d(o = new mc("Wellmore", this, false));
      gn.Q.J.d(b = new mc("Only Crits", this, false));
      gn.Q.J.d(new mc("Crits Fall Distance", this, 0.08D, 0.08D, 0.5D, 0.01D));
      gn.Q.J.d(new mc("TargetHud", this, true));
      gn.Q.J.d(new mc("TargetHudPositionX", this, 70.0D, -700.0D, 600.0D, 1.0D));
      gn.Q.J.d(new mc("TargetHudPositionY", this, 80.0D, -400.0D, 300.0D, 1.0D));
   }

   public static boolean D() {
      int var0 = 0;

      while(true) {
         p.sf.a8.A(var0);
         if(p.sf.a8.A(var0).Z() instanceof k1) {
            return true;
         }

         ++var0;
      }
   }

   public static boolean A() {
      int var0 = 0;

      while(true) {
         p.sf.a8.A(var0);
         if(p.sf.a8.A(var0).Z() instanceof k3) {
            return true;
         }

         ++var0;
      }
   }

   public static void M(a var0) {
      if(b.Q()) {
         float var10000 = 0.95F;
      } else {
         float var2 = 1.0F;
      }

   }

   public void c() {
      d = null;
      super.c();
   }

   public void H() {
      d = null;
      super.H();
   }

   @mr
   public void o(ox var1) {
      if(p.sf.Hj() && p.sf.o(k.OFF_HAND).Z() instanceof kq && gn.Q.J.S("Shield Fixer").Q()) {
         p.sf.x3.L((net.n2.k)(new m(m.n.RELEASE_USE_ITEM, new j(-0.8D, -0.8D, -0.8D), aq.DOWN)));
      }

   }

   @mr
   public void I(zm var1) {
      if(o.Q() && this.v()) {
         if(d == null) {
            return;
         }

         if(var1.r() instanceof r) {
            var1.H(true);
         }

         if(var1.r() instanceof p) {
            p var2 = (p)var1.r();
            if(var2.L() == p.f.INTERACT || var2.L() == p.f.INTERACT_AT) {
               var1.H(true);
            }
         }
      }

   }

   @mr
   public void x(zg var1) {
      String var2 = gn.Q.J.S("Attack Mode").M();
      if(var2.equalsIgnoreCase("Other")) {
         this.o(var1);
      }

   }

   @mr
   public void V(zn var1) {
      String var2 = gn.Q.J.S("Attack Mode").M();
      if(var2.equalsIgnoreCase("Wellmore")) {
         this.I(var1);
      }

   }

   private void o(zg var1) {
      if(p.sf.P()) {
         gm.z();
         String var2 = gn.Q.J.S("Rotation Mode").M();
         float var3 = var2.equalsIgnoreCase("Packet")?gn.d:p.sf.hN;
         float var4 = var2.equalsIgnoreCase("Packet")?gn.i:p.sf.V;
         this.t(var2 + ", " + o0.T(n.e(), 1));
         d = gm.V();
         if(d == null) {
            return;
         }

         if(!(p.sf.S().Z() instanceof k3) && !(p.sf.S().Z() instanceof k1) && gn.Q.J.S("Weapon Only").Q()) {
            return;
         }

         if(!uy.m(var3, var4, d, (double)n.e()) && gn.Q.J.S("Ray-Trace").Q()) {
            return;
         }

         if(p.sf.HY() && gn.Q.J.S("Using Item Check").Q()) {
            return;
         }

         if(gn.Q.J.S("Shield Breaker").Q()) {
            if(d == null) {
               return;
            }

            if(d.Hj()) {
               K = true;
               if(xs.g() != -1) {
                  if(!D()) {
                     return;
                  }

                  p.sf.a8.r = xs.g();
               }

               if(K && p.sf.S().Z() instanceof k1) {
                  if(this.J.Z(150.0D)) {
                     if(!D()) {
                        return;
                     }

                     ba.S(d, false, false);
                     this.J.B();
                  }

                  K = false;
               }
            } else if(d.L().Z() instanceof kq && xs.z() != -1) {
               p.sf.a8.r = xs.z();
            }
         }
      }

      if(!w9.U()) {
         if(p.sf.hI < gn.Q.J.S("Crits Fall Distance").e() && !p.sf.Fy() && !p.sf.L && b.Q()) {
            return;
         }
      } else if(p.sf.hI != 0.0F && !p.sf.Fy() && !p.sf.L && b.Q()) {
         return;
      }

      M(d);
   }

   private void I(zn var1) {
      if(p.sf.P()) {
         gm.z();
         String var2 = gn.Q.J.S("Rotation Mode").M();
         float var3 = var2.equalsIgnoreCase("Packet")?gn.d:p.sf.hN;
         float var4 = var2.equalsIgnoreCase("Packet")?gn.i:p.sf.V;
         this.t(var2 + ", " + o0.T(n.e(), 1));
         d = gm.V();
         if(d == null) {
            return;
         }

         if(!(p.sf.S().Z() instanceof k3) && !(p.sf.S().Z() instanceof k1) && gn.Q.J.S("Weapon Only").Q()) {
            return;
         }

         if(!uy.m(var3, var4, d, (double)n.e()) && gn.Q.J.S("Ray-Trace").Q()) {
            return;
         }

         if(p.sf.HY() && gn.Q.J.S("Using Item Check").Q()) {
            return;
         }

         if(gn.Q.J.S("Shield Breaker").Q()) {
            if(d == null) {
               return;
            }

            if(d.Hj()) {
               K = true;
               if(xs.g() != -1) {
                  if(!D()) {
                     return;
                  }

                  p.sf.a8.r = xs.g();
               }

               if(K && p.sf.S().Z() instanceof k1) {
                  if(this.J.Z(150.0D)) {
                     if(!D()) {
                        return;
                     }

                     ba.S(d, false, false);
                     this.J.B();
                  }

                  K = false;
               }
            } else if(d.L().Z() instanceof kq && xs.z() != -1) {
               p.sf.a8.r = xs.z();
            }
         }
      }

      if(!w9.U()) {
         if(p.sf.hI < gn.Q.J.S("Crits Fall Distance").e() && !p.sf.Fy() && !p.sf.L && b.Q()) {
            return;
         }
      } else if(p.sf.hI != 0.0F && !p.sf.Fy() && !p.sf.L && b.Q()) {
         return;
      }

      M(d);
   }

   @mr
   public void g(zg var1) {
      String var2 = gn.Q.J.S("Rotation Mode").M();
      if(d != null) {
         if(d.h() > 0.0F) {
            if(!(p.sf.S().Z() instanceof k3) && !(p.sf.S().Z() instanceof k1) && gn.Q.J.S("Weapon Only").Q()) {
               return;
            }

            float[] var3 = uy.a(uy.b(d.i()), true);
            if(var2.equalsIgnoreCase("Packet")) {
               var1.R(var3[0]);
               var1.v(var3[1]);
            } else if(var2.equalsIgnoreCase("Client")) {
               p.sf.hN = var3[0];
               p.sf.V = var3[1];
            }
         }

      }
   }

   @mr
   public void p(db var1) {
      String var2 = gn.Q.J.S("TargetHud Mode").M();
      if(gn.Q.J.S("TargetHud").Q() && d != null && d.h() > 0.0F) {
         if(var2.equalsIgnoreCase("Astolfo")) {
            this.t(var1.x());
         } else if(var2.equalsIgnoreCase("Dev")) {
            this.r(var1.x());
         }
      }

   }

   private void r(t var1) {
      float var3 = (float)var1.u();
      float var4 = (float)var1.v();
      float var5 = var3 / 2.0F - gn.Q.J.S("TargetHudPositionX").e();
      float var6 = var4 / 2.0F + gn.Q.J.S("TargetHudPositionY").e();
      float var7 = var3 / 2.0F - gn.Q.J.S("TargetHudPositionX").e();
      float var8 = var4 / 2.0F + gn.Q.J.S("TargetHudPositionY").e();
      net.ne.j.D();
      double var9 = (double)(d.h() / d.w() * 120.0F);
      var9 = net.u.t.F(var9, 0.0D, 120.0D);
      double var11 = d != null && Float.compare(d.h(), (float)(d instanceof net.r.r?18:10)) < 0 && d.h() > 1.0F?8.0D:0.0D;
      this.q = (double)mw.k((float)var9, (float)this.q, 0L, 0.005D);
      xh.k((double)var5, (double)var6, 145.0D, 50.0D, (new Color(23, 23, 25, 203)).getRGB());
      if(!d.Q().isEmpty()) {
         p.Z.i(gn.Q.j.d(d1.class).v() && d1.u.Q()?"Protected":d.Q(), var5 + 37.0F, var6 + 5.0F, -1);
      }

      d.c();
      d.O(var5, var6, 1.0F);
      d.W(1.5F, 1.5F, 1.5F);
      d.O(-var5 - 14.0F, -var6 + 14.0F, 1.0F);
      p.sO.U("§c❤", var5 + 16.0F, var6 + 10.0F, -1);
      d.Y();
      d.T(1.0F, 1.0F, 1.0F, 1.0F);
      p.K().q(p.sO, d.o(k.OFF_HAND), (int)var5 + 125, (int)var6 + 7);
      p.K().i(d.o(k.OFF_HAND), (int)var5 + 125, (int)var6 + 1);
      ArrayList var13 = new ArrayList();
      int var14 = 0;
      ks var15 = ((net.r.r)d).k(var14);
      var13.add(var15);
      ++var14;
      Iterator var23 = var13.iterator();
      if(var23.hasNext()) {
         var15 = (ks)var23.next();
         net.y.u1.A();
         xh.x(var15, (int)var7 + 36, (int)(var6 + 16.0F));
         var7 = var7 + 16.0F;
      }

      var23 = d.o().iterator();
      if(var23.hasNext()) {
         i var27 = (i)var23.next();
         f var16 = f.Q(x7.v(var27.V()));

         assert var16 != null;

         String var17 = b.x(var16.s(), new Object[0]);
         String var18 = "";
         if(var27.d() == 1) {
            var17 = var17 + " 2";
         }

         if(var27.d() == 2) {
            var17 = var17 + " 3";
         }

         if(var27.d() == 3) {
            var17 = var17 + " 4";
         }

         if(var27.S() < 600 && var27.S() > 300) {
            var18 = var18 + " " + f.U(var27);
         }

         if(var27.S() < 300) {
            var18 = var18 + " " + f.U(var27);
         }

         if(var27.S() > 600) {
            var18 = var18 + " " + f.U(var27);
         }

         d.c();
         d.E();
         p.sO.U(var17 + ": " + ChatFormatting.GRAY + var18, var5 + 1.0F, var8 - 9.0F, var16.t());
         d.T(1.0F, 1.0F, 1.0F, 1.0F);
         d.Y();
         var8 = var8 - 10.0F;
      }

      var23 = p.sf.x3.B().iterator();
      if(var23.hasNext()) {
         net.yp.b var28 = (net.yp.b)var23.next();
         if(p.s8.W((UUID)var28.J().getId()) == d) {
            p.n().E(var28.R());
            g.v((int)var5 + 1, (int)var6 + 1, 8.0F, 8.0F, 8, 8, 34, 34, 64.0F, 64.0F);
            d.z(0);
         }

         GL11.glDisable(3089);
      }

      xh.k((double)(var5 + 18.0F), (double)(var6 + 41.0F), 120.0D, 3.0D, (new Color(20, 221, 32)).darker().darker().darker().getRGB());
      xh.k((double)(var5 + 18.0F), (double)(var6 + 41.0F), this.q + var11, 3.0D, (new Color((new Color(253, 174, 46)).darker().getRGB())).getRGB());
      xh.k((double)(var5 + 18.0F), (double)(var6 + 41.0F), var9, 3.0D, (new Color((new Color(20, 221, 32)).getRGB())).getRGB());
   }

   private void t(t var1) {
      float var2 = (float)var1.u();
      float var3 = (float)var1.v();
      float var4 = var2 / 2.0F - gn.Q.J.S("TargetHudPositionX").e();
      float var5 = var3 / 2.0F + gn.Q.J.S("TargetHudPositionY").e();
      double var6 = (double)(d.h() / d.w() * 120.0F);
      var6 = net.u.t.F(var6, 0.0D, 120.0D);
      double var8 = d != null && d.h() < (float)(d instanceof net.r.r?18:10) && d.h() > 1.0F?8.0D:0.0D;
      this.q = (double)mw.k((float)var6, (float)this.q, 0L, 0.005D);
      xh.k((double)var4, (double)var5, 155.0D, 60.0D, (new Color(20, 20, 20, 200)).getRGB());
      if(!d.Q().isEmpty()) {
         p.sO.U(gn.Q.j.d(d1.class).v() && d1.u.Q()?"Protected":d.Q(), var4 + 31.0F, var5 + 5.0F, -1);
      }

      d.c();
      d.O(var4, var5, 1.0F);
      GL11.glScalef(2.5F, 2.5F, 2.5F);
      d.O(-var4 - 3.0F, -var5 - 2.0F, 1.0F);
      p.sO.U(o0.T(d.h() / 2.0F, 1) + " ❤", var4 + 16.0F, var5 + 10.0F, (new Color(gn.M().getRGB())).getRGB());
      d.Y();
      d.T(1.0F, 1.0F, 1.0F, 1.0F);
      p.K().q(p.sO, d.o(k.OFF_HAND), (int)var4 + 137, (int)var5 + 7);
      p.K().i(d.o(k.OFF_HAND), (int)var4 + 137, (int)var5 + 1);
      h.i(var4 + 16.0F, var5 + 55.0F, 25, d.hN, -d.V, d);
      xh.k((double)(var4 + 30.0F), (double)(var5 + 48.0F), 120.0D, 8.0D, (new Color(gn.M().getRGB())).darker().darker().darker().getRGB());
      xh.k((double)(var4 + 30.0F), (double)(var5 + 48.0F), this.q + var8, 8.0D, (new Color(gn.M().getRGB())).darker().darker().getRGB());
      xh.k((double)(var4 + 30.0F), (double)(var5 + 48.0F), var6, 8.0D, (new Color(gn.M().getRGB())).getRGB());
   }

   private static xn b(xn var0) {
      return var0;
   }
}
