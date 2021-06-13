package net.y0;

import com.google.common.collect.Lists;
import java.awt.Color;
import java.nio.FloatBuffer;
import java.util.List;
import net._x;
import net.gn;
import net.i6;
import net.oz;
import net.v3;
import net.v6;
import net.vn;
import net.vs;
import net.xu;
import net.z9;
import net.zq;
import net.y.ui;
import net.y0.c;
import net.y0.d;
import net.ye.wr;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL11;

public abstract class o extends c {
   private static final Logger f;
   private static final net.n9.x H;
   public net.y6.z y;
   protected FloatBuffer Y = net.y.m.R(4);
   protected List L = Lists.newArrayList();
   protected boolean Q;
   public static float F;
   public static float M;
   public float t;
   public float s;
   public float x;
   public float U;
   public float J;
   public float q;
   public static final boolean a;
   private static String D;
   private static final String[] cb;
   private static final String[] db;

   public o(d var1, net.y6.z var2, float var3) {
      super(var1);
      this.y = var2;
      this.W = var3;
   }

   public boolean k(wr var1) {
      return this.L.add(var1);
   }

   public net.y6.z v() {
      return this.y;
   }

   protected float l(float var1, float var2, float var3) {
      float var4;
      for(var4 = var2 - var1; var4 < -180.0F; var4 += 360.0F) {
         ;
      }

      while(var4 >= 180.0F) {
         var4 -= 360.0F;
      }

      return var1 + var3 * var4;
   }

   public void E() {
   }

   public void R(net.ne.a var1, double var2, double var4, double var6, float var8, float var9) {
      boolean var10 = c.q();
      if(!i6.y.Z() || !i6.C(i6.y, new Object[]{var1, this, Float.valueOf(var9), Double.valueOf(var2), Double.valueOf(var4), Double.valueOf(var6)})) {
         if(a) {
            var1.Aq = 1.0F;
         }

         net.y.d.c();
         net.y.d.j();
         this.y.v = this.D(var1, var9);
         this.y.z = var1.M();
         if(i6.Be.r()) {
            this.y.z = var1.M() && var1.D() != null && i6.I(var1.D(), i6.Be, new Object[0]);
         }

         this.y.n = var1.H9();
         float var12 = this.l(var1.Az, var1.AK, var9);
         float var13 = this.l(var1.AH, var1.A3, var9);
         float var14 = var13 - var12;
         if(this.y.z && var1.D() instanceof net.ne.a) {
            net.ne.a var15 = (net.ne.a)var1.D();
            var12 = this.l(var15.Az, var15.AK, var9);
            var14 = var13 - var12;
            float var16 = net.u.t.k(var14);
            if(Float.compare(var16, -85.0F) < 0) {
               var16 = -85.0F;
            }

            if(Float.compare(var16, 85.0F) >= 0) {
               var16 = 85.0F;
            }

            var12 = var13 - var16;
            if(var16 * var16 > 2500.0F) {
               var12 += var16 * 0.2F;
            }

            var14 = var13 - var12;
         }

         if(var1 == this.A.J) {
            float var10000 = var1.AZ + (var1.AX - var1.AZ) * var9;
         }

         float var11 = var1.d + (var1.V - var1.d) * var9;
         this.K(var1, var2, var4, var6);
         float var22 = this.z(var1, var9);
         this.o(var1, var22, var12, var9);
         float var23 = this.I(var1, var9);
         float var17 = 0.0F;
         float var18 = 0.0F;
         if(!var1.M() && (!gn.Q.j.d(v3.class).v() || !v3.d.Q())) {
            var17 = var1.AS + (var1.Aq - var1.AS) * var9;
            var18 = var1.A5 - var1.Aq * (1.0F - var9);
            if(var1.H9()) {
               var18 *= 3.0F;
            }

            if(Float.compare(var17, 1.0F) > 0) {
               var17 = 1.0F;
            }
         }

         net.y.d.m();
         this.y.x(var1, var18, var17, var9);
         this.y.p(var18, var17, var22, var14, var11, var23, var1);
         if(xu.Q()) {
            this.t = var18;
            this.s = var17;
            this.x = var22;
            this.U = var14;
            this.J = var11;
            this.q = var23;
         }

         if(this.g) {
            boolean var19 = this.r(var1);
            net.y.d.G();
            net.y.d.o(this.B(var1));
            if(!this.Q) {
               this.I(var1, var18, var17, var22, var14, var11, var23);
            }

            if(!(var1 instanceof net.r.r) || !((net.r.r)var1).VX()) {
               this.a(var1, var18, var17, var9, var22, var14, var11, var23);
            }

            net.y.d.o();
            net.y.d.e();
            if(var19) {
               this.t();
            }
         }

         boolean var24 = this.C(var1, var9);
         this.I(var1, var18, var17, var22, var14, var11, var23);
         if(var24) {
            this.I();
         }

         net.y.d.Y(true);
         if(!(var1 instanceof net.r.r) || !((net.r.r)var1).VX()) {
            this.a(var1, var18, var17, var9, var22, var14, var11, var23);
         }

         net.y.d.g();
         net.y.d.t(ui.w);
         net.y.d.S();
         net.y.d.t(ui.V);
         net.y.d.a();
         net.y.d.Y();
         super.w(var1, var2, var4, var6, var8, var9);
         if(i6.Cp.Z()) {
            i6.C(i6.Cp, new Object[]{var1, this, Float.valueOf(var9), Double.valueOf(var2), Double.valueOf(var4), Double.valueOf(var6)});
         }
      }

   }

