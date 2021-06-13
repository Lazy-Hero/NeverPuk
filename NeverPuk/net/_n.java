package net;

import net.mf;
import net.xn;
import net.ne.l;
import net.nn.j;
import net.u.r;
import net.y.d;
import net.y.m;
import org.lwjgl.opengl.GL11;

public class _n {
   private final j w;
   private boolean r = false;
   private boolean E = false;
   int Q;
   private r M;
   float V;
   private boolean R = false;
   private int k = 0;
   private r N = new r(-1.0D, -1.0D, -1.0D);
   private double B = 0.0D;
   private double a = 0.0D;
   private double n = 0.0D;
   private int m = -1;

   public _n(j var1) {
      this.w = var1;
      this.m = m.X(1);
   }

   public void P(boolean var1, int var2, float var3, r var4) {
      this.E = var1;
      this.Q = var2;
      this.V = var3;
      this.M = var4;
   }

   public boolean y() {
      String var1 = mf.O();
      if(!this.r) {
         return true;
      } else if(this.E != this.R) {
         return true;
      } else if(this.Q >= this.k + 20) {
         return true;
      } else if(Double.compare(Math.abs(this.M.p - this.N.p), 0.003D) > 0) {
         return true;
      } else if(Double.compare(Math.abs(this.M.H - this.N.H), 0.003D) > 0) {
         return true;
      } else if(Math.abs(this.M.a - this.N.a) > 0.003D) {
         return true;
      } else {
         l var2 = this.w.A();
         boolean var3 = Double.compare(this.a + (double)var2.A(), 128.0D + (double)(this.w.T.wH * 128.0F)) < 0;
         boolean var4 = Double.compare(var2.h6 + (double)var2.A(), 128.0D + (double)(this.w.T.wH * 128.0F)) < 0;
         return false;
      }
   }

   public void v() {
      GL11.glNewList(this.m, 4864);
   }

   public void C() {
      GL11.glEndList();
      this.R = this.E;
      this.k = this.Q;
      this.N = this.M;
      this.B = this.w.A().h;
      this.a = this.w.A().h6;
      this.n = this.w.A().l;
      this.r = true;
      d.b();
   }

   public void M() {
      l var1 = this.w.A();
      double var2 = var1.h + (var1.b - var1.h) * (double)this.V;
      double var4 = var1.h6 + (var1.hS - var1.h6) * (double)this.V;
      double var6 = var1.l + (var1.hr - var1.l) * (double)this.V;
      double var8 = (double)((float)(this.Q - this.k) + this.V);
      float var10 = (float)(var2 - this.B + var8 * 0.03D);
      float var11 = (float)(var4 - this.a);
      float var12 = (float)(var6 - this.n);
      d.c();
      if(this.E) {
         d.O(-var10 / 12.0F, -var11, -var12 / 12.0F);
      } else {
         d.O(-var10, -var11, -var12);
      }

      d.I(this.m);
      d.Y();
      d.b();
   }

   public void Y() {
      this.r = false;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
