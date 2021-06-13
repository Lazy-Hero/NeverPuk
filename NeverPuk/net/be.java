package net;

import java.nio.IntBuffer;
import net.i6;
import net.oz;
import net.uv;
import net.xn;
import net.xt;
import net.z9;
import net.cy.b;
import net.cy.s;
import net.ne.l;
import net.ni.c;
import net.nn.j;
import net.y.d;
import net.y.h;
import net.y.n;
import net.y.p;
import net.y.r;
import net.y.u;
import net.y8.x;
import net.yz.ac;
import net.yz.aq;
import org.lwjgl.opengl.EXTFramebufferObject;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;

public class be {
   private static final net.yz.m_ E = new net.yz.m_("textures/entity/end_portal.png");

   public static void V(s var0, double var1, double var3, double var5) {
      var0.o(var1, var3, var5);
   }

   public static void E(u var0, l var1, double var2, s var4, int var5, boolean var6) {
      var0.F(var1, var2, var4, var5, var6);
   }

   public static void p() {
      if(oz.ey) {
         oz.HH = true;
         oz.Y(7);
      }

   }

   public static void n() {
      if(oz.ey) {
         oz.Y(7);
      }

   }

   public static void U() {
      if(oz.ey) {
         oz.Y(7);
      }

   }

   public static void b() {
      if(oz.ey) {
         oz.Y(3);
      }

   }

   public static void Q() {
      if(oz.ey) {
         if(oz.E5 >= 2) {
            d.t('蓋');
            oz.r("pre copy depth");
            GL11.glCopyTexSubImage2D(3553, 0, 0, 0, 0, 0, oz.Kw, oz.e3);
            oz.r("copy depth");
            d.t('蓀');
         }

         oz.Y(12);
      }

   }

   public static void c() {
      if(oz.ey) {
         oz.Y(3);
      }

   }

   public static void v(n var0, float var1, int var2) {
      if(!oz.Hr) {
         boolean var3 = oz.L();
         boolean var4 = oz.b();
         oz.E();
         oz.x();
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         oz.C(var3, var4);
         var0.e(var1, var2, true, false, false);
         oz.e();
         oz.n(true, true);
         oz.C(false, false);
      }

   }

   public static void Z(n var0, float var1, int var2) {
      if(!oz.Hr && !oz.K()) {
         oz.E();
         d.C();
         oz.x();
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         oz.C(oz.V(), oz.H());
         var0.e(var1, var2, true, false, true);
         oz.e();
         oz.n(true, true);
         oz.C(false, false);
      }

   }

   public static void P(net.y.ub var0, float var1, boolean var2) {
      oz.m(true);
      d.Y(true);
      d.n(519);
      GL11.glPushMatrix();
      IntBuffer var3 = oz.Ki;
      oz.W(oz.ea);
      oz.Ee = true;
      var0.Z(var1);
      oz.Ee = false;
      oz.W(var3);
      GL11.glPopMatrix();
      d.n(515);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      var0.Z(var1);
      oz.m(false);
   }

   public static void V(n var0, float var1, int var2) {
      if(!oz.Hr) {
         oz.no();
         var0.e(var1, var2, false, true, false);
         oz.nB();
      }

   }

   public static void W() {
      if(oz.ey) {
         oz.Y(11);
         if(oz.y[11] == oz.y[7]) {
            oz.W(oz.EW);
            d.Y(false);
         }
      }

   }

   public static void q() {
      if(oz.ey) {
         d.Y(true);
         oz.Y(3);
      }

   }