   public float I(net.ne.a var1, float var2) {
      net.y.d.F();
      net.y.d.W(-1.0F, -1.0F, 1.0F);
      this.N(var1, var2);
      float var10000 = 0.0625F;
      net.y.d.O(0.0F, -1.501F, 0.0F);
      return 0.0625F;
   }

   protected boolean r(net.ne.a var1) {
      net.y.d.i();
      net.y.d.t(ui.w);
      net.y.d.w();
      net.y.d.t(ui.V);
      return true;
   }

   protected void t() {
      net.y.d.K();
      net.y.d.t(ui.w);
      net.y.d.S();
      net.y.d.t(ui.V);
   }

   protected void I(net.ne.a var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      boolean var8 = this.Y(var1);
      boolean var9 = !var1.d(net.nn.j.b().sf);
      boolean var10 = gn.Q.j.d(vn.class).v() && var1 instanceof net.r.r;
      Color var11 = new Color(vn.d.T());
      Color var12 = new Color(var11.getRed(), var11.getGreen(), var11.getBlue());
      if(this.j(var1)) {
         net.y.d.f(net.y.d.TRANSPARENT_MODEL);
         GL11.glPushMatrix();
         GL11.glEnable(10754);
         GL11.glPolygonOffset(1.0F, 1000000.0F);
         ui.c(ui.w, 240.0F, 240.0F);
         GL11.glEnable(3042);
         GL11.glDisable(3553);
         GL11.glDisable(2896);
         GL11.glBlendFunc(770, 771);
         if(!vn.F.Q()) {
            net.y.d.T((float)var12.darker().getRed() / 255.0F, (float)var12.darker().darker().getGreen() / 255.0F, (float)var12.darker().getBlue() / 255.0F, vn.r.e());
         } else {
            net.y.d.T((float)gn.M().darker().getRed() / 255.0F, (float)gn.M().darker().getGreen() / 255.0F, (float)gn.M().darker().getBlue() / 255.0F, vn.r.e());
         }

         GL11.glDisable(2929);
         GL11.glDepthMask(false);
         this.y.V(var1, var2, var3, var4, var5, var6, var7);
         GL11.glEnable(2929);
         GL11.glDepthMask(true);
         if(!vn.F.Q()) {
            net.y.d.T((float)var12.getRed() / 255.0F, (float)var12.getGreen() / 255.0F, (float)var12.getBlue() / 255.0F, vn.r.e());
         } else {
            net.y.d.T((float)gn.M().getRed() / 255.0F, (float)gn.M().getGreen() / 255.0F, (float)gn.M().getBlue() / 255.0F, vn.r.e());
         }

         this.y.V(var1, var2, var3, var4, var5, var6, var7);
         GL11.glEnable(3553);
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         GL11.glDisable(3042);
         GL11.glEnable(2896);
         GL11.glPolygonOffset(1.0F, -1000000.0F);
         GL11.glDisable(10754);
         GL11.glPopMatrix();
         net.y.d.C(net.y.d.TRANSPARENT_MODEL);
      }
   }

