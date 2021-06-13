package net.z;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import java.awt.Color;
import net.xh;
import net.xn;
import net.yz.a3;
import net.z.g;
import net.z.r;
import net.z.tu;
import net.z.v;

public class wd extends g {
   private final int k;
   private final r i;
   public int N;
   public int Q;
   private final int t;
   private final int g;
   private String c = "";
   public int u = 32;
   private int M;
   private boolean P = true;
   private boolean W = true;
   public boolean w;
   private boolean H = true;
   private int V;
   private int Y;
   private int o;
   private int D = 14737632;
   private int r = 7368816;
   private boolean h = true;
   private v.e L;
   private Predicate T = Predicates.alwaysTrue();

   public wd(int var1, r var2, int var3, int var4, int var5, int var6) {
      this.k = var1;
      this.i = var2;
      this.N = var3;
      this.Q = var4;
      this.t = var5;
      this.g = var6;
   }

   public void i(v.e var1) {
      this.L = var1;
   }

   public void K() {
      ++this.M;
   }

   public void u(String var1) {
      if(this.T.apply(var1)) {
         if(var1.length() > this.u) {
            this.c = var1.substring(0, this.u);
         } else {
            this.c = var1;
         }

         this.p();
      }

   }

   public String u() {
      return this.c;
   }

   public String O() {
      int var1 = this.Y < this.o?this.Y:this.o;
      int var2 = this.Y < this.o?this.o:this.Y;
      return this.c.substring(var1, var2);
   }

   public void n(Predicate var1) {
      this.T = var1;
   }

   public void Z(String var1) {
      String var2 = "";
      String var3 = a3.u(var1);
      int var4 = this.Y < this.o?this.Y:this.o;
      int var5 = this.Y < this.o?this.o:this.Y;
      int var6 = this.u - this.c.length() - (var4 - var5);
      if(!this.c.isEmpty()) {
         var2 = var2 + this.c.substring(0, var4);
      }

      int var7;
      if(var6 < var3.length()) {
         var2 = var2 + var3.substring(0, var6);
         var7 = var6;
      } else {
         var2 = var2 + var3;
         var7 = var3.length();
      }

      if(!this.c.isEmpty() && var5 < this.c.length()) {
         var2 = var2 + this.c.substring(var5);
      }

      if(this.T.apply(var2)) {
         this.c = var2;
         this.w(var4 - this.o + var7);
         this.y(this.k, this.c);
      }

   }

   public void y(int var1, String var2) {
      if(this.L != null) {
         this.L.T(var1, var2);
      }

   }

   public void z(int var1) {
      if(!this.c.isEmpty()) {
         if(this.o != this.Y) {
            this.Z("");
         } else {
            this.a(this.Y(var1) - this.Y);
         }
      }

   }

   public void a(int var1) {
      if(!this.c.isEmpty()) {
         if(this.o != this.Y) {
            this.Z("");
         } else {
            boolean var2 = true;
            int var3 = this.Y + var1;
            int var4 = this.Y;
            String var5 = "";
            var5 = this.c.substring(0, var3);
            if(var4 < this.c.length()) {
               var5 = var5 + this.c.substring(var4);
            }

            if(this.T.apply(var5)) {
               this.c = var5;
               this.w(var1);
               this.y(this.k, this.c);
            }
         }
      }

   }

   public int H() {
      return this.k;
   }

   public int Y(int var1) {
      return this.P(var1, this.A());
   }

   public int P(int var1, int var2) {
      return this.C(var1, var2, true);
   }

   public int C(int var1, int var2, boolean var3) {
      int var4 = var2;
      boolean var5 = true;
      int var6 = Math.abs(var1);

      for(int var7 = 0; var7 < var6; ++var7) {
         int var8 = this.c.length();
         var4 = this.c.indexOf(32, var4);
         if(var4 == -1) {
            var4 = var8;
         } else {
            while(var4 < var8 && this.c.charAt(var4) == 32) {
               ++var4;
            }
         }
      }

      return var4;
   }

   public void w(int var1) {
      this.l(this.o + var1);
   }

   public void l(int var1) {
      this.Y = var1;
      int var2 = this.c.length();
      this.Y = net.u.t.g(this.Y, 0, var2);
      this.O(this.Y);
   }

   public void l() {
      this.l(0);
   }

   public void p() {
      this.l(this.c.length());
   }

   public boolean l(char var1, int var2) {
      if(!this.w) {
         return false;
      } else if(tu.r(var2)) {
         this.p();
         this.O(0);
         return true;
      } else if(tu.S(var2)) {
         tu.G(this.O());
         return true;
      } else if(tu.L(var2)) {
         if(this.H) {
            this.Z(tu.s());
         }

         return true;
      } else if(tu.H(var2)) {
         tu.G(this.O());
         if(this.H) {
            this.Z("");
         }

         return true;
      } else {
         switch(var2) {
         case 14:
            if(tu.T()) {
               if(this.H) {
                  this.z(-1);
               }
            } else if(this.H) {
               this.a(-1);
            }

            return true;
         case 199:
            if(tu.s()) {
               this.O(0);
            } else {
               this.l();
            }

            return true;
         case 203:
            if(tu.s()) {
               if(tu.T()) {
                  this.O(this.P(-1, this.F()));
               } else {
                  this.O(this.F() - 1);
               }
            } else if(tu.T()) {
               this.l(this.Y(-1));
            } else {
               this.w(-1);
            }

            return true;
         case 205:
            if(tu.s()) {
               if(tu.T()) {
                  this.O(this.P(1, this.F()));
               } else {
                  this.O(this.F() + 1);
               }
            } else if(tu.T()) {
               this.l(this.Y(1));
            } else {
               this.w(1);
            }

            return true;
         case 207:
            if(tu.s()) {
               this.O(this.c.length());
            } else {
               this.p();
            }

            return true;
         case 211:
            if(tu.T()) {
               if(this.H) {
                  this.z(1);
               }
            } else if(this.H) {
               this.a(1);
            }

            return true;
         default:
            if(a3.s(var1)) {
               if(this.H) {
                  this.Z(Character.toString(var1));
               }

               return true;
            } else {
               return false;
            }
         }
      }
   }

