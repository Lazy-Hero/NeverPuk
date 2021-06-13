package net;

import java.awt.Color;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import net.d1;
import net.db;
import net.gn;
import net.gp;
import net.ij;
import net.mc;
import net.mk;
import net.mr;
import net.or;
import net.ue;
import net.uz;
import net.v6;
import net.xh;
import net.xn;
import net.zb;
import net.n0.ks;
import net.n1.f;
import net.n1.g;
import net.n1.o;
import net.nb.j;
import net.ne.a;
import net.ne.l;
import net.nk.f0;
import net.nm.b;
import net.nm.h;
import net.nm.i;
import net.nm.k;
import net.nm.s;
import net.r.r;
import net.u.e;
import net.y.d;
import net.y.m;
import net.y.n;
import net.yn.w;
import net.z.t;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.GLU;

public class vs extends mk {
   private final IntBuffer H = m.z(16);
   private final FloatBuffer k = m.R(16);
   private final FloatBuffer V = m.R(16);
   private final FloatBuffer Y = m.R(4);
   private final int I = (new Color(0, 0, 0, 120)).getRGB();
   private final int a = Color.BLACK.getRGB();
   private final mc e;
   private final mc s;
   private final mc O;
   private final mc Z;
   private final mc R;
   private final mc j;
   private final mc U;

   public vs() {
      super("ESP", or.Visuals);
      ArrayList var1 = new ArrayList();
      var1.add("CSGO");
      var1.add("None");
      gn.Q.J.d(new mc("ESP Mode", this, "CSGO", var1));
      gn.Q.J.d(this.e = new mc("Health Rect", this, true));
      gn.Q.J.d(this.s = new mc("Render Armor", this, true));
      gn.Q.J.d(this.Z = new mc("Render Tags", this, true));
      gn.Q.J.d(this.U = new mc("Item ESP", this, false));
      gn.Q.J.d(this.R = new mc("ESP Color", this, (new Color(16777215)).getRGB(), true));
      gn.Q.J.d(this.j = new mc("Item ESP Color", this, (new Color(16777215)).getRGB(), true));
      gn.Q.J.d(this.O = new mc("Client Color", this, false));
   }

   @mr
   public void l(ue var1) {
      if(this.v()) {
         Color var2 = new Color(this.j.T());
         Color var3 = new Color(var2.getRed(), var2.getGreen(), var2.getBlue(), 255);
         if(this.U.Q()) {
            for(l var5 : p.s8.J) {
               if(var5 instanceof i) {
                  if(!this.O.Q()) {
                     d.T((float)var3.getRed() / 255.0F, (float)var3.getGreen() / 255.0F, (float)var3.getBlue() / 255.0F, 0.3F);
                     xh.A(var5, (float)var3.getRed() / 255.0F, (float)var3.getGreen() / 255.0F, (float)var3.getBlue() / 255.0F, (float)var3.getAlpha() / 255.0F);
                  } else {
                     xh.A(var5, (float)gn.M().getRed() / 255.0F, (float)gn.M().getGreen() / 255.0F, (float)gn.M().getBlue() / 255.0F, (float)gn.M().getAlpha() / 255.0F);
                     d.T((float)gn.M().getRed() / 255.0F, (float)gn.M().getGreen() / 255.0F, (float)gn.M().getBlue() / 255.0F, 0.3F);
                  }
               }
            }
         }

      }
   }

