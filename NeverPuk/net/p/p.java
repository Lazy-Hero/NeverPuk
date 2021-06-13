package net.p;

import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import net.xn;
import net.cb.h;
import net.cb.l;
import net.cb.t;
import net.e.e;
import net.nn.j;
import net.p.a;
import net.p.n;
import net.p.s;
import net.p.u;
import net.z.wm;

public class p {
   private static final n y = new p.y();
   private static final n u = new p.g(-1, true);
   private static final n d = new p.g(1, true);
   private static final n F = new p.g(1, false);
   public static final n b = new n() {
      public void X(p var1) {
      }

      public t m() {
         return new l("");
      }

      public void A(float var1, int var2) {
      }

      public boolean C() {
         return false;
      }
   };
   private final a q;
   private final List E = Lists.newArrayList();
   private u l = new s();
   private int T = -1;
   private int N;
   private static boolean A;

   public p(a var1) {
      this.q = var1;
   }

   public n V(int var1) {
      Y();
      int var3 = var1 + this.N * 6;
      return this.N > 0 && var1 == 0?u:(var1 == 7?(var3 < this.l.U().size()?d:F):(var1 == 8?y:(var3 >= 0 && var3 < this.l.U().size()?(n)MoreObjects.firstNonNull(this.l.U().get(var3), b):b)));
   }

   public List H() {
      ArrayList var1 = Lists.newArrayList();
      int var2 = 0;

      while(true) {
         var1.add(this.V(var2));
         ++var2;
      }
   }

   public n R() {
      return this.V(this.T);
   }

   public u i() {
      return this.l;
   }

   public void M(int var1) {
      n var2 = this.V(var1);
      if(var2 != b) {
         if(this.T == var1 && var2.C()) {
            var2.X(this);
         } else {
            this.T = var1;
         }
      }

   }

   public void O() {
      this.q.N(this);
   }

   public int w() {
      return this.T;
   }

   public void J(u var1) {
      this.E.add(this.e());
      this.l = var1;
      this.T = -1;
      this.N = 0;
   }

   public e e() {
      return new e(this.l, this.H(), this.T);
   }

   static {
      I(false);
   }

   public static void I(boolean var0) {
      A = var0;
   }

   public static boolean Y() {
      return A;
   }

   public static boolean D() {
      boolean var0 = Y();
      return true;
   }

   private static xn a(xn var0) {
      return var0;
   }

   static class g implements n {
      private final int S;
      private final boolean A;

      public g(int var1, boolean var2) {
         this.S = var1;
         this.A = var2;
      }

      public void X(p var1) {
         var1.N = var1.N + this.S;
      }

      public t m() {
         return this.S < 0?new h("spectatorMenu.previous_page", new Object[0]):new h("spectatorMenu.next_page", new Object[0]);
      }

      public void A(float var1, int var2) {
         p.D();
         j.b().n().E(wm.f);
         if(this.S < 0) {
            net.z.g.r(0.0F, 0.0F, 144.0F, 0.0F, 16.0F, 16.0F, 256.0F, 256.0F);
         }

         net.z.g.r(0.0F, 0.0F, 160.0F, 0.0F, 16.0F, 16.0F, 256.0F, 256.0F);
      }

      public boolean C() {
         return this.A;
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   static class y implements n {
      private y() {
      }

      public void X(p var1) {
         var1.O();
      }

      public t m() {
         return new h("spectatorMenu.close", new Object[0]);
      }

      public void A(float var1, int var2) {
         j.b().n().E(wm.f);
         net.z.g.r(0.0F, 0.0F, 128.0F, 0.0F, 16.0F, 16.0F, 256.0F, 256.0F);
      }

      public boolean C() {
         return true;
      }
   }
}