   public boolean N(int var1, int var2, int var3) {
      boolean var4 = var1 >= this.N && var1 < this.N + this.t && var2 >= this.Q && var2 < this.Q + this.g;
      if(this.W) {
         this.n(var4);
      }

      if(this.w) {
         int var5 = var1 - this.N;
         if(this.P) {
            var5 -= 4;
         }

         String var6 = this.i.Q(this.c.substring(this.V), this.k());
         this.l(this.i.Q(var6, var5).length() + this.V);
         return true;
      } else {
         return false;
      }
   }

   public void Z() {
      boolean var1 = g.C();
      if(this.Q()) {
         if(this.k()) {
            xh.J((double)(this.N - 1), (double)(this.Q - 1), (double)(this.N + this.t + 1), (double)(this.Q + this.g + 1), (new Color(60, 60, 60, 255)).getRGB());
            xh.J((double)this.N, (double)this.Q, (double)(this.N + this.t), (double)(this.Q + this.g), -16777216);
         }

         int var2 = this.H?this.D:this.r;
         int var3 = this.Y - this.V;
         int var4 = this.o - this.V;
         String var5 = this.i.Q(this.c.substring(this.V), this.k());
         boolean var6 = var3 >= 0 && var3 <= var5.length();
         if(this.w && this.M / 6 % 2 == 0) {
            ;
         }

         boolean var7 = false;
         int var8 = this.P?this.N + 4:this.N;
         int var9 = this.P?this.Q + (this.g - 8) / 2:this.Q;
         int var10 = var8;
         if(var4 > var5.length()) {
            var4 = var5.length();
         }

         if(!var5.isEmpty()) {
            String var11 = var5.substring(0, var3);
            var10 = this.i.U(var11, (float)var8, (float)var9, var2);
         }

         if(this.Y >= this.c.length() && this.c.length() < this.R()) {
            boolean var15 = false;
         } else {
            boolean var10000 = true;
         }

         if(var3 > 0) {
            int var16 = var8 + this.t;
         }

         int var12 = var10 - 1;
         --var10;
         if(!var5.isEmpty()) {
            ;
         }

         if(var4 != var3) {
            int var13 = var8 + this.i.r(var5.substring(0, var4));
            this.X(var12, var9 - 1, var13 - 1, var9 + 1 + this.i.R);
         }
      }

   }

   private void X(int var1, int var2, int var3, int var4) {
      if(var1 < var3) {
         int var5 = var1;
         var1 = var3;
         var3 = var5;
      }

      if(var2 < var4) {
         int var7 = var2;
         var2 = var4;
         var4 = var7;
      }

      if(var3 > this.N + this.t) {
         var3 = this.N + this.t;
      }

      if(var1 > this.N + this.t) {
         var1 = this.N + this.t;
      }

      net.y.r var8 = net.y.r.f();
      net.y.p var6 = var8.k();
      net.y.d.T(0.0F, 0.0F, 255.0F, 255.0F);
      net.y.d.w();
      net.y.d.M();
      net.y.d.S(net.y.d.OR_REVERSE);
      var6.m(7, net.y8.x.y);
      var6.H((double)var1, (double)var4, 0.0D).W();
      var6.H((double)var3, (double)var4, 0.0D).W();
      var6.H((double)var3, (double)var2, 0.0D).W();
      var6.H((double)var1, (double)var2, 0.0D).W();
      var8.p();
      net.y.d.v();
      net.y.d.S();
   }

   public void r(int var1) {
      this.u = var1;
      if(this.c.length() > var1) {
         this.c = this.c.substring(0, var1);
      }

   }

   public int R() {
      return this.u;
   }

   public int A() {
      return this.Y;
   }

   public boolean k() {
      return this.P;
   }

   public void S(boolean var1) {
      this.P = var1;
   }

   public void b(int var1) {
      this.D = var1;
   }

   public void U(int var1) {
      this.r = var1;
   }

   public void n(boolean var1) {
      if(!this.w) {
         this.M = 0;
      }

      this.w = var1;
      if(net.nn.j.b().s5 != null) {
         net.nn.j.b().s5.l(var1);
      }

   }

   public boolean Y() {
      return this.w;
   }

   public void o(boolean var1) {
      this.H = var1;
   }

   public int F() {
      return this.o;
   }

   public int k() {
      return this.k()?this.t - 8:this.t;
   }

   public void O(int var1) {
      int var2 = this.c.length();
      if(var1 > var2) {
         ;
      }

      var1 = 0;
      this.o = var1;
      if(this.i != null) {
         if(this.V > var2) {
            this.V = var2;
         }

         int var3 = this.k();
         String var4 = this.i.Q(this.c.substring(this.V), var3);
         int var5 = var4.length() + this.V;
         if(var1 == this.V) {
            this.V -= this.i.c(this.c, var3, true).length();
         }

         if(var1 > var5) {
            this.V += var1 - var5;
         } else if(var1 <= this.V) {
            this.V -= this.V - var1;
         }

         this.V = net.u.t.g(this.V, 0, var2);
      }

   }

   public void O(boolean var1) {
      this.W = var1;
   }

   public boolean Q() {
      return this.h;
   }

   public void l(boolean var1) {
      this.h = var1;
   }

   private static xn b(xn var0) {
      return var0;
   }
}