   public static void u(n var0, int var1, float var2, long var3) {
      int[] var5 = uv.l();
      if(oz.HM > 0 && --oz.HB <= 0) {
         j var6 = j.b();
         var6.sl.F("shadow pass");
         u var7 = var6.o;
         oz.Hr = true;
         oz.HB = oz.Es;
         oz.HQ = var6.T.wR;
         var6.T.wR = 1;
         oz.r("pre shadow");
         GL11.glMatrixMode(5889);
         GL11.glPushMatrix();
         GL11.glMatrixMode(5888);
         GL11.glPushMatrix();
         var6.sl.F("shadow clear");
         EXTFramebufferObject.glBindFramebufferEXT('赀', oz.HI);
         oz.r("shadow bind sfb");
         oz.Y(30);
         var6.sl.F("shadow camera");
         var0.R(var2, 2);
         oz.Q(var2);
         h.k(var6.sf, var6.T.wR == 2);
         oz.r("shadow camera");
         GL20.glDrawBuffers(oz.N);
         oz.r("shadow drawbuffers");
         GL11.glReadBuffer(0);
         oz.r("shadow readbuffer");
         EXTFramebufferObject.glFramebufferTexture2DEXT('赀', '贀', 3553, oz.K8.get(0), 0);
         if(oz.K3 != 0) {
            EXTFramebufferObject.glFramebufferTexture2DEXT('赀', '賠', 3553, oz.KC.get(0), 0);
         }

         oz.I("shadow fb");
         GL11.glClearColor(1.0F, 1.0F, 1.0F, 1.0F);
         GL11.glClear(oz.K3 != 0?16640:256);
         oz.r("shadow clear");
         var6.sl.F("shadow frustum");
         b var8 = xt.Y();
         var6.sl.F("shadow culling");
         net.cy.n var9 = new net.cy.n(var8);
         l var10 = var6.A();
         double var11 = var10.hL + (var10.b - var10.hL) * (double)var2;
         double var13 = var10.F + (var10.hS - var10.F) * (double)var2;
         double var15 = var10.A + (var10.hr - var10.A) * (double)var2;
         var9.o(var11, var13, var15);
         d.Q(7425);
         d.B();
         d.n(515);
         d.Y(true);
         d.q(true, true, true, true);
         d.j();
         var6.sl.F("shadow prepareterrain");
         var6.n().E(net.n9.b.N);
         var6.sl.F("shadow setupterrain");
         int var17 = 0;
         var17 = var0.Z;
         var0.Z = var17 + 1;
         var7.F(var10, (double)var2, var9, var17, var6.sf.VX());
         var6.sl.F("shadow updatechunks");
         var6.sl.F("shadow terrain");
         d.G(5888);
         d.c();
         d.d();
         var7.Z(ac.SOLID, (double)var2, 2, var10);
         oz.r("shadow terrain solid");
         d.m();
         var7.Z(ac.CUTOUT_MIPPED, (double)var2, 2, var10);
         oz.r("shadow terrain cutoutmipped");
         var6.n().m(net.n9.b.N).s(false, false);
         var7.Z(ac.CUTOUT, (double)var2, 2, var10);
         oz.r("shadow terrain cutout");
         var6.n().m(net.n9.b.N).f();
         d.Q(7424);
         d.d(516, 0.1F);
         d.G(5888);
         d.Y();
         d.c();
         var6.sl.F("shadow entities");
         if(i6.Ct.r()) {
            i6.Q(i6.Ct, new Object[]{Integer.valueOf(0)});
         }

         var7.U(var10, var9, var2);
         oz.r("shadow entities");
         d.G(5888);
         d.Y();
         d.Y(true);
         d.E();
         d.a();
         d.G(770, 771, 1, 0);
         d.d(516, 0.1F);
         if(oz.HM >= 2) {
            d.t('蓅');
            oz.r("pre copy shadow depth");
            GL11.glCopyTexSubImage2D(3553, 0, 0, 0, 0, 0, oz.ez, oz.KM);
            oz.r("copy shadow depth");
            d.t('蓀');
         }

         d.E();
         d.Y(true);
         var6.n().E(net.n9.b.N);
         d.Q(7425);
         oz.r("shadow pre-translucent");
         GL20.glDrawBuffers(oz.N);
         oz.r("shadow drawbuffers pre-translucent");
         oz.I("shadow pre-translucent");
         if(oz.s()) {
            var6.sl.F("shadow translucent");
            var7.Z(ac.TRANSLUCENT, (double)var2, 2, var10);
            oz.r("shadow translucent");
         }

         if(i6.Ct.r()) {
            net.y.u1.B();
            i6.H(i6.Ct, new Object[]{Integer.valueOf(1)});
            var7.U(var10, var9, var2);
            i6.H(i6.Ct, new Object[]{Integer.valueOf(-1)});
            net.y.u1.m();
            oz.r("shadow entities 1");
         }

         d.Q(7424);
         d.Y(true);
         d.a();
         d.E();
         GL11.glFlush();
         oz.r("shadow flush");
         oz.Hr = false;
         var6.T.wR = oz.HQ;
         var6.sl.F("shadow postprocess");
         if(oz.Kk) {
            if(oz.HM >= 1) {
               if(oz.EL[0]) {
                  d.t('蓄');
                  d.z(oz.K8.get(0));
                  GL30.glGenerateMipmap(3553);
                  GL11.glTexParameteri(3553, 10241, oz.E7[0]?9984:9987);
               }

               if(oz.HM >= 2 && oz.EL[1]) {
                  d.t('蓅');
                  d.z(oz.K8.get(1));
                  GL30.glGenerateMipmap(3553);
                  GL11.glTexParameteri(3553, 10241, oz.E7[1]?9984:9987);
               }

               d.t('蓀');
            }

            if(oz.K3 >= 1) {
               if(oz.HK[0]) {
                  d.t('蓍');
                  d.z(oz.KC.get(0));
                  GL30.glGenerateMipmap(3553);
                  GL11.glTexParameteri(3553, 10241, oz.e2[0]?9984:9987);
               }

               if(oz.K3 >= 2 && oz.HK[1]) {
                  d.t('蓎');
                  d.z(oz.KC.get(1));
                  GL30.glGenerateMipmap(3553);
                  GL11.glTexParameteri(3553, 10241, oz.e2[1]?9984:9987);
               }

               d.t('蓀');
            }
         }

         oz.r("shadow postprocess");
         EXTFramebufferObject.glBindFramebufferEXT('赀', oz.HF);
         GL11.glViewport(0, 0, oz.Kw, oz.e3);
         oz.Ki = null;
         var6.n().E(net.n9.b.N);
         oz.Y(7);
         GL11.glMatrixMode(5888);
         GL11.glPopMatrix();
         GL11.glMatrixMode(5889);
         GL11.glPopMatrix();
         GL11.glMatrixMode(5888);
         oz.r("shadow end");
      }

   }