   protected boolean Y(net.ne.a var1) {
      return !var1.e() || this.g;
   }

   protected boolean C(net.ne.a var1, float var2) {
      return this.Z(var1, var2, true);
   }

   protected boolean Z(net.ne.a var1, float var2, boolean var3) {
      float var4 = var1.d();
      int var5 = this.f(var1, var4, var2);
      boolean var6 = (var5 >> 24 & 255) > 0;
      boolean var7 = var1.Xl > 0 || var1.AA > 0;
      return false;
   }

   protected void I() {
      net.y.d.t(ui.V);
      net.y.d.S();
      net.y.d.h(8960, 8704, ui.r);
      net.y.d.h(8960, ui.S, 8448);
      net.y.d.h(8960, ui.D, ui.V);
      net.y.d.h(8960, ui.qG, ui.W);
      net.y.d.h(8960, ui.Y, 768);
      net.y.d.h(8960, ui.k, 768);
      net.y.d.h(8960, ui.e, 8448);
      net.y.d.h(8960, ui.qZ, ui.V);
      net.y.d.h(8960, ui.N, ui.W);
      net.y.d.h(8960, ui.c, 770);
      net.y.d.h(8960, ui.C, 770);
      net.y.d.t(ui.w);
      net.y.d.h(8960, 8704, ui.r);
      net.y.d.h(8960, ui.S, 8448);
      net.y.d.h(8960, ui.Y, 768);
      net.y.d.h(8960, ui.k, 768);
      net.y.d.h(8960, ui.D, 5890);
      net.y.d.h(8960, ui.qG, ui.z);
      net.y.d.h(8960, ui.e, 8448);
      net.y.d.h(8960, ui.c, 770);
      net.y.d.h(8960, ui.qZ, 5890);
      net.y.d.T(1.0F, 1.0F, 1.0F, 1.0F);
      net.y.d.t(ui.a);
      net.y.d.w();
      net.y.d.z(0);
      net.y.d.h(8960, 8704, ui.r);
      net.y.d.h(8960, ui.S, 8448);
      net.y.d.h(8960, ui.Y, 768);
      net.y.d.h(8960, ui.k, 768);
      net.y.d.h(8960, ui.D, 5890);
      net.y.d.h(8960, ui.qG, ui.z);
      net.y.d.h(8960, ui.e, 8448);
      net.y.d.h(8960, ui.c, 770);
      net.y.d.h(8960, ui.qZ, 5890);
      net.y.d.t(ui.V);
      if(z9.Q()) {
         oz.K(0.0F, 0.0F, 0.0F, 0.0F);
      }

   }

   protected void K(net.ne.a var1, double var2, double var4, double var6) {
      net.y.d.O((float)var2, (float)var4, (float)var6);
   }

   protected void o(net.ne.a var1, float var2, float var3, float var4) {
      net.y.d.P(180.0F - var3, 0.0F, 1.0F, 0.0F);
      if(var1.AA > 0) {
         float var5 = ((float)var1.AA + var4 - 1.0F) / 20.0F * 1.6F;
         var5 = net.u.t.g(var5);
         if(var5 > 1.0F) {
            var5 = 1.0F;
         }

         net.y.d.P(var5 * this.L(var1), 0.0F, 0.0F, 1.0F);
      } else {
         String var7 = net.cb.z.q(var1.Q());
         if((b(12085, -10281).equals(var7) || b(12086, -8827).equals(var7)) && (!(var1 instanceof net.r.r) || ((net.r.r)var1).o(net.r.j.CAPE))) {
            net.y.d.O(0.0F, var1.m + 0.1F, 0.0F);
            net.y.d.P(180.0F, 0.0F, 0.0F, 1.0F);
         }
      }

   }

