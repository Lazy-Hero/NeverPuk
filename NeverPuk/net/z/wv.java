package net.z;

import java.io.IOException;
import net.m8;
import net.o2;
import net.p0;
import net.pc;
import net.pe;
import net.pl;
import net.po;
import net.pp;
import net.pt;
import net.pz;
import net.uj;
import net.xn;
import net.z9;
import net.z.g;
import net.z.m;
import net.z.t;
import net.z.th;
import net.z.tu;

public class wv extends pz {
   private final tu B;
   protected String a = "Video Settings";
   private final net.nr.d Y;
   private static final net.nr.d[] o = new net.nr.d[]{net.nr.d.GRAPHICS, net.nr.d.RENDER_DISTANCE, net.nr.d.AMBIENT_OCCLUSION, net.nr.d.FRAMERATE_LIMIT, net.nr.d.AO_LEVEL, net.nr.d.VIEW_BOBBING, net.nr.d.GUI_SCALE, net.nr.d.USE_VBO, net.nr.d.GAMMA, net.nr.d.ATTACK_INDICATOR, net.nr.d.DYNAMIC_LIGHTS, net.nr.d.DYNAMIC_FOV};
   private static final String s = "CL_00000718";
   private final uj z = new uj(this);

   public wv(tu var1, net.nr.d var2) {
      this.B = var1;
      this.Y = var2;
   }

   public void L() {
      this.a = net.c9.b.x("options.videoTitle", new Object[0]);
      this.m.clear();

      for(int var1 = 0; var1 < o.length; ++var1) {
         net.nr.d var2 = o[var1];
         int var3 = q / 2 - 155 + var1 % 2 * 160;
         int var4 = V / 6 + 21 * (var1 / 2) - 12;
         if(var2.k()) {
            this.m.add(new pt(var2.p(), var3, var4, var2));
         } else {
            this.m.add(new pc(var2.p(), var3, var4, var2, this.Y.L(var2)));
         }
      }

      int var5 = V / 6 + 21 * (o.length / 2) - 12;
      int var9 = 0;
      var9 = q / 2 - 155 + 0;
      this.m.add(new th(231, var9, var5, m8.i("of.options.shaders")));
      var9 = q / 2 - 155 + 160;
      this.m.add(new th(202, var9, var5, m8.i("of.options.quality")));
      var5 = var5 + 21;
      var9 = q / 2 - 155 + 0;
      this.m.add(new th(201, var9, var5, m8.i("of.options.details")));
      var9 = q / 2 - 155 + 160;
      this.m.add(new th(212, var9, var5, m8.i("of.options.performance")));
      var5 = var5 + 21;
      var9 = q / 2 - 155 + 0;
      this.m.add(new th(211, var9, var5, m8.i("of.options.animations")));
      var9 = q / 2 - 155 + 160;
      this.m.add(new th(222, var9, var5, m8.i("of.options.other")));
      var5 = var5 + 21;
      this.m.add(new m(200, q / 2 - 100, V / 6 + 168 + 11, net.c9.b.x("gui.done", new Object[0])));
   }

   protected void t(m var1) throws IOException {
      this.e(var1, 1);
   }

   protected void S(m var1) {
      if(var1.g == net.nr.d.GUI_SCALE.ordinal()) {
         this.e(var1, -1);
      }

   }

   private void e(m var1, int var2) {
      boolean var3 = g.B();
      if(var1.O) {
         int var4 = this.Y.iL;
         if(var1.g < 200 && var1 instanceof th) {
            this.Y.T(((th)var1).P(), var2);
            var1.J = this.Y.L(net.nr.d.i(var1.g));
         }

         if(var1.g == 200) {
            this.A.T.m();
            this.A.s(this.B);
         }

         if(this.Y.iL != var4) {
            t var5 = new t(this.A);
            int var6 = var5.u();
            int var7 = var5.v();
            this.b(this.A, var6, var7);
         }

         if(var1.g == 201) {
            this.A.T.m();
            p0 var8 = new p0(this, this.Y);
            this.A.s(var8);
         }

         if(var1.g == 202) {
            this.A.T.m();
            pp var9 = new pp(this, this.Y);
            this.A.s(var9);
         }

         if(var1.g == 211) {
            this.A.T.m();
            pe var10 = new pe(this, this.Y);
            this.A.s(var10);
         }

         if(var1.g == 212) {
            this.A.T.m();
            pl var11 = new pl(this, this.Y);
            this.A.s(var11);
         }

         if(var1.g == 222) {
            this.A.T.m();
            po var12 = new po(this, this.Y);
            this.A.s(var12);
         }

         if(var1.g == 231) {
            if(z9.SK() || z9.b()) {
               z9.A(m8.i("of.message.shaders.aa1"), m8.i("of.message.shaders.aa2"));
               return;
            }

            if(z9.G()) {
               z9.A(m8.i("of.message.shaders.af1"), m8.i("of.message.shaders.af2"));
               return;
            }

            if(z9.Z()) {
               z9.A(m8.i("of.message.shaders.fr1"), m8.i("of.message.shaders.fr2"));
               return;
            }

            if(z9.d().iW) {
               z9.A(m8.i("of.message.shaders.an1"), m8.i("of.message.shaders.an2"));
               return;
            }

            this.A.T.m();
            o2 var13 = new o2(this, this.Y);
            this.A.s(var13);
         }
      }

   }

   public void v(int var1, int var2, float var3) {
      this.C();
      this.d(this.O, this.a, q / 2, 15, 16777215);
      String var4 = z9.U();
      String var5 = "HD_U";
      var5.equals("HD");
      var5.equals("HD_U");
      var4 = "OptiFine HD C6 Ultra";
      var5.equals("L");
      this.n(this.O, var4, 2, V - 10, 8421504);
      String var6 = "Minecraft 1.12.2";
      int var7 = this.O.r(var6);
      this.n(this.O, var6, q - var7 - 2, V - 10, 8421504);
      super.v(var1, var2, var3);
      this.z.b(var1, var2, this.m);
   }

   public static int W(m var0) {
      return var0.s;
   }

   public static int e(m var0) {
      return var0.h;
   }

   public static void f(tu var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      var0.T(var1, var2, (double)var3, (double)var4, var5, var6);
   }

   private static xn b(xn var0) {
      return var0;
   }
}
