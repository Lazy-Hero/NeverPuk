package net.y6;

import net.xn;
import net.y6.jb;

public class x extends net.y6.z {
   private final jb Q;
   private final jb R;
   private final jb P;
   private final jb Z;
   private final jb F;
   private final jb c;
   private final jb X;
   private final jb r;
   private final jb N;
   private final jb s;
   private final jb a;
   private final jb u;
   private float i;

   public x(float var1) {
      this.f = 256;
      this.C = 256;
      this.w("body.body", 0, 0);
      this.w("wing.skin", -56, 88);
      this.w("wingtip.skin", -56, 144);
      this.w("rearleg.main", 0, 0);
      this.w("rearfoot.main", 112, 0);
      this.w("rearlegtip.main", 196, 0);
      this.w("head.upperhead", 112, 30);
      this.w("wing.bone", 112, 88);
      this.w("head.upperlip", 176, 44);
      this.w("jaw.jaw", 176, 65);
      this.w("frontleg.main", 112, 104);
      this.w("wingtip.bone", 112, 136);
      this.w("frontfoot.main", 144, 104);
      this.w("neck.box", 192, 104);
      this.w("frontlegtip.main", 226, 138);
      this.w("body.scale", 220, 53);
      this.w("head.scale", 0, 0);
      this.w("neck.scale", 48, 0);
      this.w("head.nostril", 112, 0);
      float var10000 = -16.0F;
      this.Q = new jb(this, "head");
      this.Q.M("upperlip", -6.0F, -1.0F, -24.0F, 12, 5, 16);
      this.Q.M("upperhead", -8.0F, -8.0F, -10.0F, 16, 16, 16);
      this.Q.x = true;
      this.Q.M("scale", -5.0F, -12.0F, -4.0F, 2, 4, 6);
      this.Q.M("nostril", -5.0F, -3.0F, -22.0F, 2, 2, 4);
      this.Q.x = false;
      this.Q.M("scale", 3.0F, -12.0F, -4.0F, 2, 4, 6);
      this.Q.M("nostril", 3.0F, -3.0F, -22.0F, 2, 2, 4);
      this.P = new jb(this, "jaw");
      this.P.n(0.0F, 4.0F, -8.0F);
      this.P.M("jaw", -6.0F, 0.0F, -16.0F, 12, 4, 16);
      this.Q.s(this.P);
      this.R = new jb(this, "neck");
      this.R.M("box", -5.0F, -5.0F, -5.0F, 10, 10, 10);
      this.R.M("scale", -1.0F, -9.0F, -3.0F, 2, 4, 6);
      this.Z = new jb(this, "body");
      this.Z.n(0.0F, 4.0F, 8.0F);
      this.Z.M("body", -12.0F, 0.0F, -16.0F, 24, 24, 64);
      this.Z.M("scale", -1.0F, -6.0F, -10.0F, 2, 6, 12);
      this.Z.M("scale", -1.0F, -6.0F, 10.0F, 2, 6, 12);
      this.Z.M("scale", -1.0F, -6.0F, 30.0F, 2, 6, 12);
      this.a = new jb(this, "wing");
      this.a.n(-12.0F, 5.0F, 2.0F);
      this.a.M("bone", -56.0F, -4.0F, -4.0F, 56, 8, 8);
      this.a.M("skin", -56.0F, 0.0F, 2.0F, 56, 0, 56);
      this.u = new jb(this, "wingtip");
      this.u.n(-56.0F, 0.0F, 0.0F);
      this.u.M("bone", -56.0F, -2.0F, -2.0F, 56, 4, 4);
      this.u.M("skin", -56.0F, 0.0F, 2.0F, 56, 0, 56);
      this.a.s(this.u);
      this.c = new jb(this, "frontleg");
      this.c.n(-12.0F, 20.0F, 2.0F);
      this.c.M("main", -4.0F, -4.0F, -4.0F, 8, 24, 8);
      this.r = new jb(this, "frontlegtip");
      this.r.n(0.0F, 20.0F, -1.0F);
      this.r.M("main", -3.0F, -1.0F, -3.0F, 6, 24, 6);
      this.c.s(this.r);
      this.s = new jb(this, "frontfoot");
      this.s.n(0.0F, 23.0F, 0.0F);
      this.s.M("main", -4.0F, 0.0F, -12.0F, 8, 4, 16);
      this.r.s(this.s);
      this.F = new jb(this, "rearleg");
      this.F.n(-16.0F, 16.0F, 42.0F);
      this.F.M("main", -8.0F, -4.0F, -8.0F, 16, 32, 16);
      this.X = new jb(this, "rearlegtip");
      this.X.n(0.0F, 32.0F, -4.0F);
      this.X.M("main", -6.0F, -2.0F, 0.0F, 12, 32, 12);
      this.F.s(this.X);
      this.N = new jb(this, "rearfoot");
      this.N.n(0.0F, 31.0F, 4.0F);
      this.N.M("main", -9.0F, 0.0F, -20.0F, 18, 6, 24);
      this.X.s(this.N);
   }

   public void x(net.ne.a var1, float var2, float var3, float var4) {
      this.i = var4;
   }