   protected float D(net.ne.a var1, float var2) {
      return var1.p(var2);
   }

   protected float z(net.ne.a var1, float var2) {
      return (float)var1.x + var2;
   }

   protected void a(net.ne.a var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      for(wr var10 : this.L) {
         boolean var11 = this.Z(var1, var4, var10.y());
         var10.t(var1, var2, var3, var4, var5, var6, var7, var8);
         this.I();
      }

   }

   protected float L(net.ne.a var1) {
      return 90.0F;
   }

   protected int f(net.ne.a var1, float var2, float var3) {
      return 0;
   }

   protected void N(net.ne.a var1, float var2) {
   }

   public void p(net.ne.a var1, double var2, double var4, double var6) {
      if(!gn.Q.j.d(v6.class).v() && !gn.Q.j.d(vs.class).v()) {
         if(!i6.Bx.Z() || !i6.C(i6.Bx, new Object[]{var1, this, Double.valueOf(var2), Double.valueOf(var4), Double.valueOf(var6)})) {
            if(this.C(var1)) {
               double var8 = var1.F(this.A.J);
               float var10 = var1.Q()?M:F;
               if(var8 < (double)(var10 * var10)) {
                  zq var11 = new zq(var1, var1.b().c());
                  _x.m(var11);
                  if(var11.t()) {
                     return;
                  }

                  String var12 = var1.b().c();
                  net.y.d.d(516, 0.1F);
                  this.Q(var1, var2, var4, var6, var12, var8);
               }
            }

            if(i6.MU.Z()) {
               i6.C(i6.MU, new Object[]{var1, this, Double.valueOf(var2), Double.valueOf(var4), Double.valueOf(var6)});
            }
         }

      }
   }

   protected boolean C(net.ne.a var1) {
      net.yy.g var2 = net.nn.j.b().sf;
      boolean var3 = !var1.d(var2);
      if(var1 != var2) {
         net.nc.m var4 = var1.f();
         net.nc.m var5 = var2.f();
         net.nc.m var6 = var4.q();
         switch(null.Q[var6.ordinal()]) {
         case 1:
            return var3;
         case 2:
            return false;
         case 3:
            return var3;
         case 4:
            return var3;
         default:
            return true;
         }
      } else {
         return net.nn.j.O() && var1 != this.A.J && !var1.t();
      }
   }

   public List i() {
      return this.L;
   }

   static {
      // $FF: Couldn't be decompiled
   }

   public static void Q(String var0) {
      D = var0;
   }

