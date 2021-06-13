package net;

import java.awt.Color;
import net.p1;
import net.xh;
import net.xn;
import net.nn.j;
import net.y.p;
import net.y8.x;
import net.yz.a3;
import net.z.g;
import net.z.r;
import net.z.tu;
import org.lwjgl.opengl.GL11;

public class o7 extends g {
   private final r j;
   private final int k;
   private final int V;
   private final int P;
   private final int L;
   private final boolean U = true;
   private final int R = 7368816;
   public String S = "";
   public int o = 50;
   public boolean Y = false;
   private int B;
   private boolean w = true;
   private boolean b = true;
   private int h = 0;
   private int r = 0;
   private int Z = 0;
   private int t = 14737632;
   private boolean c = true;

   public o7(r var1, int var2, int var3, int var4, int var5) {
      this.j = var1;
      this.k = var2;
      this.V = var3;
      this.P = var4;
      this.L = var5;
   }

   public void I() {
      ++this.B;
   }

   public String s() {
      return this.S.replaceAll(" ", "");
   }

   public void n(String var1) {
      if(var1.length() > this.o) {
         this.S = var1.substring(0, this.o);
      } else {
         this.S = var1;
      }

      this.u();
   }

   public String u() {
      int var1 = this.r < this.Z?this.r:this.Z;
      int var2 = this.r < this.Z?this.Z:this.r;
      return this.S.substring(var1, var2);
   }

   public void q(String var1) {
      String var2 = "";
      String var3 = a3.u(var1);
      int var4 = this.r < this.Z?this.r:this.Z;
      int var5 = this.r < this.Z?this.Z:this.r;
      int var6 = this.o - this.S.length() - (var4 - this.Z);
      boolean var10000 = false;
      if(this.S.length() > 0) {
         var2 = var2 + this.S.substring(0, var4);
      }

      int var8;
      if(var6 < var3.length()) {
         var2 = var2 + var3.substring(0, var6);
         var8 = var6;
      } else {
         var2 = var2 + var3;
         var8 = var3.length();
      }

      if(this.S.length() > 0 && var5 < this.S.length()) {
         var2 = var2 + this.S.substring(var5);
      }

      this.S = var2.replaceAll(" ", "");
      this.E(var4 - this.Z + var8);
   }

   public void x(int var1) {
      if(this.S.length() != 0) {
         if(this.Z != this.r) {
            this.q("");
         } else {
            this.A(this.Q(var1) - this.r);
         }
      }

   }

   public void A(int var1) {
      if(this.S.length() != 0) {
         if(this.Z != this.r) {
            this.q("");
         } else {
            boolean var2 = true;
            int var3 = this.r + var1;
            int var4 = this.r;
            String var5 = "";
            var5 = this.S.substring(0, var3);
            if(var4 < this.S.length()) {
               var5 = var5 + this.S.substring(var4);
            }

            this.S = var5;
            this.E(var1);
         }
      }

   }

   public int Q(int var1) {
      return this.K(var1, this.R());
   }

   public int K(int var1, int var2) {
      return this.B(var1, this.R(), true);
   }

   public int B(int var1, int var2, boolean var3) {
      int var4 = var2;
      boolean var5 = true;
      int var6 = Math.abs(var1);

      for(int var7 = 0; var7 < var6; ++var7) {
         int var8 = this.S.length();
         var4 = this.S.indexOf(32, var4);
         if(var4 == -1) {
            var4 = var8;
         } else {
            while(var4 < var8 && this.S.charAt(var4) == 32) {
               ++var4;
            }
         }
      }

      return var4;
   }

   public void E(int var1) {
      this.K(this.Z + var1);
   }

   public void J() {
      this.K(0);
   }

   public void u() {
      this.K(this.S.length());
   }

   public boolean O(char var1, int var2) {
      this.getClass();
      if(this.Y) {
         switch(var1) {
         case '\u0001':
            this.u();
            this.L(0);
            return true;
         case '\u0003':
            tu.G(this.u());
            return true;
         case '\u0016':
            this.q(tu.s());
            return true;
         case '\u0018':
            tu.G(this.u());
            this.q("");
            return true;
         default:
            switch(var2) {
            case 14:
               if(tu.T()) {
                  this.x(-1);
               } else {
                  this.A(-1);
               }

               return true;
            case 199:
               if(tu.s()) {
                  this.L(0);
               } else {
                  this.J();
               }

               return true;
            case 203:
               if(tu.s()) {
                  if(tu.T()) {
                     this.L(this.K(-1, this.v()));
                  } else {
                     this.L(this.v() - 1);
                  }
               } else if(tu.T()) {
                  this.K(this.Q(-1));
               } else {
                  this.E(-1);
               }

               return true;
            case 205:
               if(tu.s()) {
                  if(tu.T()) {
                     this.L(this.K(1, this.v()));
                  } else {
                     this.L(this.v() + 1);
                  }
               } else if(tu.T()) {
                  this.K(this.Q(1));
               } else {
                  this.E(1);
               }

               return true;
            case 207:
               if(tu.s()) {
                  this.L(this.S.length());
               } else {
                  this.u();
               }

               return true;
            case 211:
               if(tu.T()) {
                  this.x(1);
               } else {
                  this.A(1);
               }

               return true;
            default:
               if(a3.s(var1)) {
                  this.q(Character.toString(var1));
                  return true;
               } else {
                  return false;
               }
            }
         }
      } else {
         return false;
      }
   }