   public static void l(ac var0) {
      if(oz.e(var0)) {
         d.j();
      }

      if(net.y.ui.H()) {
         GL11.glEnableClientState('聵');
         GL20.glEnableVertexAttribArray(oz.A);
         GL20.glEnableVertexAttribArray(oz.e4);
         GL20.glEnableVertexAttribArray(oz.K6);
      }

   }

   public static void O(ac var0) {
      if(net.y.ui.H()) {
         GL11.glDisableClientState('聵');
         GL20.glDisableVertexAttribArray(oz.A);
         GL20.glDisableVertexAttribArray(oz.e4);
         GL20.glDisableVertexAttribArray(oz.K6);
      }

      if(oz.e(var0)) {
         d.a();
      }

   }

   public static void a() {
      boolean var10000 = true;
      GL11.glVertexPointer(3, 5126, 56, 0L);
      GL11.glColorPointer(4, 5121, 56, 12L);
      GL11.glTexCoordPointer(2, 5126, 56, 16L);
      net.y.ui.X(net.y.ui.w);
      GL11.glTexCoordPointer(2, 5122, 56, 24L);
      net.y.ui.X(net.y.ui.V);
      GL11.glNormalPointer(5120, 56, 28L);
      GL20.glVertexAttribPointer(oz.A, 2, 5126, false, 56, 32L);
      GL20.glVertexAttribPointer(oz.e4, 4, 5122, false, 56, 40L);
      GL20.glVertexAttribPointer(oz.K6, 3, 5122, false, 56, 48L);
   }

   public static void C() {
      oz.Y(14);
   }

   public static void N() {
   }

   public static void d() {
   }

   public static void F() {
   }

   public static void x() {
      d.E();
   }

   public static void j() {
      oz.Y(17);
   }

   public static void Y() {
      if(oz.ey) {
         if(oz.R() && oz.o()) {
            oz.Y(19);
         } else {
            oz.Y(16);
         }
      } else {
         oz.Y(0);
      }

   }