   @mr
   public void p(db var1) {
      String var3 = gn.Q.J.S("ESP Mode").M();
      int var10000 = j.V();
      this.t(var3);
      GL11.glPushMatrix();
      float var4 = p.s9.x;
      int var5 = t.K();
      double var6 = (double)var5 / Math.pow((double)var5, 2.0D);
      GL11.glScaled(var6, var6, var6);
      int var8 = this.a;
      Color var9 = new Color(this.R.T());
      int var2 = var10000;
      Color var10 = new Color(var9.getRed(), var9.getGreen(), var9.getBlue(), 255);
      int var11 = this.O.Q()?gn.M().getRGB():var10.getRGB();
      float var12 = 1.0F;
      float var13 = 1.0F / var12;
      net.y0.d var14 = p.N();
      n var15 = p.s4;
      Iterator var16 = p.s8.J.iterator();
      if(var16.hasNext()) {
         l var17 = (l)var16.next();
         if(this.X(var17) && xh.F(var17)) {
            double var18 = xh.m(var17.b, var17.hL, (double)var4);
            double var20 = xh.m(var17.hS, var17.F, (double)var4);
            double var22 = xh.m(var17.hr, var17.A, (double)var4);
            double var24 = (double)var17.h9 / 1.5D;
            double var26 = (double)var17.m + (!var17.Q() && (var17 != p.sf || !p.sf.Q())?0.2D:-0.3D);
            e var28 = new e(var18 - var24, var20, var22 - var24, var18 + var24, var20 + var26, var22 + var24);
            gp[] var29 = new gp[]{new gp(var28.n, var28.u, var28.N), new gp(var28.n, var28.c, var28.N), new gp(var28.d, var28.u, var28.N), new gp(var28.d, var28.c, var28.N), new gp(var28.n, var28.u, var28.r), new gp(var28.n, var28.c, var28.r), new gp(var28.d, var28.u, var28.r), new gp(var28.d, var28.c, var28.r)};
            var15.R(var4, 0);
            uz var30 = null;
            int var32 = var29.length;
            int var33 = 0;
            if(var33 < var32) {
               gp var34 = var29[var33];
               var34 = this.F(var5, var34.n - var14.h, var34.Z - var14.e, var34.B - var14.w);
               if(var34 != null && Double.compare(var34.B, 0.0D) >= 0 && var34.B < 1.0D) {
                  if(var30 == null) {
                     var30 = new uz(var34.n, var34.Z, var34.B, 0.0D);
                  }

                  var30.M = Math.min(var34.n, var30.M);
                  var30.b = Math.min(var34.Z, var30.b);
                  var30.G = Math.max(var34.n, var30.G);
                  var30.d = Math.max(var34.Z, var30.d);
               }

               ++var33;
            }

            if(var30 != null) {
               var15.u();
               double var31 = var30.M;
               double var59 = var30.b;
               double var35 = var30.G;
               double var37 = var30.d;
               if(var3.equalsIgnoreCase("CSGO")) {
                  xh.J(var31 + 1.0D, var59, var31 - 1.0D, var59 + (var37 - var59) / 4.0D + 0.5D, var8);
                  xh.J(var31 - 2.0D, var37, var31 + 0.5D, var37 - (var37 - var59) / 4.0D - 0.5D, var8);
                  xh.J(var31 - 2.0D, var59 - 0.5D, var31 + (var35 - var31) / 3.0D + 0.5D, var59 + 1.0D, var8);
                  xh.J(var35 - (var35 - var31) / 3.0D - 1.0D, var59 - 0.5D, var35, var59 + 1.0D, var8);
                  xh.J(var35 - 2.0D, var59, var35 + 0.5D, var59 + (var37 - var59) / 4.0D + 0.5D, var8);
                  xh.J(var35 - 2.0D, var37, var35 + 0.5D, var37 - (var37 - var59) / 4.0D - 0.5D, var8);
                  xh.J(var31 - 2.0D, var37 - 1.0D, var31 + (var35 - var31) / 3.0D + 0.5D, var37 + 0.5D, var8);
                  xh.J(var35 - (var35 - var31) / 3.0D - 1.0D, var37 - 1.0D, var35 + 0.5D, var37 + 0.5D, var8);
                  xh.J(var31, var59, var31 - 1.0D, var59 + (var37 - var59) / 4.0D, var11);
                  xh.J(var31 - 1.0D, var37, var31, var37 - (var37 - var59) / 4.0D, var11);
                  xh.J(var31 - 1.0D, var59, var31 + (var35 - var31) / 3.0D, var59 + 0.5D, var11);
                  xh.J(var35 - (var35 - var31) / 3.0D - 1.0D, var59, var35, var59 + 0.5D, var11);
                  xh.J(var35 - 1.0D, var59, var35, var59 + (var37 - var59) / 4.0D, var11);
                  xh.J(var35 - 1.0D, var37, var35, var37 - (var37 - var59) / 4.0D, var11);
                  xh.J(var31 - 1.0D, var37 - 0.5D, var31 + (var35 - var31) / 3.0D, var37, var11);
                  xh.J(var35 - (var35 - var31) / 3.0D - 2.0D, var37 - 0.5D, var35 - 0.5D, var37, var11);
               }

               boolean var39 = var17 instanceof a;
               a var41 = (a)var17;
               float var42 = var41.h();
               float var43 = var41.w();
               double var44 = (double)(var42 / var43);
               double var46 = (var37 - var59) * var44;
               if(Float.compare(var42, 4.0F) <= 0) {
                  int var40 = (new Color(200, 0, 0)).getRGB();
               }

               if(var42 <= 8.0F) {
                  int var61 = (new Color(231, 143, 85)).getRGB();
               }

               if(var42 <= 12.0F) {
                  int var62 = (new Color(219, 201, 106)).getRGB();
               }

               if(var42 <= 16.0F) {
                  int var63 = (new Color(117, 231, 85)).getRGB();
               }

               int var64 = (new Color(44, 186, 19)).getRGB();
               if(Float.compare(var42, 0.0F) > 0) {
                  if(var39 && this.e.Q()) {
                     net.u.t.T(var42, 0.0F, 20.0F);
                     xh.J(var31 - 4.5D, var59 - 0.699999988079071D, var31 - 1.0D, var37 + 0.30000001192092896D, (new Color(0, 0, 0, 255)).getRGB());
                     if(Float.compare(var42, 0.0F) > 0) {
                        if(p.sf.d(var17) <= 8.0F) {
                           xh.J(var31 - 3.5D, var37, var31 - 2.0D, var37 - var46 - (double)(Float.compare(((a)var17).h(), 18.0F) < 0?5:0), (new Color(255, 0, 0)).getRGB());
                        }

                        xh.J(var31 - 3.5D, var37, var31 - 2.0D, var37 - var46, var64);
                     }
                  }

                  if(var39 && this.Z.Q() && !gn.Q.j.d(v6.class).v()) {
                     float var48 = 20.0F;
                     String var49 = var17.Q();
                     if(gn.Q.j.d(d1.class).v() && d1.u.Q()) {
                        var49 = "Protected";
                     }

                     double var50 = (var35 - var31) / 2.0D;
                     double var52 = (double)((float)p.x.s(var49 + " §7" + (int)p.sf.d(var17) + "m") * var12);
                     float var54 = (float)((var31 + var50 - var52 / 2.0D) * (double)var13);
                     float var55 = (float)(var59 * (double)var13) - var48;
                     GL11.glPushMatrix();
                     d.W(var12, var12, var12);
                     ij.o(var49, p.sO, var54 + 5.0F, var55 + 5.0F, -1);
                     GL11.glPopMatrix();
                  }

                  if(var39 && this.s.Q() && var17 instanceof r) {
                     r var65 = (r)var17;
                     double var66 = (var37 - var59) / 4.0D;
                     ks var51 = var65.k(4);
                     if(p.sf.d(var65) <= 15.0F) {
                        if(var51 != null) {
                           double var67 = var59 + var66 - 1.0D - (var59 + 2.0D);
                           double var73 = 1.0D - (double)var51.z() / (double)var51.Z();
                           xh.x(var51, (int)var35 + 4, (int)var59 + (int)var66 - 1 - (int)(var67 / 2.0D) - 18);
                        }

                        ks var68 = var65.k(3);
                        if(var68 != null) {
                           double var53 = var59 + var66 * 2.0D - (var59 + var66 + 2.0D);
                           if(var51.j().equalsIgnoreCase("Air")) {
                              String var74 = "0";
                           } else if(!(var68.Z() instanceof net.n0.j)) {
                              var68.j();
                           } else {
                              (new StringBuilder()).append(var68.Z() - var68.z()).append("").toString();
                           }

                           if(p.sf.d(var65) < 10.0F) {
                              xh.x(var68, (int)var35 + 4, (int)(var59 + var66 * 2.0D) - (int)(var53 / 2.0D) - 18);
                           }
                        }

                        ks var69 = var65.k(2);
                        if(var69 != null) {
                           double var70 = var59 + var66 * 3.0D - (var59 + var66 * 2.0D + 2.0D);
                           if(p.sf.d(var65) < 10.0F) {
                              xh.x(var69, (int)var35 + 4, (int)(var59 + var66 * 3.0D) - (int)(var70 / 2.0D) - 18);
                           }
                        }

                        ks var71 = var65.k(1);
                        double var72 = var59 + var66 * 4.0D - (var59 + var66 * 3.0D + 2.0D);
                        if(p.sf.d(var65) < 10.0F) {
                           xh.x(var71, (int)var35 + 4, (int)(var59 + var66 * 4.0D) - (int)(var72 / 2.0D) - 18);
                        }
                     }
                  }
               }
            }
         }
      }

      GL11.glPopMatrix();
      GL11.glEnable(2929);
      d.C();
      var15.u();
      if(net.u.d.y() == null) {
         ++var2;
         j.L(var2);
      }

   }

