package net.y6;

import net.xn;
import net.y6.jb;
import net.y6.t;

public class c extends t {
   public boolean S;
   public boolean u;

   public c(float var1) {
      super(0.0F, -14.0F, 64, 32);
      float var10000 = -14.0F;
      this.P = new jb(this, 0, 16);
      this.P.d(-4.0F, -8.0F, -4.0F, 8, 8, 8, var1 - 0.5F);
      this.P.n(0.0F, -14.0F, 0.0F);
      this.N = new jb(this, 32, 16);
      this.N.d(-4.0F, 0.0F, -2.0F, 8, 12, 4, var1);
      this.N.n(0.0F, -14.0F, 0.0F);
      this.A = new jb(this, 56, 0);
      this.A.d(-1.0F, -2.0F, -1.0F, 2, 30, 2, var1);
      this.A.n(-3.0F, -12.0F, 0.0F);
      this.B = new jb(this, 56, 0);
      this.B.x = true;
      this.B.d(-1.0F, -2.0F, -1.0F, 2, 30, 2, var1);
      this.B.n(5.0F, -12.0F, 0.0F);
      this.H = new jb(this, 56, 0);
      this.H.d(-1.0F, 0.0F, -1.0F, 2, 30, 2, var1);
      this.H.n(-2.0F, -2.0F, 0.0F);
      this.a = new jb(this, 56, 0);
      this.a.x = true;
      this.a.d(-1.0F, 0.0F, -1.0F, 2, 30, 2, var1);
      this.a.n(2.0F, -2.0F, 0.0F);
   }

   public void p(float var1, float var2, float var3, float var4, float var5, float var6, net.ne.l var7) {
      super.p(var1, var2, var3, var4, var5, var6, var7);
      this.G.B = true;
      float var10000 = -14.0F;
      net.y6.z.C();
      this.N.b = 0.0F;
      this.N.I = -14.0F;
      this.N.h = -0.0F;
      this.H.b -= 0.0F;
      this.a.b -= 0.0F;
      this.A.b = (float)((double)this.A.b * 0.5D);
      this.B.b = (float)((double)this.B.b * 0.5D);
      this.H.b = (float)((double)this.H.b * 0.5D);
      this.a.b = (float)((double)this.a.b * 0.5D);
      var10000 = 0.4F;
      if(Float.compare(this.A.b, 0.4F) > 0) {
         this.A.b = 0.4F;
      }

      if(Float.compare(this.B.b, 0.4F) > 0) {
         this.B.b = 0.4F;
      }

      if(Float.compare(this.A.b, -0.4F) < 0) {
         this.A.b = -0.4F;
      }

      if(Float.compare(this.B.b, -0.4F) < 0) {
         this.B.b = -0.4F;
      }

      if(Float.compare(this.H.b, 0.4F) > 0) {
         this.H.b = 0.4F;
      }

      if(Float.compare(this.a.b, 0.4F) > 0) {
         this.a.b = 0.4F;
      }

      if(Float.compare(this.H.b, -0.4F) < 0) {
         this.H.b = -0.4F;
      }

      if(Float.compare(this.a.b, -0.4F) < 0) {
         this.a.b = -0.4F;
      }

      if(this.S) {
         this.A.b = -0.5F;
         this.B.b = -0.5F;
         this.A.c = 0.05F;
         this.B.c = -0.05F;
      }

      this.A.h = 0.0F;
      this.B.h = 0.0F;
      this.H.h = 0.0F;
      this.a.h = 0.0F;
      this.H.I = -5.0F;
      this.a.I = -5.0F;
      this.G.h = -0.0F;
      this.G.I = -13.0F;
      this.P.l = this.G.l;
      this.P.I = this.G.I;
      this.P.h = this.G.h;
      this.P.b = this.G.b;
      this.P.N = this.G.N;
      this.P.c = this.G.c;
      if(this.u) {
         var10000 = 1.0F;
         this.G.I -= 5.0F;
      }

   }

   private static xn a(xn var0) {
      return var0;
   }
}