   public static boolean T(c var0, double var1, double var3, double var5, float var7, int var8, float var9) {
      if(!oz.Hr && oz.y[oz.s] == 0) {
         return false;
      } else {
         d.i();
         z9.V().E(E);
         r var10 = r.f();
         p var11 = var10.k();
         var11.m(7, x.M);
         float var12 = 0.5F;
         float var13 = var12 * 0.15F;
         float var14 = var12 * 0.3F;
         float var15 = var12 * 0.4F;
         float var16 = 0.0F;
         float var17 = 0.2F;
         float var18 = (float)(System.currentTimeMillis() % 100000L) / 100000.0F;
         short var19 = 240;
         if(var0.y(aq.SOUTH)) {
            var11.H(var1, var3, var5 + 1.0D).m(var13, var14, var15, 1.0F).Y((double)(var16 + var18), (double)(var16 + var18)).C(var19, var19).W();
            var11.H(var1 + 1.0D, var3, var5 + 1.0D).m(var13, var14, var15, 1.0F).Y((double)(var16 + var18), (double)(var17 + var18)).C(var19, var19).W();
            var11.H(var1 + 1.0D, var3 + 1.0D, var5 + 1.0D).m(var13, var14, var15, 1.0F).Y((double)(var17 + var18), (double)(var17 + var18)).C(var19, var19).W();
            var11.H(var1, var3 + 1.0D, var5 + 1.0D).m(var13, var14, var15, 1.0F).Y((double)(var17 + var18), (double)(var16 + var18)).C(var19, var19).W();
         }

         if(var0.y(aq.NORTH)) {
            var11.H(var1, var3 + 1.0D, var5).m(var13, var14, var15, 1.0F).Y((double)(var17 + var18), (double)(var17 + var18)).C(var19, var19).W();
            var11.H(var1 + 1.0D, var3 + 1.0D, var5).m(var13, var14, var15, 1.0F).Y((double)(var17 + var18), (double)(var16 + var18)).C(var19, var19).W();
            var11.H(var1 + 1.0D, var3, var5).m(var13, var14, var15, 1.0F).Y((double)(var16 + var18), (double)(var16 + var18)).C(var19, var19).W();
            var11.H(var1, var3, var5).m(var13, var14, var15, 1.0F).Y((double)(var16 + var18), (double)(var17 + var18)).C(var19, var19).W();
         }

         if(var0.y(aq.EAST)) {
            var11.H(var1 + 1.0D, var3 + 1.0D, var5).m(var13, var14, var15, 1.0F).Y((double)(var17 + var18), (double)(var17 + var18)).C(var19, var19).W();
            var11.H(var1 + 1.0D, var3 + 1.0D, var5 + 1.0D).m(var13, var14, var15, 1.0F).Y((double)(var17 + var18), (double)(var16 + var18)).C(var19, var19).W();
            var11.H(var1 + 1.0D, var3, var5 + 1.0D).m(var13, var14, var15, 1.0F).Y((double)(var16 + var18), (double)(var16 + var18)).C(var19, var19).W();
            var11.H(var1 + 1.0D, var3, var5).m(var13, var14, var15, 1.0F).Y((double)(var16 + var18), (double)(var17 + var18)).C(var19, var19).W();
         }

         if(var0.y(aq.WEST)) {
            var11.H(var1, var3, var5).m(var13, var14, var15, 1.0F).Y((double)(var16 + var18), (double)(var16 + var18)).C(var19, var19).W();
            var11.H(var1, var3, var5 + 1.0D).m(var13, var14, var15, 1.0F).Y((double)(var16 + var18), (double)(var17 + var18)).C(var19, var19).W();
            var11.H(var1, var3 + 1.0D, var5 + 1.0D).m(var13, var14, var15, 1.0F).Y((double)(var17 + var18), (double)(var17 + var18)).C(var19, var19).W();
            var11.H(var1, var3 + 1.0D, var5).m(var13, var14, var15, 1.0F).Y((double)(var17 + var18), (double)(var16 + var18)).C(var19, var19).W();
         }

         if(var0.y(aq.DOWN)) {
            var11.H(var1, var3, var5).m(var13, var14, var15, 1.0F).Y((double)(var16 + var18), (double)(var16 + var18)).C(var19, var19).W();
            var11.H(var1 + 1.0D, var3, var5).m(var13, var14, var15, 1.0F).Y((double)(var16 + var18), (double)(var17 + var18)).C(var19, var19).W();
            var11.H(var1 + 1.0D, var3, var5 + 1.0D).m(var13, var14, var15, 1.0F).Y((double)(var17 + var18), (double)(var17 + var18)).C(var19, var19).W();
            var11.H(var1, var3, var5 + 1.0D).m(var13, var14, var15, 1.0F).Y((double)(var17 + var18), (double)(var16 + var18)).C(var19, var19).W();
         }

         if(var0.y(aq.UP)) {
            var11.H(var1, var3 + (double)var9, var5 + 1.0D).m(var13, var14, var15, 1.0F).Y((double)(var16 + var18), (double)(var16 + var18)).C(var19, var19).W();
            var11.H(var1 + 1.0D, var3 + (double)var9, var5 + 1.0D).m(var13, var14, var15, 1.0F).Y((double)(var16 + var18), (double)(var17 + var18)).C(var19, var19).W();
            var11.H(var1 + 1.0D, var3 + (double)var9, var5).m(var13, var14, var15, 1.0F).Y((double)(var17 + var18), (double)(var17 + var18)).C(var19, var19).W();
            var11.H(var1, var3 + (double)var9, var5).m(var13, var14, var15, 1.0F).Y((double)(var17 + var18), (double)(var16 + var18)).C(var19, var19).W();
         }

         var10.p();
         d.K();
         return true;
      }
   }

   private static xn a(xn var0) {
      return var0;
   }
}
