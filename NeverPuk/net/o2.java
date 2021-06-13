package net;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import net.b3;
import net.gh;
import net.gt;
import net.m8;
import net.oz;
import net.p3;
import net.p_;
import net.uv;
import net.z9;
import net.c9.b;
import net.nn.j;
import net.nr.d;
import net.z.m;
import net.z.tu;

public class o2 extends tu {
   protected tu Z;
   protected String F = "Shaders";
   private int Y = -1;
   private b3 o;
   private boolean n = false;
   private static final float[] b = new float[]{0.5F, 0.70710677F, 1.0F, 1.4142135F, 2.0F};
   private static final String[] Q = new String[]{"0.5x", "0.7x", "1x", "1.5x", "2x"};
   private static final float[] W = new float[]{0.0625F, 0.125F, 0.25F};
   private static final String[] D = new String[]{"0.5x", "1x", "2x"};
   public static final int p = 0;
   public static final int T = 1;
   public static final int U = 2;
   public static final int S = 3;
   public static final int a = 4;

   public o2(tu var1, d var2) {
      this.Z = var1;
   }

   public void L() {
      this.F = b.x("of.options.shadersTitle", new Object[0]);
      if(oz.Ka == null) {
         oz.n4();
      }

      byte var1 = 120;
      byte var2 = 20;
      int var3 = q - var1 - 10;
      byte var4 = 30;
      byte var5 = 20;
      int var6 = q - var1 - 20;
      this.o = new b3(this, var6, V, var4, V - 50, 16);
      this.o.A(7, 8);
      this.m.add(new p3(gt.ANTIALIASING, var3, 0 * var5 + var4, var1, var2));
      this.m.add(new p3(gt.NORMAL_MAP, var3, 1 * var5 + var4, var1, var2));
      this.m.add(new p3(gt.SPECULAR_MAP, var3, 2 * var5 + var4, var1, var2));
      this.m.add(new p3(gt.RENDER_RES_MUL, var3, 3 * var5 + var4, var1, var2));
      this.m.add(new p3(gt.SHADOW_RES_MUL, var3, 4 * var5 + var4, var1, var2));
      this.m.add(new p3(gt.HAND_DEPTH_MUL, var3, 5 * var5 + var4, var1, var2));
      this.m.add(new p3(gt.OLD_HAND_LIGHT, var3, 6 * var5 + var4, var1, var2));
      this.m.add(new p3(gt.OLD_LIGHTING, var3, 7 * var5 + var4, var1, var2));
      int var7 = Math.min(150, var6 / 2 - 10);
      this.m.add(new m(201, var6 / 4 - var7 / 2, V - 25, var7, var2, m8.i("of.options.shaders.shadersFolder")));
      this.m.add(new m(202, var6 / 4 * 3 - var7 / 2, V - 25, var7, var2, b.x("gui.done", new Object[0])));
      this.m.add(new m(203, var3, V - 25, var1, var2, m8.i("of.options.shaders.shaderOptions")));
      this.j();
   }

   public void j() {
      boolean var1 = z9.Q();

      for(m var3 : this.m) {
         if(var3.g != 201 && var3.g != 202 && var3.g != gt.ANTIALIASING.ordinal()) {
            var3.O = var1;
         }
      }

   }

   public void m() throws IOException {
      super.m();
      this.o.q();
   }