   public static String M() {
      return D;
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   private static String b(int var0, int var1) {
      int var2 = (var0 ^ 12087) & '\uffff';
      if(db[var2] == null) {
         char[] var3 = cb[var2].toCharArray();
         short var10000;
         switch(var3[0] & 255) {
         case 0:
            var10000 = 239;
            break;
         case 1:
            var10000 = 90;
            break;
         case 2:
            var10000 = 149;
            break;
         case 3:
            var10000 = 22;
            break;
         case 4:
            var10000 = 140;
            break;
         case 5:
            var10000 = 109;
            break;
         case 6:
            var10000 = 7;
            break;
         case 7:
            var10000 = 68;
            break;
         case 8:
            var10000 = 35;
            break;
         case 9:
            var10000 = 44;
            break;
         case 10:
            var10000 = 168;
            break;
         case 11:
            var10000 = 106;
            break;
         case 12:
            var10000 = 21;
            break;
         case 13:
            var10000 = 184;
            break;
         case 14:
            var10000 = 136;
            break;
         case 15:
            var10000 = 198;
            break;
         case 16:
            var10000 = 252;
            break;
         case 17:
            var10000 = 33;
            break;
         case 18:
            var10000 = 169;
            break;
         case 19:
            var10000 = 31;
            break;
         case 20:
            var10000 = 249;
            break;
         case 21:
            var10000 = 236;
            break;
         case 22:
            var10000 = 10;
            break;
         case 23:
            var10000 = 128;
            break;
         case 24:
            var10000 = 208;
            break;
         case 25:
            var10000 = 64;
            break;
         case 26:
            var10000 = 46;
            break;
         case 27:
            var10000 = 182;
            break;
         case 28:
            var10000 = 190;
            break;
         case 29:
            var10000 = 165;
            break;
         case 30:
            var10000 = 13;
            break;
         case 31:
            var10000 = 144;
            break;
         case 32:
            var10000 = 161;
            break;
         case 33:
            var10000 = 94;
            break;
         case 34:
            var10000 = 195;
            break;
         case 35:
            var10000 = 159;
            break;
         case 36:
            var10000 = 151;
            break;
         case 37:
            var10000 = 53;
            break;
         case 38:
            var10000 = 92;
            break;
         case 39:
            var10000 = 183;
            break;
         case 40:
            var10000 = 219;
            break;
         case 41:
            var10000 = 233;
            break;
         case 42:
            var10000 = 212;
            break;
         case 43:
            var10000 = 127;
            break;
         case 44:
            var10000 = 32;
            break;
         case 45:
            var10000 = 73;
            break;
         case 46:
            var10000 = 2;
            break;
         case 47:
            var10000 = 86;
            break;
         case 48:
            var10000 = 175;
            break;
         case 49:
            var10000 = 244;
            break;
         case 50:
            var10000 = 34;
            break;
         case 51:
            var10000 = 72;
            break;
         case 52:
            var10000 = 96;
            break;
         case 53:
            var10000 = 177;
            break;
         case 54:
            var10000 = 37;
            break;
         case 55:
            var10000 = 245;
            break;
         case 56:
            var10000 = 116;
            break;
         case 57:
            var10000 = 247;
            break;
         case 58:
            var10000 = 40;
            break;
         case 59:
            var10000 = 224;
            break;
         case 60:
            var10000 = 157;
            break;
         case 61:
            var10000 = 82;
            break;
         case 62:
            var10000 = 55;
            break;
         case 63:
            var10000 = 254;
            break;
         case 64:
            var10000 = 102;
            break;
         case 65:
            var10000 = 77;
            break;
         case 66:
            var10000 = 205;
            break;
         case 67:
            var10000 = 71;
            break;
         case 68:
            var10000 = 104;
            break;
         case 69:
            var10000 = 242;
            break;
         case 70:
            var10000 = 126;
            break;
         case 71:
            var10000 = 214;
            break;
         case 72:
            var10000 = 167;
            break;
         case 73:
            var10000 = 188;
            break;
         case 74:
            var10000 = 204;
            break;
         case 75:
            var10000 = 150;
            break;
         case 76:
            var10000 = 166;
            break;
         case 77:
            var10000 = 1;
            break;
         case 78:
            var10000 = 51;
            break;
         case 79:
            var10000 = 91;
            break;
         case 80:
            var10000 = 111;
            break;
         case 81:
            var10000 = 105;
            break;
         case 82:
            var10000 = 110;
            break;
         case 83:
            var10000 = 209;
            break;
         case 84:
            var10000 = 153;
            break;
         case 85:
            var10000 = 89;
            break;
         case 86:
            var10000 = 193;
            break;
         case 87:
            var10000 = 130;
            break;
         case 88:
            var10000 = 196;
            break;
         case 89:
            var10000 = 103;
            break;
         case 90:
            var10000 = 164;
            break;
         case 91:
            var10000 = 186;
            break;
         case 92:
            var10000 = 202;
            break;
         case 93:
            var10000 = 85;
            break;
         case 94:
            var10000 = 45;
            break;
         case 95:
            var10000 = 243;
            break;
         case 96:
            var10000 = 141;
            break;
         case 97:
            var10000 = 121;
            break;
         case 98:
            var10000 = 238;
            break;
         case 99:
            var10000 = 229;
            break;
         case 100:
            var10000 = 201;
            break;
         case 101:
            var10000 = 39;
            break;
         case 102:
            var10000 = 9;
            break;
         case 103:
            var10000 = 131;
            break;
         case 104:
            var10000 = 56;
            break;
         case 105:
            var10000 = 230;
            break;
         case 106:
            var10000 = 42;
            break;
         case 107:
            var10000 = 178;
            break;
         case 108:
            var10000 = 241;
            break;
         case 109:
            var10000 = 50;
            break;
         case 110:
            var10000 = 176;
            break;
         case 111:
            var10000 = 156;
            break;
         case 112:
            var10000 = 20;
            break;
         case 113:
            var10000 = 88;
            break;
         case 114:
            var10000 = 74;
            break;
         case 115:
            var10000 = 29;
            break;
         case 116:
            var10000 = 114;
            break;
         case 117:
            var10000 = 38;
            break;
         case 118:
            var10000 = 194;
            break;
         case 119:
            var10000 = 78;
            break;
         case 120:
            var10000 = 52;
            break;
         case 121:
            var10000 = 4;
            break;
         case 122:
            var10000 = 0;
            break;
         case 123:
            var10000 = 76;
            break;
         case 124:
            var10000 = 174;
            break;
         case 125:
            var10000 = 158;
            break;
         case 126:
            var10000 = 8;
            break;
         case 127:
            var10000 = 187;
            break;
         case 128:
            var10000 = 143;
            break;
         case 129:
            var10000 = 24;
            break;
         case 130:
            var10000 = 118;
            break;
         case 131:
            var10000 = 12;
            break;
         case 132:
            var10000 = 192;
            break;
         case 133:
            var10000 = 253;
            break;
         case 134:
            var10000 = 25;
            break;
         case 135:
            var10000 = 101;
            break;
         case 136:
            var10000 = 171;
            break;
         case 137:
            var10000 = 5;
            break;
         case 138:
            var10000 = 200;
            break;
         case 139:
            var10000 = 147;
            break;
         case 140:
            var10000 = 60;
            break;
         case 141:
            var10000 = 19;
            break;
         case 142:
            var10000 = 11;
            break;
         case 143:
            var10000 = 216;
            break;
         case 144:
            var10000 = 27;
            break;
         case 145:
            var10000 = 28;
            break;
         case 146:
            var10000 = 132;
            break;
         case 147:
            var10000 = 139;
            break;
         case 148:
            var10000 = 120;
            break;
         case 149:
            var10000 = 240;
            break;
         case 150:
            var10000 = 108;
            break;
         case 151:
            var10000 = 235;
            break;
         case 152:
            var10000 = 112;
            break;
         case 153:
            var10000 = 59;
            break;
         case 154:
            var10000 = 79;
            break;
         case 155:
            var10000 = 142;
            break;
         case 156:
            var10000 = 155;
            break;
         case 157:
            var10000 = 160;
            break;
         case 158:
            var10000 = 57;
            break;
         case 159:
            var10000 = 81;
            break;
         case 160:
            var10000 = 61;
            break;
         case 161:
            var10000 = 83;
            break;
         case 162:
            var10000 = 62;
            break;
         case 163:
            var10000 = 84;
            break;
         case 164:
            var10000 = 251;
            break;
         case 165:
            var10000 = 222;
            break;
         case 166:
            var10000 = 225;
            break;
         case 167:
            var10000 = 18;
            break;
         case 168:
            var10000 = 152;
            break;
         case 169:
            var10000 = 87;
            break;
         case 170:
            var10000 = 54;
            break;
         case 171:
            var10000 = 80;
            break;
         case 172:
            var10000 = 6;
            break;
         case 173:
            var10000 = 250;
            break;
         case 174:
            var10000 = 234;
            break;
         case 175:
            var10000 = 135;
            break;
         case 176:
            var10000 = 218;
            break;
         case 177:
            var10000 = 173;
            break;
         case 178:
            var10000 = 211;
            break;
         case 179:
            var10000 = 47;
            break;
         case 180:
            var10000 = 119;
            break;
         case 181:
            var10000 = 75;
            break;
         case 182:
            var10000 = 217;
            break;
         case 183:
            var10000 = 125;
            break;
         case 184:
            var10000 = 231;
            break;
         case 185:
            var10000 = 170;
            break;
         case 186:
            var10000 = 15;
            break;
         case 187:
            var10000 = 99;
            break;
         case 188:
            var10000 = 220;
            break;
         case 189:
            var10000 = 227;
            break;
         case 190:
            var10000 = 58;
            break;
         case 191:
            var10000 = 43;
            break;
         case 192:
            var10000 = 124;
            break;
         case 193:
            var10000 = 237;
            break;
         case 194:
            var10000 = 95;
            break;
         case 195:
            var10000 = 246;
            break;
         case 196:
            var10000 = 206;
            break;
         case 197:
            var10000 = 123;
            break;
         case 198:
            var10000 = 232;
            break;
         case 199:
            var10000 = 189;
            break;
         case 200:
            var10000 = 228;
            break;
         case 201:
            var10000 = 97;
            break;
         case 202:
            var10000 = 210;
            break;
         case 203:
            var10000 = 138;
            break;
         case 204:
            var10000 = 197;
            break;
         case 205:
            var10000 = 163;
            break;
         case 206:
            var10000 = 180;
            break;
         case 207:
            var10000 = 181;
            break;
         case 208:
            var10000 = 137;
            break;
         case 209:
            var10000 = 67;
            break;
         case 210:
            var10000 = 122;
            break;
         case 211:
            var10000 = 221;
            break;
         case 212:
            var10000 = 23;
            break;
         case 213:
            var10000 = 213;
            break;
         case 214:
            var10000 = 16;
            break;
         case 215:
            var10000 = 223;
            break;
         case 216:
            var10000 = 148;
            break;
         case 217:
            var10000 = 41;
            break;
         case 218:
            var10000 = 3;
            break;
         case 219:
            var10000 = 30;
            break;
         case 220:
            var10000 = 248;
            break;
         case 221:
            var10000 = 215;
            break;
         case 222:
            var10000 = 36;
            break;
         case 223:
            var10000 = 145;
            break;
         case 224:
            var10000 = 255;
            break;
         case 225:
            var10000 = 49;
            break;
         case 226:
            var10000 = 199;
            break;
         case 227:
            var10000 = 134;
            break;
         case 228:
            var10000 = 172;
            break;
         case 229:
            var10000 = 63;
            break;
         case 230:
            var10000 = 226;
            break;
         case 231:
            var10000 = 154;
            break;
         case 232:
            var10000 = 185;
            break;
         case 233:
            var10000 = 162;
            break;
         case 234:
            var10000 = 69;
            break;
         case 235:
            var10000 = 129;
            break;
         case 236:
            var10000 = 93;
            break;
         case 237:
            var10000 = 115;
            break;
         case 238:
            var10000 = 191;
            break;
         case 239:
            var10000 = 107;
            break;
         case 240:
            var10000 = 26;
            break;
         case 241:
            var10000 = 207;
            break;
         case 242:
            var10000 = 203;
            break;
         case 243:
            var10000 = 70;
            break;
         case 244:
            var10000 = 66;
            break;
         case 245:
            var10000 = 179;
            break;
         case 246:
            var10000 = 113;
            break;
         case 247:
            var10000 = 117;
            break;
         case 248:
            var10000 = 17;
            break;
         case 249:
            var10000 = 133;
            break;
         case 250:
            var10000 = 146;
            break;
         case 251:
            var10000 = 65;
            break;
         case 252:
            var10000 = 98;
            break;
         case 253:
            var10000 = 14;
            break;
         case 254:
            var10000 = 100;
            break;
         default:
            var10000 = 48;
         }

         short var4 = var10000;
         int var5 = (var1 & 255) - var4;
         var5 = var5 + 256;
         int var6 = ((var1 & '\uffff') >>> 8) - var4;
         var6 = var6 + 256;

         for(int var7 = 0; var7 < var3.length; ++var7) {
            int var8 = var7 % 2;
            var3[var7] = (char)(var3[var7] ^ var5);
            var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & 255;
         }

         db[var2] = (new String(var3)).intern();
      }

      return db[var2];
   }
}
