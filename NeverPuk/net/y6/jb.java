package net.y6;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import net.w7;
import net.wd;
import net.xn;
import net.z9;
import net.y6.j;
import net.y6.jf;
import net.yz.m_;

public class jb {
   public float E;
   public float K;
   private int a;
   private int v;
   public float l;
   public float I;
   public float h;
   public float b;
   public float N;
   public float c;
   private boolean C;
   private int O;
   public boolean x;
   public boolean B;
   public boolean t;
   public List f;
   public List U;
   public final String e;
   private final net.y6.z H;
   public float D;
   public float F;
   public float X;
   public List P;
   public boolean Z;
   public float k;
   public float u;
   public float G;
   private float Y;
   private m_ s;
   private String g;
   private wd V;
   private final net.y.u o;
   private static int[] z;

   public jb(net.y6.z var1, String var2) {
      this.P = new ArrayList();
      this.Z = false;
      this.k = 1.0F;
      this.u = 1.0F;
      this.G = 1.0F;
      this.s = null;
      this.g = null;
      this.o = z9.F();
      this.E = 64.0F;
      this.K = 32.0F;
      this.B = true;
      this.f = Lists.newArrayList();
      this.H = var1;
      var1.t.add(this);
      this.e = var2;
      this.R(var1.f, var1.C);
   }

   public jb(net.y6.z var1) {
      this(var1, (String)null);
   }

   public jb(net.y6.z var1, int var2, int var3) {
      this(var1);
      this.k(var2, var3);
   }

   public void s(jb var1) {
      if(this.U == null) {
         this.U = Lists.newArrayList();
      }

      this.U.add(var1);
   }

   public jb k(int var1, int var2) {
      this.a = var1;
      this.v = var2;
      return this;
   }

   public jb M(String var1, float var2, float var3, float var4, int var5, int var6, int var7) {
      var1 = this.e + "." + var1;
      j var8 = this.H.O(var1);
      this.k(var8.p, var8.S);
      this.f.add((new jf(this, this.a, this.v, var2, var3, var4, var5, var6, var7, 0.0F)).w(var1));
      return this;
   }

   public jb U(float var1, float var2, float var3, int var4, int var5, int var6) {
      this.f.add(new jf(this, this.a, this.v, var1, var2, var3, var4, var5, var6, 0.0F));
      return this;
   }

   public jb u(float var1, float var2, float var3, int var4, int var5, int var6, boolean var7) {
      this.f.add(new jf(this, this.a, this.v, var1, var2, var3, var4, var5, var6, 0.0F, var7));
      return this;
   }

   public void d(float var1, float var2, float var3, int var4, int var5, int var6, float var7) {
      this.f.add(new jf(this, this.a, this.v, var1, var2, var3, var4, var5, var6, var7));
   }

   public void n(float var1, float var2, float var3) {
      this.l = var1;
      this.I = var2;
      this.h = var3;
   }

   public void B(float var1) {
      boolean var2 = net.y6.z.W();
      if(!this.t && this.B) {
         if(!this.C) {
            this.o(var1);
         }

         int var3 = 0;
         if(this.s != null && !this.o.Km) {
            if(this.o.KE) {
               return;
            }

            var3 = net.y.d.D();
            z9.V().E(this.s);
         }

         if(this.V != null) {
            this.V.D();
         }

         if(Float.compare(this.k, 1.0F) == 0 && Float.compare(this.u, 1.0F) == 0 && Float.compare(this.G, 1.0F) == 0) {
            boolean var12 = false;
         } else {
            boolean var10000 = true;
         }

         net.y.d.O(this.D, this.F, this.X);
         if(Float.compare(this.b, 0.0F) == 0 && Float.compare(this.N, 0.0F) == 0 && Float.compare(this.c, 0.0F) == 0) {
            if(Float.compare(this.l, 0.0F) == 0 && Float.compare(this.I, 0.0F) == 0 && Float.compare(this.h, 0.0F) == 0) {
               net.y.d.W(this.k, this.u, this.G);
               net.y.d.I(this.O);
               if(this.U != null) {
                  int var5 = 0;
                  if(var5 < this.U.size()) {
                     ((jb)this.U.get(var5)).B(var1);
                     ++var5;
                  }
               }

               net.y.d.W(1.0F / this.k, 1.0F / this.u, 1.0F / this.G);
            }

            net.y.d.O(this.l * var1, this.I * var1, this.h * var1);
            net.y.d.W(this.k, this.u, this.G);
            net.y.d.I(this.O);
            if(this.U != null) {
               int var8 = 0;
               if(var8 < this.U.size()) {
                  ((jb)this.U.get(var8)).B(var1);
                  ++var8;
               }
            }

            net.y.d.W(1.0F / this.k, 1.0F / this.u, 1.0F / this.G);
            net.y.d.O(-this.l * var1, -this.I * var1, -this.h * var1);
         }

         net.y.d.c();
         net.y.d.O(this.l * var1, this.I * var1, this.h * var1);
         if(this.c != 0.0F) {
            net.y.d.P(this.c * 57.295776F, 0.0F, 0.0F, 1.0F);
         }

         if(Float.compare(this.N, 0.0F) != 0) {
            net.y.d.P(this.N * 57.295776F, 0.0F, 1.0F, 0.0F);
         }

         if(Float.compare(this.b, 0.0F) != 0) {
            net.y.d.P(this.b * 57.295776F, 1.0F, 0.0F, 0.0F);
         }

         net.y.d.W(this.k, this.u, this.G);
         net.y.d.I(this.O);
         if(this.U != null) {
            int var10 = 0;
            if(var10 < this.U.size()) {
               ((jb)this.U.get(var10)).B(var1);
               ++var10;
            }
         }

         net.y.d.Y();
         net.y.d.O(-this.D, -this.F, -this.X);
      }

   }