   protected void t(m var1) {
      int[] var2 = uv.l();
      if(var1.O) {
         if(var1 instanceof p3) {
            p3 var3 = (p3)var1;
            switch(null.F[var3.c().ordinal()]) {
            case 1:
               oz.Y();
               oz.t();
            case 2:
               oz.ek = !oz.ek;
               oz.t();
               this.A.m();
            case 3:
               oz.H3 = !oz.H3;
               oz.t();
               this.A.m();
            case 4:
               float var4 = oz.c;
               float[] var5 = b;
               String[] var10000 = Q;
               int var7 = U(var4, var5);
               if(s()) {
                  --var7;
                  var7 = var5.length - 1;
               }

               ++var7;
               if(var7 >= var5.length) {
                  var7 = 0;
               }

               oz.c = var5[var7];
               oz.t();
               oz.N();
            case 5:
               float var8 = oz._f;
               float[] var9 = b;
               String[] var27 = Q;
               int var11 = U(var8, var9);
               if(s()) {
                  --var11;
                  var11 = var9.length - 1;
               }

               ++var11;
               if(var11 >= var9.length) {
                  var11 = 0;
               }

               oz._f = var9[var11];
               oz.t();
               oz.nv();
            case 6:
               float var12 = oz.H_;
               float[] var13 = W;
               String[] var28 = D;
               int var15 = U(var12, var13);
               if(s()) {
                  --var15;
                  var15 = var13.length - 1;
               }

               ++var15;
               if(var15 >= var13.length) {
                  var15 = 0;
               }

               oz.H_ = var13[var15];
               oz.t();
            case 7:
               oz.ep.l();
               oz.t();
            case 8:
               oz.H9.l();
               oz.Z();
               oz.t();
               this.A.m();
            case 9:
               oz._y = !oz._y;
            case 10:
               oz.ER = !oz.ER;
            case 11:
               oz.EG = (oz.EG + 1) % 3;
               oz._j = oz.Ev = oz.EG;
               var1.J = "Tex Min: " + oz.Eg[oz.EG];
               gh.o();
            case 12:
               oz.HN = (oz.HN + 1) % 2;
               var1.J = "Tex_n Mag: " + oz.Q[oz.HN];
               gh.o();
            case 13:
               oz.ev = (oz.ev + 1) % 2;
               var1.J = "Tex_s Mag: " + oz.Q[oz.ev];
               gh.o();
            case 14:
               oz.eA = !oz.eA;
               var1.J = "ShadowClipFrustrum: " + m(oz.eA);
               gh.o();
            default:
               var3.L();
            }
         }

         switch(var1.g) {
         case 201:
            switch(A()) {
            case 1:
               String var16 = String.format("cmd.exe /C start \"Open file\" \"%s\"", new Object[]{oz.eP.getAbsolutePath()});
               Runtime.getRuntime().exec(var16);
               return;
            case 2:
               Runtime.getRuntime().exec(new String[]{"/usr/bin/open", oz.eP.getAbsolutePath()});
               return;
            default:
               boolean var17 = false;
               Class var19 = Class.forName("java.awt.Desktop");
               Object var20 = var19.getMethod("getDesktop", new Class[0]).invoke((Object)null, new Object[0]);
               var19.getMethod("browse", new Class[]{URI.class}).invoke(var20, new Object[]{(new File(this.A.sn, oz.b)).toURI()});
               return;
            }
         case 202:
            new File(oz.Hh, "current.cfg");
            oz.j();
            this.n = true;
            this.A.s(this.Z);
         case 203:
            p_ var18 = new p_(this, z9.d());
            z9.G().s(var18);
         default:
            this.o.L(var1);
         }
      }

   }

   public void x() {
      super.x();
      if(!this.n) {
         oz.j();
      }

   }

   public void v(int var1, int var2, float var3) {
      this.C();
      this.o.Z(var1, var2, var3);
      if(this.Y <= 0) {
         this.o.f();
         this.Y += 20;
      }

      this.d(this.O, this.F + " ", q / 2, 15, 16777215);
      String var4 = "OpenGL: " + oz.eU + ", " + oz.B + ", " + oz.ef;
      int var5 = this.O.r(var4);
      if(var5 < q - 5) {
         this.d(this.O, var4, q / 2, V - 40, 8421504);
      } else {
         this.n(this.O, var4, 5, V - 40, 8421504);
      }

      super.v(var1, var2, var3);
   }

   public void K() {
      super.K();
      --this.Y;
   }

   public j Z() {
      return this.A;
   }

   public void b(String var1, int var2, int var3, int var4) {
      this.d(this.O, var1, var2, var3, var4);
   }

   public static String m(boolean var0) {
      String var1 = m8.b();
      m8.o();
      return var1;
   }

   public static String I(int var0) {
      return var0 == 2?"FXAA 2x":(var0 == 4?"FXAA 4x":m8.o());
   }

   public static String z(float var0, float[] var1, String[] var2) {
      int var3 = U(var0, var1);
      return var2[var3];
   }

   public static int U(float var0, float[] var1) {
      for(int var2 = 0; var2 < var1.length; ++var2) {
         float var3 = var1[var2];
         if(var3 >= var0) {
            return var2;
         }
      }

      return var1.length - 1;
   }

   public static String e(float var0) {
      return z(var0, b, Q);
   }

   public static String M(float var0) {
      return z(var0, W, D);
   }

   public static int A() {
      String var0 = System.getProperty("os.name").toLowerCase();
      return var0.contains("win")?1:(var0.contains("mac")?2:(var0.contains("solaris")?3:(var0.contains("sunos")?3:(var0.contains("linux")?4:(var0.contains("unix")?4:0)))));
   }

   static {
      String[] var10000 = new String[]{"0.5x", "0.7x", "1x", "1.5x", "2x"};
      var10000 = new String[]{"0.5x", "1x", "2x"};
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
