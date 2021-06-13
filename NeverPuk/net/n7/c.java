package net.n7;

import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import net.xn;
import net.c9.b;
import net.m.a;
import net.n0.ks;
import net.ne.v;
import net.ne.y;
import net.nn.j;
import net.u.d;
import net.v.f;
import net.v.q;
import net.v.u;
import net.y.p;
import net.y.r;
import net.y.u1;
import net.y8.x;
import net.z.m;
import net.z.n;
import net.z.tu;
import org.lwjgl.input.Mouse;

public class c extends tu implements n {
   protected tu R;
   protected String T = "Select world";
   private c.i l;
   private c.l a;
   private c.e B;
   private c.k o;
   private final u w;
   private net.z.h W;
   private boolean p = true;

   public c(tu var1, u var2) {
      this.R = var1;
      this.w = var2;
   }

   public void L() {
      this.T = b.x("gui.stats", new Object[0]);
      this.p = true;
      this.A.d().L((net.n2.k)(new a(a.g.REQUEST_STATS)));
   }

   public void m() throws IOException {
      super.m();
      if(this.W != null) {
         this.W.q();
      }

   }

   public void v() {
      this.l = new c.i(this.A);
      this.l.A(1, 1);
      this.a = new c.l(this.A);
      this.a.A(1, 1);
      this.B = new c.e(this.A);
      this.B.A(1, 1);
      this.o = new c.k(this.A);
      this.o.A(1, 1);
   }

   public void o() {
      y.lY();
      this.m.add(new m(0, q / 2 + 4, V - 28, 150, 20, b.x("gui.done", new Object[0])));
      this.m.add(new m(1, q / 2 - 160, V - 52, 80, 20, b.x("stat.generalButton", new Object[0])));
      m var2 = this.x(new m(2, q / 2 - 80, V - 52, 80, 20, b.x("stat.blocksButton", new Object[0])));
      m var3 = this.x(new m(3, q / 2, V - 52, 80, 20, b.x("stat.itemsButton", new Object[0])));
      m var4 = this.x(new m(4, q / 2 + 80, V - 52, 80, 20, b.x("stat.mobsButton", new Object[0])));
      if(this.B.V() == 0) {
         var2.O = false;
      }

      if(this.a.V() == 0) {
         var3.O = false;
      }

      if(this.o.V() == 0) {
         var4.O = false;
      }

      if(d.y() == null) {
         y.a(false);
      }

   }

   protected void t(m var1) throws IOException {
      if(var1.O) {
         if(var1.g == 0) {
            this.A.s(this.R);
         } else if(var1.g == 1) {
            this.W = this.l;
         } else if(var1.g == 3) {
            this.W = this.a;
         } else if(var1.g == 2) {
            this.W = this.B;
         } else if(var1.g == 4) {
            this.W = this.o;
         } else {
            this.W.L(var1);
         }
      }

   }

   public void v(int var1, int var2, float var3) {
      boolean var4 = y.l0();
      if(this.p) {
         this.C();
         this.d(this.O, b.x("multiplayer.downloadingStats", new Object[0]), q / 2, V / 2, 16777215);
         this.d(this.O, f[(int)(j.E() / 150L % (long)f.length)], q / 2, V / 2 + this.O.R * 2, 16777215);
      }

      this.W.Z(var1, var2, var3);
      this.d(this.O, this.T, q / 2, 20, 16777215);
      super.v(var1, var2, var3);
   }

   public void T() {
      if(this.p) {
         this.v();
         this.o();
         this.W = this.l;
         this.p = false;
      }

   }

   public boolean b() {
      return !this.p;
   }

   private void o(int var1, int var2, net.n0.y var3) {
      this.Q(var1 + 1, var2 + 1);
      net.y.d.F();
      u1.A();
      this.t.i(var3.m(), var1 + 2, var2 + 2);
      u1.m();
      net.y.d.g();
   }

   private void Q(int var1, int var2) {
      this.I(var1, var2, 0, 0);
   }

