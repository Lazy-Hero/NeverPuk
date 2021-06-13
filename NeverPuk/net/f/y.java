package net.f;

import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.Map;
import net.xn;
import net.b.c;
import net.b.t;
import net.f.l;
import net.nn.j;
import net.r.r;
import net.u.e;
import net.y.p;
import net.y.u;

public class y implements l.g {
   private final j t;
   private final Map D = Maps.newHashMap();
   private final Map W = Maps.newHashMap();
   private final Map Y = Maps.newHashMap();
   private r Z;
   private double r;
   private double z;
   private double j;

   public y(j var1) {
      this.t = var1;
   }

   public void c(int var1, t var2, float var3) {
      this.D.put(Integer.valueOf(var1), var2);
      this.Y.put(Integer.valueOf(var1), Long.valueOf(System.currentTimeMillis()));
      this.W.put(Integer.valueOf(var1), Float.valueOf(var3));
   }

   public void X(float var1, long var2) {
      String var4 = l.K();
      if(!this.D.isEmpty()) {
         long var5 = System.currentTimeMillis();
         this.Z = this.t.sf;
         this.r = this.Z.hL + (this.Z.b - this.Z.hL) * (double)var1;
         this.z = this.Z.F + (this.Z.hS - this.Z.F) * (double)var1;
         this.j = this.Z.A + (this.Z.hr - this.Z.A) * (double)var1;
         net.y.d.c();
         net.y.d.C();
         net.y.d.e(net.y.d.SRC_ALPHA, net.y.d.ONE_MINUS_SRC_ALPHA, net.y.d.ONE, net.y.d.ZERO);
         net.y.d.T(0.0F, 1.0F, 0.0F, 0.75F);
         net.y.d.w();
         net.y.d.y(6.0F);
         Iterator var7 = this.D.keySet().iterator();
         if(var7.hasNext()) {
            Integer var8 = (Integer)var7.next();
            t var9 = (t)this.D.get(var8);
            float var10 = ((Float)this.W.get(var8)).floatValue();
            this.g(var1, var9);
            c var11 = var9.W();
            if(Float.compare(this.G(var11), 40.0F) <= 0) {
               u.Y((new e((double)((float)var11.H + 0.25F), (double)((float)var11.E + 0.25F), (double)var11.i + 0.25D, (double)((float)var11.H + 0.75F), (double)((float)var11.E + 0.75F), (double)((float)var11.i + 0.75F))).w(-this.r, -this.z, -this.j), 0.0F, 1.0F, 0.0F, 0.5F);
               int var12 = 0;
               if(var12 < var9.R()) {
                  c var13 = var9.y(var12);
                  if(Float.compare(this.G(var13), 40.0F) <= 0) {
                     float var14 = var12 == var9.P()?1.0F:0.0F;
                     float var15 = var12 == var9.P()?0.0F:1.0F;
                     u.Y((new e((double)((float)var13.H + 0.5F - var10), (double)((float)var13.E + 0.01F * (float)var12), (double)((float)var13.i + 0.5F - var10), (double)((float)var13.H + 0.5F + var10), (double)((float)var13.E + 0.25F + 0.01F * (float)var12), (double)((float)var13.i + 0.5F + var10))).w(-this.r, -this.z, -this.j), var14, 0.0F, var15, 0.5F);
                  }

                  ++var12;
               }
            }
         }

         var7 = this.D.keySet().iterator();
         if(var7.hasNext()) {
            Integer var18 = (Integer)var7.next();
            t var20 = (t)this.D.get(var18);
            c[] var23 = var20.N();
            int var28 = var23.length;
            int var32 = 0;
            if(var32 < var28) {
               c var36 = var23[var32];
               if(Float.compare(this.G(var36), 40.0F) <= 0) {
                  l.M(String.format("%s", new Object[]{var36.j}), (double)var36.H + 0.5D, (double)var36.E + 0.75D, (double)var36.i + 0.5D, var1, -65536);
                  l.M(String.format("%.2f", new Object[]{Float.valueOf(var36.v)}), (double)var36.H + 0.5D, (double)var36.E + 0.25D, (double)var36.i + 0.5D, var1, -65536);
               }

               ++var32;
            }

            var23 = var20.Q();
            var28 = var23.length;
            var32 = 0;
            if(var32 < var28) {
               c var37 = var23[var32];
               if(Float.compare(this.G(var37), 40.0F) <= 0) {
                  l.M(String.format("%s", new Object[]{var37.j}), (double)var37.H + 0.5D, (double)var37.E + 0.75D, (double)var37.i + 0.5D, var1, -16776961);
                  l.M(String.format("%.2f", new Object[]{Float.valueOf(var37.v)}), (double)var37.H + 0.5D, (double)var37.E + 0.25D, (double)var37.i + 0.5D, var1, -16776961);
               }

               ++var32;
            }

            int var25 = 0;
            if(var25 < var20.R()) {
               c var30 = var20.y(var25);
               if(Float.compare(this.G(var30), 40.0F) <= 0) {
                  l.M(String.format("%s", new Object[]{var30.j}), (double)var30.H + 0.5D, (double)var30.E + 0.75D, (double)var30.i + 0.5D, var1, -1);
                  l.M(String.format("%.2f", new Object[]{Float.valueOf(var30.v)}), (double)var30.H + 0.5D, (double)var30.E + 0.25D, (double)var30.i + 0.5D, var1, -1);
               }

               ++var25;
            }
         }

         Integer[] var17 = (Integer[])this.Y.keySet().toArray(new Integer[0]);
         int var19 = var17.length;
         int var21 = 0;
         if(var21 < var19) {
            Integer var27 = var17[var21];
            if(var5 - ((Long)this.Y.get(var27)).longValue() > 20000L) {
               this.D.remove(var27);
               this.Y.remove(var27);
            }

            ++var21;
         }

         net.y.d.S();
         net.y.d.E();
         net.y.d.Y();
      }

   }

   public void g(float var1, t var2) {
      net.y.r var3 = net.y.r.f();
      p var4 = var3.k();
      var4.m(3, net.y8.x.F);

      for(int var5 = 0; var5 < var2.R(); ++var5) {
         c var6 = var2.y(var5);
         if(this.G(var6) <= 40.0F) {
            float var10000 = (float)var5 / (float)var2.R() * 0.33F;
            byte var8 = 0;
            int var9 = var8 >> 16 & 255;
            int var10 = var8 >> 8 & 255;
            int var11 = var8 & 255;
            var4.H((double)var6.H - this.r + 0.5D, (double)var6.E - this.z + 0.5D, (double)var6.i - this.j + 0.5D).V(var9, var10, var11, 255).W();
         }
      }

      var3.p();
   }

   private float G(c var1) {
      return (float)(Math.abs((double)var1.H - this.Z.b) + Math.abs((double)var1.E - this.Z.hS) + Math.abs((double)var1.i - this.Z.hr));
   }

   private static xn a(xn var0) {
      return var0;
   }
}