   @mr
   public void s(zb var1) {
      if(this.v()) {
         var1.H(this.Z.Q());
      }
   }

   private boolean X(l var1) {
      return p.T.wR == 0 && var1 == p.sf?false:(var1.Z?false:(var1 instanceof w?false:(var1 instanceof r?true:(var1 instanceof net.nm.z?false:(var1 instanceof net.yn.wy?false:(var1 instanceof net.nm.e?false:(!(var1 instanceof o) && !(var1 instanceof net.n1.l)?(var1 instanceof net.nm.w?false:(var1 instanceof b?false:(var1 instanceof f?false:(var1 instanceof s?false:(var1 instanceof net.nm.t?false:(var1 instanceof k?false:(var1 instanceof net.nm.m?false:(var1 instanceof net.yn.s?false:(var1 instanceof h?false:(var1 instanceof net.yi.e?false:(var1 instanceof g?false:(var1 instanceof l?false:(!(var1 instanceof net.nk.i) && !(var1 instanceof f0) && !(var1 instanceof net.a.t) && !(var1 instanceof net.nk.d)?var1 != p.sf:false))))))))))))):false)))))));
   }

   private gp F(int var1, double var2, double var4, double var6) {
      GL11.glGetFloat(2982, this.k);
      GL11.glGetFloat(2983, this.V);
      GL11.glGetInteger(2978, this.H);
      return GLU.gluProject((float)var2, (float)var4, (float)var6, this.k, this.V, this.H, this.Y)?new gp((double)(this.Y.get(0) / (float)var1), (double)(((float)Display.getHeight() - this.Y.get(1)) / (float)var1), (double)this.Y.get(2)):null;
   }

   private static xn b(xn var0) {
      return var0;
   }
}