   private void I(int var1, int var2, int var3, int var4) {
      net.y.d.T(1.0F, 1.0F, 1.0F, 1.0F);
      this.A.n().E(G);
      float var10000 = 0.0078125F;
      var10000 = 0.0078125F;
      boolean var12 = true;
      var12 = true;
      r var9 = r.f();
      p var10 = var9.k();
      var10.m(7, x.H);
      var10.H((double)(var1 + 0), (double)(var2 + 18), (double)d).Y((double)((float)(var3 + 0) * 0.0078125F), (double)((float)(var4 + 18) * 0.0078125F)).W();
      var10.H((double)(var1 + 18), (double)(var2 + 18), (double)d).Y((double)((float)(var3 + 18) * 0.0078125F), (double)((float)(var4 + 18) * 0.0078125F)).W();
      var10.H((double)(var1 + 18), (double)(var2 + 0), (double)d).Y((double)((float)(var3 + 18) * 0.0078125F), (double)((float)(var4 + 0) * 0.0078125F)).W();
      var10.H((double)(var1 + 0), (double)(var2 + 0), (double)d).Y((double)((float)(var3 + 0) * 0.0078125F), (double)((float)(var4 + 0) * 0.0078125F)).W();
      var9.p();
   }

   // $FF: synthetic method
   static net.z.r access$400(c var0) {
      return var0.O;
   }

   // $FF: synthetic method
   static net.z.r access$500(c var0) {
      return var0.O;
   }

   // $FF: synthetic method
   static net.z.r access$600(c var0) {
      return var0.O;
   }