   public void R(float var1) {
      if(!this.t && this.B) {
         if(!this.C) {
            this.o(var1);
         }

         int var2 = 0;
         if(this.s != null && !this.o.Km) {
            if(this.o.KE) {
               return;
            }

            var2 = net.y.d.D();
            z9.V().E(this.s);
         }

         if(this.V != null) {
            this.V.D();
         }

         boolean var3 = this.k != 1.0F || this.u != 1.0F || this.G != 1.0F;
         net.y.d.c();
         net.y.d.O(this.l * var1, this.I * var1, this.h * var1);
         if(this.N != 0.0F) {
            net.y.d.P(this.N * 57.295776F, 0.0F, 1.0F, 0.0F);
         }

         if(this.b != 0.0F) {
            net.y.d.P(this.b * 57.295776F, 1.0F, 0.0F, 0.0F);
         }

         if(this.c != 0.0F) {
            net.y.d.P(this.c * 57.295776F, 0.0F, 0.0F, 1.0F);
         }

         net.y.d.W(this.k, this.u, this.G);
         net.y.d.I(this.O);
         if(this.U != null) {
            for(int var4 = 0; var4 < this.U.size(); ++var4) {
               ((jb)this.U.get(var4)).B(var1);
            }
         }

         net.y.d.Y();
         net.y.d.z(var2);
      }

   }

   public void I(float var1) {
      if(!this.t && this.B) {
         if(!this.C) {
            this.o(var1);
         }

         if(this.b == 0.0F && this.N == 0.0F && this.c == 0.0F) {
            if(this.l != 0.0F || this.I != 0.0F || this.h != 0.0F) {
               net.y.d.O(this.l * var1, this.I * var1, this.h * var1);
            }
         } else {
            net.y.d.O(this.l * var1, this.I * var1, this.h * var1);
            if(this.c != 0.0F) {
               net.y.d.P(this.c * 57.295776F, 0.0F, 0.0F, 1.0F);
            }

            if(this.N != 0.0F) {
               net.y.d.P(this.N * 57.295776F, 0.0F, 1.0F, 0.0F);
            }

            if(this.b != 0.0F) {
               net.y.d.P(this.b * 57.295776F, 1.0F, 0.0F, 0.0F);
            }
         }
      }

   }

   private void o(float var1) {
      if(this.O == 0) {
         this.Y = var1;
         this.O = net.y.m.X(1);
      }

      net.y.d.b(this.O, 4864);
      net.y.p var2 = net.y.r.f().k();

      for(int var3 = 0; var3 < this.f.size(); ++var3) {
         ((jf)this.f.get(var3)).M(var2, var1);
      }

      for(int var5 = 0; var5 < this.P.size(); ++var5) {
         w7 var4 = (w7)this.P.get(var5);
         var4.A(net.y.r.f(), var1);
      }

      net.y.d.q();
      this.C = true;
   }

   public jb R(int var1, int var2) {
      this.E = (float)var1;
      this.K = (float)var2;
      return this;
   }

   public void A(float var1, float var2, float var3, int var4, int var5, int var6, float var7) {
      this.P.add(new w7(this, this.a, this.v, var1, var2, var3, var4, var5, var6, var7));
   }

   public boolean L() {
      return this.C;
   }

   public int Y() {
      return this.O;
   }

   public void g() {
      if(this.C) {
         this.C = false;
         this.o(this.Y);
      }

   }

   public m_ L() {
      return this.s;
   }

   public void W(m_ var1) {
      this.s = var1;
   }

   public String K() {
      return this.g;
   }

   public void e(String var1) {
      this.g = var1;
   }

   public void k(int[][] var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      this.f.add(new jf(this, var1, var2, var3, var4, var5, var6, var7, var8, this.x));
   }

   public jb t(String var1) {
      return null;
   }

   public jb E(String var1) {
      return null;
   }

   public void y(wd var1) {
      this.V = var1;
   }

   public String toString() {
      StringBuffer var1 = new StringBuffer();
      var1.append("id: " + this.g + ", boxes: " + (this.f != null?Integer.valueOf(this.f.size()):null) + ", submodels: " + (this.U != null?Integer.valueOf(this.U.size()):null));
      return var1.toString();
   }

   public static void v(int[] var0) {
      z = var0;
   }

   public static int[] J() {
      return z;
   }

   private static xn a(xn var0) {
      return var0;
   }

   static {
      v(new int[5]);
   }
}