   public void V(net.ne.l var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      net.y.d.c();
      net.a.t var9 = (net.a.t)var1;
      float var10 = var9.k8 + (var9.ks - var9.k8) * this.i;
      this.P.b = (float)(Math.sin((double)(var10 * 6.2831855F)) + 1.0D) * 0.2F;
      float var11 = (float)(Math.sin((double)(var10 * 6.2831855F - 1.0F)) + 1.0D);
      var11 = (var11 * var11 + var11 * 2.0F) * 0.05F;
      net.y.d.O(0.0F, var11 - 2.0F, -3.0F);
      net.y.d.P(var11 * 2.0F, 1.0F, 0.0F, 0.0F);
      float var12 = -30.0F;
      net.y6.z.C();
      float var13 = 0.0F;
      float var10001 = 1.5F;
      double[] var15 = var9.O(6, this.i);
      float var16 = this.x(var9.O(5, this.i)[0] - var9.O(10, this.i)[0]);
      float var17 = this.x(var9.O(5, this.i)[0] + (double)(var16 / 2.0F));
      float var18 = var10 * 6.2831855F;
      var12 = 20.0F;
      float var19 = -12.0F;
      int var20 = 0;
      double[] var21 = var9.O(5 - var20, this.i);
      float var22 = (float)Math.cos((double)((float)var20 * 0.45F + var18)) * 0.15F;
      this.R.N = this.x(var21[0] - var15[0]) * 0.017453292F * 1.5F;
      this.R.b = var22 + var9.P(var20, var15, var21) * 0.017453292F * 1.5F * 5.0F;
      this.R.c = -this.x(var21[0] - (double)var17) * 0.017453292F * 1.5F;
      this.R.I = var12;
      this.R.h = var19;
      this.R.l = var13;
      var12 = (float)((double)var12 + Math.sin((double)this.R.b) * 10.0D);
      var19 = (float)((double)var19 - Math.cos((double)this.R.N) * Math.cos((double)this.R.b) * 10.0D);
      var13 = (float)((double)var13 - Math.sin((double)this.R.N) * Math.cos((double)this.R.b) * 10.0D);
      this.R.B(var7);
      ++var20;
      this.Q.I = var12;
      this.Q.h = var19;
      this.Q.l = var13;
      double[] var37 = var9.O(0, this.i);
      this.Q.N = this.x(var37[0] - var15[0]) * 0.017453292F;
      this.Q.b = this.x((double)var9.P(6, var15, var37)) * 0.017453292F * 1.5F * 5.0F;
      this.Q.c = -this.x(var37[0] - (double)var17) * 0.017453292F;
      this.Q.B(var7);
      net.y.d.c();
      net.y.d.O(0.0F, 1.0F, 0.0F);
      net.y.d.P(-var16 * 1.5F, 0.0F, 0.0F, 1.0F);
      net.y.d.O(0.0F, -1.0F, 0.0F);
      this.Z.c = 0.0F;
      this.Z.B(var7);
      int var39 = 0;
      net.y.d.a();
      var22 = var10 * 6.2831855F;
      this.a.b = 0.125F - (float)Math.cos((double)var22) * 0.2F;
      this.a.N = 0.25F;
      this.a.c = (float)(Math.sin((double)var22) + 0.125D) * 0.8F;
      this.u.c = -((float)(Math.sin((double)(var22 + 2.0F)) + 0.5D)) * 0.75F;
      this.F.b = 1.0F + var11 * 0.1F;
      this.X.b = 0.5F + var11 * 0.1F;
      this.N.b = 0.75F + var11 * 0.1F;
      this.c.b = 1.3F + var11 * 0.1F;
      this.r.b = -0.5F - var11 * 0.1F;
      this.s.b = 0.75F + var11 * 0.1F;
      this.a.B(var7);
      this.c.B(var7);
      this.F.B(var7);
      net.y.d.W(-1.0F, 1.0F, 1.0F);
      net.y.d.s(net.y.d.FRONT);
      ++var39;
      net.y.d.Y();
      net.y.d.s(net.y.d.BACK);
      net.y.d.j();
      float var41 = -((float)Math.sin((double)(var10 * 6.2831855F))) * 0.0F;
      var18 = var10 * 6.2831855F;
      var12 = 10.0F;
      var19 = 60.0F;
      var13 = 0.0F;
      var15 = var9.O(11, this.i);
      int var44 = 0;
      var37 = var9.O(12 + var44, this.i);
      var41 = (float)((double)var41 + Math.sin((double)((float)var44 * 0.45F + var18)) * 0.05000000074505806D);
      this.R.N = (this.x(var37[0] - var15[0]) * 1.5F + 180.0F) * 0.017453292F;
      this.R.b = var41 + (float)(var37[1] - var15[1]) * 0.017453292F * 1.5F * 5.0F;
      this.R.c = this.x(var37[0] - (double)var17) * 0.017453292F * 1.5F;
      this.R.I = var12;
      this.R.h = var19;
      this.R.l = var13;
      var12 = (float)((double)var12 + Math.sin((double)this.R.b) * 10.0D);
      var19 = (float)((double)var19 - Math.cos((double)this.R.N) * Math.cos((double)this.R.b) * 10.0D);
      var13 = (float)((double)var13 - Math.sin((double)this.R.N) * Math.cos((double)this.R.b) * 10.0D);
      this.R.B(var7);
      ++var44;
      net.y.d.Y();
   }

   private float x(double var1) {
      while(var1 >= 180.0D) {
         var1 -= 360.0D;
      }

      while(var1 < -180.0D) {
         var1 += 360.0D;
      }

      return (float)var1;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