   // $FF: synthetic method
   static net.z.r access$700(c var0) {
      return var0.O;
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   class e extends c.h {
      public e(j var2) {
         super(var2);
         this.h = Lists.newArrayList();

         for(f var4 : q.y) {
            boolean var5 = false;
            net.n0.y var6 = var4.m();
            if(c.this.w.H(var4) > 0) {
               var5 = true;
            } else if(q.H(var6) != null && c.this.w.H(q.H(var6)) > 0) {
               var5 = true;
            } else if(q.W(var6) != null && c.this.w.H(q.W(var6)) > 0) {
               var5 = true;
            } else if(q.y(var6) != null && c.this.w.H(q.y(var6)) > 0) {
               var5 = true;
            } else if(q.R(var6) != null && c.this.w.H(q.R(var6)) > 0) {
               var5 = true;
            }

            this.h.add(var4);
         }

         this.I = new Comparator() {
            public int n(f var1, f var2) {
               y.l0();
               net.n0.y var4 = var1.m();
               net.n0.y var5 = var2.m();
               net.v.n var6 = null;
               net.v.n var7 = null;
               if(e.this.F == 2) {
                  var6 = q.i(net.y9.l.F(var4));
                  var7 = q.i(net.y9.l.F(var5));
               } else if(e.this.F == 0) {
                  var6 = q.W(var4);
                  var7 = q.W(var5);
               } else if(e.this.F == 1) {
                  var6 = q.H(var4);
                  var7 = q.H(var5);
               } else if(e.this.F == 3) {
                  var6 = q.y(var4);
                  var7 = q.y(var5);
               } else if(e.this.F == 4) {
                  var6 = q.R(var4);
                  var7 = q.R(var5);
               }

               if(var6 != null || var7 != null) {
                  if(var6 == null) {
                     return 1;
                  }

                  if(var7 == null) {
                     return -1;
                  }

                  int var8 = c.this.w.H(var6);
                  int var9 = c.this.w.H(var7);
                  if(var8 != var9) {
                     return (var8 - var9) * e.this.p;
                  }
               }

               return net.n0.y.h(var4) - net.n0.y.h(var5);
            }

            private static xn a(xn var0) {
               return var0;
            }
         };
      }

      protected void A(int var1, int var2, r var3) {
         y.l0();
         super.A(var1, var2, var3);
         if(this.Y == 0) {
            c.this.I(var1 + 115 - 18 + 1, var2 + 1 + 1, 18, 18);
         }

         c.this.I(var1 + 115 - 18, var2 + 1, 18, 18);
         if(this.Y == 1) {
            c.this.I(var1 + 165 - 18 + 1, var2 + 1 + 1, 36, 18);
         }

         c.this.I(var1 + 165 - 18, var2 + 1, 36, 18);
         if(this.Y == 2) {
            c.this.I(var1 + 215 - 18 + 1, var2 + 1 + 1, 54, 18);
         }

         c.this.I(var1 + 215 - 18, var2 + 1, 54, 18);
         if(this.Y == 3) {
            c.this.I(var1 + 265 - 18 + 1, var2 + 1 + 1, 90, 18);
         }

         c.this.I(var1 + 265 - 18, var2 + 1, 90, 18);
         if(this.Y == 4) {
            c.this.I(var1 + 315 - 18 + 1, var2 + 1 + 1, 108, 18);
         }

         c.this.I(var1 + 315 - 18, var2 + 1, 108, 18);
      }

      protected void x(int var1, int var2, int var3, int var4, int var5, int var6, float var7) {
         f var8 = this.o(var1);
         net.n0.y var9 = var8.m();
         c.this.o(var2 + 40, var3, var9);
         this.J(q.W(var9), var2 + 115, var3, var1 % 2 == 0);
         this.J(q.H(var9), var2 + 165, var3, var1 % 2 == 0);
         this.J(var8, var2 + 215, var3, var1 % 2 == 0);
         this.J(q.y(var9), var2 + 265, var3, var1 % 2 == 0);
         this.J(q.R(var9), var2 + 315, var3, var1 % 2 == 0);
      }

      protected String P(int var1) {
         return "stat.crafted";
      }

      private static xn b(xn var0) {
         return var0;
      }
   }

   abstract class h extends net.z.h {
      protected int Y = -1;
      protected List h;
      protected Comparator I;
      protected int F = -1;
      protected int p;

      protected h(j var2) {
         super(var2, tu.q, tu.V, 32, tu.V - 64, 20);
         this.S(false);
         this.y(true, 20);
      }

      protected void E(int var1, boolean var2, int var3, int var4) {
      }

      protected boolean z(int var1) {
         return false;
      }

      public int C() {
         return 375;
      }

      protected int I() {
         return this.x / 2 + 140;
      }

      protected void x() {
         c.this.C();
      }

      protected void A(int var1, int var2, r var3) {
         boolean var4 = y.l0();
         if(!Mouse.isButtonDown(0)) {
            this.Y = -1;
         }

         if(this.Y == 0) {
            c.this.I(var1 + 115 - 18, var2 + 1, 0, 0);
         }

         c.this.I(var1 + 115 - 18, var2 + 1, 0, 18);
         if(this.Y == 1) {
            c.this.I(var1 + 165 - 18, var2 + 1, 0, 0);
         }

         c.this.I(var1 + 165 - 18, var2 + 1, 0, 18);
         if(this.Y == 2) {
            c.this.I(var1 + 215 - 18, var2 + 1, 0, 0);
         }

         c.this.I(var1 + 215 - 18, var2 + 1, 0, 18);
         if(this.Y == 3) {
            c.this.I(var1 + 265 - 18, var2 + 1, 0, 0);
         }

         c.this.I(var1 + 265 - 18, var2 + 1, 0, 18);
         if(this.Y == 4) {
            c.this.I(var1 + 315 - 18, var2 + 1, 0, 0);
         }

         c.this.I(var1 + 315 - 18, var2 + 1, 0, 18);
         if(this.F != -1) {
            short var5 = 79;
            byte var6 = 18;
            if(this.F == 1) {
               var5 = 129;
            }

            if(this.F == 2) {
               var5 = 179;
            }

            if(this.F == 3) {
               var5 = 229;
            }

            if(this.F == 4) {
               var5 = 279;
            }

            if(this.p == 1) {
               var6 = 36;
            }

            c.this.I(var1 + var5, var2 + 1, var6, 0);
         }

      }

      protected void b(int var1, int var2) {
         this.Y = -1;
         if(var1 >= 79 && var1 < 115) {
            this.Y = 0;
         } else if(var1 >= 129 && var1 < 165) {
            this.Y = 1;
         } else if(var1 >= 179 && var1 < 215) {
            this.Y = 2;
         } else if(var1 >= 229 && var1 < 265) {
            this.Y = 3;
         } else if(var1 >= 279 && var1 < 315) {
            this.Y = 4;
         }

         if(this.Y >= 0) {
            this.C(this.Y);
            this.s.n().g((net.h.d)net.h.a.v(net.nb.l.Ku, 1.0F));
         }

      }

      protected final int V() {
         return this.h.size();
      }

      protected final f o(int var1) {
         return (f)this.h.get(var1);
      }

      protected abstract String P(int var1);

      protected void J(net.v.n var1, int var2, int var3, boolean var4) {
         String var5 = var1.t(c.this.w.H(var1));
         c.this.n(c.this.O, var5, var2 - c.this.O.r(var5), var3 + 5, 16777215);
      }

      protected void M(int var1, int var2) {
         if(var2 >= this.a && var2 <= this.G) {
            int var3 = this.p(var1, var2);
            int var4 = (this.x - this.C()) / 2;
            if(var1 < var4 + 40 || var1 > var4 + 40 + 20) {
               return;
            }

            f var5 = this.o(var3);
            this.v(var5, var1, var2);
         }

      }

      protected void v(f var1, int var2, int var3) {
         net.n0.y var4 = var1.m();
         ks var5 = new ks(var4);
         String var6 = var5.e();
         String var7 = ("" + b.x(var6 + ".name", new Object[0])).trim();
         if(!var7.isEmpty()) {
            int var8 = var2 + 12;
            int var9 = var3 - 12;
            int var10 = c.this.O.r(var7);
            c.this.T(var8 - 3, var9 - 3, (double)(var8 + var10 + 3), (double)(var9 + 8 + 3), -1073741824, -1073741824);
            c.this.O.U(var7, (float)var8, (float)var9, -1);
         }

      }

      protected void C(int var1) {
         if(var1 != this.F) {
            this.F = var1;
            this.p = -1;
         } else if(this.p == -1) {
            this.p = 1;
         } else {
            this.F = -1;
            this.p = 0;
         }

         Collections.sort(this.h, this.I);
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   class i extends net.z.h {
      public i(j var2) {
         super(var2, tu.q, tu.V, 32, tu.V - 64, 10);
         this.S(false);
      }

      protected int V() {
         return q.L.size();
      }

      protected void E(int var1, boolean var2, int var3, int var4) {
      }

      protected boolean z(int var1) {
         return false;
      }

      protected int X() {
         return this.V() * 10;
      }

      protected void x() {
         c.this.C();
      }

      protected void x(int var1, int var2, int var3, int var4, int var5, int var6, float var7) {
         y.l0();
         net.v.n var9 = (net.v.n)q.L.get(var1);
         c.this.n(c.this.O, var9.q().l(), var2 + 2, var3 + 1, var1 % 2 == 0?16777215:9474192);
         String var10 = var9.t(c.this.w.H(var9));
         c.this.n(c.this.O, var10, var2 + 2 + 213 - c.this.O.r(var10), var3 + 1, var1 % 2 == 0?16777215:9474192);
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   class k extends net.z.h {
      private final List l = Lists.newArrayList();

      public k(j var2) {
         super(var2, tu.q, tu.V, 32, tu.V - 64, c.this.O.R * 4);
         this.S(false);

         for(v.m var4 : v.V.values()) {
            if(c.this.w.H(var4.q) > 0 || c.this.w.H(var4.o) > 0) {
               this.l.add(var4);
            }
         }

      }

      protected int V() {
         return this.l.size();
      }

      protected void E(int var1, boolean var2, int var3, int var4) {
      }

      protected boolean z(int var1) {
         return false;
      }

      protected int X() {
         return this.V() * c.this.O.R * 4;
      }

      protected void x() {
         c.this.C();
      }

      protected void x(int var1, int var2, int var3, int var4, int var5, int var6, float var7) {
         v.m var9 = (v.m)this.l.get(var1);
         String var10 = b.x("entity." + v.L(var9.g) + ".name", new Object[0]);
         int var11 = c.this.w.H(var9.q);
         y.lY();
         int var12 = c.this.w.H(var9.o);
         String var13 = b.x("stat.entityKills", new Object[]{Integer.valueOf(var11), var10});
         String var14 = b.x("stat.entityKilledBy", new Object[]{var10, Integer.valueOf(var12)});
         if(var11 == 0) {
            var13 = b.x("stat.entityKills.none", new Object[]{var10});
         }

         if(var12 == 0) {
            var14 = b.x("stat.entityKilledBy.none", new Object[]{var10});
         }

         c.this.n(c.this.O, var10, var2 + 2 - 10, var3 + 1, 16777215);
         c.this.n(c.this.O, var13, var2 + 2, var3 + 1 + c.this.O.R, var11 == 0?6316128:9474192);
         c.this.n(c.this.O, var14, var2 + 2, var3 + 1 + c.this.O.R * 2, var12 == 0?6316128:9474192);
         d.h(new d[5]);
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   class l extends c.h {
      public l(j var2) {
         super(var2);
         this.h = Lists.newArrayList();

         for(f var4 : q.h) {
            boolean var5 = false;
            net.n0.y var6 = var4.m();
            if(c.this.w.H(var4) > 0) {
               var5 = true;
            } else if(q.u(var6) != null && c.this.w.H(q.u(var6)) > 0) {
               var5 = true;
            } else if(q.W(var6) != null && c.this.w.H(q.W(var6)) > 0) {
               var5 = true;
            } else if(q.y(var6) != null && c.this.w.H(q.y(var6)) > 0) {
               var5 = true;
            } else if(q.R(var6) != null && c.this.w.H(q.R(var6)) > 0) {
               var5 = true;
            }

            this.h.add(var4);
         }

         this.I = new Comparator() {
            public int J(f var1, f var2) {
               net.n0.y var4 = var1.m();
               net.n0.y var5 = var2.m();
               y.lY();
               int var6 = net.n0.y.h(var4);
               int var7 = net.n0.y.h(var5);
               net.v.n var8 = null;
               net.v.n var9 = null;
               if(l.this.F == 0) {
                  var8 = q.u(var4);
                  var9 = q.u(var5);
               } else if(l.this.F == 1) {
                  var8 = q.W(var4);
                  var9 = q.W(var5);
               } else if(l.this.F == 2) {
                  var8 = q.H(var4);
                  var9 = q.H(var5);
               } else if(l.this.F == 3) {
                  var8 = q.y(var4);
                  var9 = q.y(var5);
               } else if(l.this.F == 4) {
                  var8 = q.R(var4);
                  var9 = q.R(var5);
               }

               if(var8 != null || var9 != null) {
                  if(var8 == null) {
                     return 1;
                  }

                  if(var9 == null) {
                     return -1;
                  }

                  int var10 = c.this.w.H(var8);
                  int var11 = c.this.w.H(var9);
                  if(var10 != var11) {
                     return (var10 - var11) * l.this.p;
                  }
               }

               return var6 - var7;
            }

            private static xn a(xn var0) {
               return var0;
            }
         };
      }

      protected void A(int var1, int var2, r var3) {
         y.lY();
         super.A(var1, var2, var3);
         if(this.Y == 0) {
            c.this.I(var1 + 115 - 18 + 1, var2 + 1 + 1, 72, 18);
         }

         c.this.I(var1 + 115 - 18, var2 + 1, 72, 18);
         if(this.Y == 1) {
            c.this.I(var1 + 165 - 18 + 1, var2 + 1 + 1, 18, 18);
         }

         c.this.I(var1 + 165 - 18, var2 + 1, 18, 18);
         if(this.Y == 2) {
            c.this.I(var1 + 215 - 18 + 1, var2 + 1 + 1, 36, 18);
         }

         c.this.I(var1 + 215 - 18, var2 + 1, 36, 18);
         if(this.Y == 3) {
            c.this.I(var1 + 265 - 18 + 1, var2 + 1 + 1, 90, 18);
         }

         c.this.I(var1 + 265 - 18, var2 + 1, 90, 18);
         if(this.Y == 4) {
            c.this.I(var1 + 315 - 18 + 1, var2 + 1 + 1, 108, 18);
         }

         c.this.I(var1 + 315 - 18, var2 + 1, 108, 18);
      }

      protected void x(int var1, int var2, int var3, int var4, int var5, int var6, float var7) {
         f var8 = this.o(var1);
         net.n0.y var9 = var8.m();
         c.this.o(var2 + 40, var3, var9);
         this.J(q.u(var9), var2 + 115, var3, var1 % 2 == 0);
         this.J(q.W(var9), var2 + 165, var3, var1 % 2 == 0);
         this.J(var8, var2 + 215, var3, var1 % 2 == 0);
         this.J(q.y(var9), var2 + 265, var3, var1 % 2 == 0);
         this.J(q.R(var9), var2 + 315, var3, var1 % 2 == 0);
      }

      protected String P(int var1) {
         return var1 == 1?"stat.crafted":(var1 == 2?"stat.used":(var1 == 3?"stat.pickup":(var1 == 4?"stat.dropped":"stat.depleted")));
      }

      private static xn b(xn var0) {
         return var0;
      }
   }
}