   public void k(int var1, int var2, int var3) {
      if(var1 >= this.k && var1 < this.k + this.P && var2 >= this.V && var2 < this.V + this.L) {
         boolean var7 = true;
      } else {
         boolean var10000 = false;
      }

      if(this.b) {
         this.getClass();
         this.P(true);
      }

      if(this.Y) {
         int var5 = var1 - this.k;
         if(this.w) {
            var5 -= 4;
         }

         String var6 = this.j.Q(this.S.substring(this.h), this.I());
         this.K(this.j.Q(var6, var5).length() + this.h);
      }

   }

   public void K() {
      int var1 = p1.K();
      if(this.l()) {
         if(this.o()) {
            xh.J((double)(this.k - 1), (double)(this.V - 1), (double)(this.k + this.P + 1), (double)(this.V + this.L + 1), (new Color(60, 60, 60, 255)).getRGB());
            xh.J((double)this.k, (double)this.V, (double)(this.k + this.P), (double)(this.V + this.L), -16777216);
         }

         this.getClass();
         int var2 = this.t;
         int var3 = this.r - this.h;
         int var4 = this.Z - this.h;
         String var5 = this.j.Q(this.S.substring(this.h), this.I());
         boolean var6 = var3 >= 0 && var3 <= var5.length();
         if(this.Y && this.B / 6 % 2 == 0) {
            ;
         }

         boolean var7 = false;
         int var8 = this.w?this.k + 4:this.k;
         int var9 = this.w?this.V + (this.L - 8) / 2:this.V;
         int var10 = var8;
         if(var4 > var5.length()) {
            var4 = var5.length();
         }

         if(var5.length() > 0) {
            var10 = j.b().sO.U(this.S.replaceAll("(?s).", "*"), (float)var8, (float)var9, var2);
         }

         if(this.r >= this.S.length() && this.S.length() < this.a()) {
            boolean var15 = false;
         } else {
            boolean var10000 = true;
         }

         if(var3 > 0) {
            int var16 = var8 + this.P;
         }

         int var12 = var10 - 1;
         --var10;
         if(var5.length() > 0) {
            ;
         }

         if(var4 != var3) {
            int var13 = var8 + this.j.r(var5.substring(0, var4));
            this.J(var12, var9 - 1, var13 - 1, var9 + 1 + this.j.R);
         }
      }

   }

   private void J(int var1, int var2, int var3, int var4) {
      if(var1 < var3) {
         int var5 = var1;
         var1 = var3;
         var3 = var5;
      }

      if(var2 < var4) {
         int var8 = var2;
         var2 = var4;
         var4 = var8;
      }

      net.y.r var6 = net.y.r.f();
      p var7 = var6.k();
      GL11.glColor4f(0.0F, 0.0F, 255.0F, 255.0F);
      GL11.glDisable(3553);
      GL11.glEnable(3058);
      GL11.glLogicOp(5387);
      var7.m(7, x.y);
      var7.H((double)var1, (double)var4, 0.0D).W();
      var7.H((double)var3, (double)var4, 0.0D).W();
      var7.H((double)var3, (double)var2, 0.0D).W();
      var7.H((double)var1, (double)var2, 0.0D).W();
      var6.p();
      GL11.glDisable(3058);
      GL11.glEnable(3553);
   }

   public int a() {
      return this.o;
   }

   public void y(int var1) {
      this.o = var1;
      if(this.S.length() > var1) {
         this.S = this.S.substring(0, var1);
      }

   }

   public int R() {
      return this.r;
   }

   public void K(int var1) {
      this.r = var1;
      int var2 = this.S.length();
      if(this.r < 0) {
         this.r = 0;
      }

      if(this.r > var2) {
         this.r = var2;
      }

      this.L(this.r);
   }

   public boolean o() {
      return this.w;
   }

   public void U(boolean var1) {
      this.w = var1;
   }

   public void q(int var1) {
      this.t = var1;
   }

   public boolean K() {
      return this.Y;
   }

   public void P(boolean var1) {
      if(!this.Y) {
         this.B = 0;
      }

      this.Y = var1;
   }

   public int v() {
      return this.Z;
   }

   public int I() {
      return this.o()?this.P - 8:this.P;
   }

   public void L(int var1) {
      int var2 = this.S.length();
      if(var1 > var2) {
         ;
      }

      var1 = 0;
      this.Z = var1;
      if(this.j != null) {
         if(this.h > var2) {
            this.h = var2;
         }

         int var3 = this.I();
         String var4 = this.j.Q(this.S.substring(this.h), var3);
         int var5 = var4.length() + this.h;
         if(var1 == this.h) {
            this.h -= this.j.c(this.S, var3, true).length();
         }

         if(var1 > var5) {
            this.h += var1 - var5;
         } else if(var1 <= this.h) {
            this.h -= this.h - var1;
         }

         if(this.h < 0) {
            this.h = 0;
         }

         if(this.h > var2) {
            this.h = var2;
         }
      }

   }

   public void L(boolean var1) {
      this.b = var1;
   }

   public boolean l() {
      return this.c;
   }

   public void g(boolean var1) {
      this.c = var1;
   }

   private static xn b(xn var0) {
      return var0;
   }
}
